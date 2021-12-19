package ru.senko.hermes.model.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.Optional;
import java.util.stream.Stream;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Currency {

    ETH_BTC("ETHBTC"),
    LTC_BTC("LTCBTC"),
    BNB_BTC("BNBBTC"),
    @JsonProperty(value = "solusdt") SOL_USDT("solusdt"),
    NEO_BTC("NEOBTC"),
    QTUM_ETH("QTUMETH"),
    EOS_ETH("EOSETH"),
    SNT_ETH("SNTETH"),
    BNT_ETH("BNTETH"),
    BCC_BTC("BCCBTC"),
    GAS_BTC("GASBTC"),
    BNB_ETH("BNBETH"),
    BTC_USDT("BTCUSDT"),
    ETH_USDT("ETHUSDT"),
    HSR_BTC("HSRBTC"),
    OAX_ETH("OAXETH"),
    DNT_ETH("DNTETH"),
    MCO_ETH("MCOETH"),
    ICN_ETH("ICNETH"),
    MCO_BTC("MCOBTC"),
    WTC_BTC("WTCBTC"),
    WTC_ETH("WTCETH"),
    LRC_BTC("LRCBTC"),
    LRC_ETH("LRCETH"),
    QTU_MBTC("QTUMBTC"),
    YOYO_BTC("YOYOBTC"),
    OMG_BTC("OMGBTC"),
    OMG_ETH("OMGETH"),
    ZRX_BTC("ZRXBTC"),
    ZRX_ETH("ZRXETH"),
    STRAT_BTC("STRATBTC"),
    STRAT_ETH("STRATETH"),
    SNGLS_BTC("SNGLSBTC"),
    SNGLS_ETH("SNGLSETH"),
    BQX_BTC("BQXBTC"),
    BQX_ETH("BQXETH"),
    KNC_BTC("KNCBTC"),
    KNC_ETH("KNCETH"),
    FUN_BTC("FUNBTC"),
    FUN_ETH("FUNETH"),
    SNM_BTC("SNMBTC"),
    SNM_ETH("SNMETH"),
    NEO_ETH("NEOETH"),
    IOTA_BTC("IOTABTC"),
    IOTA_ETH("IOTAETH"),
    LINK_BTC("LINKBTC"),
    LINK_ETH("LINKETH"),
    XVG_BTC("XVGBTC"),
    XVG_ETH("XVGETH"),
    SALT_BTC("SALTBTC"),
    SALT_ETH("SALTETH"),
    MDA_BTC("MDABTC"),
    MDA_ETH("MDAETH"),
    MTL_BTC("MTLBTC"),
    MTL_ETH("MTLETH"),
    SUB_BTC("SUBBTC"),
    SUB_ETH("SUBETH"),
    EOS_BTC("EOSBTC"),
    SNT_BTC("SNTBTC"),
    ETC_ETH("ETCETH"),
    ETC_BTC("ETCBTC"),
    MTH_BTC("MTHBTC"),
    MTH_ETH("MTHETH"),
    ENG_BTC("ENGBTC"),
    ENG_ETH("ENGETH"),
    DNT_BTC("DNTBTC"),
    ZEC_BTC("ZECBTC"),
    ZEC_ETH("ZECETH"),
    BNT_BTC("BNTBTC"),
    AST_BTC("ASTBTC"),
    AST_ETH("ASTETH"),
    DASH_BTC("DASHBTC"),
    DASH_ETH("DASHETH"),
    OAX_BTC("OAXBTC"),
    ICN_BTC("ICNBTC"),
    BTG_BTC("BTGBTC"),
    BTG_ETH("BTGETH"),
    EVX_BTC("EVXBTC"),
    EVX_ETH("EVXETH"),
    REQ_BTC("REQBTC"),
    REQ_ETH("REQETH"),
    VIB_BTC("VIBBTC"),
    VIB_ETH("VIBETH"),
    HSR_ETH("HSRETH"),
    TRX_BTC("TRXBTC"),
    TRX_ETH("TRXETH"),
    POWR_BTC("POWRBTC"),
    POWR_ETH("POWRETH"),
    ARK_BTC("ARKBTC"),
    ARK_ETH("ARKETH"),
    YOYO_ETH("YOYOETH"),
    XRP_BTC("XRPBTC"),
    XRP_ETH("XRPETH"),
    MOD_BTC("MODBTC"),
    MOD_ETH("MODETH"),
    ENJ_BTC("ENJBTC"),
    ENJ_ETH("ENJETH"),
    STORJ_BTC("STORJBTC"),
    STORJ_ETH("STORJETH"),
    BNB_USDT("BNBUSDT"),
    VEN_BNB("VENBNB"),
    YOYO_BNB("YOYOBNB"),
    POWR_BNB("POWRBNB"),
    VEN_BTC("VENBTC"),
    VEN_ETH("VENETH"),
    KMD_BTC("KMDBTC"),
    KMD_ETH("KMDETH"),
    NULS_BNB("NULSBNB"),
    RCN_BTC("RCNBTC"),
    RCN_ETH("RCNETH"),
    RCN_BNB("RCNBNB"),
    NULS_BTC("NULSBTC"),
    NULS_ETH("NULSETH"),
    RDN_BTC("RDNBTC"),
    RDN_ETH("RDNETH"),
    RDN_BNB("RDNBNB"),
    XMR_BTC("XMRBTC"),
    XMR_ETH("XMRETH"),
    DLT_BNB("DLTBNB"),
    WTC_BNB("WTCBNB"),
    DLT_BTC("DLTBTC"),
    DLT_ETH("DLTETH"),
    AMB_BTC("AMBBTC"),
    AMB_ETH("AMBETH"),
    AMB_BNB("AMBBNB"),
    BCC_ETH("BCCETH"),
    BCC_USDT("BCCUSDT"),
    BCC_BNB("BCCBNB"),
    BAT_BTC("BATBTC"),
    BAT_ETH("BATETH"),
    BAT_BNB("BATBNB"),
    BCPT_BTC("BCPTBTC"),
    BCPT_ETH("BCPTETH"),
    BCPT_BNB("BCPTBNB"),
    ARN_BTC("ARNBTC"),
    ARN_ETH("ARNETH"),
    GVT_BTC("GVTBTC"),
    GVT_ETH("GVTETH"),
    CDT_BTC("CDTBTC"),
    CDT_ETH("CDTETH"),
    GXS_BTC("GXSBTC"),
    GXS_ETH("GXSETH"),
    NEO_USDT("NEOUSDT"),
    NEO_BNB("NEOBNB"),
    POE_BTC("POEBTC"),
    POE_ETH("POEETH"),
    QSP_BTC("QSPBTC"),
    QSP_ETH("QSPETH"),
    QSP_BNB("QSPBNB"),
    BTS_BTC("BTSBTC"),
    BTS_ETH("BTSETH"),
    BTS_BNB("BTSBNB"),
    XZC_BTC("XZCBTC"),
    XZC_ETH("XZCETH"),
    XZC_BNB("XZCBNB"),
    LSK_BTC("LSKBTC"),
    LSK_ETH("LSKETH"),
    LSK_BNB("LSKBNB"),
    TNT_BTC("TNTBTC"),
    TNT_ETH("TNTETH"),
    FUEL_BTC("FUELBTC"),
    FUEL_ETH("FUELETH"),
    MANA_BTC("MANABTC"),
    MANA_ETH("MANAETH"),
    BCD_BTC("BCDBTC"),
    BCD_ETH("BCDETH"),
    DGD_BTC("DGDBTC"),
    DGD_ETH("DGDETH"),
    IOTA_BNB("IOTABNB"),
    ADX_BTC("ADXBTC"),
    ADX_ETH("ADXETH"),
    ADX_BNB("ADXBNB"),
    ADA_BTC("ADABTC"),
    ADA_ETH("ADAETH"),
    PPT_BTC("PPTBTC"),
    PPT_ETH("PPTETH"),
    CMT_BTC("CMTBTC"),
    CMT_ETH("CMTETH"),
    CMT_BNB("CMTBNB"),
    XLM_BTC("XLMBTC"),
    XLM_ETH("XLMETH"),
    XLM_BNB("XLMBNB"),
    CND_BTC("CNDBTC"),
    CND_ETH("CNDETH"),
    CND_BNB("CNDBNB"),
    LEND_BTC("LENDBTC"),
    LEND_ETH("LENDETH"),
    WABI_BTC("WABIBTC"),
    WABI_ETH("WABIETH"),
    WABI_BNB("WABIBNB"),
    LTC_ETH("LTCETH"),
    LTC_USDT("LTCUSDT"),
    LTC_BNB("LTCBNB"),
    TNB_BTC("TNBBTC"),
    TNB_ETH("TNBETH"),
    WAVES_BTC("WAVESBTC"),
    WAVES_ETH("WAVESETH"),
    WAVES_BNB("WAVESBNB"),
    GTO_BTC("GTOBTC"),
    GTO_ETH("GTOETH"),
    GTO_BNB("GTOBNB"),
    ICX_BTC("ICXBTC"),
    ICX_ETH("ICXETH"),
    ICX_BNB("ICXBNB");

    private String symbol;

    private static final Currency[] VALUES = values();

    public static Optional<Currency> getBySymbol(String symbol) {
        return Stream.of(VALUES)
                .filter(currency -> symbol.equalsIgnoreCase(currency.symbol))
                .findAny();
    }

//2021-11-14 10:53:09.709  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ICXBNB
//2021-11-14 10:53:09.709  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OSTBTC
//2021-11-14 10:53:09.709  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OSTETH
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OSTBNB
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ELFBTC
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ELFETH
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AIONBTC
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AIONETH
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AIONBNB
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NEBLBTC
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NEBLETH
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NEBLBNB
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BRDBTC
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BRDETH
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BRDBNB
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MCOBNB
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EDOBTC
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EDOETH
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WINGSBTC
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WINGSETH
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NAVBTC
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NAVETH
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NAVBNB
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LUNBTC
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LUNETH
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRIGBTC
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRIGETH
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRIGBNB
//2021-11-14 10:53:09.710  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : APPCBTC
//2021-11-14 10:53:09.711  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : APPCETH
//2021-11-14 10:53:09.711  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : APPCBNB
//2021-11-14 10:53:09.711  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VIBEBTC
//2021-11-14 10:53:09.711  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VIBEETH
//2021-11-14 10:53:09.711  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RLCBTC
//2021-11-14 10:53:09.711  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RLCETH
//2021-11-14 10:53:09.711  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RLCBNB
//2021-11-14 10:53:09.711  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : INSBTC
//2021-11-14 10:53:09.711  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : INSETH
//2021-11-14 10:53:09.711  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PIVXBTC
//2021-11-14 10:53:09.711  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PIVXETH
//2021-11-14 10:53:09.711  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PIVXBNB
//2021-11-14 10:53:09.711  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IOSTBTC
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IOSTETH
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHATBTC
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHATETH
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STEEMBTC
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STEEMETH
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STEEMBNB
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NANOBTC
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NANOETH
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NANOBNB
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VIABTC
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VIAETH
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VIABNB
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BLZBTC
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BLZETH
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BLZBNB
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AEBTC
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AEETH
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AEBNB
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RPXBTC
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RPXETH
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RPXBNB
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NCASHBTC
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NCASHETH
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NCASHBNB
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : POABTC
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : POAETH
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : POABNB
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZILBTC
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZILETH
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZILBNB
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONTBTC
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONTETH
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONTBNB
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STORMBTC
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STORMETH
//2021-11-14 10:53:09.712  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STORMBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QTUMBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QTUMUSDT
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XEMBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XEMETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XEMBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WANBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WANETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WANBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WPRBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WPRETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QLCBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QLCETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SYSBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SYSETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SYSBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QLCBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GRSBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GRSETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADAUSDT
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADABNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CLOAKBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CLOAKETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GNTBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GNTETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GNTBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LOOMBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LOOMETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LOOMBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPUSDT
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCNBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCNETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCNBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : REPBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : REPETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : REPBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCTUSD
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TUSDBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHTUSD
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TUSDETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TUSDBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZENBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZENETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZENBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SKYBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SKYETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SKYBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EOSUSDT
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EOSBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CVCBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CVCETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CVCBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : THETABTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : THETAETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : THETABNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TUSDUSDT
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IOTAUSDT
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XLMUSDT
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IOTXBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IOTXETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QKCBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QKCETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AGIBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AGIETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AGIBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NXSBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NXSETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NXSBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ENJBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DATABTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DATAETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONTUSDT
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRXBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRXUSDT
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETCUSDT
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETCBNB
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ICXUSDT
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SCBTC
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SCETH
//2021-11-14 10:53:09.713  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SCBNB
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NPXSBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NPXSETH
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VENUSDT
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KEYBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KEYETH
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NASBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NASETH
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NASBNB
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MFTBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MFTETH
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MFTBNB
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DENTBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DENTETH
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ARDRBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ARDRETH
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ARDRBNB
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NULSUSDT
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HOTBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HOTETH
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VETBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VETETH
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VETUSDT
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VETBNB
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOCKBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOCKETH
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : POLYBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : POLYBNB
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PHXBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PHXETH
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PHXBNB
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HCBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HCETH
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GOBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GOBNB
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PAXBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PAXBNB
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PAXUSDT
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PAXETH
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RVNBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RVNBNB
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DCRBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DCRBNB
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDCBNB
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MITHBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MITHBNB
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHABCBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHSVBTC
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHABCUSDT
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHSVUSDT
//2021-11-14 10:53:09.714  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBPAX
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCPAX
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHPAX
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPPAX
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EOSPAX
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XLMPAX
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RENBTC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RENBNB
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBTUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPTUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EOSTUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XLMTUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBUSDC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCUSDC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHUSDC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPUSDC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EOSUSDC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XLMUSDC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDCUSDT
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADATUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRXTUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NEOTUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRXXRP
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XZCXRP
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PAXTUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDCTUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDCPAX
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINKUSDT
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINKTUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINKPAX
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINKUSDC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WAVESUSDT
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WAVESTUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WAVESPAX
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WAVESUSDC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHABCTUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHABCPAX
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHABCUSDC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHSVTUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHSVPAX
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHSVUSDC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTCTUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTCPAX
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTCUSDC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRXPAX
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRXUSDC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTTBTC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTTBNB
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTTUSDT
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBUSDS
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCUSDS
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDSUSDT
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDSPAX
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDSTUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDSUSDC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTTPAX
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTTTUSD
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTTUSDC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONGBNB
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONGBTC
//2021-11-14 10:53:09.715  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONGUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HOTBNB
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HOTUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZILUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZRXBNB
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZRXUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FETBNB
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FETBTC
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FETUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BATUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XMRBNB
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XMRUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZECBNB
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZECUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZECPAX
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZECTUSD
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZECUSDC
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IOSTBNB
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IOSTUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CELRBNB
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CELRBTC
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CELRUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADAPAX
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADAUSDC
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NEOPAX
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NEOUSDC
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DASHBNB
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DASHUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NANOUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OMGBNB
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OMGUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : THETAUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ENJUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MITHUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MATICBNB
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MATICBTC
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MATICUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ATOMBNB
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ATOMBTC
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ATOMUSDT
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ATOMUSDC
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ATOMPAX
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ATOMTUSD
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETCUSDC
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETCPAX
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETCTUSD
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BATUSDC
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BATPAX
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BATTUSD
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PHBBNB
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PHBBTC
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PHBUSDC
//2021-11-14 10:53:09.716  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PHBTUSD
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PHBPAX
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TFUELBNB
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TFUELBTC
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TFUELUSDT
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TFUELUSDC
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TFUELTUSD
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TFUELPAX
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONEBNB
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONEBTC
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONEUSDT
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONETUSD
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONEPAX
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONEUSDC
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTMBNB
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTMBTC
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTMUSDT
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTMTUSD
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTMPAX
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTMUSDC
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCBBTC
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCPTTUSD
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCPTPAX
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCPTUSDC
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALGOBNB
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALGOBTC
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALGOUSDT
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALGOTUSD
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALGOPAX
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALGOUSDC
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDSBUSDT
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDSBUSDS
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GTOUSDT
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GTOPAX
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GTOTUSD
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GTOUSDC
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ERDBNB
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ERDBTC
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ERDUSDT
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ERDPAX
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ERDUSDC
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOGEBNB
//2021-11-14 10:53:09.717  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOGEBTC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOGEUSDT
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOGEPAX
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOGEUSDC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DUSKBNB
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DUSKBTC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DUSKUSDT
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DUSKUSDC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DUSKPAX
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BGBPUSDC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ANKRBNB
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ANKRBTC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ANKRUSDT
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ANKRTUSD
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ANKRPAX
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ANKRUSDC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONTPAX
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONTUSDC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WINBNB
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WINBTC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WINUSDT
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WINUSDC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COSBNB
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COSBTC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COSUSDT
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TUSDBTUSD
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NPXSUSDT
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NPXSUSDC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COCOSBNB
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COCOSBTC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COCOSUSDT
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MTLUSDT
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TOMOBNB
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TOMOBTC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TOMOUSDT
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TOMOUSDC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PERLBNB
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PERLBTC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PERLUSDC
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PERLUSDT
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DENTUSDT
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MFTUSDT
//2021-11-14 10:53:09.720  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KEYUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STORMUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOCKUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WANUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FUNUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CVCUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTTTRX
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WINTRX
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHZBNB
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHZBTC
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHZUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BANDBNB
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BANDBTC
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BANDUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBBUSD
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCBUSD
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BUSDUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BEAMBNB
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BEAMBTC
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BEAMUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XTZBNB
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XTZBTC
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XTZUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RENUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RVNUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HCUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HBARBNB
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HBARBTC
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HBARUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NKNBNB
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NKNBTC
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NKNUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPBUSD
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHBUSD
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHABCBUSD
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTCBUSD
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINKBUSD
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETCBUSD
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STXBNB
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STXBTC
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STXUSDT
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KAVABNB
//2021-11-14 10:53:09.722  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KAVABTC
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KAVAUSDT
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BUSDNGN
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBNGN
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCNGN
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ARPABNB
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ARPABTC
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ARPAUSDT
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRXBUSD
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EOSBUSD
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IOTXUSDT
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RLCUSDT
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MCOUSDT
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XLMBUSD
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADABUSD
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CTXCBNB
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CTXCBTC
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CTXCUSDT
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHBNB
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHBTC
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHUSDT
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHUSDC
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHTUSD
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHPAX
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHBUSD
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCRUB
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHRUB
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPRUB
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBRUB
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TROYBNB
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TROYBTC
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TROYUSDT
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BUSDRUB
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QTUMBUSD
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VETBUSD
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VITEBNB
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VITEBTC
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VITEUSDT
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTTBNB
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTTBTC
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTTUSDT
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCTRY
//2021-11-14 10:53:09.728  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBTRY
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BUSDTRY
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHTRY
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPTRY
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDTTRY
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDTRUB
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCEUR
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHEUR
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBEUR
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPEUR
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EURBUSD
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EURUSDT
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OGNBNB
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OGNBTC
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OGNUSDT
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DREPBNB
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DREPBTC
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DREPUSDT
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BULLUSDT
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BULLBUSD
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BEARUSDT
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BEARBUSD
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHBULLUSDT
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHBULLBUSD
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHBEARUSDT
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHBEARBUSD
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TCTBNB
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TCTBTC
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TCTUSDT
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WRXBNB
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WRXBTC
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WRXUSDT
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ICXBUSD
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTSUSDT
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTSBUSD
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LSKUSDT
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNTUSDT
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNTBUSD
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTOBNB
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTOBTC
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTOUSDT
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ATOMBUSD
//2021-11-14 10:53:09.730  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DASHBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NEOBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WAVESBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XTZBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EOSBULLUSDT
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EOSBULLBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EOSBEARUSDT
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EOSBEARBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPBULLUSDT
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPBULLBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPBEARUSDT
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPBEARBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BATBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ENJBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NANOBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONTBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RVNBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STRATBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STRATBNB
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STRATUSDT
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AIONBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AIONUSDT
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MBLBNB
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MBLBTC
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MBLUSDT
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COTIBNB
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COTIBTC
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COTIUSDT
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALGOBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTTBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TOMOBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XMRBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZECBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBBULLUSDT
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBBULLBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBBEARUSDT
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBBEARBUSD
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STPTBNB
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STPTBTC
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STPTUSDT
//2021-11-14 10:53:09.732  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCZAR
//2021-11-14 10:53:09.733  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHZAR
//2021-11-14 10:53:09.733  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBZAR
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDTZAR
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BUSDZAR
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCBKRW
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHBKRW
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBBKRW
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WTCUSDT
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DATABUSD
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DATAUSDT
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XZCUSDT
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SOLBNB
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SOLBTC
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SOLUSDT
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SOLBUSD
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCIDRT
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBIDRT
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDTIDRT
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BUSDIDRT
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CTSIBTC
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CTSIUSDT
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CTSIBNB
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CTSIBUSD
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HIVEBNB
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HIVEBTC
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HIVEUSDT
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHRBNB
//2021-11-14 10:53:09.734  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHRBTC
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHRUSDT
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCUPUSDT
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCDOWNUSDT
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GXSUSDT
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ARDRUSDT
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ERDBUSD
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LENDUSDT
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HBARBUSD
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MATICBUSD
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WRXBUSD
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZILBUSD
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MDTBNB
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MDTBTC
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MDTUSDT
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STMXBNB
//2021-11-14 10:53:09.735  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STMXBTC
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STMXETH
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STMXUSDT
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KNCBUSD
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KNCUSDT
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : REPBUSD
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : REPUSDT
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LRCBUSD
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LRCUSDT
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IQBNB
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IQBUSD
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PNTBTC
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PNTUSDT
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCGBP
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHGBP
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPGBP
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBGBP
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GBPBUSD
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DGBBNB
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DGBBTC
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DGBBUSD
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCUAH
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDTUAH
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COMPBTC
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COMPBNB
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COMPBUSD
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COMPUSDT
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCBIDR
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHBIDR
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBBIDR
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BUSDBIDR
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDTBIDR
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BKRWUSDT
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BKRWBUSD
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SCUSDT
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZENUSDT
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SXPBTC
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SXPBNB
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SXPBUSD
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SNXBTC
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SNXBNB
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SNXBUSD
//2021-11-14 10:53:09.737  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SNXUSDT
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHUPUSDT
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHDOWNUSDT
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADAUPUSDT
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADADOWNUSDT
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINKUPUSDT
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINKDOWNUSDT
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VTHOBNB
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VTHOBUSD
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VTHOUSDT
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DCRBUSD
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DGBUSDT
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GBPUSDT
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STORJBUSD
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SXPUSDT
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IRISBNB
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IRISBTC
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IRISBUSD
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MKRBNB
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MKRBTC
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MKRUSDT
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MKRBUSD
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DAIBNB
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DAIBTC
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DAIUSDT
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DAIBUSD
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RUNEBNB
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RUNEBTC
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RUNEBUSD
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MANABUSD
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOGEBUSD
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LENDBUSD
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZRXBUSD
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DCRUSDT
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STORJUSDT
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPBKRW
//2021-11-14 10:53:09.739  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADABKRW
//2021-11-14 10:53:09.740  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCAUD
//2021-11-14 10:53:09.740  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHAUD
//2021-11-14 10:53:09.740  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AUDBUSD
//2021-11-14 10:53:09.740  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FIOBNB
//2021-11-14 10:53:09.740  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FIOBTC
//2021-11-14 10:53:09.740  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FIOBUSD
//2021-11-14 10:53:09.741  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBUPUSDT
//2021-11-14 10:53:09.741  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBDOWNUSDT
//2021-11-14 10:53:09.741  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XTZUPUSDT
//2021-11-14 10:53:09.741  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XTZDOWNUSDT
//2021-11-14 10:53:09.741  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AVABNB
//2021-11-14 10:53:09.741  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AVABTC
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AVABUSD
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDTBKRW
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BUSDBKRW
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IOTABUSD
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MANAUSDT
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPAUD
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBAUD
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AUDUSDT
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BALBNB
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BALBTC
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BALBUSD
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : YFIBNB
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : YFIBTC
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : YFIBUSD
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : YFIUSDT
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BLZBUSD
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KMDBUSD
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BALUSDT
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BLZUSDT
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IRISUSDT
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KMDUSDT
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCDAI
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHDAI
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBDAI
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDTDAI
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BUSDDAI
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : JSTBNB
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : JSTBTC
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : JSTBUSD
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : JSTUSDT
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SRMBNB
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SRMBTC
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SRMBUSD
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SRMUSDT
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ANTBNB
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ANTBTC
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ANTBUSD
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ANTUSDT
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CRVBNB
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CRVBTC
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CRVBUSD
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CRVUSDT
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SANDBNB
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SANDBTC
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SANDUSDT
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SANDBUSD
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OCEANBNB
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OCEANBTC
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OCEANBUSD
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OCEANUSDT
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NMRBNB
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NMRBTC
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NMRBUSD
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NMRUSDT
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTBNB
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTBTC
//2021-11-14 10:53:09.742  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTBUSD
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTUSDT
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LUNABNB
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LUNABTC
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LUNABUSD
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LUNAUSDT
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IDEXBTC
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IDEXBUSD
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RSRBNB
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RSRBTC
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RSRBUSD
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RSRUSDT
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PAXGBNB
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PAXGBTC
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PAXGBUSD
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PAXGUSDT
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WNXMBNB
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WNXMBTC
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WNXMBUSD
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WNXMUSDT
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRBBNB
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRBBTC
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRBBUSD
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRBUSDT
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHNGN
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTBIDR
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINKAUD
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SXPAUD
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BZRXBNB
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BZRXBTC
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BZRXBUSD
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BZRXUSDT
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WBTCBTC
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WBTCETH
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUSHIBNB
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUSHIBTC
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUSHIBUSD
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUSHIUSDT
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : YFIIBNB
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : YFIIBTC
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : YFIIBUSD
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : YFIIUSDT
//2021-11-14 10:53:09.744  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KSMBNB
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KSMBTC
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KSMBUSD
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KSMUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EGLDBNB
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EGLDBTC
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EGLDBUSD
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EGLDUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DIABNB
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DIABTC
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DIABUSD
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DIAUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RUNEUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FIOUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UMABTC
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UMAUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EOSUPUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EOSDOWNUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRXUPUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRXDOWNUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPUPUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPDOWNUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTUPUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTDOWNUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SRMBIDR
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONEBIDR
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINKTRY
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDTNGN
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BELBNB
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BELBTC
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BELBUSD
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BELUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WINGBNB
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WINGBTC
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SWRVBNB
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SWRVBUSD
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WINGBUSD
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WINGUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTCUPUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTCDOWNUSDT
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LENDBKRW
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SXPEUR
//2021-11-14 10:53:09.746  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CREAMBNB
//2021-11-14 10:53:09.750  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CREAMBUSD
//2021-11-14 10:53:09.750  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UNIBNB
//2021-11-14 10:53:09.750  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UNIBTC
//2021-11-14 10:53:09.750  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UNIBUSD
//2021-11-14 10:53:09.750  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UNIUSDT
//2021-11-14 10:53:09.750  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NBSBTC
//2021-11-14 10:53:09.750  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NBSUSDT
//2021-11-14 10:53:09.750  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OXTBTC
//2021-11-14 10:53:09.750  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OXTUSDT
//2021-11-14 10:53:09.750  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUNBTC
//2021-11-14 10:53:09.750  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUNUSDT
//2021-11-14 10:53:09.750  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AVAXBNB
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AVAXBTC
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AVAXBUSD
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AVAXUSDT
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HNTBTC
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HNTUSDT
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BAKEBNB
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BURGERBNB
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SXPBIDR
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINKBKRW
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FLMBNB
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FLMBTC
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FLMBUSD
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FLMUSDT
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SCRTBTC
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SCRTETH
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CAKEBNB
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CAKEBUSD
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SPARTABNB
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UNIUPUSDT
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UNIDOWNUSDT
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ORNBTC
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ORNUSDT
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRXNGN
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SXPTRY
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UTKBTC
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UTKUSDT
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XVSBNB
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XVSBTC
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XVSBUSD
//2021-11-14 10:53:09.751  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XVSUSDT
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALPHABNB
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALPHABTC
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALPHABUSD
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALPHAUSDT
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VIDTBTC
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VIDTBUSD
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AAVEBNB
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCBRL
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDTBRL
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AAVEBTC
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AAVEETH
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AAVEBUSD
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AAVEUSDT
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AAVEBKRW
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NEARBNB
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NEARBTC
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NEARBUSD
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NEARUSDT
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SXPUPUSDT
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SXPDOWNUSDT
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTBKRW
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SXPGBP
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FILBNB
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FILBTC
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FILBUSD
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FILUSDT
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FILUPUSDT
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FILDOWNUSDT
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : YFIUPUSDT
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : YFIDOWNUSDT
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : INJBNB
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : INJBTC
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : INJBUSD
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : INJUSDT
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AERGOBTC
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AERGOBUSD
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINKEUR
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONEBUSD
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EASYETH
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AUDIOBTC
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AUDIOBUSD
//2021-11-14 10:53:09.753  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AUDIOUSDT
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CTKBNB
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CTKBTC
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CTKBUSD
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CTKUSDT
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHUPUSDT
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHDOWNUSDT
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BOTBTC
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BOTBUSD
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHBRL
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTEUR
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AKROBTC
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AKROUSDT
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KP3RBNB
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KP3RBUSD
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AXSBNB
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AXSBTC
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AXSBUSD
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AXSUSDT
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HARDBNB
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HARDBTC
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HARDBUSD
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HARDUSDT
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBBRL
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTCEUR
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RENBTCBTC
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RENBTCETH
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DNTBUSD
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DNTUSDT
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SLPETH
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADAEUR
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTCNGN
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CVPETH
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CVPBUSD
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STRAXBTC
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STRAXETH
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STRAXBUSD
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STRAXUSDT
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FORBTC
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FORBUSD
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UNFIBNB
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UNFIBTC
//2021-11-14 10:53:09.755  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UNFIBUSD
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UNFIUSDT
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FRONTETH
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FRONTBUSD
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHABUSD
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ROSEBTC
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ROSEBUSD
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ROSEUSDT
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AVAXTRY
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BUSDBRL
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AVAUSDT
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SYSBUSD
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XEMUSDT
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HEGICETH
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HEGICBUSD
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AAVEUPUSDT
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AAVEDOWNUSDT
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PROMBNB
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PROMBUSD
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPBRL
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPNGN
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SKLBTC
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SKLBUSD
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SKLUSDT
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BCHEUR
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : YFIEUR
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZILBIDR
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUSDBTC
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUSDETH
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUSDUSDT
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COVERETH
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COVERBUSD
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GLMBTC
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GLMETH
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GHSTETH
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GHSTBUSD
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUSHIUPUSDT
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUSHIDOWNUSDT
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XLMUPUSDT
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XLMDOWNUSDT
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINKBRL
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINKNGN
//2021-11-14 10:53:09.757  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTCRUB
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRXTRY
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XLMEUR
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DFETH
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DFBUSD
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GRTBTC
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GRTETH
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GRTUSDT
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : JUVBTC
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : JUVBUSD
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : JUVUSDT
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PSGBTC
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PSGBUSD
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PSGUSDT
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BUSDBVND
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDTBVND
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : 1INCHBTC
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : 1INCHUSDT
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : REEFBTC
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : REEFUSDT
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OGBTC
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OGUSDT
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ATMBTC
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ATMUSDT
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ASRBTC
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ASRUSDT
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CELOBTC
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CELOUSDT
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RIFBTC
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RIFUSDT
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHZTRY
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XLMTRY
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINKGBP
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GRTEUR
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCSTBTC
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCSTBUSD
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCSTUSDT
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRUBTC
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRUBUSD
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRUUSDT
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DEXEETH
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DEXEBUSD
//2021-11-14 10:53:09.759  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EOSEUR
//2021-11-14 10:53:09.761  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTCBRL
//2021-11-14 10:53:09.761  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDCBUSD
//2021-11-14 10:53:09.761  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TUSDBUSD
//2021-11-14 10:53:09.761  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PAXBUSD
//2021-11-14 10:53:09.761  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CKBBTC
//2021-11-14 10:53:09.761  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CKBBUSD
//2021-11-14 10:53:09.761  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CKBUSDT
//2021-11-14 10:53:09.761  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TWTBTC
//2021-11-14 10:53:09.761  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TWTBUSD
//2021-11-14 10:53:09.761  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TWTUSDT
//2021-11-14 10:53:09.761  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FIROBTC
//2021-11-14 10:53:09.761  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FIROETH
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FIROUSDT
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BETHETH
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOGEEUR
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOGETRY
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOGEAUD
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOGEBRL
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTNGN
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PROSETH
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LITBTC
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LITBUSD
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LITUSDT
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCVAI
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BUSDVAI
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SFPBTC
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SFPBUSD
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SFPUSDT
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOGEGBP
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTTRY
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FXSBTC
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FXSBUSD
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DODOBTC
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DODOBUSD
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DODOUSDT
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FRONTBTC
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EASYBTC
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CAKEBTC
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CAKEUSDT
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BAKEBUSD
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UFTETH
//2021-11-14 10:53:09.762  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UFTBUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : 1INCHBUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BANDBUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GRTBUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IOSTBUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OMGBUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : REEFBUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ACMBTC
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ACMBUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ACMUSDT
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AUCTIONBTC
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AUCTIONBUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PHABTC
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PHABUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTGBP
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADATRY
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADABRL
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADAGBP
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TVKBTC
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TVKBUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BADGERBTC
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BADGERBUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BADGERUSDT
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FISBTC
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FISBUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FISUSDT
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTBRL
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADAAUD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HOTTRY
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EGLDEUR
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OMBTC
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OMBUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OMUSDT
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PONDBTC
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PONDBUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PONDUSDT
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DEGOBTC
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DEGOBUSD
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DEGOUSDT
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AVAXEUR
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTTTRY
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHZBRL
//2021-11-14 10:53:09.764  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UNIEUR
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALICEBTC
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALICEBUSD
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALICEUSDT
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHZBUSD
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHZEUR
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHZGBP
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BIFIBNB
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BIFIBUSD
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINABTC
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINABUSD
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LINAUSDT
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADARUB
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ENJBRL
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ENJEUR
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MATICEUR
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NEOTRY
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PERPBTC
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PERPBUSD
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PERPUSDT
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RAMPBTC
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RAMPBUSD
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RAMPUSDT
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUPERBTC
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUPERBUSD
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUPERUSDT
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CFXBTC
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CFXBUSD
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CFXUSDT
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ENJGBP
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EOSTRY
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTCGBP
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LUNAEUR
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RVNTRY
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : THETAEUR
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XVGBUSD
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EPSBTC
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EPSBUSD
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EPSUSDT
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AUTOBTC
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AUTOBUSD
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AUTOUSDT
//2021-11-14 10:53:09.766  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TKOBTC
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TKOBIDR
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TKOBUSD
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TKOUSDT
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PUNDIXETH
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PUNDIXUSDT
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTTBRL
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTTEUR
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HOTEUR
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WINEUR
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TLMBTC
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TLMBUSD
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TLMUSDT
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : 1INCHUPUSDT
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : 1INCHDOWNUSDT
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTGBUSD
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTGUSDT
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HOTBUSD
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBUAH
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ONTTRY
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VETEUR
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VETGBP
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WINBRL
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MIRBTC
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MIRBUSD
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MIRUSDT
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BARBTC
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BARBUSD
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BARUSDT
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FORTHBTC
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FORTHBUSD
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FORTHUSDT
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CAKEGBP
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOGERUB
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HOTBRL
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WRXEUR
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EZBTC
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EZETH
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BAKEUSDT
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BURGERBUSD
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BURGERUSDT
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SLPBUSD
//2021-11-14 10:53:09.768  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SLPUSDT
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRXAUD
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRXEUR
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VETTRY
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SHIBUSDT
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SHIBBUSD
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ICPBTC
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ICPBNB
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ICPBUSD
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ICPUSDT
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCGYEN
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDTGYEN
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SHIBEUR
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SHIBRUB
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETCEUR
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETCBRL
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOGEBIDR
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ARBTC
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ARBNB
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ARBUSD
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ARUSDT
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : POLSBTC
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : POLSBNB
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : POLSBUSD
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : POLSUSDT
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MDXBTC
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MDXBNB
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MDXBUSD
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MDXUSDT
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MASKBNB
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MASKBUSD
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MASKUSDT
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LPTBTC
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LPTBNB
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LPTBUSD
//2021-11-14 10:53:09.770  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LPTUSDT
//2021-11-14 10:53:09.771  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHUAH
//2021-11-14 10:53:09.771  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MATICBRL
//2021-11-14 10:53:09.771  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SOLEUR
//2021-11-14 10:53:09.771  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SHIBBRL
//2021-11-14 10:53:09.771  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AGIXBTC
//2021-11-14 10:53:09.771  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ICPEUR
//2021-11-14 10:53:09.771  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MATICGBP
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SHIBTRY
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MATICBIDR
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MATICRUB
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NUBTC
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NUBNB
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NUBUSD
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NUUSDT
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XVGUSDT
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RLCBUSD
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CELRBUSD
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ATMBUSD
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ZENBUSD
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTMBUSD
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : THETABUSD
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WINBUSD
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KAVABUSD
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XEMBUSD
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ATABTC
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ATABNB
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ATABUSD
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ATAUSDT
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GTCBTC
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GTCBNB
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GTCBUSD
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GTCUSDT
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TORNBTC
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TORNBNB
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TORNBUSD
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TORNUSDT
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MATICTRY
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETCGBP
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SOLGBP
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BAKEBTC
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : COTIBUSD
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KEEPBTC
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KEEPBNB
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KEEPBUSD
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KEEPUSDT
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SOLTRY
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RUNEGBP
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SOLBRL
//2021-11-14 10:53:09.773  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SCBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHRBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STMXBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HNTBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTTBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOCKBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADABIDR
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ERNBNB
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ERNBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ERNUSDT
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KLAYBTC
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KLAYBNB
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KLAYBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KLAYUSDT
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RUNEEUR
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MATICAUD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTRUB
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UTKBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IOTXBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PHAUSDT
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SOLRUB
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RUNEAUD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BUSDUAH
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BONDBTC
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BONDBNB
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BONDBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BONDUSDT
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MLNBTC
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MLNBNB
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MLNBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MLNUSDT
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GRTTRY
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CAKEBRL
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ICPRUB
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTAUD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AAVEBRL
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : EOSAUD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DEXEUSDT
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTOBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADXBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QUICKBTC
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QUICKBNB
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QUICKBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : C98USDT
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : C98BUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : C98BNB
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : C98BTC
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CLVBTC
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CLVBNB
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CLVBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CLVUSDT
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QNTBTC
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QNTBNB
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QNTBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QNTUSDT
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FLOWBTC
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FLOWBNB
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FLOWBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FLOWUSDT
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XECBUSD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AXSBRL
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AXSAUD
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TVKUSDT
//2021-11-14 10:53:09.775  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MINABTC
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MINABNB
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MINABUSD
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MINAUSDT
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RAYBNB
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RAYBUSD
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RAYUSDT
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FARMBTC
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FARMBNB
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FARMBUSD
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FARMUSDT
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALPACABTC
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALPACABNB
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALPACABUSD
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALPACAUSDT
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TLMTRY
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : QUICKUSDT
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ORNBUSD
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MBOXBTC
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MBOXBNB
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MBOXBUSD
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MBOXUSDT
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VGXBTC
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VGXETH
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FORUSDT
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : REQUSDT
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GHSTUSDT
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRURUB
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FISBRL
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WAXPUSDT
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WAXPBUSD
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WAXPBNB
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WAXPBTC
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRIBEBTC
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRIBEBNB
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRIBEBUSD
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TRIBEUSDT
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GNOUSDT
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GNOBUSD
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GNOBNB
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GNOBTC
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ARPATRY
//2021-11-14 10:53:09.777  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : PROMBTC
//2021-11-14 10:53:09.779  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MTLBUSD
//2021-11-14 10:53:09.779  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OGNBUSD
//2021-11-14 10:53:09.779  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XECUSDT
//2021-11-14 10:53:09.779  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : C98BRL
//2021-11-14 10:53:09.779  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SOLAUD
//2021-11-14 10:53:09.779  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUSHIBIDR
//2021-11-14 10:53:09.779  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : XRPBIDR
//2021-11-14 10:53:09.779  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : POLYBUSD
//2021-11-14 10:53:09.779  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ELFUSDT
//2021-11-14 10:53:09.779  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DYDXUSDT
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DYDXBUSD
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DYDXBNB
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DYDXBTC
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ELFBUSD
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : POLYUSDT
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : IDEXUSDT
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : VIDTUSDT
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SOLBIDR
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AXSBIDR
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BTCUSDP
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ETHUSDP
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNBUSDP
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDPBUSD
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : USDPUSDT
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GALAUSDT
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GALABUSD
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GALABNB
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : GALABTC
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTMBIDR
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALGOBIDR
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CAKEAUD
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KSMAUD
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : WAVESRUB
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SUNBUSD
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ILVUSDT
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ILVBUSD
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ILVBNB
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ILVBTC
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RENBUSD
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : YGGUSDT
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : YGGBUSD
//2021-11-14 10:53:09.780  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : YGGBNB
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : YGGBTC
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STXBUSD
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SYSUSDT
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DFUSDT
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SOLUSDC
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ARPARUB
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LTCUAH
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FETBUSD
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ARPABUSD
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LSKBUSD
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AVAXBIDR
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALICEBIDR
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FIDAUSDT
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FIDABUSD
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FIDABNB
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FIDABTC
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DENTBUSD
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FRONTUSDT
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CVPUSDT
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AGLDBTC
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AGLDBNB
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AGLDBUSD
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AGLDUSDT
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RADBTC
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RADBNB
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RADBUSD
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RADUSDT
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : UNIAUD
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : HIVEBUSD
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : STPTBUSD
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BETABTC
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BETABNB
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BETABUSD
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BETAUSDT
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SHIBAUD
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RAREBTC
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RAREBNB
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RAREBUSD
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RAREUSDT
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AVAXBRL
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AVAXAUD
//2021-11-14 10:53:09.782  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LUNAAUD
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : TROYBUSD
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AXSETH
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTMETH
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SOLETH
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SSVBTC
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SSVETH
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LAZIOTRY
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LAZIOEUR
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LAZIOBTC
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LAZIOUSDT
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHESSBTC
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHESSBNB
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHESSBUSD
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CHESSUSDT
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTMAUD
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTMBRL
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SCRTBUSD
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ADXUSDT
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AUCTIONUSDT
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CELOBUSD
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : FTMRUB
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NUAUD
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : NURUB
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : REEFTRY
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : REEFBIDR
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SHIBDOGE
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DARUSDT
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DARBUSD
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DARBNB
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DARBTC
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNXBTC
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNXBNB
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNXBUSD
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : BNXUSDT
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RGTUSDT
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RGTBTC
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RGTBUSD
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : RGTBNB
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LAZIOBUSD
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : OXTBUSD
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MANATRY
//2021-11-14 10:53:09.784  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ALGORUB
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SHIBUAH
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : LUNABIDR
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : AUDUSDC
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MOVRBTC
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MOVRBNB
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MOVRBUSD
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MOVRUSDT
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CITYBTC
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CITYBNB
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CITYBUSD
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : CITYUSDT
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ENSBTC
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ENSBNB
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ENSBUSD
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ENSUSDT
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SANDETH
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : DOTETH
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MATICETH
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : ANKRBUSD
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : SANDTRY
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : MANABRL
//2021-11-14 10:53:09.786  INFO 5799 --- [   scheduling-1] r.s.h.m.a.c.b.job.TickersPublisher       : KP3RUSDT

}
