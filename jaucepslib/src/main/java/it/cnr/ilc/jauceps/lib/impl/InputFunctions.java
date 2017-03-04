/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl;

import it.cnr.ilc.jauceps.lib.impl.table.TabLE;
import it.cnr.ilc.jauceps.lib.impl.table.TabLessario;
import it.cnr.ilc.jauceps.lib.impl.table.TabSAI;
import it.cnr.ilc.jauceps.lib.impl.table.TabSF;
import it.cnr.ilc.jauceps.lib.impl.table.TabSI;
import it.cnr.ilc.jauceps.lib.impl.table.TabSM;
import it.cnr.ilc.jauceps.lib.impl.table.TabSPF;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery;
import it.cnr.ilc.jauceps.lib.outputobjects.AucepsResponse;
import it.cnr.ilc.jauceps.lib.structs.Analyses;
import it.cnr.ilc.jauceps.lib.structs.Analysis;
import static it.cnr.ilc.jauceps.lib.structs.LES_Q_MODE.BY_KEY;
import it.cnr.ilc.jauceps.lib.structs.Segments;
import static it.cnr.ilc.jauceps.lib.structs.Segments.SM1;
import static it.cnr.ilc.jauceps.lib.structs.Segments.SM2;
import static it.cnr.ilc.jauceps.lib.structs.Segments.SPF1;
import static it.cnr.ilc.jauceps.lib.structs.Segments.SPF2;
import it.cnr.ilc.jauceps.lib.structs.SilType;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingQueries;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;
import static it.cnr.ilc.latmorphlib.structs.LEM_TYPE.IPERLEMMA;
import static it.cnr.ilc.latmorphlib.structs.LEM_TYPE.IPOLEMMA;
import java.sql.Connection;

import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author Riccardo Del Gratta
 * @mail riccardo.delgratta@{gmail.com|ilc.cnr.it}
 */
public class InputFunctions {

    private AucepsResponse response;
    private TravellingTables travellingtables;
    private TravellingQueries travellingqueries;
    private Sillib sillib;

    /**
     *
     * @param response
     * @param travellingtables
     * @param travellingqueries
     */
    public InputFunctions(AucepsResponse response, TravellingTables travellingtables, TravellingQueries travellingqueries) {
        this.response = response;
        this.travellingtables = travellingtables;
        this.travellingqueries = travellingqueries;
    }

    Analyses analyses;

    Analysis cur_analysis;
    private RunAnalyses runanalyses = new RunAnalyses();

    Vars vars = new Vars();
    boolean sqlDebug = vars.isSqlDebug();
    boolean flowDebug = vars.isFlowDebug();
    boolean valueDebug = vars.isValueDebug();
    boolean deepFlowDebug = vars.isDeepFlowDebug();
    boolean printSplash = vars.isPrintSplash();
    boolean callerDebug = vars.isCallerDebug();
    boolean analysisDebug = vars.isAnalysisDebug();
    boolean printStructDebug = vars.isPrintStructDebug();
    int printFormatted = vars.getPrintFormatted();
    boolean debugJson = vars.isDebugJson();
    boolean useInPipe = vars.isUseInPipe();
    boolean operationDebug = vars.isOperationDebug();
    String EOS = vars.getEOS();

    // log4j
    int loglevel = 0;
    /* only info */

    static final String CLASS_NAME = InputFunctions.class.getName();
    static Logger log = Logger.getLogger(CLASS_NAME);

    public AucepsResponse silcall(Connection conn, SilType sil, String wordform) {
        String routine = CLASS_NAME + "/silcall";
        String logmess = "";
        String origWf = wordform;

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in InputFunctions.java", routine);
            log.debug(logmess);
        }
        /*
         1- Change wordform to lowercase
         2- Change wordform v -> u
         3- Change wordfom j->i 
         4- Assign changed wordform to sil.form
         */
 /*1*/
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHANGING wordform -%s- to lowercase", wordform);
            log.debug(logmess);
        }
        wordform = wordform.toLowerCase();
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHANGED wordform -%s- to lowercase", wordform);
            log.debug(logmess);
        }

        /*2&3*/
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHANGING wordform -%s- v-> u and j->i", wordform);
            log.debug(logmess);
        }

        wordform = wordform.replaceAll("v", "u");
        wordform = wordform.replaceAll("j", "i");

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHANGED wordform -%s- v-> u and j->i", wordform);
            log.debug(logmess);
        }

        /*4*/
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING wordform %s to sil.form -%s-", wordform, sil.getForm());
            log.debug(logmess);
        }

        sil.setForm(wordform);

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPIED wordform %s to sil.form -%s-", wordform, sil.getForm());
            log.debug(logmess);
        }

        if (callerDebug) {
            logmess = String.format("CALLING initAnalyses in  RunAnalyses.java CALLER %s", routine);
            log.debug(logmess);

        }
        if (analysisDebug) {

            logmess = String.format("ANALYSES DEBUG in -%s- AucepsResponse -%s-", routine, response.toString());
            log.debug(logmess);

        }

        response = runanalyses.initAnalyses(response, origWf, wordform);
        if (analysisDebug) {
            logmess = String.format("ANALYSES DEBUG in -%s- after runanalyses.initAnalyses AucepsResponse -%s-", routine, response.toString());
            log.debug(logmess);

        }

        if (callerDebug) {
            logmess = String.format("CALLING siln in  InputFunctions.java. CALLER %s", routine);
            log.debug(logmess);

        }

        response = siln(response, travellingtables, travellingqueries);
        if (analysisDebug) {
            logmess = String.format("ANALYSES DEBUG in -%s- after siln AucepsResponse -%s-", routine, response.toString());
            log.debug(logmess);

        }
        response.setSil(sil);
        setResponse(response);

        return response;

    }

    /**
     * loops spf_1 spf_2 si sf sm_1 sm_2
     *
     * @param response
     * @param travellingtables
     * @param travellingqueries
     * @return
     */
    public AucepsResponse siln(AucepsResponse response,
            TravellingTables travellingtables,
            TravellingQueries travellingqueries) {
        String routine = InputFunctions.class.getName() + "/siln";
        String logmess = "";
        SilType sil = response.getSil();
        String[] segment = new String[7];

        // sillib for managing radicals
        sillib = new Sillib();

        // queries
        TabSpfQuery tabspfq_1 = travellingqueries.getFirstTabSpfq();
        tabspfq_1.setConn(travellingqueries.getConn());

        TabSpfQuery tabspfq_2 = travellingqueries.getSecondTabSpfq();
        tabspfq_2.setConn(travellingqueries.getConn());

        TabSiQuery tabsiq = travellingqueries.getTabsiq();
        tabsiq.setConn(travellingqueries.getConn());

        TabSfQuery tabsfq = travellingqueries.getTabsfq();
        tabsfq.setConn(travellingqueries.getConn());

        TabSmQuery tabsmq_1 = travellingqueries.getFirstTabSmq();
        tabsmq_1.setConn(travellingqueries.getConn());

        TabSmQuery tabsmq_2 = travellingqueries.getSecondTabSmq();
        tabsmq_2.setConn(travellingqueries.getConn());

        // list of tables
        List<TabSPF> tabsSpf_1;
        List<TabSPF> tabsSpf_2;
        List<TabSI> tabsSi;
        List<TabSF> tabsSf;
        List<TabSM> tabsSm_1;
        List<TabSM> tabsSm_2;

        //indicators
        boolean isanySpf_1 = false;
        boolean isanySpf_2 = false;
        boolean isanySi = false;
        boolean isanySf = false;
        boolean isanySm_1 = false;
        boolean isanySm_2 = false;

        // loop counters
        int spf_1 = 0;
        int spf_2 = 0;
        int si = 0;
        int sf = 0;
        int sm_1 = 0;
        int sm_2 = 0;

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in InputFunctions.java", routine);
            log.debug(logmess);
        }
        while (sil.getForm() != null) { // start while on form

            if (callerDebug || deepFlowDebug) {
                logmess = String.format("CALLING tabspfq_1.getSPFset in TabSpfQuery.java with parameters: form -%s- and SPF1 -%d-. CALLER %s", sil.getForm(), Segments.SPF1, routine);
                log.debug(logmess);

            }

            tabsSpf_1 = tabspfq_1.getSPFset(sil.getForm(), SPF1);
            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING setFirstListOfTabSpf in -%s-", routine);
                log.debug(logmess);

            }
            travellingtables.setFirstListOfTabSpf(tabsSpf_1);
            travellingtables.setIsanySPF1(!tabsSpf_1.isEmpty());
            isanySpf_1 = travellingtables.isIsanySPF1();
            if (valueDebug) {
                logmess = String.format("****VALUES of getFirstListOfTabSpf  -%d-", travellingtables.getFirstListOfTabSpf().size());
                log.debug(logmess);

                logmess = String.format("****VALUES of getFirstListOfTabSpf is -%d- LOOP SPF1 -%d-", travellingtables.getFirstListOfTabSpf().size(), travellingtables.getFirstListOfTabSpf().size());
                log.debug(logmess);
            }
            for (TabSPF tabSpf_1 : tabsSpf_1) {
                if (operationDebug) {
                    logmess = String.format("OPERATIONDEBUG SETTING setFirstTabSpf in -%s-", routine);
                    log.debug(logmess);
                    logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 1 in -%s-", routine);
                    log.debug(logmess);

                }
                travellingtables.setFirstTabSpf(tabSpf_1);
                travellingtables.setStatus("1");

                // setting indicators to false
                isanySpf_2 = false;
                isanySi = false;
                isanySf = false;
                isanySm_1 = false;
                isanySm_2 = false;
                travellingtables.setIsanySPF2(isanySpf_2);
                travellingtables.setIsanySI(isanySi);
                travellingtables.setIsanySF(isanySf);
                travellingtables.setIsanySM1(isanySm_1);
                travellingtables.setIsanySM2(isanySm_2);

                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW LOOP SPF1. "
                            + "Counters spf1 -%d- "
                            + "spf2 -%d- "
                            + "si -%d- "
                            + "sf -%d- "
                            + "sm_1 -%d- "
                            + "sm_2 -%d- "
                            + "isanySPF1 -%s- "
                            + "isanySPF2 -%s- "
                            + "isanySI -%s- "
                            + "isanySF -%s- "
                            + "isanySM1 -%s- "
                            + "isanySM2 -%s- "
                            + "travellingtabes.status -%s-",
                            spf_1,
                            spf_2,
                            si,
                            sf,
                            sm_1,
                            sm_2,
                            isanySpf_1,
                            isanySpf_2,
                            isanySi,
                            isanySf,
                            isanySm_1,
                            isanySm_2,
                            travellingtables.getStatus());
                    log.debug(logmess);
                }
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****ASSIGNING EOS to sil.segment[6] in routine %s", routine);
                    log.debug(logmess);
                }
                segment = sil.getSegment();
                segment[6] = EOS;
                sil.setSegment(segment);
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****ASSIGNED EOS to sil.segment[6] in routine %s", routine);
                    log.debug(logmess);
                }
                if (valueDebug) {
                    segment = sil.getSegment();
                    for (int i = 0; i < segment.length; i++) {
                        logmess = String.format("****VALUES IN LOOP getSPFset_1 Segment at index -%d- with value -%s-", i, segment[i]);
                        log.debug(logmess);
                    }
                }
                if (callerDebug) {
                    logmess = String.format("CALLING spferic in  %s.Parameters form -%s-and spf1 -%d- CALLER %s",
                            CLASS_NAME, sil.getForm(), spf_1, routine);
                    log.debug(logmess);

                }

                /* call spferic and update sil */
                sil = sillib.spferic(sil, tabSpf_1);
                response.setSil(sil);
                if (analysisDebug) {
                    logmess = String.format("ANALYSES DEBUG in -%s- after spferic AucepsResponse -%s-", routine, response.toString());
                    log.debug(logmess);

                }
                if (callerDebug || deepFlowDebug) {
                    logmess = String.format("CALLING tabspfq_2.getSPFset in TabSpfQuery.java with parameters: rad_spfe -%s- and SPF2 -%d-. CALLER %s", sil.getRad_spfe(), SPF2, routine);
                    log.debug(logmess);
                }

                tabsSpf_2 = tabspfq_2.getSPFset(sil.getRad_spfe(), SPF2);
                if (operationDebug) {
                    logmess = String.format("OPERATIONDEBUG SETTING setSecondListOfTabSpf in -%s-", routine);
                    log.debug(logmess);

                }
                travellingtables.setSecondListOfTabSpf(tabsSpf_2);
                travellingtables.setIsanySPF2(!tabsSpf_2.isEmpty());
                isanySpf_2 = travellingtables.isIsanySPF2();
                // loop over resultset from tabspf with SPF2
                if (valueDebug) {
                    logmess = String.format("****VALUES of getSecondListOfTabSpf  -%d-", travellingtables.getSecondListOfTabSpf().size());
                    log.debug(logmess);

                    logmess = String.format("****VALUES of getFirstListOfTabSpf is -%d- LOOP SPF2 -%d-", travellingtables.getSecondListOfTabSpf().size(), travellingtables.getSecondListOfTabSpf().size());
                    log.debug(logmess);

                }
                for (TabSPF tabSpf_2 : tabsSpf_2) {
                    if (operationDebug) {
                        logmess = String.format("OPERATIONDEBUG SETTING setSecondTabSpf in -%s-", routine);
                        log.debug(logmess);
                        logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 1 in -%s-", routine);
                        log.debug(logmess);

                    }
                    travellingtables.setSecondTabSpf(tabSpf_2);
                    travellingtables.setStatus("2");

                    // setting indicators to false
                    isanySi = false;
                    isanySf = false;
                    isanySm_1 = false;
                    isanySm_2 = false;
                    travellingtables.setIsanySI(isanySi);
                    travellingtables.setIsanySF(isanySf);
                    travellingtables.setIsanySM1(isanySm_1);
                    travellingtables.setIsanySM2(isanySm_2);
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW LOOP SPF2. "
                                + "Counters spf1 -%d- "
                                + "spf2 -%d- "
                                + "si -%d- "
                                + "sf -%d- "
                                + "sm_1 -%d- "
                                + "sm_2 -%d- "
                                + "isanySPF1 -%s- "
                                + "isanySPF2 -%s- "
                                + "isanySI -%s- "
                                + "isanySF -%s- "
                                + "isanySM1 -%s- "
                                + "isanySM2 -%s- "
                                + "travellingtabes.status -%s-",
                                spf_1,
                                spf_2,
                                si,
                                sf,
                                sm_1,
                                sm_2,
                                isanySpf_1,
                                isanySpf_2,
                                isanySi,
                                isanySf,
                                isanySm_1,
                                isanySm_2,
                                travellingtables.getStatus());
                        log.debug(logmess);
                    }
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****ASSIGNING EOS to sil.segment[0] in routine %s", routine);
                        log.debug(logmess);
                    }
                    segment = sil.getSegment();
                    segment[0] = EOS;

                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****ASSIGNED EOS to sil.segment[0] in routine %s", routine);
                        log.debug(logmess);
                    }

                    if (callerDebug) {
                        logmess = String.format("CALLING spfric in %s. Parameters rad_spfe -%s- and spf1 -%d- and spf2 -%d. CALLER %s",
                                CLASS_NAME, sil.getRad_spfe(), spf_1, spf_2,
                                routine);
                        log.debug(logmess);
                    }
                    /* call spfric and update sil*/
                    sil = sillib.spfric(sil, tabSpf_2);

                    response.setSil(sil);
                    if (analysisDebug) {
                        logmess = String.format("ANALYSES DEBUG in -%s- after spfric AucepsResponse -%s-", routine, response.toString());
                        log.debug(logmess);

                    }
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****ASSIGNING getSPF(SPF2) to sil.segment[5] in routine %s", routine);
                        log.debug(logmess);
                    }

                    segment[5] = tabSpf_2.getSPF();
                    sil.setSegment(segment);
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****ASSIGNED getSPF(SPF2) to sil.segment[5] in routine %s", routine);
                        log.debug(logmess);
                    }
                    if (valueDebug) {
                        segment = sil.getSegment();
                        for (int i = 0; i < segment.length; i++) {
                            logmess = String.format("****VALUES IN LOOP getSPFset_2 Segment at index -%d- with value -%s-", i, segment[i]);
                            log.debug(logmess);
                        }
                    }

                    if (callerDebug || deepFlowDebug) {
                        logmess = String.format("CALLING getSIset in TabSiQuery.java with parameters: rad_spf -%s-. CALLER %s", sil.getRad_spf(), routine);
                        log.debug(logmess);
                    }
                    tabsSi = tabsiq.getSIset(sil.getRad_spf());
                    if (operationDebug) {
                        logmess = String.format("OPERATIONDEBUG SETTING setListOfTabSi in -%s-", routine);
                        log.debug(logmess);

                    }
                    travellingtables.setListOfTabSI(tabsSi);
                    travellingtables.setIsanySI(!tabsSi.isEmpty());
                    isanySi = travellingtables.isIsanySI();
                    // loop over tabSI
                    if (valueDebug) {
                        logmess = String.format("****VALUES of getListOfTabSI  -%d-", travellingtables.getListOfTabSI().size());
                        log.debug(logmess);

                        logmess = String.format("****VALUES of getListOfTabSI is -%d- LOOP SI -%d-", travellingtables.getListOfTabSI().size(), travellingtables.getListOfTabSI().size());
                        log.debug(logmess);

                    }
                    for (TabSI tabSi : tabsSi) {
                        if (operationDebug) {
                            logmess = String.format("OPERATIONDEBUG SETTING setTabSI in -%s-", routine);
                            log.debug(logmess);
                            logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 3 in -%s-", routine);
                            log.debug(logmess);

                        }
                        travellingtables.setTabSI(tabSi);
                        travellingtables.setStatus("3");

                        // setting indicators to false
                        isanySf = false;
                        isanySm_1 = false;
                        isanySm_2 = false;

                        travellingtables.setIsanySF(isanySf);
                        travellingtables.setIsanySM1(isanySm_1);
                        travellingtables.setIsanySM2(isanySm_2);
                        if (deepFlowDebug) {
                            logmess = String.format("DEEPFLOW LOOP SI. "
                                    + "Counters spf1 -%d- "
                                    + "spf2 -%d- "
                                    + "si -%d- "
                                    + "sf -%d- "
                                    + "sm_1 -%d- "
                                    + "sm_2 -%d- "
                                    + "isanySPF1 -%s- "
                                    + "isanySPF2 -%s- "
                                    + "isanySI -%s- "
                                    + "isanySF -%s- "
                                    + "isanySM1 -%s- "
                                    + "isanySM2 -%s- "
                                    + "travellingtabes.status -%s-",
                                    spf_1,
                                    spf_2,
                                    si,
                                    sf,
                                    sm_1,
                                    sm_2,
                                    isanySpf_1,
                                    isanySpf_2,
                                    isanySi,
                                    isanySf,
                                    isanySm_1,
                                    isanySm_2,
                                    travellingtables.getStatus());
                            log.debug(logmess);
                        }
                        // ADD CODE
                        if (deepFlowDebug) {
                            logmess = String.format("DEEPFLOW ****ASSIGNING EOS to sil.segment[4] in routine %s", routine);
                            log.debug(logmess);
                        }
                        segment = sil.getSegment();
                        segment[4] = EOS;

                        if (deepFlowDebug) {
                            logmess = String.format("DEEPFLOW ****ASSIGNED EOS to sil.segment[4] in routine %s", routine);
                            log.debug(logmess);
                        }
                        if (callerDebug) {

                            logmess = String.format("CALLING siric in %s. Parameters rad_spf -%s- and spf1 -%d- and spf2 -%d and si-%d-. CALLER %s",
                                    CLASS_NAME, sil.getRad_spf(), spf_1, spf_2, si,
                                    routine);
                            log.debug(logmess);
                        }
                        sil = sillib.siric(sil, tabSi);
                        response.setSil(sil);
                        if (analysisDebug) {
                            logmess = String.format("ANALYSES DEBUG in -%s- after siric AucepsResponse -%s-", routine, response.toString());
                            log.debug(logmess);

                        }
                        if (deepFlowDebug) {
                            logmess = String.format("DEEPFLOW ****ASSIGNING getSI to sil.segment[0] in routine %s", routine);
                            log.debug(logmess);
                            logmess = String.format("DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine %s", routine);
                            log.debug(logmess);
                            logmess = String.format("DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine %s", routine);
                            log.debug(logmess);
                            logmess = String.format("DEEPFLOW ****ASSIGNING getRad_si to sil.segment[1] in routine %s", routine);
                            log.debug(logmess);
                        }

                        segment[0] = tabSi.getSI();
                        segment[3] = EOS;
                        segment[2] = EOS;
                        segment[1] = sil.getRad_si();

                        if (valueDebug) {
                            for (int i = 0; i < segment.length; i++) {
                                logmess = String.format("****VALUES IN LOOP getSIset Segment at index -%d- with value -%s-", i, segment[i]);
                                log.debug(logmess);
                            }
                        }
                        sil.setSegment(segment);
                        if (deepFlowDebug) {
                            logmess = String.format("DEEPFLOW ****ASSIGNED getSI to sil.segment[0] in routine %s", routine);
                            log.debug(logmess);
                            logmess = String.format("DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine %s", routine);
                            log.debug(logmess);
                            logmess = String.format("DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine %s", routine);
                            log.debug(logmess);
                            logmess = String.format("DEEPFLOW ****ASSIGNED getRad_si to sil.segment[1] in routine %s", routine);
                            log.debug(logmess);
                        }
                        for (int i = 0; i < segment.length; i++) {
                            if (valueDebug) {
                                logmess = String.format("****VALUES IN LOOP getSI Segment at index -%d- with value -%s-", i, segment[i]);
                                log.debug(logmess);
                            }
                        }

                        if (callerDebug && deepFlowDebug) {
                            logmess = String.format("CALLING lemmi_ecc in -%s- CALLER siln  with parameter sil.rad_si: %s", routine, sil.getRad_si());
                            log.debug(logmess);
                        }
                        response = lemmi_ecc(response, travellingtables, travellingqueries);
                        if (analysisDebug) {
                            logmess = String.format("ANALYSES DEBUG in -%s- after lemmi_ecc AucepsResponse -%s-", routine, response.toString());
                            log.debug(logmess);
                        }

                        travellingtables = getTravellingtables();
                        // END ADD CODE
                        if (callerDebug || deepFlowDebug) {
                            logmess = String.format("CALLING getSFset in TabSfQuery.java with parameters: rad_si -%s-. CALLER %s", sil.getRad_si(), routine);
                            log.debug(logmess);
                        }
                        tabsSf = tabsfq.getSFset(sil.getRad_si());
                        if (operationDebug) {
                            logmess = String.format("OPERATIONDEBUG SETTING setListOfTabSf in -%s-", routine);
                            log.debug(logmess);

                        }
                        travellingtables.setListOfTabSF(tabsSf);
                        travellingtables.setIsanySF(!tabsSf.isEmpty());
                        isanySf = travellingtables.isIsanySF();
                        // loop over tabSF
                        if (valueDebug) {
                            logmess = String.format("****VALUES of getListOfTabSF  -%d-", travellingtables.getListOfTabSF().size());
                            log.debug(logmess);

                            logmess = String.format("****VALUES of getListOfTabSF is -%d- ADDITIONAL LOOP SF -%d-", travellingtables.getListOfTabSF().size(), travellingtables.getListOfTabSF().size());
                            log.debug(logmess);
                        }
                        for (TabSF tabSf : tabsSf) {
                            if (operationDebug) {
                                logmess = String.format("OPERATIONDEBUG SETTING setTabSf in -%s-", routine);
                                log.debug(logmess);
                                logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 20 in -%s-", routine);
                                log.debug(logmess);

                            }
                            travellingtables.setTabSf(tabSf);
                            travellingtables.setStatus("20");

                            // setting indicators to false
                            isanySm_1 = false;
                            isanySm_2 = false;

                            travellingtables.setIsanySM1(isanySm_1);
                            travellingtables.setIsanySM2(isanySm_2);
                            if (deepFlowDebug) {
                                logmess = String.format("DEEPFLOW LOOP SF. "
                                        + "Counters spf1 -%d- "
                                        + "spf2 -%d- "
                                        + "si -%d- "
                                        + "sf -%d- "
                                        + "sm_1 -%d- "
                                        + "sm_2 -%d- "
                                        + "isanySPF1 -%s- "
                                        + "isanySPF2 -%s- "
                                        + "isanySI -%s- "
                                        + "isanySF -%s- "
                                        + "isanySM1 -%s- "
                                        + "isanySM2 -%s- "
                                        + "travellingtabes.status -%s-",
                                        spf_1,
                                        spf_2,
                                        si,
                                        sf,
                                        sm_1,
                                        sm_2,
                                        isanySpf_1,
                                        isanySpf_2,
                                        isanySi,
                                        isanySf,
                                        isanySm_1,
                                        isanySm_2,
                                        travellingtables.getStatus());
                                log.debug(logmess);
                            }
                            // ADD CODE B4 SM1
                            segment = sil.getSegment();

                            if (deepFlowDebug) {
                                logmess = String.format("DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine %s", routine);
                                log.debug(logmess);
                                logmess = String.format("DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine %s", routine);
                                log.debug(logmess);
                            }
                            segment[2] = EOS;
                            segment[3] = EOS;

                            if (callerDebug) {

                                logmess = String.format("CALLING sfric in %s. Parameters rad_si -%s- "
                                        + "and spf1 -%d- and spf2 -%d "
                                        + "and si-%d- and sf -%d-. CALLER %s",
                                        CLASS_NAME, sil.getRad_si(), spf_1, spf_2, si, sf,
                                        routine);
                                log.debug(logmess);
                            }
                            sil = sillib.sfric(sil, tabSf);
                            if (analysisDebug) {
                                logmess = String.format("ANALYSES DEBUG in -%s- after siln AucepsResponse -%s-", routine, response.toString());
                                log.debug(logmess);

                            }
                            if (deepFlowDebug) {
                                logmess = String.format("DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine %s", routine);
                                log.debug(logmess);
                                logmess = String.format("DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine %s", routine);
                                log.debug(logmess);
                            }
                            segment[1] = sil.getRad_sf();
                            segment[4] = tabSf.getSEG();
                            sil.setSegment(segment);
                            if (valueDebug) {
                                for (int i = 0; i < segment.length; i++) {
                                    logmess = String.format("****VALUES IN LOOP getSFset Segment at index -%d- with value -%s-", i, segment[i]);
                                    log.debug(logmess);
                                }
                            }
                            if (deepFlowDebug) {
                                logmess = String.format("DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine %s", routine);
                                log.debug(logmess);
                                logmess = String.format("DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine %s", routine);
                                log.debug(logmess);
                                logmess = String.format("DEEPFLOW ****ASSIGNED getSF -%s- to sil.segment[4] in routine %s", tabSf.getSEG(), routine);
                                log.debug(logmess);
                                logmess = String.format("DEEPFLOW ****ASSIGNED getRad_sf -%s- to sil.segment[1] in routine %s", sil.getRad_sf(), routine);
                                log.debug(logmess);
                            }
                            sil.setSegment(segment);
                            response.setSil(sil);
                            if (sil.getRad_sf().compareTo("") != 0) {
                                if (callerDebug) {
                                    logmess = String.format("CALLING analysis (1) with sf -%d- in %s CALLER %s  with parameter sil.rad_sf -%s- isanysm1 -%s- isanysm2 -%s- FROM LOOP getSFset",
                                            sf, CLASS_NAME, routine, sil.getRad_sf(), travellingtables.isIsanySM1(), travellingtables.isIsanySM2());
                                    log.debug(logmess);
                                }
                                response = runanalyses.analysis(response, travellingtables, travellingqueries, sil.getRad_sf());
                                setResponse(response);
                                /*instantiate tabsm */
                                //System.err.println("GIULIA 9 SILN (1) " + " analysis: -" + response.getAnalyses().getNumAnalysis() + "- " + response.getAnalyses().toString());
                                //System.err.println("GIULIA 9 SILN (1) " + " current: -" + response.getAnalyses().getNumAnalysis() + "- " + response.getCur_analysis().toString());
                                //ARRIVATO QUI 29/12/15
                                //getSillib().analysis(conn, tabLe, tabSf, tabSm_1, tabSm_2, tabSpf_1, tabSpf_2, tabSi, sil.getRad_sf(), tabspfq_1.isAny(), tabspfq_2.isAny(), tabsiq.isAny(), false, false);
                            }
                            // LOOP SM1
                            if (callerDebug || deepFlowDebug) {
                                logmess = String.format("CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -%s-. CALLER %s", sil.getRad_sf(), routine);
                                log.debug(logmess);
                            }
                            tabsSm_1 = tabsmq_1.getSMset(sil.getRad_sf(), SM1);
                            if (operationDebug) {
                                logmess = String.format("OPERATIONDEBUG SETTING setFirstListOfTabSM in -%s-", routine);
                                log.debug(logmess);

                            }
                            travellingtables.setFirstListOfTabSM(tabsSm_1);
                            travellingtables.setIsanySM1(!tabsSm_1.isEmpty());
                            isanySm_1 = travellingtables.isIsanySM1();
                            // loop over tabSM1
                            if (valueDebug) {
                                logmess = String.format("****VALUES of getFirstListOfTabSM  -%d-", travellingtables.getFirstListOfTabSM().size());
                                log.debug(logmess);

                                logmess = String.format("****VALUES of getFirstListOfTabSM is -%d- LOOP SM1 -%d-", travellingtables.getFirstListOfTabSM().size(), travellingtables.getFirstListOfTabSM().size());
                                log.debug(logmess);
                            }
                            for (TabSM tabSm_1 : tabsSm_1) {
                                if (operationDebug) {
                                    logmess = String.format("OPERATIONDEBUG SETTING setFirstTabSm in -%s-", routine);
                                    log.debug(logmess);
                                    logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 21 in -%s-", routine);
                                    log.debug(logmess);

                                }
                                travellingtables.setFirstTabSm(tabSm_1);
                                travellingtables.setStatus("21");

                                // setting indicators to false
                                isanySm_2 = false;
                                travellingtables.setIsanySM2(isanySm_2);
                                if (deepFlowDebug) {
                                    logmess = String.format("DEEPFLOW LOOP SM1. "
                                            + "Counters spf1 -%d- "
                                            + "spf2 -%d- "
                                            + "si -%d- "
                                            + "sf -%d- "
                                            + "sm_1 -%d- "
                                            + "sm_2 -%d- "
                                            + "isanySPF1 -%s- "
                                            + "isanySPF2 -%s- "
                                            + "isanySI -%s- "
                                            + "isanySF -%s- "
                                            + "isanySM1 -%s- "
                                            + "isanySM2 -%s- "
                                            + "travellingtabes.status -%s-",
                                            spf_1,
                                            spf_2,
                                            si,
                                            sf,
                                            sm_1,
                                            sm_2,
                                            isanySpf_1,
                                            isanySpf_2,
                                            isanySi,
                                            isanySf,
                                            isanySm_1,
                                            isanySm_2,
                                            travellingtables.getStatus());
                                    log.debug(logmess);
                                }
                                // ADD CODE
                                if (deepFlowDebug) {
                                    logmess = String.format("DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine %s", routine);
                                    log.debug(logmess);

                                }
                                segment = sil.getSegment();
                                segment[2] = EOS;
                                sil.setSegment(segment);
                                response.setSil(sil);
                                if (deepFlowDebug) {
                                    logmess = String.format("DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine %s", routine);
                                    log.debug(logmess);
                                }
                                if (callerDebug) {
                                    logmess = String.format("CALLING smric in  Sillib.java with rad_sf -%s- and SM -%d- CALLER %s", sil.getRad_sf(), SM1, routine);
                                    log.debug(logmess);
                                }

                                sil = sillib.smric(sil, travellingtables, sil.getRad_sf(), SM1);

                                if (deepFlowDebug) {
                                    logmess = String.format("DEEPFLOW ****ASSIGNING getSm_1 to sil.segment[3] in routine %s", routine);
                                    log.debug(logmess);
                                    logmess = String.format("DEEPFLOW ****ASSIGNING rad_sm1 to sil.segment[1] in routine %s", routine);
                                    log.debug(logmess);

                                }
                                segment = sil.getSegment();
                                segment[3] = tabSm_1.getSM();
                                segment[1] = sil.getRad_sm1();
                                sil.setSegment(segment);
                                response.setSil(sil);
                                if (deepFlowDebug) {
                                    logmess = String.format("DEEPFLOW ****ASSIGNED getSm_1 to sil.segment[3] in routine %s", routine);
                                    log.debug(logmess);
                                    logmess = String.format("DEEPFLOW ****ASSIGNED rad_sm1 to sil.segment[1] in routine %s", routine);
                                    log.debug(logmess);

                                }
                                if (valueDebug) {
                                    for (int i = 0; i < segment.length; i++) {
                                        logmess = String.format("****VALUES IN LOOP getSM1set Segment at index -%d- with value -%s-", i, segment[i]);
                                        log.debug(logmess);
                                    }
                                }
                                if (callerDebug) {
                                    logmess = String.format("CALLING analysis (2) with sm1 -%d- in %s CALLER %s  with parameter sil.rad_sf -%s- FROM LOOP getSFset",
                                            sm_1, CLASS_NAME, routine, sil.getRad_sm1());
                                    log.debug(logmess);
                                }
                                response = runanalyses.analysis(response, travellingtables, travellingqueries, sil.getRad_sm1());
                                setResponse(response);
                                //System.err.println("GIULIA 9 SILN (2) " + " analysis: -" + response.getAnalyses().getNumAnalysis() + "- " + response.getAnalyses().toString());
                                //System.err.println("GIULIA 9 SILN (2) " + " current: -" + response.getAnalyses().getNumAnalysis() + "- " + response.getCur_analysis().toString());
                                // ADD CODE B4 SM2
                                // LOOP SM2
                                if (callerDebug || deepFlowDebug) {
                                    logmess = String.format("CALLING getSMset_2 in TabSmQuery.java with parameters: rad_sm1 -%s-. CALLER %s", sil.getRad_sm1(), routine);
                                    log.debug(logmess);
                                }
                                tabsSm_2 = tabsmq_2.getSMset(sil.getRad_sm1(), SM2);
                                if (operationDebug) {
                                    logmess = String.format("OPERATIONDEBUG SETTING setSecondListOfTabSM in -%s-", routine);
                                    log.debug(logmess);

                                }
                                travellingtables.setSecondListOfTabSM(tabsSm_2);
                                travellingtables.setIsanySM2(!tabsSm_2.isEmpty());
                                isanySm_2 = travellingtables.isIsanySM2();
                                // loop over tabSM2
                                if (valueDebug) {
                                    logmess = String.format("****VALUES of getSecondListOfTabSM  -%d-", travellingtables.getSecondListOfTabSM().size());
                                    log.debug(logmess);

                                    logmess = String.format("****VALUES of getSecondListOfTabSM is -%d- LOOP SM2 -%d-", travellingtables.getSecondListOfTabSM().size(), travellingtables.getSecondListOfTabSM().size());
                                    log.debug(logmess);
                                }
                                for (TabSM tabSm_2 : tabsSm_2) {
                                    if (operationDebug) {
                                        logmess = String.format("OPERATIONDEBUG SETTING setSecondTabSm in -%s-", routine);
                                        log.debug(logmess);
                                        logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 22 in -%s-", routine);
                                        log.debug(logmess);

                                    }
                                    travellingtables.setSecondTabSm(tabSm_2);
                                    travellingtables.setStatus("22");
                                    if (deepFlowDebug) {
                                        logmess = String.format("DEEPFLOW LOOP SM2. "
                                                + "Counters spf1 -%d- "
                                                + "spf2 -%d- "
                                                + "si -%d- "
                                                + "sf -%d- "
                                                + "sm_1 -%d- "
                                                + "sm_2 -%d- "
                                                + "isanySPF1 -%s- "
                                                + "isanySPF2 -%s- "
                                                + "isanySI -%s- "
                                                + "isanySF -%s- "
                                                + "isanySM1 -%s- "
                                                + "isanySM2 -%s- "
                                                + "travellingtabes.status -%s-",
                                                spf_1,
                                                spf_2,
                                                si,
                                                sf,
                                                sm_1,
                                                sm_2,
                                                isanySpf_1,
                                                isanySpf_2,
                                                isanySi,
                                                isanySf,
                                                isanySm_1,
                                                isanySm_2,
                                                travellingtables.getStatus());
                                        log.debug(logmess);
                                    }
                                    if (deepFlowDebug) {
                                        logmess = String.format("DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine %s", routine);
                                        log.debug(logmess);

                                    }
                                    segment = sil.getSegment();
                                    segment[2] = EOS;
                                    sil.setSegment(segment);
                                    response.setSil(sil);
                                    if (deepFlowDebug) {
                                        logmess = String.format("DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine %s", routine);
                                        log.debug(logmess);
                                    }
                                    if (callerDebug) {
                                        logmess = String.format("CALLING smric in  Sillib.java. CALLER %s", routine);
                                        log.debug(logmess);
                                    }

                                    sil = sillib.smric(sil, travellingtables, sil.getRad_sm1(), SM2);

                                    if (deepFlowDebug) {
                                        logmess = String.format("DEEPFLOW ****ASSIGNING getSm_2 to sil.segment[2] in routine %s", routine);
                                        log.debug(logmess);
                                        logmess = String.format("DEEPFLOW ****ASSIGNING rad_sm1 to sil.segment[1] in routine %s", routine);
                                        log.debug(logmess);

                                    }
                                    segment = sil.getSegment();
                                    segment[2] = tabSm_2.getSM();
                                    segment[1] = sil.getRad_sm2();
                                    sil.setSegment(segment);
                                    response.setSil(sil);
                                    if (deepFlowDebug) {
                                        logmess = String.format("DEEPFLOW ****ASSIGNED getSm_1 to sil.segment[3] in routine %s", routine);
                                        log.debug(logmess);
                                        logmess = String.format("DEEPFLOW ****ASSIGNED rad_sm1 to sil.segment[1] in routine %s", routine);
                                        log.debug(logmess);

                                    }
                                    if (valueDebug) {
                                        for (int i = 0; i < segment.length; i++) {
                                            logmess = String.format("****VALUES IN LOOP getSM1set Segment at index -%d- with value -%s-", i, segment[i]);
                                            log.debug(logmess);
                                        }
                                    }
                                    if (callerDebug) {
                                        logmess = String.format("CALLING analysis (3) with sm2 -%s-in %s CALLER %s  with parameter sil.rad_sf -%s- FROM LOOP getSFset",
                                                sm_2, CLASS_NAME, routine, sil.getRad_sm2());
                                        log.debug(logmess);
                                    }
                                    response = runanalyses.analysis(response, travellingtables, travellingqueries, sil.getRad_sm2());
                                    setResponse(response);
                                    //System.err.println("GIULIA 9 SILN (3) " + " analysis: -" + response.getAnalyses().getNumAnalysis() + "- " + response.getAnalyses().toString());
                                    //System.err.println("GIULIA 9 SILN (3) " + " current: -" + response.getAnalyses().getNumAnalysis() + "- " + response.getCur_analysis().toString());

                                    sm_2++;
                                } // rof tabsm_2
                                travellingtables.setIsanySM2(false);
                                sm_1++;
                            } // rof tabsm_1
                            travellingtables.setIsanySM1(false);

                            sf++;
                        } // rof tabsf
                        travellingtables.setIsanySF(false);
                        si++;
                    } // rof tabsi
                    travellingtables.setIsanySI(false);
                    spf_2++;

                } //  rof tabSpf_2
                travellingtables.setIsanySPF2(false);
                spf_1++;
            } //  rof tabSpf_1
            travellingtables.setIsanySPF1(false);

            break;

        } // end while

        response.setStatus(travellingtables.getStatus());
        return response;

    } // end siln

    //lemmi_ecc(TravellingTables travellingtables,String rad_si)
    public AucepsResponse lemmi_ecc(AucepsResponse response, TravellingTables travellingtables, TravellingQueries travellingqueries) {
        String routine = InputFunctions.class.getName() + "/lemmi_ecc";
        String logmess = "";
        SilType sil = response.getSil();
        String rad_si = sil.getRad_si();
        int le = 0, les = 0;

        // comp_le
        boolean retComp_le;
        // List
        List<TabLessario> tabsLessario;
        List<TabLE> tabsLe;

        // queries
        TabLessarioQuery tablessarioq = travellingqueries.getTablessarioq();
        tablessarioq.setConn(travellingqueries.getConn());

        // indicators
        boolean isanylessario = false;
        boolean isanyle = false;

        TabLeQuery tableq = travellingqueries.getTableq();
        tableq.setConn(travellingqueries.getConn());

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in InputFunctions.java with rad_si: %s", routine, rad_si);
            log.debug(logmess);
        }

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING rad_si (str) %s on sil.radical %s", rad_si, sil.getRadical());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****ASSIGNING EOS to sil.ind_alt in routine %s", routine);
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****ASSIGNING EOS to sil.rad_alt in routine %s", routine);
            log.debug(logmess);

        }
        sil.setRadical(rad_si);
        sil.setInd_alt(EOS);
        sil.setRad_alt(EOS);

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPIED rad_si (str) %s on sil.radical %s", rad_si, sil.getRadical());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****ASSIGNED EOS to sil.ind_alt in routine %s", routine);
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****ASSIGNED EOS to sil.rad_alt in routine %s", routine);
            log.debug(logmess);

        }

        /*loops*/
        if (callerDebug && deepFlowDebug) {
            logmess = String.format("CALLING getLEset with parameters rad_si: -%s- CALLER %s ", rad_si, routine);
            log.debug(logmess);
        }

        tabsLe = tableq.getLEset(sil.getRad_si());
        if (operationDebug) {
            logmess = String.format("OPERATIONDEBUG SETTING setListOfTabLE in -%s-", routine);
            log.debug(logmess);

        }
        travellingtables.setListOfTabLE(tabsLe);
        isanyle = travellingtables.isIsanyLE();

//        if (callerDebug && deepFlowDebug) {
//            logmess = String.format("CALLING getLEset with parameters rad_si: -%s- CALLER %s ", rad_si, routine);
//            log.debug(logmess);
//        }
        if (valueDebug) {
            logmess = String.format("****VALUES of getListOfTabLE  -%d-", travellingtables.getListOfTabLE().size());
            log.debug(logmess);

            logmess = String.format("****VALUES of getListOfTabLE is -%d-  LOOP ON TABLE -%d-", travellingtables.getListOfTabLE().size(), travellingtables.getListOfTabLE().size());
            log.debug(logmess);

        }
        for (TabLE tabLe : tabsLe) {
            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING setTabLe in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 4 in -%s-", routine);
                log.debug(logmess);

            }
            travellingtables.setTabLe(tabLe);
            travellingtables.setStatus("4");
            // setting indicators to false
            isanylessario = false;
            //for (Iterator<TabLE> TabLEit = tabsLe.iterator(); TabLEit.hasNext();) {

            //setTabLe(TabLEit.next());
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW LOOP LE IN LEMMI_ECC. "
                        + "Counters le -%d- "
                        + "lessario -%d- "
                        + "isanyLE -%s- "
                        + "isanyLES -%s- "
                        + "isanySPF1 -%s- "
                        + "isanySPF2 -%s- "
                        + "isanySI -%s- "
                        + "isanySF -%s- "
                        + "isanySM1 -%s- "
                        + "isanySM2 -%s- "
                        + "travellingtabes.status -%s-",
                        le,
                        les,
                        isanyle,
                        isanylessario,
                        travellingtables.isIsanySPF1(),
                        travellingtables.isIsanySPF2(),
                        travellingtables.isIsanySI(),
                        travellingtables.isIsanySF(),
                        travellingtables.isIsanySM1(),
                        travellingtables.isIsanySM2(),
                        travellingtables.getStatus());
                log.debug(logmess);
            }

            /* loop over lessario */
            if (callerDebug) {
                logmess = String.format("CALLING getLESset with parameters les_id: -%s- CALLER %s ", tabLe.getLE_LESid(), routine);
                log.debug(logmess);
            }

            //tabsLessario = tablessarioq.getLESset(travellingtables.getTabLe().getLE_LESid(), BY_KEY);
            tabsLessario = tablessarioq.getLESset(tabLe.getLE_LESid(), BY_KEY);
            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING setListOfTabLessario in -%s-", routine);
                log.debug(logmess);

            }
            travellingtables.setListOfTabLessario(tabsLessario);
            isanylessario = travellingtables.isIsanyLes();
            if (valueDebug) {
                logmess = String.format("****VALUES of getListOfTabLessario  -%d-", travellingtables.getListOfTabLessario().size());
                log.debug(logmess);
                if (travellingtables.getListOfTabLessario().isEmpty()) {
                    logmess = String.format("****VALUES of getListOfTabLessario is -%d-  LOOP LESSARIO -%d-", travellingtables.getListOfTabLessario().size(), travellingtables.getListOfTabLessario().size());
                    log.debug(logmess);
                }

            }

            for (TabLessario tabLessario : tabsLessario) {
                if (operationDebug) {
                    logmess = String.format("OPERATIONDEBUG SETTING setTabLessario in -%s-", routine);
                    log.debug(logmess);
                    logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 5 in -%s-", routine);
                    log.debug(logmess);

                }
                travellingtables.setTabLessario(tabLessario);
                travellingtables.setStatus("5");
                //for (Iterator<TabLessario> TabLESit = tabsLessario.iterator(); TabLESit.hasNext();) {
                //tabLessario = TabLESit.next(); /* ATTENTION: only one row or null*/

                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW LOOP LESSARIO IN LEMMI_ECC. "
                            + "Counters le -%d- "
                            + "lessario -%d- "
                            + "isanyLE -%s- "
                            + "isanyLES -%s- "
                            + "isanySPF1 -%s- "
                            + "isanySPF2 -%s- "
                            + "isanySI -%s- "
                            + "isanySF -%s- "
                            + "isanySM1 -%s- "
                            + "isanySM2 -%s- "
                            + "travellingtabes.status -%s-",
                            le,
                            les,
                            isanyle,
                            isanylessario,
                            travellingtables.isIsanySPF1(),
                            travellingtables.isIsanySPF2(),
                            travellingtables.isIsanySI(),
                            travellingtables.isIsanySF(),
                            travellingtables.isIsanySM1(),
                            travellingtables.isIsanySM2(),
                            travellingtables.getStatus());
                    log.debug(logmess);
                }
                if (callerDebug) {
                    logmess = String.format("CALLING comp_le in  %s. CALLER %s", CLASS_NAME, routine);
                    log.debug(logmess);

                }

                //CompLe comple = new CompLe(conn, sil, tabspf_1, tabspf_2, tabSi, tabLessario, getTabLe());
                //comple.comp_le(sil.getRadical(), SAI_cod, isanyspf1, isanispf2, isanysi);
                response = comp_le(response, travellingtables, sil.getRadical());//, SAI_cod, isanyspf1, isanispf2, isanysi);
                if (analysisDebug) {
                    logmess = String.format("ANALYSES DEBUG in -%s- after comp_le -%d- -%s-", routine, le, response.toString());
                    log.debug(logmess);

                }

                travellingtables = getTravellingtables();
                les++;
            } // rof lessario
            travellingtables.setIsanyLes(false);
            travellingtables = getTravellingtables();
            le++;
        } //rof table
        travellingtables.setIsanyLE(false);
        travellingtables = getTravellingtables();
        //setTabLe(tabLe);

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in InputFunctions.java with rad_si: %s", routine, rad_si);
            log.debug(logmess);
        }
        setTravellingtables(travellingtables);
        response.setExecutedLemmiEcc(!tabsLe.isEmpty());
        return response;

    } // end lemmi_ecc

    public AucepsResponse comp_le(AucepsResponse response, TravellingTables travellingtables, String str) {
        String routine = InputFunctions.class.getName() + "/comp_le";

        // travellinttables is sent as input parameter, even it is not necessary
        SilType sil = response.getSil();
        //tables
        TabSAI tabSai = travellingtables.getTabSAI();
        TabLessario tabLessario = travellingtables.getTabLessario();
        TabLessario copiedLessario;// = travellingtables.getCopiedLessario(); //areal
        TabSI tabSi = travellingtables.getTabSI();
        TabSPF tabspf_1 = travellingtables.getFirstTabSpf();
        TabSPF tabspf_2 = travellingtables.getFirstTabSpf();

        String logmess = "";
        String a_gra = "";

        String SAI_cod = tabSai.getSAI_cod();

        Comparator comparator = new Comparator();
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in InputFunctions.java. Parameter %s", routine, str);
            log.debug(logmess);
        }

        //List<TabSAI> tabsSai = inisaiq.getSAIset("-"); /* maybe sil.radical???*/
        a_gra = tabLessario.getA_gra();

        /* SAIset is 0 or 1 record
         for (Iterator<TabSAI> TabSAIit = tabsSai.iterator(); TabSAIit.hasNext();) {
         TabSAI tabsai = TabSAIit.next();
         SAI_cod = tabsai.getSAI_cod();
         }
         */
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHECKING sil.ind_alt -%s- in %s", sil.getInd_alt(), routine);
            log.debug(logmess);
        }
        //if (!sil.getInd_alt().equals("")) {
        //if (sil.getInd_alt().equals(EOS) || sil.getInd_alt().length()>=0) { /*ind_alt !='\0' check initialized */ 
        /* RDG */
        if (sil.getInd_alt().equals("")) { /* was !sil.getInd_alt().equals("") to ask */
            //if (sil.getInd_alt() != null) {
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED sil.ind_alt -%s- in %s: WAS NOT NULL", sil.getInd_alt(), routine);
                log.debug(logmess);
            }
            if (callerDebug) {
                logmess = String.format("CALLING compai with parameters a_gra: -%s- and SAI_cod -%s- CALLER %s ", a_gra, SAI_cod, routine);
                log.debug(logmess);
            }

            if (!comparator.compai(travellingtables)) {
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compai in routine %s in with parameters a_gra: -%s- and SAI_cod -%s- EXIT FALSE ", routine, a_gra, SAI_cod);
                    log.debug(logmess);
                }
                // RETURN 0 FALSE
                if (operationDebug) {
                    logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compai in -%s- BRANCH FALSE", routine);
                    log.debug(logmess);
                }
                travellingtables = comparator.getTravellingtables();
                setTravellingtables(travellingtables);
                response.setExitInCompai(true);
                response.setCompai(false);
                if (analysisDebug) {
                    logmess = String.format("ANALYSES DEBUG in -%s- after compai  AucepsResponse -%s-", routine, response.toString());
                    log.debug(logmess);
                }
                return response;
            } else { //else compai
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compai in routine %s in with parameters a_gra: -%s- and SAI_cod -%s- EXIT TRUE -CONTINUE-", routine, a_gra, SAI_cod);
                    log.debug(logmess);
                }
                response.setCompai(true);
                response.setExitInCompai(false);
                if (analysisDebug) {
                    logmess = String.format("ANALYSES DEBUG in -%s- after compai setExitInCompai(false); AucepsResponse -%s-", routine, response.toString());
                    log.debug(logmess);
                }

            }
            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING  travellingtables after GETTING travellingtables from comparator in compai in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG GETTING tabLessario getTabLessario after compai in -%s-", routine);
                log.debug(logmess);
            }
            travellingtables = comparator.getTravellingtables();
            setTravellingtables(travellingtables);
            tabLessario = travellingtables.getTabLessario();

        } else// else sil.ind_alt
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED sil.ind_alt -%s- in %s: WAS NULL", sil.getInd_alt(), routine);
                log.debug(logmess);
            } // end /*ind_alt !='\0'*/
        // getSI
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHECKING getSI -%s- in %s", tabSi.getSI(), routine);
            log.debug(logmess);
        }

        if (travellingtables.isIsanySI() && !tabSi.getSI().equals("")) {// getSI
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED tabSi.getSI() -%s- in %s: WAS NOT ''", tabSi.getSI(), routine);
                log.debug(logmess);
            }
            if (callerDebug) {
                logmess = String.format("CALLING compsi with parameters getSI: -%s-  CALLER %s ", tabSi.getSI(), routine);
                log.debug(logmess);
            }
            if (!comparator.compsi(travellingtables)) {
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compsi in routine %s in with parameters getSI: -%s-  EXIT FALSE", tabSi.getSI(), routine);
                    log.debug(logmess);
                }
                // RETURN 0 FALSE
                if (operationDebug) {
                    logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compsi in -%s- BRANCH FALSE", routine);
                    log.debug(logmess);
                    logmess = String.format("OPERATIONDEBUG GETTING tabLessario getTabLessario after compsi in -%s-", routine);
                    log.debug(logmess);
                }
                travellingtables = comparator.getTravellingtables();
                setTravellingtables(travellingtables);
                response.setCompsi(false);
                response.setExitInCompsi(true);
                if (analysisDebug) {
                    logmess = String.format("ANALYSES DEBUG in -%s- after compsi   AucepsResponse -%s-", routine, response.toString());
                    log.debug(logmess);
                }
                return response;
            } else { //else compsi
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compsi in routine %s in with parameters getSI: -%s-  EXIT TRUE -CONTINUE-", routine, tabSi.getSI());
                    log.debug(logmess);
                }
                response.setCompsi(true);
                response.setExitInCompsi(false);
                if (analysisDebug) {
                    logmess = String.format("ANALYSES DEBUG in -%s- after compsi  setExitInCompsi(false); AucepsResponse -%s-", routine, response.toString());
                    log.debug(logmess);
                }
            }
            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compsi in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG GETTING tabLessario getTabLessario after compsi in -%s-", routine);
                log.debug(logmess);
            }
            travellingtables = comparator.getTravellingtables();
            setTravellingtables(travellingtables);
            tabLessario = travellingtables.getTabLessario();
        } else // else  getSI
        {
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED tabSi.getSI() -%s- in %s: WAS ''", tabSi.getSI(), routine);
                log.debug(logmess);
            } // end getSI
        }        ////System.err.println("SPF: "+tabspf_2.getSPF());

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHECKING getSPF_1 -%s- in %s", tabspf_1.getSPF(), routine);
            log.debug(logmess);
        }

        if (travellingtables.isIsanySPF1() && !tabspf_1.getSPF().equals("")) { // getSPF_1
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED tabspf_1.getSPF() -%s- in %s: WAS NOT ''", tabspf_1.getSPF(), routine);
                log.debug(logmess);
            }
            if (callerDebug) {
                logmess = String.format("CALLING compspfe with parameters getSPFE: -%s-  CALLER %s ", tabspf_1.getSPF(), routine);
                log.debug(logmess);
            }
            if (!comparator.compspfe(sil, travellingtables)) {
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compspfe in routine %s in with parameters getSI: -%s-  EXIT FALSE", tabspf_1.getSPF(), routine);
                    log.debug(logmess);
                }
                // RETURN 0 FALSE
                if (operationDebug) {
                    logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspfe in -%s- BRANCH FALSE", routine);
                    log.debug(logmess);

                    logmess = String.format("OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspfe in -%s- BRANCH FALSE", routine);
                    log.debug(logmess);
                }
                travellingtables = comparator.getTravellingtables();
                setTravellingtables(travellingtables);
                response.setCompspfe(false);
                response.setExitInCompspfe(true);
                sil = comparator.getSil();
                response.setSil(sil);

                if (analysisDebug) {
                    logmess = String.format("ANALYSES DEBUG in -%s- after compspfe in comp_le  AucepsResponse -%s-", routine, response.toString());
                    log.debug(logmess);
                }

                return response;
            } else { //else compspfe
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compspfe in routine %s in with parameters getSPF1: -%s-  EXIT TRUE -CONTINUE-", routine, tabspf_1.getSPF());
                    log.debug(logmess);
                }
                sil = comparator.getSil();
                response.setSil(sil);

                response.setCompspfe(true);
                response.setExitInCompspfe(false);
                if (analysisDebug) {
                    logmess = String.format("ANALYSES DEBUG in -%s- after compspfe in comp_le setExitInCompspfe(false); AucepsResponse -%s-", routine, response.toString());
                    log.debug(logmess);
                }
            }
            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspfe in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspfe in -%s-", routine);
                log.debug(logmess);
            }
            travellingtables = comparator.getTravellingtables();
            setTravellingtables(travellingtables);
            sil = comparator.getSil();
            response.setSil(sil);
        } else // else  getSPF_1
        {
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED tabspf_1.getSPF() -%s- in %s: WAS ''", tabspf_1.getSPF(), routine);
                log.debug(logmess);
            } // end getSPF_1
        }
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHECKING isanyspf2 -%s- in %s", travellingtables.isIsanySPF2(), routine);
            log.debug(logmess);
        }

        if (travellingtables.isIsanySPF2()) { // getSPF_2
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED isanyspf2 -%s- in %s: WAS TRUE", travellingtables.isIsanySPF2(), routine);
                log.debug(logmess);
            }
            if (callerDebug) {
                logmess = String.format("CALLING compspf with parameters getSPF: -%s-  CALLER %s ", tabspf_2.getSPF(), routine);
                log.debug(logmess);
            }
            if (!comparator.compspf(sil, travellingtables)) {
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compspf in routine %s in with parameters getSPF2: -%s-  EXIT FALSE", tabspf_2.getSPF(), routine);
                    log.debug(logmess);
                }
                // RETURN 0 FALSE
                if (operationDebug) {
                    logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -%s-", routine);
                    log.debug(logmess);
                    logmess = String.format("OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -%s-", routine);
                    log.debug(logmess);
                }
                travellingtables = comparator.getTravellingtables();
                setTravellingtables(travellingtables);
                sil = comparator.getSil();
                response.setSil(sil);
                response.setCompspf(false);
                response.setExitInCompspf(true);
                if (analysisDebug) {
                    logmess = String.format("ANALYSES DEBUG in -%s- after compspf  AucepsResponse -%s-", routine, response.toString());
                    log.debug(logmess);
                }
                return response;
            } else { //else compspf
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compspf in routine %s in with parameters getSPF2: -%s-  EXIT TRUE -CONTINUE-", routine, tabspf_2.getSPF());
                    log.debug(logmess);
                }
                sil = comparator.getSil();
                response.setSil(sil);
                response.setCompspf(true);
                response.setExitInCompspf(false);
                if (analysisDebug) {
                    logmess = String.format("ANALYSES DEBUG in -%s- after compspf response.setExitInCompspf(false);  AucepsResponse -%s-", routine, response.toString());
                    log.debug(logmess);
                }
            }
            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -%s-", routine);
                log.debug(logmess);
            }
            travellingtables = comparator.getTravellingtables();
            setTravellingtables(travellingtables);
            sil = comparator.getSil();
            response.setSil(sil);
        } else // else  getSPF_2
        {
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED isanyspf2 -%s- in %s: WAS FALSE", travellingtables.isIsanySPF2(), routine);
                log.debug(logmess);
            } // end getSPF_2
        }
        if (callerDebug) {
            logmess = String.format("CALLING areacp with lessario with pr_key: -%s-  CALLER %s ", tabLessario.getPr_key(), routine);
            log.debug(logmess);
        }

        copiedLessario = comparator.areacp(travellingtables.getTabLessario());
        if (analysisDebug) {
            logmess = String.format("ANALYSES DEBUG in -%s- after comparator.areacp AucepsResponse -%s-", routine, response.toString());
            log.debug(logmess);

        }
        travellingtables.setCopiedLessario(copiedLessario);
        setTravellingtables(travellingtables);
        /*since in principle sil might be changed, let's retrieve it*/
        if (operationDebug) {
            logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in areacp in -%s-", routine);
            log.debug(logmess);
            logmess = String.format("OPERATIONDEBUG SETTING sil after GETTING sil from comparator in areacp in -%s-", routine);
            log.debug(logmess);
        }
        travellingtables = comparator.getTravellingtables();
        setTravellingtables(travellingtables);
        sil = comparator.getSil();
        response.setSil(sil);
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNING in %s isLe -%d- to sil.isLE", routine, 1);
            log.debug(logmess);
        }

        sil.setIsLE(1);
        response.setSil(sil);
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNED in %s isLe -%d- to sil.isLE", routine, 1);
            log.debug(logmess);
        }

        if (callerDebug) {
            logmess = String.format("CALLING lemtiz with copiedlessario with pr_key: -%s-  and IPOLEMMA CALLER %s ", copiedLessario.getPr_key(), routine);
            log.debug(logmess);
        }

        response = sillib.lemtiz(response, travellingtables, travellingqueries, IPOLEMMA);
        if (analysisDebug) {
            logmess = String.format("ANALYSES DEBUG in -%s- after sillib.lemtiz AucepsResponse -%s-", routine, response.toString());
            log.debug(logmess);

        }
        if (operationDebug) {
            logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in areacp in -%s-", routine);
            log.debug(logmess);
            logmess = String.format("OPERATIONDEBUG SETTING sil after GETTING sil from sillib in lemtiz in -%s-", routine);
            log.debug(logmess);
        }
        setTravellingtables(travellingtables);

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNING in %s isLe -%d- to sil.isLE", routine, 0);
            log.debug(logmess);
        }
        sil = response.getSil();
        sil.setIsLE(0);
        response.setSil(sil);
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNED in %s isLe -%d- to sil.isLE", routine, 0);
            log.debug(logmess);
        }
        if (callerDebug) {
            logmess = String.format("CALLING lemv with copiedlessario with pr_key: -%s-  and IPOLEMMA CALLER %s ", copiedLessario.getPr_key(), routine);
            log.debug(logmess);
        }
        // PARTIREDAQUI//
        travellingtables = sillib.getTravellingtables();
        response = sillib.lemv(response, travellingtables, travellingqueries, IPERLEMMA);

        //sillib.lemv(copiedLessario, tabLe, IPERLEMMA);
        if (analysisDebug) {
            logmess = String.format("ANALYSES DEBUG in -%s- after sillib.lemv AucepsResponse -%s-", routine, response.toString());
            log.debug(logmess);

        }
        travellingtables = sillib.getTravellingtables();
        response.setSil(sil);
        setTravellingtables(travellingtables);
        response.setExitInComp_le(true);
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in %s ", routine, CLASS_NAME);
            log.debug(logmess);
        }
        return response;
    } // end comp_le 

    /**
     * @return the response
     */
    public AucepsResponse getResponse() {
        return response;
    }

    /**
     * @return the travellingtables
     */
    public TravellingTables getTravellingtables() {
        return travellingtables;
    }

    /**
     * @return the travellingqueries
     */
    public TravellingQueries getTravellingqueries() {
        return travellingqueries;
    }

    /**
     * @param response the response to set
     */
    public void setResponse(AucepsResponse response) {
        this.response = response;
    }

    /**
     * @param travellingtables the travellingtables to set
     */
    public void setTravellingtables(TravellingTables travellingtables) {
        this.travellingtables = travellingtables;
    }

    /**
     * @param travellingqueries the travellingqueries to set
     */
    public void setTravellingqueries(TravellingQueries travellingqueries) {
        this.travellingqueries = travellingqueries;
    }

}
