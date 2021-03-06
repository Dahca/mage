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
package mage.cards.f;

import java.util.UUID;
import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.DestroyTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.WatcherScope;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.GameEvent.EventType;
import mage.game.events.ZoneChangeEvent;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.common.TargetControlledCreaturePermanent;
import mage.target.common.TargetCreaturePermanent;
import mage.watchers.Watcher;

/**
 *
 * @author nantuko
 */
public class FleshAllergy extends CardImpl {

    public FleshAllergy(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.SORCERY},"{2}{B}{B}");

        // As an additional cost to cast Flesh Allergy, sacrifice a creature.
        // Destroy target creature. Its controller loses life equal to the number of creatures that died this turn.
        this.getSpellAbility().addCost(new SacrificeTargetCost(new TargetControlledCreaturePermanent()));
        this.getSpellAbility().addEffect(new DestroyTargetEffect());
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());
        this.getSpellAbility().addEffect(new FleshAllergyEffect());
        this.getSpellAbility().addWatcher(new FleshAllergyWatcher());
    }

    public FleshAllergy(final FleshAllergy card) {
        super(card);
    }

    @Override
    public FleshAllergy copy() {
        return new FleshAllergy(this);
    }
}

class FleshAllergyWatcher extends Watcher {

    public int creaturesDiedThisTurn = 0;

    public FleshAllergyWatcher() {
        super("CreaturesDied", WatcherScope.GAME);
    }

    public FleshAllergyWatcher(final FleshAllergyWatcher watcher) {
        super(watcher);
    }

    @Override
    public FleshAllergyWatcher copy() {
        return new FleshAllergyWatcher(this);
    }

    @Override
    public void watch(GameEvent event, Game game) {
        if (event.getType() == EventType.ZONE_CHANGE && ((ZoneChangeEvent) event).isDiesEvent()) {
            MageObject card = game.getLastKnownInformation(event.getTargetId(), Zone.BATTLEFIELD);
            if (card != null && card.getCardType().contains(CardType.CREATURE)) {
                creaturesDiedThisTurn++;
            }
        }
    }

    @Override
    public void reset() {
        super.reset();
        creaturesDiedThisTurn = 0;
    }

}

class FleshAllergyEffect extends OneShotEffect {

    public FleshAllergyEffect() {
        super(Outcome.DestroyPermanent);
        staticText = "Its controller loses life equal to the number of creatures that died this turn";
    }

    public FleshAllergyEffect(final FleshAllergyEffect effect) {
        super(effect);
    }

    @Override
    public FleshAllergyEffect copy() {
        return new FleshAllergyEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        FleshAllergyWatcher watcher = (FleshAllergyWatcher) game.getState().getWatchers().get("CreaturesDied");
        Permanent permanent = game.getPermanentOrLKIBattlefield(getTargetPointer().getFirst(game, source));
        if (permanent != null && watcher != null) {
            Player player = game.getPlayer(permanent.getControllerId());
            if (player != null) {
                int amount = watcher.creaturesDiedThisTurn;
                if (amount > 0) {
                    player.loseLife(amount, game, false);
                    return true;
                }
            }
        }
        return false;
    }

}
