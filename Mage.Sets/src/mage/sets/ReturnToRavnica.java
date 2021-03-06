/*
 * Copyright 2011 BetaSteward_at_googlemail.com. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.constants.SetType;
import mage.cards.ExpansionSet;

import mage.constants.Rarity;
import mage.cards.CardGraphicInfo;

/**
 *
 * @author magenoxx_at_gmail.com
 */
public class ReturnToRavnica extends ExpansionSet {

    private static final ReturnToRavnica fINSTANCE = new ReturnToRavnica();

    public static ReturnToRavnica getInstance() {
        return fINSTANCE;
    }

    private ReturnToRavnica() {
        super("Return to Ravnica", "RTR", ExpansionSet.buildDate(2012, 9, 29), SetType.EXPANSION);
        this.blockName = "Return to Ravnica";
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        cards.add(new SetCardInfo("Abrupt Decay", 141, Rarity.RARE, mage.cards.a.AbruptDecay.class));
        cards.add(new SetCardInfo("Aerial Predation", 113, Rarity.COMMON, mage.cards.a.AerialPredation.class));
        cards.add(new SetCardInfo("Angel of Serenity", 1, Rarity.MYTHIC, mage.cards.a.AngelOfSerenity.class));
        cards.add(new SetCardInfo("Annihilating Fire", 85, Rarity.COMMON, mage.cards.a.AnnihilatingFire.class));
        cards.add(new SetCardInfo("Aquus Steed", 29, Rarity.UNCOMMON, mage.cards.a.AquusSteed.class));
        cards.add(new SetCardInfo("Archon of the Triumvirate", 142, Rarity.RARE, mage.cards.a.ArchonOfTheTriumvirate.class));
        cards.add(new SetCardInfo("Archweaver", 114, Rarity.UNCOMMON, mage.cards.a.Archweaver.class));
        cards.add(new SetCardInfo("Armada Wurm", 143, Rarity.MYTHIC, mage.cards.a.ArmadaWurm.class));
        cards.add(new SetCardInfo("Armory Guard", 2, Rarity.COMMON, mage.cards.a.ArmoryGuard.class));
        cards.add(new SetCardInfo("Arrest", 3, Rarity.UNCOMMON, mage.cards.a.Arrest.class));
        cards.add(new SetCardInfo("Ash Zealot", 86, Rarity.RARE, mage.cards.a.AshZealot.class));
        cards.add(new SetCardInfo("Assassin's Strike", 57, Rarity.UNCOMMON, mage.cards.a.AssassinsStrike.class));
        cards.add(new SetCardInfo("Auger Spree", 144, Rarity.COMMON, mage.cards.a.AugerSpree.class));
        cards.add(new SetCardInfo("Avenging Arrow", 4, Rarity.COMMON, mage.cards.a.AvengingArrow.class));
        cards.add(new SetCardInfo("Axebane Guardian", 115, Rarity.COMMON, mage.cards.a.AxebaneGuardian.class));
        cards.add(new SetCardInfo("Axebane Stag", 116, Rarity.COMMON, mage.cards.a.AxebaneStag.class));
        cards.add(new SetCardInfo("Azorius Arrester", 5, Rarity.COMMON, mage.cards.a.AzoriusArrester.class));
        cards.add(new SetCardInfo("Azorius Charm", 145, Rarity.UNCOMMON, mage.cards.a.AzoriusCharm.class));
        cards.add(new SetCardInfo("Azorius Guildgate", 237, Rarity.COMMON, mage.cards.a.AzoriusGuildgate.class));
        cards.add(new SetCardInfo("Azorius Justiciar", 6, Rarity.UNCOMMON, mage.cards.a.AzoriusJusticiar.class));
        cards.add(new SetCardInfo("Azorius Keyrune", 225, Rarity.UNCOMMON, mage.cards.a.AzoriusKeyrune.class));
        cards.add(new SetCardInfo("Azor's Elocutors", 210, Rarity.RARE, mage.cards.a.AzorsElocutors.class));
        cards.add(new SetCardInfo("Batterhorn", 87, Rarity.COMMON, mage.cards.b.Batterhorn.class));
        cards.add(new SetCardInfo("Bazaar Krovod", 7, Rarity.UNCOMMON, mage.cards.b.BazaarKrovod.class));
        cards.add(new SetCardInfo("Bellows Lizard", 88, Rarity.COMMON, mage.cards.b.BellowsLizard.class));
        cards.add(new SetCardInfo("Blistercoil Weird", 211, Rarity.UNCOMMON, mage.cards.b.BlistercoilWeird.class));
        cards.add(new SetCardInfo("Blood Crypt", 238, Rarity.RARE, mage.cards.b.BloodCrypt.class));
        cards.add(new SetCardInfo("Bloodfray Giant", 89, Rarity.UNCOMMON, mage.cards.b.BloodfrayGiant.class));
        cards.add(new SetCardInfo("Blustersquall", 30, Rarity.UNCOMMON, mage.cards.b.Blustersquall.class));
        cards.add(new SetCardInfo("Brushstrider", 117, Rarity.UNCOMMON, mage.cards.b.Brushstrider.class));
        cards.add(new SetCardInfo("Call of the Conclave", 146, Rarity.UNCOMMON, mage.cards.c.CallOfTheConclave.class));
        cards.add(new SetCardInfo("Cancel", 31, Rarity.COMMON, mage.cards.c.Cancel.class));
        cards.add(new SetCardInfo("Carnival Hellsteed", 147, Rarity.RARE, mage.cards.c.CarnivalHellsteed.class));
        cards.add(new SetCardInfo("Catacomb Slug", 58, Rarity.COMMON, mage.cards.c.CatacombSlug.class));
        cards.add(new SetCardInfo("Centaur Healer", 148, Rarity.COMMON, mage.cards.c.CentaurHealer.class));
        cards.add(new SetCardInfo("Centaur's Herald", 118, Rarity.COMMON, mage.cards.c.CentaursHerald.class));
        cards.add(new SetCardInfo("Chaos Imps", 90, Rarity.RARE, mage.cards.c.ChaosImps.class));
        cards.add(new SetCardInfo("Chemister's Trick", 149, Rarity.COMMON, mage.cards.c.ChemistersTrick.class));
        cards.add(new SetCardInfo("Chorus of Might", 119, Rarity.COMMON, mage.cards.c.ChorusOfMight.class));
        cards.add(new SetCardInfo("Chromatic Lantern", 226, Rarity.RARE, mage.cards.c.ChromaticLantern.class));
        cards.add(new SetCardInfo("Chronic Flooding", 32, Rarity.COMMON, mage.cards.c.ChronicFlooding.class));
        cards.add(new SetCardInfo("Civic Saber", 227, Rarity.UNCOMMON, mage.cards.c.CivicSaber.class));
        cards.add(new SetCardInfo("Cobblebrute", 91, Rarity.COMMON, mage.cards.c.Cobblebrute.class));
        cards.add(new SetCardInfo("Codex Shredder", 228, Rarity.UNCOMMON, mage.cards.c.CodexShredder.class));
        cards.add(new SetCardInfo("Collective Blessing", 150, Rarity.RARE, mage.cards.c.CollectiveBlessing.class));
        cards.add(new SetCardInfo("Common Bond", 151, Rarity.COMMON, mage.cards.c.CommonBond.class));
        cards.add(new SetCardInfo("Concordia Pegasus", 8, Rarity.COMMON, mage.cards.c.ConcordiaPegasus.class));
        cards.add(new SetCardInfo("Conjured Currency", 33, Rarity.RARE, mage.cards.c.ConjuredCurrency.class));
        cards.add(new SetCardInfo("Corpsejack Menace", 152, Rarity.RARE, mage.cards.c.CorpsejackMenace.class));
        cards.add(new SetCardInfo("Counterflux", 153, Rarity.RARE, mage.cards.c.Counterflux.class));
        cards.add(new SetCardInfo("Coursers' Accord", 154, Rarity.COMMON, mage.cards.c.CoursersAccord.class));
        cards.add(new SetCardInfo("Cremate", 59, Rarity.COMMON, mage.cards.c.Cremate.class));
        cards.add(new SetCardInfo("Crosstown Courier", 34, Rarity.COMMON, mage.cards.c.CrosstownCourier.class));
        cards.add(new SetCardInfo("Cryptborn Horror", 212, Rarity.RARE, mage.cards.c.CryptbornHorror.class));
        cards.add(new SetCardInfo("Cyclonic Rift", 35, Rarity.RARE, mage.cards.c.CyclonicRift.class));
        cards.add(new SetCardInfo("Daggerdrome Imp", 60, Rarity.COMMON, mage.cards.d.DaggerdromeImp.class));
        cards.add(new SetCardInfo("Dark Revenant", 61, Rarity.UNCOMMON, mage.cards.d.DarkRevenant.class));
        cards.add(new SetCardInfo("Deadbridge Goliath", 120, Rarity.RARE, mage.cards.d.DeadbridgeGoliath.class));
        cards.add(new SetCardInfo("Dead Reveler", 62, Rarity.COMMON, mage.cards.d.DeadReveler.class));
        cards.add(new SetCardInfo("Deathrite Shaman", 213, Rarity.RARE, mage.cards.d.DeathriteShaman.class));
        cards.add(new SetCardInfo("Death's Presence", 121, Rarity.RARE, mage.cards.d.DeathsPresence.class));
        cards.add(new SetCardInfo("Desecration Demon", 63, Rarity.RARE, mage.cards.d.DesecrationDemon.class));
        cards.add(new SetCardInfo("Destroy the Evidence", 64, Rarity.COMMON, mage.cards.d.DestroyTheEvidence.class));
        cards.add(new SetCardInfo("Detention Sphere", 155, Rarity.RARE, mage.cards.d.DetentionSphere.class));
        cards.add(new SetCardInfo("Deviant Glee", 65, Rarity.COMMON, mage.cards.d.DeviantGlee.class));
        cards.add(new SetCardInfo("Dispel", 36, Rarity.COMMON, mage.cards.d.Dispel.class));
        cards.add(new SetCardInfo("Doorkeeper", 37, Rarity.COMMON, mage.cards.d.Doorkeeper.class));
        cards.add(new SetCardInfo("Downsize", 38, Rarity.COMMON, mage.cards.d.Downsize.class));
        cards.add(new SetCardInfo("Drainpipe Vermin", 66, Rarity.COMMON, mage.cards.d.DrainpipeVermin.class));
        cards.add(new SetCardInfo("Dramatic Rescue", 156, Rarity.COMMON, mage.cards.d.DramaticRescue.class));
        cards.add(new SetCardInfo("Dreadbore", 157, Rarity.RARE, mage.cards.d.Dreadbore.class));
        cards.add(new SetCardInfo("Dreg Mangler", 158, Rarity.UNCOMMON, mage.cards.d.DregMangler.class));
        cards.add(new SetCardInfo("Drudge Beetle", 122, Rarity.COMMON, mage.cards.d.DrudgeBeetle.class));
        cards.add(new SetCardInfo("Druid's Deliverance", 123, Rarity.COMMON, mage.cards.d.DruidsDeliverance.class));
        cards.add(new SetCardInfo("Dryad Militant", 214, Rarity.UNCOMMON, mage.cards.d.DryadMilitant.class));
        cards.add(new SetCardInfo("Dynacharge", 92, Rarity.COMMON, mage.cards.d.Dynacharge.class));
        cards.add(new SetCardInfo("Electrickery", 93, Rarity.COMMON, mage.cards.e.Electrickery.class));
        cards.add(new SetCardInfo("Epic Experiment", 159, Rarity.MYTHIC, mage.cards.e.EpicExperiment.class));
        cards.add(new SetCardInfo("Essence Backlash", 160, Rarity.COMMON, mage.cards.e.EssenceBacklash.class));
        cards.add(new SetCardInfo("Ethereal Armor", 9, Rarity.COMMON, mage.cards.e.EtherealArmor.class));
        cards.add(new SetCardInfo("Explosive Impact", 94, Rarity.COMMON, mage.cards.e.ExplosiveImpact.class));
        cards.add(new SetCardInfo("Eyes in the Skies", 10, Rarity.COMMON, mage.cards.e.EyesInTheSkies.class));
        cards.add(new SetCardInfo("Faerie Impostor", 39, Rarity.UNCOMMON, mage.cards.f.FaerieImpostor.class));
        cards.add(new SetCardInfo("Fall of the Gavel", 161, Rarity.UNCOMMON, mage.cards.f.FallOfTheGavel.class));
        cards.add(new SetCardInfo("Fencing Ace", 11, Rarity.UNCOMMON, mage.cards.f.FencingAce.class));
        cards.add(new SetCardInfo("Firemind's Foresight", 162, Rarity.RARE, mage.cards.f.FiremindsForesight.class));
        cards.add(new SetCardInfo("Forest", 270, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 271, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 272, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 273, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 274, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Frostburn Weird", 215, Rarity.COMMON, mage.cards.f.FrostburnWeird.class));
        cards.add(new SetCardInfo("Gatecreeper Vine", 124, Rarity.COMMON, mage.cards.g.GatecreeperVine.class));
        cards.add(new SetCardInfo("Giant Growth", 125, Rarity.COMMON, mage.cards.g.GiantGrowth.class));
        cards.add(new SetCardInfo("Gobbling Ooze", 126, Rarity.UNCOMMON, mage.cards.g.GobblingOoze.class));
        cards.add(new SetCardInfo("Goblin Electromancer", 163, Rarity.COMMON, mage.cards.g.GoblinElectromancer.class));
        cards.add(new SetCardInfo("Goblin Rally", 95, Rarity.UNCOMMON, mage.cards.g.GoblinRally.class));
        cards.add(new SetCardInfo("Golgari Charm", 164, Rarity.UNCOMMON, mage.cards.g.GolgariCharm.class));
        cards.add(new SetCardInfo("Golgari Decoy", 127, Rarity.UNCOMMON, mage.cards.g.GolgariDecoy.class));
        cards.add(new SetCardInfo("Golgari Guildgate", 239, Rarity.COMMON, mage.cards.g.GolgariGuildgate.class));
        cards.add(new SetCardInfo("Golgari Keyrune", 229, Rarity.UNCOMMON, mage.cards.g.GolgariKeyrune.class));
        cards.add(new SetCardInfo("Golgari Longlegs", 216, Rarity.COMMON, mage.cards.g.GolgariLonglegs.class));
        cards.add(new SetCardInfo("Gore-House Chainwalker", 96, Rarity.COMMON, mage.cards.g.GoreHouseChainwalker.class));
        cards.add(new SetCardInfo("Grave Betrayal", 67, Rarity.RARE, mage.cards.g.GraveBetrayal.class));
        cards.add(new SetCardInfo("Grim Roustabout", 68, Rarity.COMMON, mage.cards.g.GrimRoustabout.class));
        cards.add(new SetCardInfo("Grisly Salvage", 165, Rarity.COMMON, mage.cards.g.GrislySalvage.class));
        cards.add(new SetCardInfo("Grove of the Guardian", 240, Rarity.RARE, mage.cards.g.GroveOfTheGuardian.class));
        cards.add(new SetCardInfo("Growing Ranks", 217, Rarity.RARE, mage.cards.g.GrowingRanks.class));
        cards.add(new SetCardInfo("Guild Feud", 97, Rarity.RARE, mage.cards.g.GuildFeud.class));
        cards.add(new SetCardInfo("Guttersnipe", 98, Rarity.UNCOMMON, mage.cards.g.Guttersnipe.class));
        cards.add(new SetCardInfo("Hallowed Fountain", 241, Rarity.RARE, mage.cards.h.HallowedFountain.class));
        cards.add(new SetCardInfo("Havoc Festival", 166, Rarity.RARE, mage.cards.h.HavocFestival.class));
        cards.add(new SetCardInfo("Hellhole Flailer", 167, Rarity.UNCOMMON, mage.cards.h.HellholeFlailer.class));
        cards.add(new SetCardInfo("Heroes' Reunion", 168, Rarity.UNCOMMON, mage.cards.h.HeroesReunion.class));
        cards.add(new SetCardInfo("Horncaller's Chant", 128, Rarity.COMMON, mage.cards.h.HorncallersChant.class));
        cards.add(new SetCardInfo("Hover Barrier", 40, Rarity.UNCOMMON, mage.cards.h.HoverBarrier.class));
        cards.add(new SetCardInfo("Hussar Patrol", 169, Rarity.COMMON, mage.cards.h.HussarPatrol.class));
        cards.add(new SetCardInfo("Hypersonic Dragon", 170, Rarity.RARE, mage.cards.h.HypersonicDragon.class));
        cards.add(new SetCardInfo("Inaction Injunction", 41, Rarity.COMMON, mage.cards.i.InactionInjunction.class));
        cards.add(new SetCardInfo("Inspiration", 42, Rarity.COMMON, mage.cards.i.Inspiration.class));
        cards.add(new SetCardInfo("Island", 255, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 256, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 257, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 258, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 259, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Isperia's Skywatch", 43, Rarity.COMMON, mage.cards.i.IsperiasSkywatch.class));
        cards.add(new SetCardInfo("Isperia, Supreme Judge", 171, Rarity.MYTHIC, mage.cards.i.IsperiaSupremeJudge.class));
        cards.add(new SetCardInfo("Izzet Charm", 172, Rarity.UNCOMMON, mage.cards.i.IzzetCharm.class));
        cards.add(new SetCardInfo("Izzet Guildgate", 242, Rarity.COMMON, mage.cards.i.IzzetGuildgate.class));
        cards.add(new SetCardInfo("Izzet Keyrune", 230, Rarity.UNCOMMON, mage.cards.i.IzzetKeyrune.class));
        cards.add(new SetCardInfo("Izzet Staticaster", 173, Rarity.UNCOMMON, mage.cards.i.IzzetStaticaster.class));
        cards.add(new SetCardInfo("Jace, Architect of Thought", 44, Rarity.MYTHIC, mage.cards.j.JaceArchitectOfThought.class));
        cards.add(new SetCardInfo("Jarad, Golgari Lich Lord", 174, Rarity.MYTHIC, mage.cards.j.JaradGolgariLichLord.class));
        cards.add(new SetCardInfo("Jarad's Orders", 175, Rarity.RARE, mage.cards.j.JaradsOrders.class));
        cards.add(new SetCardInfo("Judge's Familiar", 218, Rarity.UNCOMMON, mage.cards.j.JudgesFamiliar.class));
        cards.add(new SetCardInfo("Keening Apparition", 12, Rarity.COMMON, mage.cards.k.KeeningApparition.class));
        cards.add(new SetCardInfo("Knightly Valor", 13, Rarity.COMMON, mage.cards.k.KnightlyValor.class));
        cards.add(new SetCardInfo("Korozda Guildmage", 176, Rarity.UNCOMMON, mage.cards.k.KorozdaGuildmage.class));
        cards.add(new SetCardInfo("Korozda Monitor", 129, Rarity.COMMON, mage.cards.k.KorozdaMonitor.class));
        cards.add(new SetCardInfo("Launch Party", 69, Rarity.COMMON, mage.cards.l.LaunchParty.class));
        cards.add(new SetCardInfo("Lobber Crew", 99, Rarity.COMMON, mage.cards.l.LobberCrew.class));
        cards.add(new SetCardInfo("Lotleth Troll", 177, Rarity.RARE, mage.cards.l.LotlethTroll.class));
        cards.add(new SetCardInfo("Loxodon Smiter", 178, Rarity.RARE, mage.cards.l.LoxodonSmiter.class));
        cards.add(new SetCardInfo("Lyev Skyknight", 179, Rarity.UNCOMMON, mage.cards.l.LyevSkyknight.class));
        cards.add(new SetCardInfo("Mana Bloom", 130, Rarity.RARE, mage.cards.m.ManaBloom.class));
        cards.add(new SetCardInfo("Martial Law", 14, Rarity.RARE, mage.cards.m.MartialLaw.class));
        cards.add(new SetCardInfo("Mercurial Chemister", 180, Rarity.RARE, mage.cards.m.MercurialChemister.class));
        cards.add(new SetCardInfo("Mind Rot", 70, Rarity.COMMON, mage.cards.m.MindRot.class));
        cards.add(new SetCardInfo("Minotaur Aggressor", 100, Rarity.UNCOMMON, mage.cards.m.MinotaurAggressor.class));
        cards.add(new SetCardInfo("Mizzium Mortars", 101, Rarity.RARE, mage.cards.m.MizziumMortars.class));
        cards.add(new SetCardInfo("Mizzium Skin", 45, Rarity.COMMON, mage.cards.m.MizziumSkin.class));
        cards.add(new SetCardInfo("Mountain", 265, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 266, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 267, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 268, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 269, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Necropolis Regent", 71, Rarity.MYTHIC, mage.cards.n.NecropolisRegent.class));
        cards.add(new SetCardInfo("New Prahv Guildmage", 181, Rarity.UNCOMMON, mage.cards.n.NewPrahvGuildmage.class));
        cards.add(new SetCardInfo("Nivix Guildmage", 182, Rarity.UNCOMMON, mage.cards.n.NivixGuildmage.class));
        cards.add(new SetCardInfo("Nivmagus Elemental", 219, Rarity.RARE, mage.cards.n.NivmagusElemental.class));
        cards.add(new SetCardInfo("Niv-Mizzet, Dracogenius", 183, Rarity.MYTHIC, mage.cards.n.NivMizzetDracogenius.class));
        cards.add(new SetCardInfo("Oak Street Innkeeper", 131, Rarity.UNCOMMON, mage.cards.o.OakStreetInnkeeper.class));
        cards.add(new SetCardInfo("Ogre Jailbreaker", 72, Rarity.COMMON, mage.cards.o.OgreJailbreaker.class));
        cards.add(new SetCardInfo("Overgrown Tomb", 243, Rarity.RARE, mage.cards.o.OvergrownTomb.class));
        cards.add(new SetCardInfo("Pack Rat", 73, Rarity.RARE, mage.cards.p.PackRat.class));
        cards.add(new SetCardInfo("Palisade Giant", 15, Rarity.RARE, mage.cards.p.PalisadeGiant.class));
        cards.add(new SetCardInfo("Paralyzing Grasp", 46, Rarity.COMMON, mage.cards.p.ParalyzingGrasp.class));
        cards.add(new SetCardInfo("Perilous Shadow", 74, Rarity.COMMON, mage.cards.p.PerilousShadow.class));
        cards.add(new SetCardInfo("Phantom General", 16, Rarity.UNCOMMON, mage.cards.p.PhantomGeneral.class));
        cards.add(new SetCardInfo("Pithing Needle", 231, Rarity.RARE, mage.cards.p.PithingNeedle.class));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 251, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 252, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 253, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 254, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Precinct Captain", 17, Rarity.RARE, mage.cards.p.PrecinctCaptain.class));
        cards.add(new SetCardInfo("Psychic Spiral", 47, Rarity.UNCOMMON, mage.cards.p.PsychicSpiral.class));
        cards.add(new SetCardInfo("Pursuit of Flight", 102, Rarity.COMMON, mage.cards.p.PursuitOfFlight.class));
        cards.add(new SetCardInfo("Pyroconvergence", 103, Rarity.UNCOMMON, mage.cards.p.Pyroconvergence.class));
        cards.add(new SetCardInfo("Racecourse Fury", 104, Rarity.UNCOMMON, mage.cards.r.RacecourseFury.class));
        cards.add(new SetCardInfo("Rakdos Cackler", 220, Rarity.UNCOMMON, mage.cards.r.RakdosCackler.class));
        cards.add(new SetCardInfo("Rakdos Charm", 184, Rarity.UNCOMMON, mage.cards.r.RakdosCharm.class));
        cards.add(new SetCardInfo("Rakdos Guildgate", 244, Rarity.COMMON, mage.cards.r.RakdosGuildgate.class));
        cards.add(new SetCardInfo("Rakdos Keyrune", 232, Rarity.UNCOMMON, mage.cards.r.RakdosKeyrune.class));
        cards.add(new SetCardInfo("Rakdos, Lord of Riots", 187, Rarity.MYTHIC, mage.cards.r.RakdosLordOfRiots.class));
        cards.add(new SetCardInfo("Rakdos Ragemutt", 185, Rarity.UNCOMMON, mage.cards.r.RakdosRagemutt.class));
        cards.add(new SetCardInfo("Rakdos Ringleader", 186, Rarity.UNCOMMON, mage.cards.r.RakdosRingleader.class));
        cards.add(new SetCardInfo("Rakdos Shred-Freak", 221, Rarity.COMMON, mage.cards.r.RakdosShredFreak.class));
        cards.add(new SetCardInfo("Rakdos's Return", 188, Rarity.MYTHIC, mage.cards.r.RakdossReturn.class));
        cards.add(new SetCardInfo("Rest in Peace", 18, Rarity.RARE, mage.cards.r.RestInPeace.class));
        cards.add(new SetCardInfo("Righteous Authority", 189, Rarity.RARE, mage.cards.r.RighteousAuthority.class));
        cards.add(new SetCardInfo("Risen Sanctuary", 190, Rarity.UNCOMMON, mage.cards.r.RisenSanctuary.class));
        cards.add(new SetCardInfo("Rites of Reaping", 191, Rarity.UNCOMMON, mage.cards.r.RitesOfReaping.class));
        cards.add(new SetCardInfo("Rix Maadi Guildmage", 192, Rarity.UNCOMMON, mage.cards.r.RixMaadiGuildmage.class));
        cards.add(new SetCardInfo("Rogue's Passage", 245, Rarity.UNCOMMON, mage.cards.r.RoguesPassage.class));
        cards.add(new SetCardInfo("Rootborn Defenses", 19, Rarity.COMMON, mage.cards.r.RootbornDefenses.class));
        cards.add(new SetCardInfo("Rubbleback Rhino", 132, Rarity.COMMON, mage.cards.r.RubblebackRhino.class));
        cards.add(new SetCardInfo("Runewing", 48, Rarity.COMMON, mage.cards.r.Runewing.class));
        cards.add(new SetCardInfo("Savage Surge", 133, Rarity.UNCOMMON, mage.cards.s.SavageSurge.class));
        cards.add(new SetCardInfo("Search the City", 49, Rarity.RARE, mage.cards.s.SearchTheCity.class));
        cards.add(new SetCardInfo("Search Warrant", 193, Rarity.COMMON, mage.cards.s.SearchWarrant.class));
        cards.add(new SetCardInfo("Security Blockade", 20, Rarity.UNCOMMON, mage.cards.s.SecurityBlockade.class));
        cards.add(new SetCardInfo("Seek the Horizon", 134, Rarity.UNCOMMON, mage.cards.s.SeekTheHorizon.class));
        cards.add(new SetCardInfo("Selesnya Charm", 194, Rarity.UNCOMMON, mage.cards.s.SelesnyaCharm.class));
        cards.add(new SetCardInfo("Selesnya Guildgate", 246, Rarity.COMMON, mage.cards.s.SelesnyaGuildgate.class));
        cards.add(new SetCardInfo("Selesnya Keyrune", 233, Rarity.UNCOMMON, mage.cards.s.SelesnyaKeyrune.class));
        cards.add(new SetCardInfo("Selesnya Sentry", 21, Rarity.COMMON, mage.cards.s.SelesnyaSentry.class));
        cards.add(new SetCardInfo("Seller of Songbirds", 22, Rarity.COMMON, mage.cards.s.SellerOfSongbirds.class));
        cards.add(new SetCardInfo("Sewer Shambler", 75, Rarity.COMMON, mage.cards.s.SewerShambler.class));
        cards.add(new SetCardInfo("Shrieking Affliction", 76, Rarity.UNCOMMON, mage.cards.s.ShriekingAffliction.class));
        cards.add(new SetCardInfo("Skull Rend", 195, Rarity.COMMON, mage.cards.s.SkullRend.class));
        cards.add(new SetCardInfo("Skyline Predator", 50, Rarity.UNCOMMON, mage.cards.s.SkylinePredator.class));
        cards.add(new SetCardInfo("Skymark Roc", 196, Rarity.UNCOMMON, mage.cards.s.SkymarkRoc.class));
        cards.add(new SetCardInfo("Slaughter Games", 197, Rarity.RARE, mage.cards.s.SlaughterGames.class));
        cards.add(new SetCardInfo("Slime Molding", 135, Rarity.UNCOMMON, mage.cards.s.SlimeMolding.class));
        cards.add(new SetCardInfo("Slitherhead", 222, Rarity.UNCOMMON, mage.cards.s.Slitherhead.class));
        cards.add(new SetCardInfo("Sluiceway Scorpion", 198, Rarity.COMMON, mage.cards.s.SluicewayScorpion.class));
        cards.add(new SetCardInfo("Slum Reaper", 77, Rarity.UNCOMMON, mage.cards.s.SlumReaper.class));
        cards.add(new SetCardInfo("Soulsworn Spirit", 51, Rarity.UNCOMMON, mage.cards.s.SoulswornSpirit.class));
        cards.add(new SetCardInfo("Soul Tithe", 23, Rarity.UNCOMMON, mage.cards.s.SoulTithe.class));
        cards.add(new SetCardInfo("Spawn of Rix Maadi", 199, Rarity.COMMON, mage.cards.s.SpawnOfRixMaadi.class));
        cards.add(new SetCardInfo("Sphere of Safety", 24, Rarity.UNCOMMON, mage.cards.s.SphereOfSafety.class));
        cards.add(new SetCardInfo("Sphinx of the Chimes", 52, Rarity.RARE, mage.cards.s.SphinxOfTheChimes.class));
        cards.add(new SetCardInfo("Sphinx's Revelation", 200, Rarity.MYTHIC, mage.cards.s.SphinxsRevelation.class));
        cards.add(new SetCardInfo("Splatter Thug", 105, Rarity.COMMON, mage.cards.s.SplatterThug.class));
        cards.add(new SetCardInfo("Stab Wound", 78, Rarity.COMMON, mage.cards.s.StabWound.class));
        cards.add(new SetCardInfo("Stealer of Secrets", 53, Rarity.COMMON, mage.cards.s.StealerOfSecrets.class));
        cards.add(new SetCardInfo("Steam Vents", 247, Rarity.RARE, mage.cards.s.SteamVents.class));
        cards.add(new SetCardInfo("Stonefare Crocodile", 136, Rarity.COMMON, mage.cards.s.StonefareCrocodile.class));
        cards.add(new SetCardInfo("Street Spasm", 106, Rarity.UNCOMMON, mage.cards.s.StreetSpasm.class));
        cards.add(new SetCardInfo("Street Sweeper", 234, Rarity.UNCOMMON, mage.cards.s.StreetSweeper.class));
        cards.add(new SetCardInfo("Sundering Growth", 223, Rarity.COMMON, mage.cards.s.SunderingGrowth.class));
        cards.add(new SetCardInfo("Sunspire Griffin", 25, Rarity.COMMON, mage.cards.s.SunspireGriffin.class));
        cards.add(new SetCardInfo("Supreme Verdict", 201, Rarity.RARE, mage.cards.s.SupremeVerdict.class));
        cards.add(new SetCardInfo("Survey the Wreckage", 107, Rarity.COMMON, mage.cards.s.SurveyTheWreckage.class));
        cards.add(new SetCardInfo("Swamp", 260, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 261, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 262, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 263, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 264, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swift Justice", 26, Rarity.COMMON, mage.cards.s.SwiftJustice.class));
        cards.add(new SetCardInfo("Syncopate", 54, Rarity.UNCOMMON, mage.cards.s.Syncopate.class));
        cards.add(new SetCardInfo("Tablet of the Guilds", 235, Rarity.UNCOMMON, mage.cards.t.TabletOfTheGuilds.class));
        cards.add(new SetCardInfo("Tavern Swindler", 79, Rarity.UNCOMMON, mage.cards.t.TavernSwindler.class));
        cards.add(new SetCardInfo("Teleportal", 202, Rarity.UNCOMMON, mage.cards.t.Teleportal.class));
        cards.add(new SetCardInfo("Temple Garden", 248, Rarity.RARE, mage.cards.t.TempleGarden.class));
        cards.add(new SetCardInfo("Tenement Crasher", 108, Rarity.COMMON, mage.cards.t.TenementCrasher.class));
        cards.add(new SetCardInfo("Terrus Wurm", 80, Rarity.COMMON, mage.cards.t.TerrusWurm.class));
        cards.add(new SetCardInfo("Thoughtflare", 203, Rarity.UNCOMMON, mage.cards.t.Thoughtflare.class));
        cards.add(new SetCardInfo("Thrill-Kill Assassin", 81, Rarity.UNCOMMON, mage.cards.t.ThrillKillAssassin.class));
        cards.add(new SetCardInfo("Tower Drake", 55, Rarity.COMMON, mage.cards.t.TowerDrake.class));
        cards.add(new SetCardInfo("Towering Indrik", 137, Rarity.COMMON, mage.cards.t.ToweringIndrik.class));
        cards.add(new SetCardInfo("Trained Caracal", 27, Rarity.COMMON, mage.cards.t.TrainedCaracal.class));
        cards.add(new SetCardInfo("Traitorous Instinct", 109, Rarity.COMMON, mage.cards.t.TraitorousInstinct.class));
        cards.add(new SetCardInfo("Transguild Promenade", 249, Rarity.COMMON, mage.cards.t.TransguildPromenade.class));
        cards.add(new SetCardInfo("Treasured Find", 204, Rarity.UNCOMMON, mage.cards.t.TreasuredFind.class));
        cards.add(new SetCardInfo("Trestle Troll", 205, Rarity.COMMON, mage.cards.t.TrestleTroll.class));
        cards.add(new SetCardInfo("Trostani, Selesnya's Voice", 206, Rarity.MYTHIC, mage.cards.t.TrostaniSelesnyasVoice.class));
        cards.add(new SetCardInfo("Trostani's Judgment", 28, Rarity.COMMON, mage.cards.t.TrostanisJudgment.class));
        cards.add(new SetCardInfo("Ultimate Price", 82, Rarity.UNCOMMON, mage.cards.u.UltimatePrice.class));
        cards.add(new SetCardInfo("Underworld Connections", 83, Rarity.RARE, mage.cards.u.UnderworldConnections.class));
        cards.add(new SetCardInfo("Urban Burgeoning", 138, Rarity.COMMON, mage.cards.u.UrbanBurgeoning.class));
        cards.add(new SetCardInfo("Utvara Hellkite", 110, Rarity.MYTHIC, mage.cards.u.UtvaraHellkite.class));
        cards.add(new SetCardInfo("Vandalblast", 111, Rarity.UNCOMMON, mage.cards.v.Vandalblast.class));
        cards.add(new SetCardInfo("Vassal Soul", 224, Rarity.COMMON, mage.cards.v.VassalSoul.class));
        cards.add(new SetCardInfo("Viashino Racketeer", 112, Rarity.COMMON, mage.cards.v.ViashinoRacketeer.class));
        cards.add(new SetCardInfo("Vitu-Ghazi Guildmage", 207, Rarity.UNCOMMON, mage.cards.v.VituGhaziGuildmage.class));
        cards.add(new SetCardInfo("Voidwielder", 56, Rarity.COMMON, mage.cards.v.Voidwielder.class));
        cards.add(new SetCardInfo("Volatile Rig", 236, Rarity.RARE, mage.cards.v.VolatileRig.class));
        cards.add(new SetCardInfo("Vraska the Unseen", 208, Rarity.MYTHIC, mage.cards.v.VraskaTheUnseen.class));
        cards.add(new SetCardInfo("Wayfaring Temple", 209, Rarity.RARE, mage.cards.w.WayfaringTemple.class));
        cards.add(new SetCardInfo("Wild Beastmaster", 139, Rarity.RARE, mage.cards.w.WildBeastmaster.class));
        cards.add(new SetCardInfo("Worldspine Wurm", 140, Rarity.MYTHIC, mage.cards.w.WorldspineWurm.class));
        cards.add(new SetCardInfo("Zanikev Locust", 84, Rarity.UNCOMMON, mage.cards.z.ZanikevLocust.class));
    }
}
