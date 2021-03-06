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

package mage.sets;

import mage.constants.SetType;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.cards.CardGraphicInfo;

/**
 *
 * @author BetaSteward_at_googlemail.com
 */
public class RiseOfTheEldrazi extends ExpansionSet {

    private static final RiseOfTheEldrazi fINSTANCE = new RiseOfTheEldrazi();

    public static RiseOfTheEldrazi getInstance() {
        return fINSTANCE;
    }

    private RiseOfTheEldrazi() {
        super("Rise of the Eldrazi", "ROE", ExpansionSet.buildDate(2010, 3, 17), SetType.EXPANSION);
        this.blockName = "Zendikar";
        this.parentSet = Zendikar.getInstance();
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        cards.add(new SetCardInfo("Affa Guard Hound", 14, Rarity.UNCOMMON, mage.cards.a.AffaGuardHound.class));
        cards.add(new SetCardInfo("Akoum Boulderfoot", 134, Rarity.UNCOMMON, mage.cards.a.AkoumBoulderfoot.class));
        cards.add(new SetCardInfo("All Is Dust", 1, Rarity.MYTHIC, mage.cards.a.AllIsDust.class));
        cards.add(new SetCardInfo("Ancient Stirrings", 174, Rarity.COMMON, mage.cards.a.AncientStirrings.class));
        cards.add(new SetCardInfo("Angelheart Vial", 215, Rarity.RARE, mage.cards.a.AngelheartVial.class));
        cards.add(new SetCardInfo("Arrogant Bloodlord", 94, Rarity.UNCOMMON, mage.cards.a.ArrogantBloodlord.class));
        cards.add(new SetCardInfo("Artisan of Kozilek", 2, Rarity.UNCOMMON, mage.cards.a.ArtisanOfKozilek.class));
        cards.add(new SetCardInfo("Aura Finesse", 54, Rarity.COMMON, mage.cards.a.AuraFinesse.class));
        cards.add(new SetCardInfo("Aura Gnarlid", 175, Rarity.COMMON, mage.cards.a.AuraGnarlid.class));
        cards.add(new SetCardInfo("Awakening Zone", 176, Rarity.RARE, mage.cards.a.AwakeningZone.class));
        cards.add(new SetCardInfo("Bala Ged Scorpion", 95, Rarity.COMMON, mage.cards.b.BalaGedScorpion.class));
        cards.add(new SetCardInfo("Baneful Omen", 96, Rarity.RARE, mage.cards.b.BanefulOmen.class));
        cards.add(new SetCardInfo("Battle Rampart", 135, Rarity.COMMON, mage.cards.b.BattleRampart.class));
        cards.add(new SetCardInfo("Battle-Rattle Shaman", 136, Rarity.COMMON, mage.cards.b.BattleRattleShaman.class));
        cards.add(new SetCardInfo("Bear Umbra", 177, Rarity.RARE, mage.cards.b.BearUmbra.class));
        cards.add(new SetCardInfo("Beastbreaker of Bala Ged", 178, Rarity.UNCOMMON, mage.cards.b.BeastbreakerOfBalaGed.class));
        cards.add(new SetCardInfo("Bloodrite Invoker", 97, Rarity.COMMON, mage.cards.b.BloodriteInvoker.class));
        cards.add(new SetCardInfo("Bloodthrone Vampire", 98, Rarity.COMMON, mage.cards.b.BloodthroneVampire.class));
        cards.add(new SetCardInfo("Boar Umbra", 179, Rarity.UNCOMMON, mage.cards.b.BoarUmbra.class));
        cards.add(new SetCardInfo("Bramblesnap", 180, Rarity.UNCOMMON, mage.cards.b.Bramblesnap.class));
        cards.add(new SetCardInfo("Brimstone Mage", 137, Rarity.UNCOMMON, mage.cards.b.BrimstoneMage.class));
        cards.add(new SetCardInfo("Brood Birthing", 138, Rarity.COMMON, mage.cards.b.BroodBirthing.class));
        cards.add(new SetCardInfo("Broodwarden", 181, Rarity.UNCOMMON, mage.cards.b.Broodwarden.class));
        cards.add(new SetCardInfo("Cadaver Imp", 99, Rarity.COMMON, mage.cards.c.CadaverImp.class));
        cards.add(new SetCardInfo("Caravan Escort", 15, Rarity.COMMON, mage.cards.c.CaravanEscort.class));
        cards.add(new SetCardInfo("Cast Through Time", 55, Rarity.MYTHIC, mage.cards.c.CastThroughTime.class));
        cards.add(new SetCardInfo("Champion's Drake", 56, Rarity.COMMON, mage.cards.c.ChampionsDrake.class));
        cards.add(new SetCardInfo("Conquering Manticore", 139, Rarity.RARE, mage.cards.c.ConqueringManticore.class));
        cards.add(new SetCardInfo("Consume the Meek", 100, Rarity.RARE, mage.cards.c.ConsumeTheMeek.class));
        cards.add(new SetCardInfo("Consuming Vapors", 101, Rarity.RARE, mage.cards.c.ConsumingVapors.class));
        cards.add(new SetCardInfo("Contaminated Ground", 102, Rarity.COMMON, mage.cards.c.ContaminatedGround.class));
        cards.add(new SetCardInfo("Coralhelm Commander", 57, Rarity.RARE, mage.cards.c.CoralhelmCommander.class));
        cards.add(new SetCardInfo("Corpsehatch", 103, Rarity.UNCOMMON, mage.cards.c.Corpsehatch.class));
        cards.add(new SetCardInfo("Crab Umbra", 58, Rarity.UNCOMMON, mage.cards.c.CrabUmbra.class));
        cards.add(new SetCardInfo("Curse of Wizardry", 104, Rarity.UNCOMMON, mage.cards.c.CurseOfWizardry.class));
        cards.add(new SetCardInfo("Daggerback Basilisk", 182, Rarity.COMMON, mage.cards.d.DaggerbackBasilisk.class));
        cards.add(new SetCardInfo("Dawnglare Invoker", 16, Rarity.COMMON, mage.cards.d.DawnglareInvoker.class));
        cards.add(new SetCardInfo("Death Cultist", 105, Rarity.COMMON, mage.cards.d.DeathCultist.class));
        cards.add(new SetCardInfo("Deathless Angel", 17, Rarity.RARE, mage.cards.d.DeathlessAngel.class));
        cards.add(new SetCardInfo("Demonic Appetite", 106, Rarity.COMMON, mage.cards.d.DemonicAppetite.class));
        cards.add(new SetCardInfo("Demystify", 18, Rarity.COMMON, mage.cards.d.Demystify.class));
        cards.add(new SetCardInfo("Deprive", 59, Rarity.COMMON, mage.cards.d.Deprive.class));
        cards.add(new SetCardInfo("Devastating Summons", 140, Rarity.RARE, mage.cards.d.DevastatingSummons.class));
        cards.add(new SetCardInfo("Disaster Radius", 141, Rarity.RARE, mage.cards.d.DisasterRadius.class));
        cards.add(new SetCardInfo("Distortion Strike", 60, Rarity.COMMON, mage.cards.d.DistortionStrike.class));
        cards.add(new SetCardInfo("Domestication", 61, Rarity.UNCOMMON, mage.cards.d.Domestication.class));
        cards.add(new SetCardInfo("Dormant Gomazoa", 62, Rarity.RARE, mage.cards.d.DormantGomazoa.class));
        cards.add(new SetCardInfo("Drake Umbra", 63, Rarity.UNCOMMON, mage.cards.d.DrakeUmbra.class));
        cards.add(new SetCardInfo("Drana, Kalastria Bloodchief", 107, Rarity.RARE, mage.cards.d.DranaKalastriaBloodchief.class));
        cards.add(new SetCardInfo("Dread Drone", 108, Rarity.COMMON, mage.cards.d.DreadDrone.class));
        cards.add(new SetCardInfo("Dreamstone Hedron", 216, Rarity.UNCOMMON, mage.cards.d.DreamstoneHedron.class));
        cards.add(new SetCardInfo("Echo Mage", 64, Rarity.RARE, mage.cards.e.EchoMage.class));
        cards.add(new SetCardInfo("Eel Umbra", 65, Rarity.COMMON, mage.cards.e.EelUmbra.class));
        cards.add(new SetCardInfo("Eland Umbra", 19, Rarity.COMMON, mage.cards.e.ElandUmbra.class));
        cards.add(new SetCardInfo("Eldrazi Conscription", 3, Rarity.RARE, mage.cards.e.EldraziConscription.class));
        cards.add(new SetCardInfo("Eldrazi Temple", 227, Rarity.RARE, mage.cards.e.EldraziTemple.class));
        cards.add(new SetCardInfo("Emerge Unscathed", 20, Rarity.UNCOMMON, mage.cards.e.EmergeUnscathed.class));
        cards.add(new SetCardInfo("Emrakul's Hatcher", 142, Rarity.COMMON, mage.cards.e.EmrakulsHatcher.class));
        cards.add(new SetCardInfo("Emrakul, the Aeons Torn", 4, Rarity.MYTHIC, mage.cards.e.EmrakulTheAeonsTorn.class));
        cards.add(new SetCardInfo("Enatu Golem", 217, Rarity.UNCOMMON, mage.cards.e.EnatuGolem.class));
        cards.add(new SetCardInfo("Enclave Cryptologist", 66, Rarity.UNCOMMON, mage.cards.e.EnclaveCryptologist.class));
        cards.add(new SetCardInfo("Escaped Null", 109, Rarity.UNCOMMON, mage.cards.e.EscapedNull.class));
        cards.add(new SetCardInfo("Essence Feed", 110, Rarity.COMMON, mage.cards.e.EssenceFeed.class));
        cards.add(new SetCardInfo("Evolving Wilds", 228, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Explosive Revelation", 143, Rarity.UNCOMMON, mage.cards.e.ExplosiveRevelation.class));
        cards.add(new SetCardInfo("Fissure Vent", 144, Rarity.COMMON, mage.cards.f.FissureVent.class));
        cards.add(new SetCardInfo("Flame Slash", 145, Rarity.COMMON, mage.cards.f.FlameSlash.class));
        cards.add(new SetCardInfo("Fleeting Distraction", 67, Rarity.COMMON, mage.cards.f.FleetingDistraction.class));
        cards.add(new SetCardInfo("Forest", 245, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 246, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 247, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 248, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forked Bolt", 146, Rarity.UNCOMMON, mage.cards.f.ForkedBolt.class));
        cards.add(new SetCardInfo("Frostwind Invoker", 68, Rarity.COMMON, mage.cards.f.FrostwindInvoker.class));
        cards.add(new SetCardInfo("Gelatinous Genesis", 183, Rarity.RARE, mage.cards.g.GelatinousGenesis.class));
        cards.add(new SetCardInfo("Gideon Jura", 21, Rarity.MYTHIC, mage.cards.g.GideonJura.class));
        cards.add(new SetCardInfo("Gigantomancer", 184, Rarity.RARE, mage.cards.g.Gigantomancer.class));
        cards.add(new SetCardInfo("Gloomhunter", 111, Rarity.COMMON, mage.cards.g.Gloomhunter.class));
        cards.add(new SetCardInfo("Glory Seeker", 22, Rarity.COMMON, mage.cards.g.GlorySeeker.class));
        cards.add(new SetCardInfo("Goblin Arsonist", 147, Rarity.COMMON, mage.cards.g.GoblinArsonist.class));
        cards.add(new SetCardInfo("Goblin Tunneler", 148, Rarity.COMMON, mage.cards.g.GoblinTunneler.class));
        cards.add(new SetCardInfo("Gravitational Shift", 69, Rarity.RARE, mage.cards.g.GravitationalShift.class));
        cards.add(new SetCardInfo("Gravity Well", 185, Rarity.UNCOMMON, mage.cards.g.GravityWell.class));
        cards.add(new SetCardInfo("Grotag Siege-Runner", 149, Rarity.COMMON, mage.cards.g.GrotagSiegeRunner.class));
        cards.add(new SetCardInfo("Growth Spasm", 186, Rarity.COMMON, mage.cards.g.GrowthSpasm.class));
        cards.add(new SetCardInfo("Guard Duty", 23, Rarity.COMMON, mage.cards.g.GuardDuty.class));
        cards.add(new SetCardInfo("Guard Gomazoa", 70, Rarity.UNCOMMON, mage.cards.g.GuardGomazoa.class));
        cards.add(new SetCardInfo("Guul Draz Assassin", 112, Rarity.RARE, mage.cards.g.GuulDrazAssassin.class));
        cards.add(new SetCardInfo("Hada Spy Patrol", 71, Rarity.UNCOMMON, mage.cards.h.HadaSpyPatrol.class));
        cards.add(new SetCardInfo("Halimar Wavewatch", 72, Rarity.COMMON, mage.cards.h.HalimarWavewatch.class));
        cards.add(new SetCardInfo("Hand of Emrakul", 5, Rarity.COMMON, mage.cards.h.HandOfEmrakul.class));
        cards.add(new SetCardInfo("Harmless Assault", 24, Rarity.COMMON, mage.cards.h.HarmlessAssault.class));
        cards.add(new SetCardInfo("Haze Frog", 187, Rarity.COMMON, mage.cards.h.HazeFrog.class));
        cards.add(new SetCardInfo("Heat Ray", 150, Rarity.COMMON, mage.cards.h.HeatRay.class));
        cards.add(new SetCardInfo("Hedron-Field Purists", 25, Rarity.RARE, mage.cards.h.HedronFieldPurists.class));
        cards.add(new SetCardInfo("Hedron Matrix", 218, Rarity.RARE, mage.cards.h.HedronMatrix.class));
        cards.add(new SetCardInfo("Hellcarver Demon", 113, Rarity.MYTHIC, mage.cards.h.HellcarverDemon.class));
        cards.add(new SetCardInfo("Hellion Eruption", 151, Rarity.RARE, mage.cards.h.HellionEruption.class));
        cards.add(new SetCardInfo("Hyena Umbra", 26, Rarity.COMMON, mage.cards.h.HyenaUmbra.class));
        cards.add(new SetCardInfo("Ikiral Outrider", 27, Rarity.COMMON, mage.cards.i.IkiralOutrider.class));
        cards.add(new SetCardInfo("Induce Despair", 114, Rarity.COMMON, mage.cards.i.InduceDespair.class));
        cards.add(new SetCardInfo("Inquisition of Kozilek", 115, Rarity.UNCOMMON, mage.cards.i.InquisitionOfKozilek.class));
        cards.add(new SetCardInfo("Irresistible Prey", 188, Rarity.UNCOMMON, mage.cards.i.IrresistiblePrey.class));
        cards.add(new SetCardInfo("Island", 233, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 234, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 235, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 236, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("It That Betrays", 7, Rarity.RARE, mage.cards.i.ItThatBetrays.class));
        cards.add(new SetCardInfo("Jaddi Lifestrider", 189, Rarity.UNCOMMON, mage.cards.j.JaddiLifestrider.class));
        cards.add(new SetCardInfo("Joraga Treespeaker", 190, Rarity.UNCOMMON, mage.cards.j.JoragaTreespeaker.class));
        cards.add(new SetCardInfo("Jwari Scuttler", 73, Rarity.COMMON, mage.cards.j.JwariScuttler.class));
        cards.add(new SetCardInfo("Kabira Vindicator", 28, Rarity.UNCOMMON, mage.cards.k.KabiraVindicator.class));
        cards.add(new SetCardInfo("Kargan Dragonlord", 152, Rarity.MYTHIC, mage.cards.k.KarganDragonlord.class));
        cards.add(new SetCardInfo("Kazandu Tuskcaller", 191, Rarity.RARE, mage.cards.k.KazanduTuskcaller.class));
        cards.add(new SetCardInfo("Keening Stone", 219, Rarity.RARE, mage.cards.k.KeeningStone.class));
        cards.add(new SetCardInfo("Khalni Hydra", 192, Rarity.MYTHIC, mage.cards.k.KhalniHydra.class));
        cards.add(new SetCardInfo("Kiln Fiend", 153, Rarity.COMMON, mage.cards.k.KilnFiend.class));
        cards.add(new SetCardInfo("Knight of Cliffhaven", 29, Rarity.COMMON, mage.cards.k.KnightOfCliffhaven.class));
        cards.add(new SetCardInfo("Kor Line-Slinger", 30, Rarity.COMMON, mage.cards.k.KorLineSlinger.class));
        cards.add(new SetCardInfo("Kor Spiritdancer", 31, Rarity.RARE, mage.cards.k.KorSpiritdancer.class));
        cards.add(new SetCardInfo("Kozilek, Butcher of Truth", 6, Rarity.MYTHIC, mage.cards.k.KozilekButcherOfTruth.class));
        cards.add(new SetCardInfo("Kozilek's Predator", 193, Rarity.COMMON, mage.cards.k.KozileksPredator.class));
        cards.add(new SetCardInfo("Lagac Lizard", 154, Rarity.COMMON, mage.cards.l.LagacLizard.class));
        cards.add(new SetCardInfo("Last Kiss", 116, Rarity.COMMON, mage.cards.l.LastKiss.class));
        cards.add(new SetCardInfo("Lavafume Invoker", 155, Rarity.COMMON, mage.cards.l.LavafumeInvoker.class));
        cards.add(new SetCardInfo("Lay Bare", 74, Rarity.COMMON, mage.cards.l.LayBare.class));
        cards.add(new SetCardInfo("Leaf Arrow", 194, Rarity.COMMON, mage.cards.l.LeafArrow.class));
        cards.add(new SetCardInfo("Lighthouse Chronologist", 75, Rarity.MYTHIC, mage.cards.l.LighthouseChronologist.class));
        cards.add(new SetCardInfo("Lightmine Field", 32, Rarity.RARE, mage.cards.l.LightmineField.class));
        cards.add(new SetCardInfo("Linvala, Keeper of Silence", 33, Rarity.MYTHIC, mage.cards.l.LinvalaKeeperOfSilence.class));
        cards.add(new SetCardInfo("Living Destiny", 195, Rarity.COMMON, mage.cards.l.LivingDestiny.class));
        cards.add(new SetCardInfo("Lone Missionary", 34, Rarity.COMMON, mage.cards.l.LoneMissionary.class));
        cards.add(new SetCardInfo("Lord of Shatterskull Pass", 156, Rarity.RARE, mage.cards.l.LordOfShatterskullPass.class));
        cards.add(new SetCardInfo("Luminous Wake", 35, Rarity.UNCOMMON, mage.cards.l.LuminousWake.class));
        cards.add(new SetCardInfo("Lust for War", 157, Rarity.UNCOMMON, mage.cards.l.LustForWar.class));
        cards.add(new SetCardInfo("Magmaw", 158, Rarity.RARE, mage.cards.m.Magmaw.class));
        cards.add(new SetCardInfo("Makindi Griffin", 36, Rarity.COMMON, mage.cards.m.MakindiGriffin.class));
        cards.add(new SetCardInfo("Mammoth Umbra", 37, Rarity.UNCOMMON, mage.cards.m.MammothUmbra.class));
        cards.add(new SetCardInfo("Merfolk Observer", 76, Rarity.COMMON, mage.cards.m.MerfolkObserver.class));
        cards.add(new SetCardInfo("Merfolk Skyscout", 77, Rarity.UNCOMMON, mage.cards.m.MerfolkSkyscout.class));
        cards.add(new SetCardInfo("Might of the Masses", 196, Rarity.COMMON, mage.cards.m.MightOfTheMasses.class));
        cards.add(new SetCardInfo("Mnemonic Wall", 78, Rarity.COMMON, mage.cards.m.MnemonicWall.class));
        cards.add(new SetCardInfo("Momentous Fall", 197, Rarity.RARE, mage.cards.m.MomentousFall.class));
        cards.add(new SetCardInfo("Mortician Beetle", 117, Rarity.RARE, mage.cards.m.MorticianBeetle.class));
        cards.add(new SetCardInfo("Mountain", 241, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 242, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 243, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 244, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mul Daya Channelers", 198, Rarity.RARE, mage.cards.m.MulDayaChannelers.class));
        cards.add(new SetCardInfo("Narcolepsy", 79, Rarity.COMMON, mage.cards.n.Narcolepsy.class));
        cards.add(new SetCardInfo("Naturalize", 199, Rarity.COMMON, mage.cards.n.Naturalize.class));
        cards.add(new SetCardInfo("Near-Death Experience", 38, Rarity.RARE, mage.cards.n.NearDeathExperience.class));
        cards.add(new SetCardInfo("Nema Siltlurker", 200, Rarity.COMMON, mage.cards.n.NemaSiltlurker.class));
        cards.add(new SetCardInfo("Nest Invader", 201, Rarity.COMMON, mage.cards.n.NestInvader.class));
        cards.add(new SetCardInfo("Nighthaze", 118, Rarity.COMMON, mage.cards.n.Nighthaze.class));
        cards.add(new SetCardInfo("Nirkana Cutthroat", 119, Rarity.UNCOMMON, mage.cards.n.NirkanaCutthroat.class));
        cards.add(new SetCardInfo("Nirkana Revenant", 120, Rarity.MYTHIC, mage.cards.n.NirkanaRevenant.class));
        cards.add(new SetCardInfo("Nomads' Assembly", 39, Rarity.RARE, mage.cards.n.NomadsAssembly.class));
        cards.add(new SetCardInfo("Not of This World", 8, Rarity.UNCOMMON, mage.cards.n.NotOfThisWorld.class));
        cards.add(new SetCardInfo("Null Champion", 121, Rarity.COMMON, mage.cards.n.NullChampion.class));
        cards.add(new SetCardInfo("Ogre's Cleaver", 220, Rarity.UNCOMMON, mage.cards.o.OgresCleaver.class));
        cards.add(new SetCardInfo("Ogre Sentry", 159, Rarity.COMMON, mage.cards.o.OgreSentry.class));
        cards.add(new SetCardInfo("Ondu Giant", 202, Rarity.COMMON, mage.cards.o.OnduGiant.class));
        cards.add(new SetCardInfo("Oust", 40, Rarity.UNCOMMON, mage.cards.o.Oust.class));
        cards.add(new SetCardInfo("Overgrown Battlement", 203, Rarity.COMMON, mage.cards.o.OvergrownBattlement.class));
        cards.add(new SetCardInfo("Pathrazer of Ulamog", 9, Rarity.UNCOMMON, mage.cards.p.PathrazerOfUlamog.class));
        cards.add(new SetCardInfo("Pawn of Ulamog", 122, Rarity.UNCOMMON, mage.cards.p.PawnOfUlamog.class));
        cards.add(new SetCardInfo("Pelakka Wurm", 204, Rarity.UNCOMMON, mage.cards.p.PelakkaWurm.class));
        cards.add(new SetCardInfo("Pennon Blade", 221, Rarity.UNCOMMON, mage.cards.p.PennonBlade.class));
        cards.add(new SetCardInfo("Perish the Thought", 123, Rarity.COMMON, mage.cards.p.PerishTheThought.class));
        cards.add(new SetCardInfo("Pestilence Demon", 124, Rarity.RARE, mage.cards.p.PestilenceDemon.class));
        cards.add(new SetCardInfo("Phantasmal Abomination", 80, Rarity.UNCOMMON, mage.cards.p.PhantasmalAbomination.class));
        cards.add(new SetCardInfo("Plains", 229, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 230, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 231, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 232, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Prey's Vengeance", 205, Rarity.UNCOMMON, mage.cards.p.PreysVengeance.class));
        cards.add(new SetCardInfo("Prophetic Prism", 222, Rarity.COMMON, mage.cards.p.PropheticPrism.class));
        cards.add(new SetCardInfo("Puncturing Light", 41, Rarity.COMMON, mage.cards.p.PuncturingLight.class));
        cards.add(new SetCardInfo("Rage Nimbus", 160, Rarity.RARE, mage.cards.r.RageNimbus.class));
        cards.add(new SetCardInfo("Raid Bombardment", 161, Rarity.COMMON, mage.cards.r.RaidBombardment.class));
        cards.add(new SetCardInfo("Rapacious One", 162, Rarity.UNCOMMON, mage.cards.r.RapaciousOne.class));
        cards.add(new SetCardInfo("Reality Spasm", 81, Rarity.UNCOMMON, mage.cards.r.RealitySpasm.class));
        cards.add(new SetCardInfo("Realms Uncharted", 206, Rarity.RARE, mage.cards.r.RealmsUncharted.class));
        cards.add(new SetCardInfo("Recurring Insight", 82, Rarity.RARE, mage.cards.r.RecurringInsight.class));
        cards.add(new SetCardInfo("Regress", 83, Rarity.COMMON, mage.cards.r.Regress.class));
        cards.add(new SetCardInfo("Reinforced Bulwark", 223, Rarity.COMMON, mage.cards.r.ReinforcedBulwark.class));
        cards.add(new SetCardInfo("Renegade Doppelganger", 84, Rarity.RARE, mage.cards.r.RenegadeDoppelganger.class));
        cards.add(new SetCardInfo("Repay in Kind", 125, Rarity.RARE, mage.cards.r.RepayInKind.class));
        cards.add(new SetCardInfo("Repel the Darkness", 42, Rarity.COMMON, mage.cards.r.RepelTheDarkness.class));
        cards.add(new SetCardInfo("Runed Servitor", 224, Rarity.UNCOMMON, mage.cards.r.RunedServitor.class));
        cards.add(new SetCardInfo("Sarkhan the Mad", 214, Rarity.MYTHIC, mage.cards.s.SarkhanTheMad.class));
        cards.add(new SetCardInfo("Sea Gate Oracle", 85, Rarity.COMMON, mage.cards.s.SeaGateOracle.class));
        cards.add(new SetCardInfo("See Beyond", 86, Rarity.COMMON, mage.cards.s.SeeBeyond.class));
        cards.add(new SetCardInfo("Shared Discovery", 87, Rarity.COMMON, mage.cards.s.SharedDiscovery.class));
        cards.add(new SetCardInfo("Shrivel", 126, Rarity.COMMON, mage.cards.s.Shrivel.class));
        cards.add(new SetCardInfo("Skeletal Wurm", 127, Rarity.UNCOMMON, mage.cards.s.SkeletalWurm.class));
        cards.add(new SetCardInfo("Skittering Invasion", 10, Rarity.UNCOMMON, mage.cards.s.SkitteringInvasion.class));
        cards.add(new SetCardInfo("Skywatcher Adept", 88, Rarity.COMMON, mage.cards.s.SkywatcherAdept.class));
        cards.add(new SetCardInfo("Smite", 43, Rarity.COMMON, mage.cards.s.Smite.class));
        cards.add(new SetCardInfo("Snake Umbra", 207, Rarity.COMMON, mage.cards.s.SnakeUmbra.class));
        cards.add(new SetCardInfo("Soulbound Guardians", 45, Rarity.UNCOMMON, mage.cards.s.SoulboundGuardians.class));
        cards.add(new SetCardInfo("Soul's Attendant", 44, Rarity.COMMON, mage.cards.s.SoulsAttendant.class));
        cards.add(new SetCardInfo("Soulsurge Elemental", 163, Rarity.UNCOMMON, mage.cards.s.SoulsurgeElemental.class));
        cards.add(new SetCardInfo("Spawning Breath", 164, Rarity.COMMON, mage.cards.s.SpawningBreath.class));
        cards.add(new SetCardInfo("Spawnsire of Ulamog", 11, Rarity.RARE, mage.cards.s.SpawnsireOfUlamog.class));
        cards.add(new SetCardInfo("Sphinx-Bone Wand", 225, Rarity.RARE, mage.cards.s.SphinxBoneWand.class));
        cards.add(new SetCardInfo("Sphinx of Magosi", 89, Rarity.RARE, mage.cards.s.SphinxOfMagosi.class));
        cards.add(new SetCardInfo("Spider Umbra", 208, Rarity.COMMON, mage.cards.s.SpiderUmbra.class));
        cards.add(new SetCardInfo("Splinter Twin", 165, Rarity.RARE, mage.cards.s.SplinterTwin.class));
        cards.add(new SetCardInfo("Sporecap Spider", 209, Rarity.COMMON, mage.cards.s.SporecapSpider.class));
        cards.add(new SetCardInfo("Staggershock", 166, Rarity.COMMON, mage.cards.s.Staggershock.class));
        cards.add(new SetCardInfo("Stalwart Shield-Bearers", 46, Rarity.COMMON, mage.cards.s.StalwartShieldBearers.class));
        cards.add(new SetCardInfo("Stomper Cub", 210, Rarity.COMMON, mage.cards.s.StomperCub.class));
        cards.add(new SetCardInfo("Student of Warfare", 47, Rarity.RARE, mage.cards.s.StudentOfWarfare.class));
        cards.add(new SetCardInfo("Suffer the Past", 128, Rarity.UNCOMMON, mage.cards.s.SufferThePast.class));
        cards.add(new SetCardInfo("Surrakar Spellblade", 90, Rarity.RARE, mage.cards.s.SurrakarSpellblade.class));
        cards.add(new SetCardInfo("Surreal Memoir", 167, Rarity.UNCOMMON, mage.cards.s.SurrealMemoir.class));
        cards.add(new SetCardInfo("Survival Cache", 48, Rarity.UNCOMMON, mage.cards.s.SurvivalCache.class));
        cards.add(new SetCardInfo("Swamp", 237, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 238, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 239, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 240, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Tajuru Preserver", 211, Rarity.RARE, mage.cards.t.TajuruPreserver.class));
        cards.add(new SetCardInfo("Thought Gorger", 129, Rarity.RARE, mage.cards.t.ThoughtGorger.class));
        cards.add(new SetCardInfo("Time of Heroes", 49, Rarity.UNCOMMON, mage.cards.t.TimeOfHeroes.class));
        cards.add(new SetCardInfo("Totem-Guide Hartebeest", 50, Rarity.COMMON, mage.cards.t.TotemGuideHartebeest.class));
        cards.add(new SetCardInfo("Training Grounds", 91, Rarity.RARE, mage.cards.t.TrainingGrounds.class));
        cards.add(new SetCardInfo("Traitorous Instinct", 168, Rarity.UNCOMMON, mage.cards.t.TraitorousInstinct.class));
        cards.add(new SetCardInfo("Transcendent Master", 51, Rarity.MYTHIC, mage.cards.t.TranscendentMaster.class));
        cards.add(new SetCardInfo("Tuktuk the Explorer", 169, Rarity.RARE, mage.cards.t.TuktukTheExplorer.class));
        cards.add(new SetCardInfo("Ulamog's Crusher", 13, Rarity.COMMON, mage.cards.u.UlamogsCrusher.class));
        cards.add(new SetCardInfo("Ulamog, the Infinite Gyre", 12, Rarity.MYTHIC, mage.cards.u.UlamogTheInfiniteGyre.class));
        cards.add(new SetCardInfo("Umbra Mystic", 52, Rarity.RARE, mage.cards.u.UmbraMystic.class));
        cards.add(new SetCardInfo("Unified Will", 92, Rarity.UNCOMMON, mage.cards.u.UnifiedWill.class));
        cards.add(new SetCardInfo("Valakut Fireboar", 170, Rarity.UNCOMMON, mage.cards.v.ValakutFireboar.class));
        cards.add(new SetCardInfo("Vendetta", 130, Rarity.COMMON, mage.cards.v.Vendetta.class));
        cards.add(new SetCardInfo("Venerated Teacher", 93, Rarity.COMMON, mage.cards.v.VeneratedTeacher.class));
        cards.add(new SetCardInfo("Vengevine", 212, Rarity.MYTHIC, mage.cards.v.Vengevine.class));
        cards.add(new SetCardInfo("Vent Sentinel", 171, Rarity.COMMON, mage.cards.v.VentSentinel.class));
        cards.add(new SetCardInfo("Virulent Swipe", 131, Rarity.UNCOMMON, mage.cards.v.VirulentSwipe.class));
        cards.add(new SetCardInfo("Wall of Omens", 53, Rarity.UNCOMMON, mage.cards.w.WallOfOmens.class));
        cards.add(new SetCardInfo("Warmonger's Chariot", 226, Rarity.UNCOMMON, mage.cards.w.WarmongersChariot.class));
        cards.add(new SetCardInfo("Wildheart Invoker", 213, Rarity.COMMON, mage.cards.w.WildheartInvoker.class));
        cards.add(new SetCardInfo("World at War", 172, Rarity.RARE, mage.cards.w.WorldAtWar.class));
        cards.add(new SetCardInfo("Wrap in Flames", 173, Rarity.COMMON, mage.cards.w.WrapInFlames.class));
        cards.add(new SetCardInfo("Zof Shade", 132, Rarity.COMMON, mage.cards.z.ZofShade.class));
        cards.add(new SetCardInfo("Zulaport Enforcer", 133, Rarity.COMMON, mage.cards.z.ZulaportEnforcer.class));
    }

}
