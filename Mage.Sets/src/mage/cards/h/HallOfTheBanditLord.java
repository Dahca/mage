/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.cards.h;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import mage.MageObject;
import mage.Mana;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTappedAbility;
import mage.abilities.costs.common.PayLifeCost;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.common.BasicManaEffect;
import mage.abilities.effects.common.ManaEffect;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.keyword.HasteAbility;
import mage.abilities.mana.SimpleManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.WatcherScope;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.GameEvent.EventType;
import mage.game.events.ZoneChangeEvent;
import mage.game.stack.Spell;
import mage.target.targetpointer.FixedTarget;
import mage.watchers.Watcher;

/**
 *
 * @author emerald000
 */
public class HallOfTheBanditLord extends CardImpl {

    public HallOfTheBanditLord(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.LAND},"");
        this.supertype.add("Legendary");

        // Hall of the Bandit Lord enters the battlefield tapped.
        this.addAbility(new EntersBattlefieldTappedAbility());

        // {T}, Pay 3 life: Add {C} to your mana pool. If that mana is spent on a creature spell, it gains haste.
        Mana mana = Mana.ColorlessMana(1);
        mana.setFlag(true);
        ManaEffect effect = new BasicManaEffect(mana);
        effect.setText("Add {C} to your mana pool. If that mana is spent on a creature spell, it gains haste");
        Ability ability = new SimpleManaAbility(Zone.BATTLEFIELD, effect, new TapSourceCost());
        ability.addCost(new PayLifeCost(3));
        this.addAbility(ability, new HallOfTheBanditLordWatcher(ability));
    }

    public HallOfTheBanditLord(final HallOfTheBanditLord card) {
        super(card);
    }

    @Override
    public HallOfTheBanditLord copy() {
        return new HallOfTheBanditLord(this);
    }
}

class HallOfTheBanditLordWatcher extends Watcher {

    private final Ability source;
    private final List<UUID> creatures = new ArrayList<>();

    HallOfTheBanditLordWatcher(Ability source) {
        super("HallOfTheBanditLordWatcher", WatcherScope.CARD);
        this.source = source;
    }

    HallOfTheBanditLordWatcher(final HallOfTheBanditLordWatcher watcher) {
        super(watcher);
        this.creatures.addAll(watcher.creatures);
        this.source = watcher.source;
    }

    @Override
    public HallOfTheBanditLordWatcher copy() {
        return new HallOfTheBanditLordWatcher(this);
    }

    @Override
    public void watch(GameEvent event, Game game) {
        if (event.getType() == EventType.MANA_PAYED) {
            MageObject target = game.getObject(event.getTargetId());
            if (event.getSourceId() != null
                    && event.getSourceId().equals(this.getSourceId())
                    && target != null && target.getCardType().contains(CardType.CREATURE)
                    && event.getFlag()) {
                if (target instanceof Spell) {
                    this.creatures.add(((Spell) target).getCard().getId());
                }
            }
        }
        if (event.getType() == EventType.COUNTERED) {
            if (creatures.contains(event.getTargetId())) {
                creatures.remove(event.getSourceId());
            }
        }
        if (event.getType() == EventType.ZONE_CHANGE) {
            if (creatures.contains(event.getSourceId())) {
                ZoneChangeEvent zEvent = (ZoneChangeEvent) event;
                // spell was e.g. exiled and goes again to stack, so previous cast has not resolved.
                if (zEvent.getToZone() == Zone.STACK) {
                    creatures.remove(event.getSourceId());
                }
            }
        }
        if (event.getType() == EventType.ENTERS_THE_BATTLEFIELD) {
            if (creatures.contains(event.getSourceId())) {
                ContinuousEffect effect = new GainAbilityTargetEffect(HasteAbility.getInstance(), Duration.Custom);
                effect.setTargetPointer(new FixedTarget(event.getSourceId()));
                game.addEffect(effect, source);
                creatures.remove(event.getSourceId());
            }
        }
    }

    @Override
    public void reset() {
        super.reset();
        creatures.clear();
    }

}
