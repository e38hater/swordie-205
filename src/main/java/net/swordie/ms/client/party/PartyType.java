package net.swordie.ms.client.party;

import java.util.Arrays;

/**
 * Created on 3/19/2018.
 */
public enum PartyType {
    PartyReq_LoadParty(0),
    PartyReq_CreateNewParty(1),
    PartyReq_WithdrawParty(2),
    PartyReq_JoinParty(3),
    PartyReq_InviteParty(4),
    PartyReq_InviteIntrusion(5), // member -> party request
    PartyReq_KickParty(6), // party -> member request
    PartyReq_ChangePartyBoss(7),
    PartyReq_ApplyParty(8),
    PartyReq_SetAppliable(9),
    PartyReq_ClearIntrusion(10),
    PartyReq_CreateNewParty_Group(11),
    PartyReq_JoinParty_Group(12),
    PartyReq_PartySetting(13),
    PartyReq_LoadStarPlanetPoint(14),

    PartyRes_LoadParty_Done(19),
    PartyRes_CreateNewParty_Done(20),
    PartyRes_CreateNewParty_AlreadyJoined(21),
    PartyRes_CreateNewParty_Beginner(22),
    PartyRes_CreateNewParty_Unknown(23),
    PartyRes_CreateNewParty_ByNonBoss(24),

    PartyRes_WithdrawParty_Done(25),
    PartyRes_WithdrawParty_NotJoined(26),
    PartyRes_WithdrawParty_Unknown(27),

    PartyRes_JoinParty_Done(28),
    PartyRes_JoinParty_Done2(29),

    PartyRes_JoinParty_AlreadyJoined(30),
    PartyRes_JoinParty_AlreadyFull(31),
    PartyRes_JoinParty_OverDesiredSize(32),
    PartyRes_JoinParty_UnknownUser(33),
    PartyRes_JoinParty_Unknown(34),
    PartyRes_JoinParty_OtherUserFieldLimit(35),

    PartyRes_JoinIntrusion_Done(36),
    PartyRes_JoinIntrusion_UnknownParty(37),

    PartyRes_InviteParty_Sent(38),
    PartyRes_InviteParty_BlockedUser(39),
    PartyRes_InviteParty_AlreadyInvited(40),
    PartyRes_InviteParty_AlreadyInvitedByInviter(41),
    PartyRes_InviteParty_Rejected(42),
    PartyRes_InviteParty_Accepted(43),
    PartyRes_InviteParty_OtherUserFieldLimit(44),

    PartyRes_InviteIntrusion_Sent(45),
    PartyRes_InviteIntrusion_BlockedUser(46),
    PartyRes_InviteIntrusion_AlreadyInvited(47),
    PartyRes_InviteIntrusion_AlreadyInvitedByInviter(48),
    PartyRes_InviteIntrusion_Rejected(49),
    PartyRes_InviteIntrusion_Accepted(50),

    PartyRes_KickParty_Done(51),
    PartyRes_KickParty_FieldLimit(52),
    PartyRes_KickParty_New(53),
    PartyRes_KickParty_Unknown(54),

    PartyRes_ChangePartyBoss_Done(55),
    PartyRes_ChangePartyBoss_NotSameField(56),
    PartyRes_ChangePartyBoss_NoMemberInSameField(57),
    PartyRes_ChangePartyBoss_NotSameChannel(58),
    PartyRes_ChangePartyBoss_Unknown(59),

    PartyRes_AdminCannotCreate(60),
    PartyRes_AdminCannotInvite(61),

    PartyRes_InAnotherWorld(62),
    PartyRes_InAnotherChanelBlockedUser(63),

    PartyRes_UserMigration(64),
    PartyRes_ChangeLevelOrJob(65),
    PartyRes_UpdateShutdownStatus(66),
    PartyRes_UpdateShutdownStatus_New(67),
    PartyRes_SetAppliable(68),
    PartyRes_SetAppliableFailed(69),
    PartyRes_SuccessToSelectPQReward(70),
    PartyRes_FailToSelectPQReward(71),
    PartyRes_ReceivePQReward(72),
    PartyRes_FailToRequestPQReward(73),
    PartyRes_FieldLimit(74),

    PartyRes_ApplyParty_Sent(75),
    PartyRes_ApplyParty_UnknownParty(76),
    PartyRes_ApplyParty_BlockedUser(77),
    PartyRes_ApplyParty_AlreadyApplied(78),
    PartyRes_ApplyParty_AlreadyAppliedByApplier(79),
    PartyRes_ApplyParty_AlreadyFull(80),
    PartyRes_ApplyParty_Rejected(81),
    PartyRes_ApplyParty_Accepted(82),

    PartyRes_FoundPossibleMember(83),
    PartyRes_FoundPossibleParty(84),

    PartyRes_PartySettingDone(85), // everything under here is uncertain
    PartyRes_Load_StarGrade_Result(86),
    PartyRes_Load_StarGrade_Result2(87),
    PartyRes_Member_Rename(88),

    PartyInfo_TownPortalChanged(89),
    PartyInfo_OpenGate(90),

    ExpeditionReq_Load(96),// v202.3
    ExpeditionReq_CreateNew(97),// v202.3
    ExpeditionReq_Invite(98),// v202.3
    ExpeditionReq_ResponseInvite(99),// v202.3
    ExpeditionReq_Withdraw(100),// v202.3
    ExpeditionReq_Kick(101),// v202.3
    ExpeditionReq_ChangeMaster(102),// v202.3
    ExpeditionReq_ChangePartyBoss(103),// v202.3
    ExpeditionReq_RelocateMember(104),// v202.3

    ExpeditionNoti_Load_Done(105),// v202.3
    ExpeditionNoti_Load_Fail(106),// v202.3
    ExpeditionNoti_CreateNew_Done(107),// v202.3
    ExpeditionNoti_Join_Done(108),// v202.3
    ExpeditionNoti_You_Joined(109),// v202.3
    ExpeditionNoti_You_Joined2(110),// v202.3
    ExpeditionNoti_Join_Fail(111),// v202.3
    ExpeditionNoti_Withdraw_Done(112),// v202.3
    ExpeditionNoti_You_Withdrew(113),// v202.3
    ExpeditionNoti_Kick_Done(114),// v202.3
    ExpeditionNoti_You_Kicked(115),// v202.3
    ExpeditionNoti_Removed(116),// v202.3
    ExpeditionNoti_MasterChanged(117),// v202.3
    ExpeditionNoti_Modified(118),// v202.3
    ExpeditionNoti_Modified2(119),// v202.3
    ExpeditionNoti_Invite(120),// v202.3
    ExpeditionNoti_ResponseInvite(121),// v202.3
    ExpeditionNoti_Create_Fail_By_Over_Weekly_Counter(122),// v202.3
    ExpeditionNoti_Invite_Fail_By_Over_Weekly_Counter(123),// v202.3
    ExpeditionNoti_Apply_Fail_By_Over_Weekly_Counter(124),// v202.3
    ExpeditionNoti_Invite_Fail_By_Blocked_Behavior(125),

    AdverNoti_LoadDone(126),// v202.3
    AdverNoti_Change(127),// v202.3
    AdverNoti_Remove(128),// v202.3
    AdverNoti_GetAll(129),// v202.3
    AdverNoti_Apply(130),// v202.3
    AdverNoti_ResultApply(131),// v202.3
    AdverNoti_AddFail(132),// v202.3
    AdverReq_Add(133),// v202.3
    AdverReq_Remove(134),// v202.3
    AdverReq_GetAll(135),// v202.3
    AdverReq_RemoveUserFromNotiList(136),// v202.3
    AdverReq_Apply(137),// v202.3
    AdverReq_ResultApply(138),// v202.3

    ;

    private byte val;

    PartyType(int val) {
        this.val = (byte) val;
    }

    public static PartyType getByVal(byte type) {
        return Arrays.stream(values()).filter(i -> i.getVal() == type).findFirst().orElse(null);
    }

    public byte getVal() {
        return val;
    }
}
