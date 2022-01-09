package net.swordie.ms.client.jobs.adventurer;

import net.swordie.ms.client.character.Char;
import net.swordie.ms.client.character.CharacterStat;
import net.swordie.ms.client.character.items.Item;
import net.swordie.ms.client.character.skills.Option;
import net.swordie.ms.client.character.skills.Skill;
import net.swordie.ms.client.character.skills.temp.TemporaryStatBase;
import net.swordie.ms.client.character.skills.temp.TemporaryStatManager;
import net.swordie.ms.connection.InPacket;
import net.swordie.ms.constants.JobConstants;
import net.swordie.ms.enums.TSIndex;
import net.swordie.ms.loaders.ItemData;
import net.swordie.ms.loaders.SkillData;

import static net.swordie.ms.client.character.skills.temp.CharacterTemporaryStat.*;

public class Pathfinder extends Archer {



    public static final int ANCIENT_CURSE = 1298;
    public static final int RETURN_TO_PARTEM = 1297;


    public static final int CARDINAL_DELUGE = 3011004; // Cardinal Force
    public static final int CARDINAL_BURST = 3301004;
    public static final int SWARM_SHOT = 3301008;
    public static final int SWARM_SHOT_ATOM = 3301009;
    public static final int BOUNTIFUL_DELUGE = 3300005;
    public static final int CARDINAL_DELUGE_AMPLIFICATION = 3300002;



    public static final int RAVEN = 3311009;

    public static final int CARDINAL_BURST_AMPLIFICATION = 3311013;
    public static final int BOUNTIFUL_BURST = 3310004;
    public static final int CARDINAL_TORRENT = 3311002;
    public static final int CARDINAL_TORRENT_SWEEP = 3311003;

    public static final int CARDINAL_DELUGE_ADVANCED = 3321003;
    public static final int CARDINAL_BURST_ADVANCED = 3321005;
    public static final int CARDINAL_TORRENT_ADVANCED = 3321006;
    public static final int CARDINAL_TORRENT_SWEEP_ADVANCED = 3321007;
    

    public static final int ANCIENT_ASTRA_DELUGE_ATOM = 3321037;
    public static final int ANCIENT_ASTRA_BURST = 3321039;



    public static final int CURSEWEAVER = 3320001;

    private static final int[] addedSkills = new int[]{
            ANCIENT_CURSE,
            RETURN_TO_PARTEM,
    };



    public Pathfinder(Char chr) {
        super(chr);
        if (chr != null && chr.getId() != 0 && isHandlerOfJob(chr.getJob())) {
            for (int skillId : addedSkills) {
                if (!chr.hasSkill(skillId)) {
                    Skill skill = SkillData.getSkillDeepCopyById(skillId);
                    skill.setCurrentLevel(1);
                    chr.addSkill(skill);
                }
            }
        }
    }

    @Override
    public boolean isHandlerOfJob(short id) {
        return JobConstants.isPathFinder(id);
    }



    @Override
    public void setCharCreationStats(Char chr) {
        super.setCharCreationStats(chr);
    }



}
