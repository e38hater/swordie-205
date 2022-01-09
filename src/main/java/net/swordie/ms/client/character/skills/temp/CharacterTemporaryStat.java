package net.swordie.ms.client.character.skills.temp;

import org.apache.log4j.LogManager;
import org.python.antlr.ast.Return;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created on 1/2/2018.
 */
public enum CharacterTemporaryStat implements Comparator<CharacterTemporaryStat> {
    IndiePAD(0),
    IndieMAD(1),
    IndiePDD(2),
    IndieMDD(-1),
    IndieMHP(3),
    IndieMHPR(4),// v202.3
    IndieMMP(5),
    IndieMMPR(6),

    IndieACC(7),
    IndieEVA(8),
    IndieJump(9),
    IndieSpeed(10),// v202.3
    IndieAllStat(11),// v202.3
    IndieDodgeCriticalTime(12),
    IndieEXP(13),
    IndieBooster(15),// v202.3

    IndieFixedDamageR(16),
    PyramidStunBuff(17),
    PyramidFrozenBuff(18),
    PyramidFireBuff(19),
    PyramidBonusDamageBuff(20),
    IndieRelaxEXP(21),
    IndieSTR(22),
    IndieDEX(23),

    IndieINT(24),
    IndieLUK(25),
    IndieDamR(26),// v202.3
    IndieScriptBuff(27),
    IndieMDF(28),
    IndieMaxDamageOver(-1),
    IndieAsrR(29),
    IndieTerR(30),

    IndieCr(31),
    IndiePDDR(32),
    IndieCrDam(33),
    IndieBDR(34),// v202.3
    IndieStatR(35),
    IndieStance(36),
    IndieIgnoreMobpdpR(37),
    IndieEmpty(38),

    IndiePADR(39),// v202.3
    IndieMADR(40),// v202.3
    IndieCrDamR(41),
    IndieEVAR(42),
    IndieMDDR(-1),
    IndieDrainHP(43),
    IndiePMdR(-1),
    IndieMaxDamageOverR(-1),

    IndieForceJump(44),
    IndieForceSpeed(45),
    IndieQrPointTerm(46),
    IndieUnk1(47),
    IndieUnk2(48),
    IndieUnk3(49),
    IndieUnk4(50),
    IndieUnk5(51),
    IndieUnk6(52),
    IndieUnk7(53),
    IndieUnk8(54),
    IndieUnk9(55),
    IndieUnk10(56),
    IndieUnk11(57),
    IndieUnk12(58),
    IndieUnk13(59),
    IndieUnk14(60),
    IndieUnk15(61),
    IndieUnk16(62),
    IndieUnk17(63),
    IndieStatCount(68),

    PAD(69),// v202.3
    PDD(70),// v202.3
    MAD(71),// v202.3
    ACC(72),// v202.3
    EVA(73),// v202.3
    Craft(74),// v202.3

    Speed(75),// v202.3
    Jump(76),// v202.3
    MagicGuard(77),// v202.3
    DarkSight(78),// v202.3
    Booster(79),// v202.3
    PowerGuard(80),// v202.3
    MaxHP(81),// v202.3
    MaxMP(82),// v202.3

    Invincible(83),// v202.3
    SoulArrow(84),// v202.3
    Stun(85),// v202.3
    Poison(86),// v202.3
    Seal(87),// v202.3
    Darkness(88),// v202.3
    ComboCounter(89),// v202.3
    WorldReaver(90),
    HammerOfTheRighteous(91),
    BigHammerOfTheRighteous(92),
    WeaponCharge(93),// v202.3

    HolySymbol(94),// v202.3
    MesoUp(95),// v202.3
    ShadowPartner(96),// v202.3
    PickPocket(97),// v202.3
    MesoGuard(98),// v202.3
    Thaw(99),// v202.3
    Weakness(100),// v202.3
    Curse(101),// v202.3

    Slow(102),// v202.3
    Morph(103),// v202.3
    Regen(104),// v202.3
    BasicStatUp(105),// v202.3
    Stance(106),// v202.3
    SharpEyes(107),// v202.3
    ManaReflection(108),// v202.3
    Attract(109),// v202.3

    NoBulletConsume(110),// v202.3
    Infinity(111),// v202.3
    AdvancedBless(112),// v202.3
    IllusionStep(113),// v202.3
    Blind(114),// v202.3
    Concentration(115),// v202.3
    BanMap(116),// v202.3
    MaxLevelBuff(117),// v202.3

    MesoUpByItem(118),// v202.3
    Ghost(119),// v202.3
    Barrier(120),// v202.3
    Unk111(121),
    Unk112(122),
    ReverseInput(123),// v202.3
    ItemUpByItem(124),// v202.3
    RespectPImmune(125),// v202.3
    RespectMImmune(126),// v202.3
    DefenseAtt(127),// v202.3

    DefenseState(128),// v202.3
    DojangBerserk(129),// v202.3
    DojangInvincible(130),// v202.3
    DojangShield(131),// v202.3
    SoulMasterFinal(132),// v202.3
    WindBreakerFinal(133),// v202.3
    ElementalReset(134),// v202.3
    HideAttack(135),// v202.3

    EventRate(136),// v202.3
    ComboAbilityBuff(137),// v202.3
    ComboDrain(138),// v202.3
    ComboBarrier(139),// v202.3
    BodyPressure(140),// v202.3
    RepeatEffect(141),// v202.3
    ExpBuffRate(142),// v202.3 [Used for 2450156]
    StopPortion(143),// v202.3

    StopMotion(144),// v202.3
    Fear(145),// v202.3
    HiddenPieceOn(146),// v202.3
    MagicShield(147),// v202.3
    MagicResistance(148),// v202.3
    SoulStone(149),// v202.3
    Flying(150),// v202.3
    Frozen(151),// v202.3

    AssistCharge(152),// v202.3
    Enrage(153),// v202.3
    DrawBack(154),// v202.3
    NotDamaged(155),// v202.3
    FinalCut(156),// v202.3
    HowlingAttackDamage(157),// v202.3
    BeastFormDamageUp(158),// v202.3
    Dance(159),// v202.3

    EMHP(160),// v202.3
    EMMP(161),// v202.3
    EPAD(162),// v202.3
    EMAD(163),// v202.3
    EPDD(164),// v202.3

    Guard(165),
    Cyclone(166),
    RadiantOrb(167),
    HowlingCritical(168),
    HowlingMaxMP(169),
    HowlingDefence(170),
    HowlingEvasion(171),
    Conversion(172),// v202.3
   // Revive(167),// v202.3
    PinkbeanMinibeenMove(173),// v202.3
  //  Sneak(169),// v202.3

    Mechanic(174),// v202.3
    BeastFormMaxHP(175),// v202.3
    Dice(176),// v202.3
    BlessingArmor(177),// v202.3
    DamR(178),// v202.3
    TeleportMasteryOn(179),// v202.3
    CombatOrders(180),// v202.3
    Beholder(181),// v202.3

    DispelItemOption(182),// v202.3
    Inflation(183),// v202.3
    OnixDivineProtection(184),// v202.3
    Web(185),// v202.3
    Unk188_177(186),
    Bless(187),// v202.3
    //TimeBomb(183),// v202.3
    DisOrder(188),// v202.3
    //Thread(185),// v202.3


    Thread(189),
    Team(190),// v202.3
    Explosion(191),// v202.3
    BuffLimit(192),// v202.3

    STR(193),// v202.3
    INT(194),// v202.3
    DEX(195),// v202.3
    LUK(196),// v202.3
    DispelItemOptionByField(197),// v202.3

    DarkTornado(198), // Cygnus Attack
    PVPDamage(199),// v202.3
    PvPScoreBonus(200),// v202.3
    PvPInvincible(201),// v202.3
    PvPRaceEffect(202),// v202.3
    WeaknessMdamage(203),// v202.3
    Frozen2(204),// v202.3
    PVPDamageSkill(205),// v202.3

    AmplifyDamage(206),// v202.3
    Shock(207),// v202.3
    InfinityForce(208),// v202.3
    IncMaxHP(209),// v202.3
    IncMaxMP(210),// v202.3
    HolyMagicShell(211),// v202.3
    KeyDownTimeIgnore(212),// v202.3

    ArcaneAim(213),// v202.3
    MasterMagicOn(214),// v202.3
    AsrR(215),// v202.3
    TerR(216),// v202.3
    DamAbsorbShield(217),// v202.3
    DevilishPower(218),// v202.3
    Roulette(219),// v202.3
    SpiritLink(220),// v202.3

    AsrRByItem(221),// v202.3
    Event(222),// v202.3
    CriticalBuff(223),// v202.3
    DropRate(224),// v202.3
    PlusExpRate(225),// v202.3
    ItemInvincible(226),// v202.3
    Awake(227),
    ItemCritical(228),// v202.3


    Event2(229),// v202.3
    VampiricTouch(230),// v202.3
    DDR(231),// v202.3
    IncCriticalDam(232),
    IncTerR(233),// v202.3
    IncAsrR(234),// v202.3

    DeathMark(235),// v202.3
    UsefulAdvancedBless(236),// v202.3
    Lapidification(237),// v202.3
    VenomSnake(238),// v202.3
    CarnivalAttack(239),// v202.3
    CarnivalDefence(240),// v202.3
    CarnivalExp(241),// v202.3
    SlowAttack(242),// v202.3

    PyramidEffect(243),// v202.3
    KillingPoint(244),// v202.3
    HollowPointBullet(245),// v202.3
    KeyDownMoving(246),// v202.3
    IgnoreTargetDEF(247),// v202.3
    ReviveOnce(248),// v202.3
    Invisible(249),// v202.3
    EnrageCr(250),// v202.3

    EnrageCrDamMin(251),// v202.3
    Judgement(252),// v202.3
    DojangLuckyBonus(253),// v202.3
    PainMark(254),// v202.3
    Magnet(255),// v202.3
    MagnetArea(256),// v202.3
    GuidedArrow(257),
    SpiritFlow(258),
    LucentBrand(259), // *
    ExtraSkillCTS(260),
    Unk199_256(261),
    TideOfBattle(262),// v202.3
    GrandGuardian(263),// v203.2 Paladin VSkills
    DropPer(264),// v202.3 [Used for 2023145]
    VampDeath(265),// v202.3
    BlessingArmorIncPAD(266),// v202.3
    KeyDownAreaMoving(267),// v202.3
    Larkness(268),// v202.3
    StackBuff(269),// v202.3
    BlessOfDarkness(270),// v202.3


    AntiMagicShell(271),// v202.3
    AntiMagicShellBool(271),// v202.3

    LifeTidal(272),// v202.3
    HitCriDamR(273),// v202.3
    SmashStack(274),// v202.3

    PartyBarrier(275),// v202.3
    ReshuffleSwitch(276),// v202.3
    SpecialAction(277),// v202.3
    VampDeathSummon(278),// v202.3
    StopForceAtomInfo(279),// v202.3
    SoulGazeCriDamR(280),// v202.3
    SoulRageCount(281),// v202.3
    PowerTransferGauge(282),// v202.3

    AffinitySlug(283),// v202.3
    Trinity(284),// v202.3
    IncMaxDamage(285),// v202.3
    BossShield(286),// v202.3
    MobZoneState(287),// v202.3
    GiveMeHeal(288),// v202.3
    TouchMe(289),// v202.3
    Contagion(290),// v202.3

    ComboUnlimited(291),// v202.3
    SoulExalt(292),// v202.3
    IgnorePCounter(293),// v202.3
    IgnoreAllCounter(294),// v202.3
    IgnorePImmune(295),// v202.3
    IgnoreAllImmune(296),// v202.3
    FinalJudgement(297),// v202.3
    Unk188_283(298),
    IceAura(299),// v202.3

    FireAura(300),// v202.3
    VengeanceOfAngel(301),// v202.3
    HeavensDoor(302),// v202.3
    Preparation(303),// v202.3
    BullsEye(304),// v202.3
    IncEffectHPPotion(305),// v202.3
    IncEffectMPPotion(306),// v202.3
    BleedingToxin(307),// v202.3

    IgnoreMobDamR(308),// v202.3
    Asura(309),// v202.3
    Unk306(310),// v202.3
    FlipTheCoin(311),// v202.3
    UnityOfPower(312),// v202.3
    Stimulate(313),// v202.3
    ReturnTeleport(314),// v202.3
    DropRIncrease(315),// v202.3
    IgnoreMobpdpR(316),// v202.3

    BdR(317),// v202.3
    CapDebuff(318),// v202.3
    Exceed(319),// v202.3
    DiabolikRecovery(320),// v202.3
    FinalAttackProp(321),// v202.3
    ExceedOverload(322),// v202.3
    OverloadCount(323),// v202.3
    BuckShot(324),// v202.3

    FireBomb(325),// v202.3
    HalfstatByDebuff(326),// v202.3
    SurplusSupply(327),// v202.3
    SetBaseDamage(328),// v202.3
    EVAR(329),// v202.3
    NewFlying(330),// v202.3
    AmaranthGenerator(331),// v202.3
    OnCapsule(332),// v202.3

    CygnusElementSkill(333),// v202.3
    StrikerHyperElectric(334),// v202.3
    EventPointAbsorb(335),// v202.3
    EventAssemble(336),// v202.3
    StormBringer(337),// v202.3
    ACCR(338),// v202.3
    DEXR(339),// v202.3
    Albatross(340),// v202.3

    Translucence(341),// v202.3
    PoseType(342),// v202.3
    LightOfSpirit(343),// v202.3
    ElementSoul(344),// v202.3
    GlimmeringTime(345),// v202.3
    TrueSight(346),// v202.3
    SoulExplosion(347),// v202.3
    SoulMP(348),// v202.3

    FullSoulMP(349),// v202.3
    SoulSkillDamageUp(350),// v202.3
    ElementalCharge(351),// v202.3
    Restoration(352),// v202.3
    CrossOverChain(353),// v202.3
    ChargeBuff(354),// v202.3
    Reincarnation(355),// v202.3
    KnightsAura(356),// v202.3

    ChillingStep(357),// v202.3
    DotBasedBuff(358),// v202.3
    BlessEnsenble(359),// v202.3
    ComboCostInc(360),// v202.3
    ExtremeArchery(361),// v202.3
    NaviFlying(362),// v202.3
    QuiverCatridge(363),// v202.3
    AdvancedQuiver(364),// v202.3

    UserControlMob(365),// v202.3
    ImmuneBarrier(366),// v202.3
    ArmorPiercing(367),// v202.3
    ZeroAuraStr(368),// v202.3
    ZeroAuraSpd(369),// v202.3
    CriticalGrowing(370),// v202.3
    RelicEmblem(371), // *
    QuickDraw(372),// v202.3
    BowMasterConcentration(373),// v202.3

    TimeFastABuff(374),// v202.3
    TimeFastBBuff(375),// v202.3
    GatherDropR(376),// v202.3
    AimBox2D(377),// v202.3
    Unk203_374(378),
    IncMonsterBattleCaptureRate(379),// v202.3
    CursorSniping(380),// v202.3
    DebuffTolerance(381),// v202.3
    DotHealHPPerSecond(382),// v202.3

    SpiritGuard(383),// v202.3
    PreReviveOnce(384),// v202.3
    SetBaseDamageByBuff(385),// v202.3
    LimitMP(386),// v202.3
    ReflectDamR(387),// v202.3
    ComboTempest(388),// v202.3
    MHPCutR(389),// v202.3
    MMPCutR(390),// v202.3

    SelfWeakness(391),// v202.3
    ElementDarkness(392),// v202.3
    FlareTrick(393),// v202.3
    Ember(394),// v202.3
    Dominion(395),// v202.3
    SiphonVitality(396),// v202.3
    DarknessAscension(397),// v202.3
    BossWaitingLinesBuff(398),// v202.3

    DamageReduce(399),// v202.3
    ShadowServant(400),// v202.3
    ShadowIllusion(401),// v202.3
    KnockBack(402),// v202.3
    AddAttackCount(403),// v202.3
    ComplusionSlant(404),// v202.3
    JaguarSummoned(405),// v202.3
    JaguarCount(406),// v202.3

    SSFShootingAttack(407),// v202.3
    DevilCry(408),// v202.3
    ShieldAttack(409),// v202.3
    BMageAura(410),// v202.3
    DarkLighting(411),// v202.3
    AttackCountX(412),// v202.3
    BMageDeath(413),// v202.3
    BombTime(414),// v202.3
    NoDebuff(415),// v202.3
    BattlePvPMikeShield(416),// v202.3
    BattlePvPMikeBugle(417),// v202.3
    XenonAegisSystem(418),// v202.3
    AngelicBursterSoulSeeker(419),// v202.3
    HiddenPossession(420),// v202.3
    NightWalkerBat(421),// v202.3
    NightLordMark(422),// v202.3
    WizardIgnite(423),// v202.3
    FireBarrier(424),// v202.3
    ChangeFoxMan(425),// v202.3
    DivineEcho(426),// v203.2 (Paladin V Buff).
    BattlePvPHelenaMark(427),
    Unk424(428),
    Unk425(429),
    RIFT_OF_DAMNATION(430),// v202.3
    QuiverBarrage(431),
    SwordsOfConsciousness(432),
    PrimalGrenade(433),
    Unk200_430(434),
    Unk200_431(435),
    BattlePvPLangEProtection(436),// v202.3
    BattlePvPLeeMalNyunScaleUp(437),// v202.3
    BattlePvPRevive(438),// v202.3
    Unk188_419(439),
    Unk188_420(440),
    PinkbeanAttackBuff(441),// v202.3
    PinkbeanRelax(442),// v202.3
    PinkbeanRollingGrade(443),// v202.3
    PinkbeanYoYoStack(444),// v202.3
    RandAreaAttack(445),// v202.3
    Unk442(446),
    NextAttackEnhance(447),
  //  AranBeyonderDamAbsorb(444),
    AranCombotempastOption(448),
    NautilusFinalAttack(449),
    ViperTimeLeap(450),
    RoyalGuardState(451),// v202.3
    RoyalGuardPrepare(452),// v202.3
    MichaelSoulLink(453),// v202.3
    MichaelStanceLink(454),// v202.3
    TriflingWhimOnOff(455),// v202.3
    AddRangeOnOff(456),// v202.3

    KinesisPsychicPoint(457),// v202.3
    KinesisPsychicOver(458),// v202.3
    KinesisPsychicShield(459),// v202.3
    KinesisIncMastery(460),// v202.3
    KinesisPsychicEnergeShield(461),// v202.3
    BladeStance(462),// v202.3
    DebuffActiveSkillHPCon(463),// v202.3
    DebuffIncHP(464),// v202.3

    BowMasterMortalBlow(465),// v202.3
    AngelicBursterSoulResonance(466),// v202.3
    Fever(467),
    IgnisRore(468),// v202.3
   // RpSiksin(465),// v202.3
    TeleportMasteryRange(469),// v202.3
    FixCoolTime(470),// v202.3
    IncMobRateDummy(471),// v202.3

    AdrenalinBoost(472),// v202.3
    AranSmashSwing(473),// v202.3
    AranDrain(474),// v202.3
    AranBoostEndHunt(475),// v202.3
    HiddenHyperLinkMaximization(476),// v202.3
    RWCylinder(477),// v202.3
    RWCombination(478),// v202.3
    Unk476(479),// v202.3
    RWMagnumBlow(480),// v202.3

    RWBarrier(481),// v202.3
    RWBarrierHeal(482),// v202.3
    RWMaximizeCannon(483),// v202.3
    RWOverHeat(484),// v202.3
    UsingScouter(485),// v202.3
    RWMovingEvar(486),// v202.3
    Stigma(487),// v202.3
    Unk485(488),
    Unk486(489),
    Unk487(490),
    Unk488(491),
    Unk489(492),
    Unk490(493),
    Unk491(494),
    Unk492(495),
    LightningCascade(496),// v202.3
    BulletBarrage(497),// v202.3
    Unk495(498),
    AuraScythe(499),// v202.3
    Unk497(500),
    Unk498(501),
    Unk499(502),
    Unk500(503),
    Unk501(504),
    ManaOverload(505),// v202.3
    Unk503(506),
    Unk504(507),
    SpreadThrow(508),
    WindEnergy(509),
    MassDestructionRockets(510),// Used for:   Cannonneer 1st V  |  Battle Mage 2nd V  |  Buccaneer 3rd V
    ShadowAssault(511),
    Unk188_492(512),
    Unk510(513),
    Unk511(514),
    BlitzShield(515),
    Unk513(516),
    FreudWisdom(517),// v202.3 or SKILL_COOLTIME_REDUCE_R
    CoreOverload(518),// v202.3
    Spotlight(519),// angelic buster v skill
    Unk188_500(520),// v202.3
    Unk518(521),
    CrystallineWings(522),// v203.2
    Unk520(522),
    Unk521(523),
    Overdrive(524),// v202.3 or attack power
    EtherealForm(525),
    LastResort(526),
    ViciousShot(527),
    Unk176_466(528), // *
    Unk200_527(529),
    Unk200_528(530),
    ImpenetrableSkin(531),

    Unk199_520(532),
    Unk199_521(533),
    Unk199_521Ex(533),
    Resonance(534),
    FlashCrystalBattery(535),
    Unk199_524(536),
    CrystalBattery(537),
    Unk199_526(538),
    Unk199_527(539),
    Unk199_528(540),
    Unk199_529(541),
    Unk199_530(542),
    Unk200_557(543),
    SpecterEnergy(544),
    SpecterState(545),
    BasicCast(546), // *
    ScarletCast(547),
    GustCast(548),
    AbyssalCast(549),
    ImpendingDeath(550),
    AbyssalRecall(551),
    ChargeSpellAmplifier(552),
    InfinitySpell(553),
    ConversionOverdrive(554),
    Solus(555),
    Unk199_543(556),
    Unk199_544(557),
    Unk199_545(558),
    Unk199_546(559),
    BigBangAttackCharge(560),
    Unk199_548(561),
    TridentStrike(562),
    ComboInstinct(563),
    GaleBarrier(564),
    Unk199_552(565),
    Unk199_553(566),
    SwordOfLight(567), // *
    PhantomMark(568),
    PhantomMarkMobStat(569),
    Unk200_568(570),
    Unk200_569(571),
    Unk200_570(572),
    KeyDownCTS(573), // Used in Keydown skills: 400011028, 37121052, 37121003‬, 400051024, 11121052, 400011091,  more
    Unk200_572(574), // Alliance Snow
    Unk200_573(575),
    Unk200_574(576),
    Unk202_575(577),
    Unk202_576(578),
    TanadianRuin(579),
    AeonianRise(580),
    Unk202_579(581),
    Unk202_580(582),
    Unk205_583(583),
    Unk205_584(584),
    Unk205_585(585),
    AncientGuidance(586), // Ancient Guidance Mode   Mode and Stack should be encoded (x,y)
    Unk205_587(587),
    Unk205_588(588),
    Unk205_589(-1),
    Unk205_590(590),
    Unk205_591(591),
    Unk205_592(592),
    Unk205_593(593),
    Unk199_555(594),
    Unk199_556(595),
    Unk199_557(596),
    Unk199_558(597),
    Unk199_559(598),

    HayatoStance(599), // *
    HayatoStanceBonus(600),
    EyeForEye(601),
    WillowDodge(602),

    Unk465(603),// v202.3
    HayatoPAD(604),// v202.3
    HayatoHPR(605),// v202.3
    HayatoMPR(606),// v202.3
    HayatoBooster(607),// v202.3
    Unk595,// v202.3
    Unk596,// v202.3
    Jinsoku(610),// v202.3
    HayatoCr(611),// v202.3
    HakuBlessing(612),// v202.3
    HayatoBoss(613),// v202.3
    BattoujutsuAdvance(614),// v202.3
    Unk602,// v202.3
    Unk603,// v202.3
    BlackHeartedCurse(617),// v202.3
    BeastMode(618),// v202.3
    TeamRoar(619),// v202.3
    Unk607(620),// v202.3
    Unk608(621),// v202.3
    Unk609(622),// v202.3
    Unk610(623),// v202.3
    Unk611(624),// v202.3
    Unk612(625),// v202.3
    Unk613(626),// v202.3
    Unk614(627),// v202.3
    Unk615(628),// v202.3
    Unk616(629),// v202.3
    Unk617(630),// v202.3
    Unk618(631),// v202.3
    Unk619(632),// v202.3
    Unk620,
    Unk621,
    Unk622,
    Unk623,
    Unk624,
    Unk625,
    Unk626,
    EnergyCharged(641),// v202.3
    DashSpeed(642),// v202.3
    DashJump(643),// v202.3
    RideVehicle(644),// v202.3
    PartyBooster(645),// v202.3 - or 631 according to my sniffs
    GuidedBullet(646),// v202.3
    Undead(647),// v202.3


    RideVehicleExpire(648),// v205

    RelicGauge(649), // 205

    None(-1),
    ;

    private int bitPos;
    private int val;
    private int pos;
    public static final int length = 32;
    private static final org.apache.log4j.Logger log = LogManager.getRootLogger();

    private static final List<CharacterTemporaryStat> ORDER = Arrays.asList(
            STR, INT, DEX, LUK,
            PAD, PDD, MAD, ACC, EVA, EVAR,
            Craft, Speed, Jump,
            EMHP, EMMP, EPAD, EMAD, EPDD,
            MagicGuard, DarkSight, Booster, PowerGuard, Guard,
            MaxHP, MaxMP, Invincible, SoulArrow, Stun, Shock,
             Poison, Seal, Darkness, ComboCounter,WorldReaver,HammerOfTheRighteous,BigHammerOfTheRighteous,
            WeaponCharge, ElementalCharge,
            HolySymbol, MesoUp, ShadowPartner, PickPocket, MesoGuard, Thaw, Weakness, WeaknessMdamage,
            Curse, Slow, BuffLimit, Team, DisOrder, //Thread,
            Morph, Ghost,
            Regen, BasicStatUp, Stance, SharpEyes, ManaReflection, Attract, NoBulletConsume, StackBuff, Trinity,
            Infinity, AdvancedBless, IllusionStep, Blind, Concentration, BanMap, MaxLevelBuff, Barrier, DojangShield, ReverseInput,
            MesoUpByItem, ItemUpByItem, RespectPImmune, RespectMImmune, DefenseAtt, DefenseState, DojangBerserk, DojangInvincible, SoulMasterFinal,
            WindBreakerFinal, ElementalReset, HideAttack, EventRate, ComboAbilityBuff, ComboDrain, ComboBarrier, PartyBarrier,
            BodyPressure, RepeatEffect, ExpBuffRate, StopPortion, StopMotion, Fear, MagicShield, MagicResistance, SoulStone,
            Flying, NewFlying, NaviFlying, Frozen, Frozen2, Web,
            Enrage, NotDamaged, FinalCut, HowlingAttackDamage, BeastFormDamageUp, Dance, OnCapsule,
            Cyclone, Conversion, PinkbeanMinibeenMove, Mechanic, DrawBack,
            BeastFormMaxHP, Dice, BlessingArmor, BlessingArmorIncPAD,
            DamR, TeleportMasteryOn, CombatOrders, Beholder, DispelItemOption, DispelItemOptionByField,
            Inflation, OnixDivineProtection, Bless, Explosion, DarkTornado, IncMaxHP, IncMaxMP,
            PVPDamage, PVPDamageSkill, PvPScoreBonus, PvPInvincible, PvPRaceEffect,
            HolyMagicShell, InfinityForce, AmplifyDamage, KeyDownTimeIgnore, MasterMagicOn,
            AsrR, AsrRByItem, TerR, DamAbsorbShield, Roulette, Event, SpiritLink,
            CriticalBuff, DropRate, PlusExpRate, ItemInvincible, ItemCritical,
            Event2, VampiricTouch, DDR, IncTerR, IncAsrR, DeathMark, PainMark,
            UsefulAdvancedBless, Lapidification, VampDeath, VampDeathSummon,
            VenomSnake, CarnivalAttack, CarnivalDefence, CarnivalExp, SlowAttack, PyramidEffect, HollowPointBullet, KeyDownMoving, KeyDownAreaMoving, CygnusElementSkill,
            IgnoreTargetDEF, Invisible, ReviveOnce, AntiMagicShell,
            EnrageCr, EnrageCrDamMin, BlessOfDarkness, LifeTidal,
            Judgement, DojangLuckyBonus, HitCriDamR, Larkness, SmashStack, ReshuffleSwitch, SpecialAction, ArcaneAim,
            StopForceAtomInfo, SoulGazeCriDamR, SoulRageCount, PowerTransferGauge, AffinitySlug, SoulExalt, HiddenPieceOn,
            BossShield, MobZoneState, GiveMeHeal, TouchMe, Contagion, ComboUnlimited,
            IgnorePCounter, IgnoreAllCounter, IgnorePImmune, IgnoreAllImmune,
            FinalJudgement, KnightsAura, IceAura, FireAura, VengeanceOfAngel, HeavensDoor, Preparation, BullsEye, IncEffectHPPotion, IncEffectMPPotion,
            SoulMP, FullSoulMP, SoulSkillDamageUp,
            BleedingToxin, IgnoreMobDamR, Asura, Unk306, FlipTheCoin, UnityOfPower, Stimulate, ReturnTeleport, CapDebuff,
            DropRIncrease, IgnoreMobpdpR, BdR,
            Exceed, DiabolikRecovery, FinalAttackProp, ExceedOverload, DevilishPower,
            OverloadCount, BuckShot, FireBomb, HalfstatByDebuff, SurplusSupply, SetBaseDamage, AmaranthGenerator,
            StrikerHyperElectric, EventPointAbsorb, EventAssemble, StormBringer, ACCR, DEXR, Albatross, Translucence,
            PoseType, LightOfSpirit, ElementSoul, GlimmeringTime, Restoration, ComboCostInc, ChargeBuff,
            TrueSight, CrossOverChain, ChillingStep, Reincarnation, DotBasedBuff, BlessEnsenble, ExtremeArchery,
            QuiverCatridge, AdvancedQuiver, UserControlMob, ImmuneBarrier, ArmorPiercing, ZeroAuraStr, ZeroAuraSpd,
            CriticalGrowing, QuickDraw, RelicEmblem, BowMasterConcentration, TimeFastABuff, TimeFastBBuff, GatherDropR, AimBox2D,
            IncMonsterBattleCaptureRate, CursorSniping, DebuffTolerance, DotHealHPPerSecond, SpiritGuard,
            PreReviveOnce, SetBaseDamageByBuff, LimitMP, ReflectDamR, ComboTempest, MHPCutR, MMPCutR, SelfWeakness,
            ElementDarkness, FlareTrick, Ember, Dominion, SiphonVitality, DarknessAscension, BossWaitingLinesBuff,
            DamageReduce, ShadowServant, ShadowIllusion,
            AddAttackCount, ComplusionSlant, JaguarSummoned, JaguarCount, SSFShootingAttack, DevilCry, ShieldAttack, BMageAura,
            DarkLighting, AttackCountX, BMageDeath, BombTime, NoDebuff,
            XenonAegisSystem, AngelicBursterSoulSeeker, HiddenPossession, NightWalkerBat, NightLordMark, WizardIgnite,
            BattlePvPHelenaMark, Unk424,
            BattlePvPLangEProtection, BattlePvPLeeMalNyunScaleUp, BattlePvPRevive, PinkbeanAttackBuff,
            RandAreaAttack, Unk442, BattlePvPMikeShield, BattlePvPMikeBugle,
            PinkbeanRelax, PinkbeanYoYoStack, WindEnergy,
            NextAttackEnhance, AranCombotempastOption, NautilusFinalAttack, ViperTimeLeap,
            RoyalGuardState, RoyalGuardPrepare, MichaelSoulLink, MichaelStanceLink, TriflingWhimOnOff, AddRangeOnOff,
            KinesisPsychicPoint, KinesisPsychicOver, KinesisPsychicShield, KinesisIncMastery, KinesisPsychicEnergeShield,
            BladeStance, DebuffActiveSkillHPCon, DebuffIncHP, BowMasterMortalBlow, AngelicBursterSoulResonance, Fever,
            IgnisRore, TeleportMasteryRange, FireBarrier, ChangeFoxMan,
            FixCoolTime, IncMobRateDummy, AdrenalinBoost, AranSmashSwing, AranDrain, AranBoostEndHunt, HiddenHyperLinkMaximization,
            RWCylinder, RWCombination, Unk476, RWMagnumBlow, RWBarrier, RWBarrierHeal, RWMaximizeCannon, RWOverHeat,
            RWMovingEvar, Stigma, Unk485, Unk486, Unk487, Unk488, Unk489, Unk490, Unk491, Unk492,
            LightningCascade, BulletBarrage, AuraScythe, Unk497, Unk498, Unk499, Unk500, DivineEcho,
            Unk501, ManaOverload, Unk503, Unk504, SpreadThrow,
            MassDestructionRockets, ShadowAssault, Unk188_492, Unk510, Unk511, BlitzShield, Unk513, FreudWisdom, CoreOverload, Unk425,
            CrystallineWings, Unk520, RIFT_OF_DAMNATION,
            Unk188_500, Spotlight,  Unk518,
            Unk521, Overdrive, EtherealForm, LastResort,
            SpecterEnergy, SpecterState, BasicCast, ScarletCast, GustCast, AbyssalCast, ImpendingDeath, AbyssalRecall, ChargeSpellAmplifier,
            InfinitySpell, ConversionOverdrive,
            GaleBarrier,
             DropPer,
            IncMaxDamage,
            IndieUnk13,
            HayatoStance, EyeForEye, HayatoStanceBonus,

            HayatoPAD, HayatoHPR, HayatoMPR, HayatoBooster, Unk595, Unk596, Jinsoku, HayatoCr,
            HakuBlessing, HayatoBoss, BattoujutsuAdvance, Unk602,
            TeamRoar, Unk607, Unk608, Unk609, Unk610, Unk611, Unk612, Unk613,
            Unk615, Unk616, Unk617, Unk618, Unk619
    );

    private static final List<CharacterTemporaryStat> REMOTE_ORDER = Arrays.asList(
            Speed, Poison, Seal, Darkness, WeaponCharge, ElementalCharge, Stun, Shock, Weakness, WeaknessMdamage,
            Curse, Slow, PvPRaceEffect, Team, DisOrder, /*Thread*/ ShadowPartner,  Morph, Ghost, Attract, Magnet, MagnetArea,
            NoBulletConsume, BanMap, Barrier, DojangShield, ReverseInput, RespectPImmune, RespectMImmune, DefenseAtt, DefenseState,
            DojangBerserk, RepeatEffect, Unk602, StopPortion, StopMotion, Fear, MagicShield, Frozen, Frozen2, Web, DrawBack, FinalCut,
            OnCapsule, Mechanic, Inflation, Explosion, DarkTornado, AmplifyDamage, HideAttack, DevilishPower, SpiritLink, Event, Event2,
            DeathMark, PainMark, Lapidification, VampDeath, VampDeathSummon, VenomSnake, PyramidEffect, KillingPoint, PinkbeanRollingGrade,
            IgnoreTargetDEF, Invisible, Judgement, KeyDownAreaMoving, StackBuff, BlessOfDarkness, Larkness, ReshuffleSwitch, SpecialAction,
            StopForceAtomInfo, SoulGazeCriDamR, PowerTransferGauge, BlitzShield, AffinitySlug, SoulExalt, HiddenPieceOn, SmashStack, MobZoneState,
            GiveMeHeal, TouchMe, Contagion, ComboUnlimited, IgnorePCounter, IgnoreAllCounter, IgnorePImmune, IgnoreAllImmune,
            FinalJudgement, KnightsAura, IceAura, FireAura, HeavensDoor, DamAbsorbShield, NotDamaged, BleedingToxin,
            WindBreakerFinal, IgnoreMobDamR, Asura, Unk306, UnityOfPower, Stimulate, ReturnTeleport, CapDebuff, OverloadCount, FireBomb,
            SurplusSupply, NewFlying, NaviFlying, AmaranthGenerator, CygnusElementSkill, StrikerHyperElectric, EventPointAbsorb, EventAssemble,
            Albatross, Translucence, LightOfSpirit, ElementSoul, GlimmeringTime, Reincarnation, Beholder, QuiverCatridge, ArmorPiercing,
            ZeroAuraStr, ZeroAuraSpd, ImmuneBarrier, FullSoulMP, AntiMagicShellBool, Dance, Unk425, ComboTempest, HalfstatByDebuff,
            ComplusionSlant, JaguarSummoned, BMageAura, BombTime, Unk491, Unk492, LightningCascade, BulletBarrage, Unk495, AuraScythe,
            Unk497, DarkLighting, AttackCountX, FireBarrier, KeyDownMoving, MichaelSoulLink, KinesisPsychicEnergeShield, BladeStance,
            IgnisRore, AdrenalinBoost, RWBarrier, Unk476, RWMagnumBlow, GuidedArrow, SpiritFlow, LucentBrand, ExtraSkillCTS, Unk199_256, Stigma, DivineEcho, Unk503,
            Unk504, Unk485, ManaOverload, CursorSniping, Unk188_500, Spotlight, CoreOverload, FreudWisdom, ComboCounter, Overdrive, EtherealForm,
            LastResort,  Unk520,
            SpecterState, ImpendingDeath, GrandGuardian, HayatoStanceBonus, BeastMode, TeamRoar,
            HayatoBooster, HayatoPAD, HayatoHPR, HayatoMPR, HayatoCr, HayatoBoss, Stance, BattoujutsuAdvance, Unk603,
            BlackHeartedCurse, EyeForEye, Unk608, Unk612, Unk613, Unk614, Unk616, Unk617, Unk618,  Unk513
    );

    CharacterTemporaryStat(int bitPos) {
        this.bitPos = bitPos;
        this.val = 1 << (31 - bitPos % 32);
        this.pos = bitPos / 32;
    }

    // for Unks only
    CharacterTemporaryStat() {
        int bitPos = -1;
        if (name().contains("Unk")) {
            bitPos = Integer.parseInt(name().replace("Unk", ""));
        }
        this.bitPos = bitPos;
        this.val = 1 << (31 - bitPos % 32);
        this.pos = bitPos / 32;
    }

    public boolean isEncodeInt() {
        switch (this) {
            case CarnivalDefence:
            case SpiritLink:
            case DojangLuckyBonus:
            case SoulGazeCriDamR:
            case PowerTransferGauge:
            case ReturnTeleport:
            case ShadowPartner:
            case AranSmashSwing:
            case SetBaseDamage:
            case QuiverCatridge:
            case ImmuneBarrier:
            case NaviFlying:
            case Dance:
            case SetBaseDamageByBuff:
            case DotHealHPPerSecond:
            case SpiritGuard:
            case IncMaxDamage:
            case Unk612:
            case MagnetArea:
            case DivineEcho:
            case Unk306:
            case VampDeath:
            case BlitzShield:
            case RWBarrier:
                return true;
            default:
                return false;
        }
    }

    public boolean isIndie() {
        return getBitPos() < IndieStatCount.getBitPos();
    }

    public boolean isMovingEffectingStat() {
        switch (this) {
            case Speed:
            case Jump:
            case Stun:
            case Weakness:
            case Slow:
            case Morph:
            case Ghost:
            case BasicStatUp:
            case Attract:
            case DashSpeed:
            case DashJump:
            case Flying:
            case Frozen:
            case Frozen2:
            case Lapidification:
            case IndieSpeed:
            case IndieJump:
            case KeyDownMoving:
            case EnergyCharged:
            case Mechanic:
            case Magnet:
            case MagnetArea:
            case VampDeath:
            case VampDeathSummon:
            case GiveMeHeal:
            case DarkTornado:
            case NewFlying:
            case NaviFlying:
            case UserControlMob:
            case Dance:
            case SelfWeakness:
            case IndieUnk10:
            case BattlePvPLeeMalNyunScaleUp:
            case TouchMe:
            case IndieForceSpeed:
            case IndieForceJump:
            case RideVehicle:
            case RideVehicleExpire:

                return true;
            default:
                return false;
        }
    }

    public int getVal() {
        return val;
    }

    public int getPos() {
        return pos;
    }

    public int getOrder() {
        return ORDER.indexOf(this);
    }

    public int getRemoteOrder() {
        return REMOTE_ORDER.indexOf(this);
    }

    public boolean isRemoteEncode4() {
        switch (this) {
            case NoBulletConsume:// v202.3
            case RespectPImmune:// v202.3
            case RespectMImmune:// v202.3
            case DefenseAtt:// v202.3
            case DefenseState:// v202.3
            case MagicShield:// v202.3
            case PyramidEffect:// v202.3
            case BlessOfDarkness:// v202.3
            case Unk306:// v202.3
            case ImmuneBarrier:// v202.3
            case Dance:// v202.3
            case Unk425:// v202.3
            case SpiritGuard:
            case KinesisPsychicEnergeShield:// v202.3
            case AdrenalinBoost:// v202.3
            case RWBarrier:// v202.3
            case Unk476:// v202.3
            case RWMagnumBlow:// v202.3
            case DivineEcho:// v202.3
            case Unk503:// v202.3
            case Unk612:// v202.3
            case Unk613:// v202.3
            case Unk614:// v202.3
            case Unk617:// v202.3
            case Unk618:// v202.3
            case HayatoStance:
            //case Unk487:
            case Unk488:
            case Unk489:
                return true;
            default:
                return false;
        }
    }

    public boolean isRemoteEncode1() {
        switch (this) {
            case Speed:// v202.3
            case Poison:// v202.3
            case Seal:// v202.3
            case Shock:// v202.3
            case Team:// v202.3
            case Cyclone:
            case OnCapsule:// v202.3
            case KillingPoint:// v202.3
            case PinkbeanRollingGrade:// v202.3
            case ReturnTeleport:// v202.3
            case FireBomb:// v202.3
            case SurplusSupply:// v202.3
                return true;
            default:
                return false;
        }
    }

    public boolean isNotEncodeReason() {
        switch (this) {
            case Speed:// v202.3
            case Poison:// v202.3
            case Seal:// v202.3
            case ElementalCharge:// v202.3
            case Shock:// v202.3
            case Team:// v202.3
            case Ghost:// v202.3
            case NoBulletConsume:// v202.3
            case RespectPImmune:// v202.3
            case RespectMImmune:// v202.3
            case DefenseAtt:// v202.3
            case DefenseState:// v202.3
            case MagicShield:// v202.3
            case Cyclone:
            case OnCapsule:// v202.3
            case PyramidEffect:// v202.3
            case KillingPoint:// v202.3
            case PinkbeanRollingGrade:// v202.3
            case StackBuff:// v202.3
            case BlessOfDarkness:// v202.3
            case SurplusSupply:// v202.3
            case ImmuneBarrier:// v202.3
            case AdrenalinBoost:// v202.3
            case RWBarrier:// v202.3
            case Unk476:// v202.3
            case RWMagnumBlow:// v202.3
            case Unk504:// v202.3
            case Unk485:// v202.3
            case ManaOverload:// v202.3
            case Unk613:// v202.3
            case Unk614:// v202.3
            case Unk617:// v202.3
            case Unk618:// v202.3
            case HayatoStance:
            case Unk488:
            case Unk489:
            //case Unk460:
                return true;
            default:
                return false;
        }
    }

    public boolean isNotEncodeAnything() {
        switch (this) {
            // not encoded in client
            case DarkSight:
            case SoulArrow:
            case DojangInvincible:
            case Flying:
            case BeastFormDamageUp:
            case BlessingArmor:
            case BlessingArmorIncPAD:
            case HolyMagicShell:
            case VengeanceOfAngel:
            case UserControlMob:
            // Special encoding
            case FullSoulMP:// v202.3
            case AntiMagicShellBool:// v202.3
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        int a = Stigma.bitPos;
//        int val = 1 << (31 - (a & 0x1f));
//        int pos = a >> 5;
        int val = 0x1000;
        int pos = 0;
        log.debug(String.format("value 0x%04x, pos %d", val, pos));
        for(CharacterTemporaryStat cts : values()) {
            if(cts.getVal() == val && cts.getPos() == pos) {
                log.debug("Corresponds to " + cts);
            }
        }
//        for (CharacterTemporaryStat cts : values()) {
//            val = cts.getVal();
//            for (int i = 0; i < 32; i++) {
//                if (1 << i == val) {
//                    val = 31 - i;
//                }
//            }
//            if (val % 8 == 0) {
//                System.out.println();
//            }
//            System.out.println(String.format("%s(%d),", cts.toString(), (cts.getPos() * 32) + val));
//        }
    }

    @Override
    public int compare(CharacterTemporaryStat o1, CharacterTemporaryStat o2) {
        if (o1.getPos() < o2.getPos()) {
            return -1;
        } else if (o1.getPos() > o2.getPos()) {
            return 1;
        }
        // hacky way to circumvent java not having unsigned ints
        int o1Val = o1.getVal();
        if (o1Val == 0x8000_0000) {
            o1Val = Integer.MAX_VALUE;
        }
        int o2Val = o2.getVal();
        if (o2Val == 0x8000_0000) {
            o2Val = Integer.MAX_VALUE;
        }

        if (o1Val > o2Val) {
            // bigger value = earlier in the int => smaller
            return -1;
        } else if (o1Val < o2Val) {
            return 1;
        }
        return 0;
    }

    public int getBitPos() {
        return bitPos;
    }
}
