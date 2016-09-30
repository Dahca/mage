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
package mage.sets.saviorsofkamigawa;

import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.common.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.condition.common.MoreCardsInHandThanOpponentsCondition;
import mage.abilities.decorator.ConditionalTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.effects.common.LoseLifeTargetEffect;
import mage.abilities.effects.common.ReturnSourceFromGraveyardToHandEffect;
import mage.cards.CardImpl;
import mage.constants.CardType;
import mage.constants.Rarity;
import mage.constants.TargetController;
import mage.constants.Zone;
import mage.target.TargetPlayer;

/**
 *
 * @author LevelX2
 */
public class DeathOfAThousandStings extends CardImpl {

    public DeathOfAThousandStings(UUID ownerId) {
        super(ownerId, 64, "Death of a Thousand Stings", Rarity.COMMON, new CardType[]{CardType.INSTANT}, "{4}{B}");
        this.expansionSetCode = "SOK";
        this.subtype.add("Arcane");

        // Target player loses 1 life and you gain 1 life.
        this.getSpellAbility().addEffect(new LoseLifeTargetEffect(1));
        this.getSpellAbility().addTarget(new TargetPlayer());
        Effect effect = new GainLifeEffect(1);
        effect.setText("and you gain 1 life");
        this.getSpellAbility().addEffect(effect);

        // At the beginning of your upkeep, if you have more cards in hand than each opponent, you may return Death of a Thousand Stings from your graveyard to your hand.
        Ability ability = new ConditionalTriggeredAbility(
                new BeginningOfUpkeepTriggeredAbility(Zone.GRAVEYARD,
                        new ReturnSourceFromGraveyardToHandEffect(),
                        TargetController.YOU, true),
                new MoreCardsInHandThanOpponentsCondition(),
                "At the beginning of your upkeep, if you have more cards in hand than each opponent, you may return {this} from your graveyard to your hand.");
        this.addAbility(ability);
    }

    public DeathOfAThousandStings(final DeathOfAThousandStings card) {
        super(card);
    }

    @Override
    public DeathOfAThousandStings copy() {
        return new DeathOfAThousandStings(this);
    }
}
