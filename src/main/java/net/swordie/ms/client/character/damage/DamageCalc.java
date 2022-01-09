package net.swordie.ms.client.character.damage;

import net.swordie.ms.client.character.Char;
import net.swordie.ms.client.character.items.BodyPart;
import net.swordie.ms.client.character.skills.info.SkillInfo;
import net.swordie.ms.client.character.skills.SkillStat;
import net.swordie.ms.client.character.skills.temp.TemporaryStatManager;
import net.swordie.ms.constants.GameConstants;
import net.swordie.ms.constants.ItemConstants;
import net.swordie.ms.constants.JobConstants;
import net.swordie.ms.constants.SkillConstants;
import net.swordie.ms.enums.BaseStat;
import net.swordie.ms.enums.Stat;
import net.swordie.ms.enums.WeaponType;
import net.swordie.ms.loaders.SkillData;

import java.util.Map;

import static net.swordie.ms.client.character.skills.temp.CharacterTemporaryStat.SetBaseDamage;
import static net.swordie.ms.enums.BaseStat.*;


/**
 * Created on 5/4/2018.
 */
public class DamageCalc {

    private int seed1, seed2, seed3;
    private Char chr;

    public DamageCalc() {
    }

    public DamageCalc(Char chr, int seed1, int seed2, int seed3) {
        this.seed1 = seed1;
        this.seed2 = seed2;
        this.seed3 = seed3;
        this.chr = chr;
    }

    public int getSeed1() {
        return seed1;
    }

    public int getSeed2() {
        return seed2;
    }

    public int getSeed3() {
        return seed3;
    }

    public long calcPDamageForPvM(int skillID, int slv, int dotDmg) {
        TemporaryStatManager tsm = chr.getTemporaryStatManager();
        WeaponType weaponType = chr.getWeaponType();
        SkillInfo si = SkillData.getSkillInfoById(skillID);
        double mult = (si == null ? 100 : dotDmg) / 100D;
        mult = mult == 0 ? si.getValue(SkillStat.damage, slv) / 100D : mult;
        BaseStat mainStat = GameConstants.getMainStatForJob(chr.getJob());
        BaseStat secStat = GameConstants.getSecStatByMainStat(mainStat);
        BaseStat attStat = mainStat == inte ? mad : pad;
        int mainAmount = chr.getTotalStat(mainStat);
        int secAmount = chr.getTotalStat(secStat);
        int attAmount = chr.getTotalStat(attStat);
        Map<BaseStat, Integer> basicStats = chr.getTotalBasicStats();
        int setBaseDamage = tsm.hasStat(SetBaseDamage) ? tsm.getOption(SetBaseDamage).nOption : 0;
        long damage = calcDamageByWT(weaponType, basicStats, setBaseDamage, skillID);
        return (long) (damage * mult);
    }

    private long calcDamageByWT(WeaponType wt, Map<BaseStat, Integer> stats, int setBaseDamage, int skillID) {
        if (setBaseDamage > 0) {
            return setBaseDamage;
        }
        long dmg = 0;
        double jobConst = JobConstants.getDamageConstant(chr.getJob());
        short job = chr.getJob();
        if (JobConstants.isBeginnerJob(job)) {
            dmg = calcBaseDamage(stats.get(str), stats.get(dex), 0, stats.get(pad), jobConst + 1.2);
        } else {
            if (JobConstants.getJobCategory(job) != 2 || JobConstants.isLuminous(job) || JobConstants.isKinesis(job)) {
                switch (wt) {
                    case None:
                        break;
                    case ShiningRod:
                        dmg = calcBaseDamage(stats.get(inte), stats.get(luk), 0, stats.get(mad), jobConst + 1.2);
                        break;
                    case SoulShooter:
                        dmg = calcBaseDamage(stats.get(dex), stats.get(str), 0, stats.get(pad), jobConst + 1.7);
                        break;
                    case ChainSword:
                        dmg = calcHybridBaseDamage(stats.get(str), stats.get(dex), stats.get(luk), 0, stats.get(pad), jobConst + 1.5);
                        break;
                    case Scepter:
                        dmg = calcBaseDamage(stats.get(inte), stats.get(luk), 0, stats.get(mad), jobConst + 1.34);
                        break;
                    case PsyLimiter:
                        dmg = calcBaseDamage(stats.get(inte), stats.get(luk), 0, stats.get(mad), jobConst + 1.2);
                        break;
                    case Chain:
                        dmg = calcBaseDamage(stats.get(luk), stats.get(dex), stats.get(str), stats.get(pad), jobConst + 1.3);
                        break;
                    case Gauntlet:
                        dmg = calcBaseDamage(stats.get(inte), stats.get(luk), 0, stats.get(mad), jobConst + 1.2);
                        break;
                    case OneHandedSword:
                        dmg = calcBaseDamage(stats.get(str), stats.get(dex), 0, stats.get(pad), jobConst + 1.2);
                        break;
                    case OneHandedAxe:
                    case OneHandedMace:
                        dmg = calcBaseDamage(stats.get(str), stats.get(dex), 0, stats.get(pad), jobConst + 1.2);
                        break;
                    case Dagger:
                        dmg = calcBaseDamage(stats.get(luk), stats.get(dex), stats.get(str), stats.get(pad), jobConst + 1.2);
                        break;
                    case Katara:
                        dmg = calcBaseDamage(stats.get(luk), stats.get(dex), stats.get(str), stats.get(pad), jobConst + 1.3);
                        break;
                    case Cane:
                        double k;
                        if (SkillConstants.isStealableSkill(skillID)) {
                            k = jobConst + 1.2;
                        } else {
                            k = jobConst + 1.3;
                        }
                        dmg = calcBaseDamage(stats.get(luk), stats.get(dex), 0, stats.get(pad), k);
                        break;
                    case Wand:
                    case Staff:
                        double mult;
                        if (JobConstants.isBlazeWizard(chr.getJob()) || JobConstants.isExplorer(chr.getJob())) {
                            mult = 1.2;
                        } else {
                            mult = 1;
                        }
                        dmg = calcBaseDamage(stats.get(inte), stats.get(luk), 0, stats.get(mad), jobConst + mult);
                        break;
                    case Barehand:
                        dmg = calcBaseDamage(stats.get(str), stats.get(dex), 0, 1, jobConst + 1.43);
                        break;
                    case TwoHandedSword:
                    case LongSword:
                        dmg = calcBaseDamage(stats.get(str), stats.get(dex), 0, stats.get(pad), jobConst + 1.34);
                        break;
                    case TwoHandedAxe:
                    case TwoHandedMace:
                        dmg = calcBaseDamage(stats.get(str), stats.get(dex), 0, stats.get(pad), jobConst + 1.34);
                        break;
                    case Katana:
                        dmg = calcBaseDamage(stats.get(str), stats.get(dex), 0, stats.get(pad), jobConst + 1.25);
                        break;
                    case Fan:
                        dmg = calcBaseDamage(stats.get(inte), stats.get(luk), 0, stats.get(mad), jobConst + 1.35);
                        break;
                    case Spear:
                    case Polearm:
                    case BigSword:
                        dmg = calcBaseDamage(stats.get(str), stats.get(dex), 0, stats.get(pad), jobConst + 1.49);
                        break;
                    case Bow:
                    case AncientBow: // ?
                        dmg = calcBaseDamage(stats.get(dex), stats.get(str), 0, stats.get(pad), jobConst + 1.3);
                        break;
                    case Crossbow:
                        dmg = calcBaseDamage(stats.get(dex), stats.get(str), 0, stats.get(pad), jobConst + 1.35);
                        break;
                    case Claw:
                        dmg = calcBaseDamage(stats.get(luk), stats.get(dex), 0, stats.get(pad), jobConst + 1.75);
                        break;
                    case Knuckle:
                        dmg = calcBaseDamage(stats.get(str), stats.get(dex), 0, stats.get(pad), jobConst + 1.7);
                        break;
                    case Gun:
                        dmg = calcBaseDamage(stats.get(dex), stats.get(str), 0, stats.get(pad), jobConst + 1.5);
                        break;
                    case DualBowgun:
                        dmg = calcBaseDamage(stats.get(dex), stats.get(str), 0, stats.get(pad), jobConst + 1.3);
                        break;
                    case HandCannon:
                        int dexNum = stats.get(dex);
                        int strNum = stats.get(str);
                        if (strNum >= dexNum) {
                            int temp = dexNum;
                            dexNum = strNum;
                            strNum = temp;
                        }
                        dmg = calcBaseDamage(dexNum, strNum, 0, stats.get(pad), jobConst + 1.5);
                        break;
                    case ArmCannon:
                        dmg = calcBaseDamage(stats.get(str), stats.get(dex), 0, stats.get(pad), jobConst + 1.7);
                        break;
                    case Desperado:
                        // calcDamageByHp, first arg is raw hp, 2nd is
                        dmg = calcBaseDamageByHp(chr.getStat(Stat.mhp), stats.get(mhp), stats.get(str), stats.get(pad), jobConst + 1.3);
                        break;
                }
            } else {
                dmg = calcBaseDamage(stats.get(inte), stats.get(luk), 0, stats.get(mad), jobConst + 1.0);
            }
//            dmg = (long) (dmg/2L+(((dmg/2L)/100)*chr.getAvatarData().getCharacterStat().getPierce())); // Pierce Damage
        }
        return dmg;
    }

    private long calcBaseDamageByHp(int rawHp, int totalHp, int str, int pad, double finalDamage) {
        return (long) (((int) (rawHp / 3.5) + 0.8 * ((int) ((totalHp - rawHp) / 3.5)) + str) / 100.0 * (pad * finalDamage) + 0.5);
    }

    private long calcHybridBaseDamage(int stat1, int stat2, int stat3, int stat4, int att, double finalDamage) {
        long dmg = (long) ((stat1 * 3.5 + stat2 * 3.5 + stat3 * 3.5 + stat4) / 100.0 * (att * finalDamage) + 0.5);
        return dmg;
    }

    private long calcBaseDamage(int mainStat, int secStat, int tertStat, int att, double finalDamage) {
        long dmg = (long) ((tertStat + secStat + 4 * mainStat) / 100.0 * (att * finalDamage) + 0.5);
        return dmg;
    }
}
