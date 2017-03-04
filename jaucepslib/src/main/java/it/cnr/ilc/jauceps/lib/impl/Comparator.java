/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl;

import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C_COD_P;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C_COD_P2;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.PM;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.PM2;
import it.cnr.ilc.jauceps.lib.impl.table.TabLessario;
import it.cnr.ilc.jauceps.lib.impl.table.TabSF;
import it.cnr.ilc.jauceps.lib.impl.table.TabSFCodSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabSI;
import it.cnr.ilc.jauceps.lib.impl.table.TabSM;
import it.cnr.ilc.jauceps.lib.impl.table.TabSPF;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabLemmaEndingQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery;
import it.cnr.ilc.jauceps.lib.outputobjects.AucepsResponse;
import it.cnr.ilc.jauceps.lib.structs.SilType;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingQueries;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabSfDefinition.C07F;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabSfDefinition.C_COD;
import static it.cnr.ilc.latmorphlib.structs.LEM_TYPE.IPERLEMMA;
import static it.cnr.ilc.latmorphlib.structs.LEM_TYPE.IPERLEMMA_INT;
import static it.cnr.ilc.latmorphlib.structs.LEM_TYPE.IPOLEMMA;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author Riccardo Del Gratta
 * @mail riccardo.delgratta@{gmail.com|ilc.cnr.it}
 */
public class Comparator {

    private TravellingTables travellingtables;
    private SilType sil;
    static final String CLASS_NAME = Comparator.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

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
    String EOS = vars.getEOS();
    boolean operationDebug = vars.isOperationDebug();

    public boolean compai(TravellingTables travellingtables) {
        String routine = CLASS_NAME + "/compai";
        String logmess = "";
        String buffer = "";
        String SAI_cod = travellingtables.getTabSAI().getSAI_cod();

        // get the last updated tables
        TabLessario tabLes = travellingtables.getTabLessario();
        TabSI tabSi = travellingtables.getTabSI();

        String a_gra = tabLes.getA_gra();
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Comparator.java with parameters a_gra -%s- and cod -%s-", routine, a_gra, SAI_cod);
            log.debug(logmess);
        }

        //System.err.println("MARCO+RICCARDO a_gra -" + a_gra + "- sai_cod -" + SAI_cod + "-");

        /*
         if (!strcmp(areavs.a_gra, getSAI_cod())) {
         */
        if (SAI_cod != null && a_gra.compareTo(SAI_cod) == 0) {
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****COPYING in function %s. From getSI -%s- to buffer-%s-", routine, tabSi.getSI(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****APPENDING in function %s. From areavs.les -%s-  to buffer -%s-", routine, tabLes.getLes(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****COPYING in function %s.From buffer -%s- to areavs.les -%s-", routine, buffer, tabLes.getLes());
                log.debug(logmess);
            }
            //buffer=new StringBuilder(tabSi.getSIcod()).toString();
            /* add the les of lessario to the initial segment and then set the les to
             this new value
             */
            buffer = tabSi.getSI();
            buffer = buffer + tabLes.getLes();
            tabLes.setLes(buffer);
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****COPIED in function %s. From getSI -%s- to buffer-%s-", routine, tabSi.getSI(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****APPENDED in function %s. From areavs.les -%s-  to buffer -%s-", routine, tabLes.getLes(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****COPIED in function %s.From buffer -%s- to areavs.les -%s-", routine, buffer, tabLes.getLes());
                log.debug(logmess);
            }
            travellingtables.setTabLessario(tabLes);
            setTravellingtables(travellingtables);

            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters a_gra -%s- and cod -%s- EXIT 1", routine, a_gra, SAI_cod);
                log.debug(logmess);
            }

            return true;

        }

        travellingtables.setTabLessario(tabLes);
        setTravellingtables(travellingtables);

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters a_gra -%s- and cod -%s- EXIT 0", routine, a_gra, SAI_cod);
            log.debug(logmess);
        }

        return false;

    }

    public boolean compsi(TravellingTables travellingtables) {
        String routine = CLASS_NAME + "/compsi";
        String logmess = "";
        String buffer = "";

        // get the last updated tables
        TabLessario tabLes = travellingtables.getTabLessario();
        TabSI tabSi = travellingtables.getTabSI();

        String lesSi = tabLes.getSi();
        String getSIcod = tabSi.getSI_cod();
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Comparator.java with parameters getSI -%s-", routine, lesSi);
            log.debug(logmess);
        }


        /*
         if (!strcmp(areavs.a_gra, getSAI_cod())) {
         */
        if (lesSi.compareTo(getSIcod) == 0) {
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****COPYING in function %s. From getSI -%s- to buffer-%s-", routine, tabSi.getSI(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****APPENDING in function %s. From areavs.les -%s-  to buffer -%s-", routine, tabLes.getLes(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****COPYING in function %s.From buffer -%s- to areavs.les -%s-", routine, buffer, tabLes.getLes());
                log.debug(logmess);
            }

            //buffer=new StringBuilder(tabSi.getSIcod()).toString();
            /* add the les of lessario to the initial segment and then set the les to
             this new value
             */
            buffer = tabSi.getSI();
            buffer = buffer + tabLes.getLes();
            tabLes.setLes(buffer);
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****COPIED in function %s. From getSI -%s- to buffer-%s-", routine, tabSi.getSI(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****APPENDED in function %s. From areavs.les -%s-  to buffer -%s-", routine, tabLes.getLes(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****COPIED in function %s.From buffer -%s- to areavs.les -%s-", routine, buffer, tabLes.getLes());
                log.debug(logmess);
            }
            travellingtables.setTabLessario(tabLes);
            //setLessario(tabLes);
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters lesSi -%s-  EXIT 1", routine, lesSi);
                log.debug(logmess);
            }
            setTravellingtables(travellingtables);
            return true;

        }

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters lesSi -%s-  EXIT 0", routine, lesSi);
            log.debug(logmess);
        }

        travellingtables.setTabLessario(tabLes);
        setTravellingtables(travellingtables);
        return false;

    } // end compsi

    public boolean compspfe(SilType sil, TravellingTables travellingtables) {
        String routine = Comparator.class
                .getName() + "/compspfe";
        String logmess = "";
        String[] segments = new String[7];

        // get the last updated tables
        TabLessario tabLes = travellingtables.getTabLessario();
        TabSPF tabspf_1 = travellingtables.getFirstTabSpf();
        //tabSi = travellingtables.getTabSI();

        String spf1 = tabspf_1.getSPF();
        String areavs_spf_0 = tabLes.getSpf();

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Comparator.java with parameters getSPF(SPF1) -%s-  EXIT 0", routine, spf1);
            log.debug(logmess);
        }

        if ((spf1.compareTo("que") == 0) && (areavs_spf_0.compareTo("3") == 0)) {

            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s getSPF(SPF1) -%s- = 'que' and areavs.spf[0] -%s- == '3' (RETURNING TO CALLER) OK", routine, spf1, areavs_spf_0);
                log.debug(logmess);
            }
            setTravellingtables(travellingtables);
            setSil(sil);
            return false;

        }
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNING in %s getSPF(SPF1) -%s- to sil.segment[6]", routine, spf1);
            log.debug(logmess);
        }
        segments = sil.getSegment();
        segments[6] = spf1;

        sil.setSegment(segments);
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNED in %s getSPF(SPF1) -%s- to sil.segment[6]", routine, spf1);
            log.debug(logmess);
        }

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters getSPF(SPF1) -%s-  EXIT 0", routine, spf1);
            log.debug(logmess);
        }
        setTravellingtables(travellingtables);
        setSil(sil);

        return true;
    }// end compspfe

    public boolean compspf(SilType sil, TravellingTables travellingtables) {
        String routine = CLASS_NAME + "/compspf";
        String logmess = "";
        String[] segments = new String[7];
        // get the last updated tables

        TabLessario tabLes = travellingtables.getTabLessario();
        TabSPF tabspf_2 = travellingtables.getSecondTabSpf();

        String spf2 = tabspf_2.getSPF();
        String areavs_spf = tabLes.getSpf();
        String areavs_spf_0 = "";

        if (areavs_spf.length() > 0) {
            areavs_spf_0 = Character.toString(areavs_spf.charAt(0));
        }

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Comparator.java with parameters getSPF(SPF1) -%s-  EXIT 0", routine, spf2);
            log.debug(logmess);
        }
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNING in %s 0 to sil.part -%d-", routine, sil.getPart());
            log.debug(logmess);
        }

        sil.setPart(0);
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNED in %s 0  to sil.part -%d-", routine, sil.getPart());
            log.debug(logmess);
        }

        if ((!(spf2 == null) && "".equals(spf2))) {// if getSPF(SPF2)=="" //IF1
            //if (!( * getSPF(SPF2))) { 
            //if (!(getSPF(SPF2)))
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s getSPF(SPF2) -%s-  WAS NOT NULL (OK) ", routine, spf2);
                log.debug(logmess);
            }
            if (areavs_spf_0.compareTo("p") == 0) { //IF2
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s areavs.spf[0] == 'p' returning OK", routine);
                    log.debug(logmess);
                }
                setTravellingtables(travellingtables);
                setSil(sil);
                if (flowDebug || deepFlowDebug) {
                    logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters getSPF(SPF1) -%s-  EXIT 0  IF1-IF2", routine, spf2);
                    log.debug(logmess);
                }
                return false;
            } else { //ELSE2
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s areavs.spf[0] == 'p' returning KO", routine);
                    log.debug(logmess);
                }
                setTravellingtables(travellingtables);
                setSil(sil);
                if (flowDebug || deepFlowDebug) {
                    logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters getSPF(SPF1) -%s-  EXIT 1 IF1-ELSE2", routine, spf2);
                    log.debug(logmess);
                }
                return true;
            }
        } else {// else getSPF(SPF2) //ELSE1
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s getSPF(SPF2) -%s- (RETURNING TO CALLER) WAS NOT '' (KO) ", routine, spf2);
                log.debug(logmess);
            }// end else getSPF(SPF2)        // second block
            setSil(sil);
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW CONTINUING Executing %s in Comparator.java with parameters getSPF(SPF1) -%s-  ELSE1", routine, spf2);
                log.debug(logmess);
            }
        }
        if (areavs_spf.compareTo(tabspf_2.getSPF_cod()) == 0) { //IF3
            //if (!strcmp(areavs.spf, getSPF_cod(SPF2))) { // if areavs.spf, getSPF_cod(SPF2
            if (deepFlowDebug) {

                logmess = String.format("DEEPFLOW ****CHECKED in %s getSPF(SPF2)_cod -%s- and area_spf -%s- OK", routine, tabspf_2.getSPF_cod(), areavs_spf);
                log.debug(logmess);

            }
            if (areavs_spf_0.compareTo("p") != 0) {
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s areavs.spf[0] != 'p' -%s- returning OK", routine, areavs_spf_0);
                    log.debug(logmess);
                }
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****ASSIGNING in %s 1  to sil.part -%d-", routine, sil.getPart());
                    log.debug(logmess);
                }
                sil.setPart(1);
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****ASSIGNED in %s 1  to sil.part -%d-", routine, sil.getPart());
                    log.debug(logmess);
                }
            }
            setTravellingtables(travellingtables);
            setSil(sil);
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters getSPF(SPF1) -%s-  EXIT 1 IF3", routine, spf2);
                log.debug(logmess);
            }
            return true;
        } else// else areavs.spf, getSPF_cod(SPF2 //ELSE3
        {
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW CONTINUING Executing %s in Comparator.java with parameters getSPF(SPF1) -%s-  ELSE3", routine, spf2);
                log.debug(logmess);
            }
        }
        setTravellingtables(travellingtables);
        setSil(sil);
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters getSPF(SPF1) -%s-  EXIT 0 END ROUTINE", routine, spf2);
            log.debug(logmess);
        }
        return false;
    } // compspf

    public TabLessario areacp(TabLessario s) {
        String routine = CLASS_NAME + "/areacp";
        String logmess = "";
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Comparator.java with s.pr_key -%s-", routine, s.getPr_key());
            log.debug(logmess);
        }
        TabLessario t;
        String n_id = s.getN_id();
        String gen = s.getGen();
        String clem = s.getClem();
        String si = s.getSi();
        String smv = s.getSmv();
        String spf = s.getSpf();
        String les = s.getLes();
        String codles = s.getCodles();

        String lem = s.getLem();
        String s_omo = s.getS_omo();
        String piu = s.getPiu();
        String codlem = s.getCodlem();
        String type = s.getType();
        String codLE = s.getCodLE();
        /*codLe*/

        String pt = s.getPt();
        String a_gra = s.getA_gra();
        String gra_u = s.getGra_u();
        String pr_key = s.getPr_key();
        /*pr_key*/

        t = new TabLessario(n_id, gen, clem, si, smv,
                spf, les, codles, lem, s_omo, piu,
                codlem, type, codLE, pt, a_gra, gra_u,
                pr_key);

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with s.pr_key -%s-", routine, s.getPr_key());
            log.debug(logmess);
        }

        return t;
    } // end areacp
    //public void compsm2(TabLE tabLe, TabLessario tabLes, TabSF tabSf, TabSM tabSm_1, TabSM tabSm_2, boolean isanysm1, boolean isanysm2) {

    public AucepsResponse compsm2(AucepsResponse response, TravellingTables travellingtables, TravellingQueries travellingqueries) {
        String routine = Comparator.class.getName() + "/compsm2";
        String logmess = "";
        String[] segments = new String[7];
        String condition = "";
        SilType sil = response.getSil();

        Sillib sillib = new Sillib();
        //tables
        TabLessario tabLes = travellingtables.getTabLessario();
        TabLessario areal = travellingtables.getCopiedLessario();
        TabSF tabSf = travellingtables.getTabSf();
        TabSM tabSm_1 = travellingtables.getFirstTabSm();
        TabSM tabSm_2 = travellingtables.getSecondTabSm();

        // queries
        TabSfQuery tabsfq = travellingqueries.getTabsfq();
        tabsfq.setConn(travellingqueries.getConn());

        //List
        List<TabSFCodSet> tabsCodSet = travellingtables.getListOfTabSFCodSet();

        //boolean
        boolean isanyCodSet = false;

        //
        String areavs_smv = tabLes.getSmv();

        //
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java with parameters areavs_smv -%s-", routine, areavs_smv);
            log.debug(logmess);
        }

        if (areavs_smv.equals("-")) {
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s areavs_smv -%s- = '-' (RETURNING TO CALLER) OK", routine, areavs_smv);
                log.debug(logmess);

            }
            setTravellingtables(travellingtables);
            response.setExitInCompsm2(true);
            return response;
        }

        if (areavs_smv.equals("+")) {
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s areavs_smv = + and areavs.codles -%s- OK", routine, tabLes.getCodles());
                log.debug(logmess);
            }
            condition = String.format("( %s=\'%s\' )", C_COD_P2, tabLes.getCodles());

        } else {
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s areavs_smv != + and areavs.codles -%s- OK", routine, tabLes.getCodles());
                log.debug(logmess);

            }
            condition = String.format("( ( %s=\'%s\' ) AND ( %s!='+' ))",
                    C_COD_P2, tabLes.getCodles(), PM2);
        }

        if (callerDebug && deepFlowDebug) {
            logmess = String.format("CALLING getSF_cod_set with condition -%s- getSF -%s- getSm_1 -%s-, "
                    + "getSm_2 -%s- and mode -%d- CALLER -%s-", condition, tabSf.getSEG(), tabSm_1.getSM(), tabSm_2.getSM(), 2, routine);
            log.debug(logmess);
        }

        tabsCodSet = tabsfq.getSF_cod_set(condition, travellingtables, 2);//tabsfq.getSF_cod_set(condition,
        if (operationDebug) {
            logmess = String.format("OPERATIONDEBUG SETTING setListOfTabSf in -%s-", routine);
            log.debug(logmess);

        }
        travellingtables.setListOfTabSFCodSet(tabsCodSet);
        isanyCodSet = travellingtables.isIsanySFCodSet();

        for (TabSFCodSet tabsfcset : tabsCodSet) {
            if (callerDebug) {
                logmess = String.format("CALLING areacp with tabLes with pr_key: -%s-  CALLER %s ", tabLes.getPr_key(), routine);
                log.debug(logmess);
            }
            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING setTabSfCodSet in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 14 in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG SETTING setCopiedLessario in -%s-", routine);
                log.debug(logmess);

            }

            travellingtables.setTabSfCodSet(tabsfcset);
            travellingtables.setStatus("14");
            areal = areacp(tabLes);
            travellingtables.setCopiedLessario(areal);

            if (callerDebug) {
                logmess = String.format("CALLING lemsm1 with tabLes with pr_key: -%s-  CALLER %s ", areal.getPr_key(), routine);
                log.debug(logmess);
            }
            response = lemsm1(response, travellingtables, travellingqueries);
            sil = response.getSil();
            travellingtables = getTravellingtables();
            areal = travellingtables.getCopiedLessario();
            //setSil(lemsm1(copiedLessario, tabSm_1, tabSm_2, tabsCodSet, isanysm1, isanysm2));
            if (callerDebug) {
                logmess = String.format("CALLING lemsm2 with tabLes with pr_key: -%s-  CALLER %s ", areal.getPr_key(), routine);
                log.debug(logmess);
            }
            response = lemsm2(response, travellingtables, travellingqueries);
            sil = response.getSil();
            travellingtables = getTravellingtables();
            areal = travellingtables.getCopiedLessario();
            if (callerDebug) {
                logmess = String.format("CALLING areacp with tabLes with pr_key: -%s-  CALLER %s ", areal.getPr_key(), routine);
                log.debug(logmess);
            }
            areal = areacp(tabLes);
            travellingtables.setCopiedLessario(areal);
            setTravellingtables(travellingtables);

            if (callerDebug) {
                logmess = String.format("CALLING lemtiz with tabLes with pr_key: -%s- and IPERLEMMA  CALLER %s ", areal.getPr_key(), routine);
                log.debug(logmess);
            }
            response = sillib.lemtiz(response, travellingtables, travellingqueries, IPERLEMMA);
            travellingtables = sillib.getTravellingtables();
            //lemtiz(copiedLessario, tabLe, IPERLEMMA);
            if (callerDebug) {
                logmess = String.format("CALLING lemv with tabLes with pr_key: -%s-  and IPERLEMMA CALLER %s ", areal.getPr_key(), routine);
                log.debug(logmess);
            }
            response = sillib.lemv(response, travellingtables, travellingqueries, IPERLEMMA);
            travellingtables = sillib.getTravellingtables();

            areal = travellingtables.getCopiedLessario();
            travellingtables.setCopiedLessario(areal);
        }
        setTravellingtables(travellingtables);
        response.setExitInCompsm2(false);
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java with parameters areavs_smv -%s-", routine, areavs_smv);
            log.debug(logmess);
        }
        ////System.err.println("CCCCC "+sil);
        return response;

    } // end compsm2
    //public void compsm1(TabLE tabLe, TabLessario tabLes, TabSF tabSf, TabSM tabSm_1, TabSM tabSm_2, boolean isanysm1, boolean isanysm2) {

    public AucepsResponse compsm1(AucepsResponse response, TravellingTables travellingtables, TravellingQueries travellingqueries) {
        String routine = Comparator.class
                .getName() + "/compsm1";
        String logmess = "";
        String[] segments = new String[7];
        String condition = "";

        SilType sil = response.getSil();

        Sillib sillib = new Sillib();
        //tables
        TabLessario tabLes = travellingtables.getTabLessario();
        TabLessario areal = travellingtables.getCopiedLessario();
        TabSF tabSf = travellingtables.getTabSf();
        TabSM tabSm_1 = travellingtables.getFirstTabSm();
        TabSM tabSm_2 = travellingtables.getSecondTabSm();

        // queries
        TabSfQuery tabsfq = travellingqueries.getTabsfq();
        tabsfq.setConn(travellingqueries.getConn());

        //boolean
        boolean isanyCodSet = false;

        //List
        List<TabSFCodSet> tabsCodSet = travellingtables.getListOfTabSFCodSet();
        String areavs_smv = tabLes.getSmv();
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java with parameters areavs_smv -%s-", routine, areavs_smv);
            log.debug(logmess);
        }

        if (areavs_smv.equals("-")) {
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s areavs_smv -%s- = '-' (RETURNING TO CALLER) OK", routine, areavs_smv);
                log.debug(logmess);

            }
            setTravellingtables(travellingtables);
            response.setExitInCompsm1(true);
            return response;
        }

        if (areavs_smv.equals("+")) {
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s areavs_smv = + and areavs.codles -%s- OK", routine, tabLes.getCodles());
                log.debug(logmess);
            }
            condition = String.format("( %s=\'%s\' )", C_COD_P, tabLes.getCodles());

        } else {
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s areavs_smv != + and areavs.codles -%s- OK", routine, tabLes.getCodles());
                log.debug(logmess);

            }
            condition = String.format("( ( %s=\'%s\' ) AND ( %s!='+' ))",
                    C_COD_P, tabLes.getCodles(), PM);
        }

        if (callerDebug && deepFlowDebug) {
            logmess = String.format("CALLING getSF_cod_set with condition -%s- getSF -%s- getSm_1 -%s-, "
                    + "getSm_2 -%s- and mode -%d- CALLER -%s-", condition, tabSf.getSEG(), tabSm_1.getSM(), tabSm_2.getSM(), 1, routine);
            log.debug(logmess);
        }
        tabsCodSet = tabsfq.getSF_cod_set(condition, travellingtables, 1);
        if (operationDebug) {
            logmess = String.format("OPERATIONDEBUG SETTING setListOfTabSf in -%s-", routine);
            log.debug(logmess);

        }
        travellingtables.setListOfTabSFCodSet(tabsCodSet);
        isanyCodSet = travellingtables.isIsanySFCodSet();

        for (TabSFCodSet tabsfcset : tabsCodSet) {
            if (callerDebug) {
                logmess = String.format("CALLING areacp with tabLes with pr_key: -%s-  CALLER %s ", tabLes.getPr_key(), routine);
                log.debug(logmess);
            }

            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING setTabSfCodSet in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 14 in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG SETTING setCopiedLessario in -%s-", routine);
                log.debug(logmess);

            }

            travellingtables.setTabSfCodSet(tabsfcset);
            travellingtables.setStatus("15");
            areal = areacp(tabLes);
            travellingtables.setCopiedLessario(areal);

            if (callerDebug) {
                logmess = String.format("CALLING lemsm1 with tabLes with pr_key: -%s-  CALLER %s ", areal.getPr_key(), routine);
                log.debug(logmess);
            }
            response = lemsm1(response, travellingtables, travellingqueries);
            sil = response.getSil();
            travellingtables = getTravellingtables();
            areal = travellingtables.getCopiedLessario();
            //setSil(lemsm1(copiedLessario, tabSm_1, tabSm_2, tabsCodSet, isanysm1, isanysm2));

            if (callerDebug) {
                logmess = String.format("CALLING areacp with tabLes with pr_key: -%s-  CALLER %s ", areal.getPr_key(), routine);
                log.debug(logmess);
            }
            areal = areacp(tabLes);
            travellingtables.setCopiedLessario(areal);
            setTravellingtables(travellingtables);

            if ("i".equals(areal.getClem())) {
                if (callerDebug) {
                    logmess = String.format("CALLING lemtiz with tabLes with pr_key: -%s- and IPERLEMMA_INT  CALLER %s ", areal.getPr_key(), routine);
                    log.debug(logmess);
                }
                response = sillib.lemtiz(response, travellingtables, travellingqueries, IPERLEMMA_INT);

            } else {
                if (callerDebug) {
                    logmess = String.format("CALLING lemtiz with tabLes with pr_key: -%s- and IPERLEMMA  CALLER %s ", areal.getPr_key(), routine);
                    log.debug(logmess);
                }
                response = sillib.lemtiz(response, travellingtables, travellingqueries, IPERLEMMA);

            }
            travellingtables = sillib.getTravellingtables();
            if (callerDebug) {
                logmess = String.format("CALLING lemv with tabLes with pr_key: -%s-  and IPERLEMMA CALLER %s ", areal.getPr_key(), routine);
                log.debug(logmess);
            }
            response = sillib.lemv(response, travellingtables, travellingqueries, IPERLEMMA);
            travellingtables = sillib.getTravellingtables();

            areal = travellingtables.getCopiedLessario();
            //travellingtables.setCopiedLessario(areal);
        }
        setTravellingtables(travellingtables);
        response.setExitInCompsm1(false);
        return response;

    } // end compsm1 

    //public SilType lemsm1(TabLessario areal, TabSM tabSm_1, TabSM tabSm_2, List<TabSFCodSet> tabsCodSet, boolean isanysm1, boolean isanysm2) {
    public AucepsResponse lemsm1(AucepsResponse response, TravellingTables travellingtables, TravellingQueries travellingqueries) {
        String routine = CLASS_NAME + "/lemsm1";
        String logmess = "";
        String condition = "";
        String lesId = "";
        Sillib sillib = new Sillib();
        SilType sil = response.getSil();
//         //System.err.println("BBBBB "+sil);

        //tables
        TabLessario areal = travellingtables.getCopiedLessario();
        TabSM tabSm_2 = travellingtables.getSecondTabSm();
        TabSM tabSm_1 = travellingtables.getFirstTabSm();

        String areal_les = areal.getLes();
        String sil_lemma = sil.getLemma();
        String sil_codice = sil.getCodice();
        lesId = areal.getPr_key();

        // TabSFCodSet
        TabSFCodSet tabCodSet = travellingtables.getTabSfCodSet();

        // List
        List<TabSFCodSet> tabsCodSet = travellingtables.getListOfTabSFCodSet();

        //queries
        TabLemmaEndingQuery tablemmaendigq = travellingqueries.getTablemmaendq();
        tablemmaendigq.setConn(travellingqueries.getConn());

        String C_COD_S = "", C_COD_P = "";
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java for lessario with pr_key -%s-", routine, lesId);
            log.debug(logmess);
        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING in function %s. From areal->les -%s- to sil.lemma-%s-", routine, areal_les, sil_lemma);
            log.debug(logmess);
        }
        sil.setLemma(areal_les);
        sil_lemma = sil.getLemma();
        response.setSil(sil);
        if (flowDebug || deepFlowDebug) {

            logmess = String.format("DEEPFLOW ****COPIED in function %s. From areal->les -%s- to sil.lemma-%s-", routine, areal_les, sil_lemma);
            log.debug(logmess);
        }

        if (travellingtables.isIsanySM2()) {
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****APPENDING in function %s. getSM_2 -%s- to sil.lemma-%s-", routine, tabSm_2.getSM(), sil_lemma);
                log.debug(logmess);
            }

            sil_lemma = sil_lemma + tabSm_2.getSM();
            sil.setLemma(sil_lemma);
            sil_lemma = sil.getLemma();
            response.setSil(sil);

            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****APPENDED in function %s. getSM_2 -%s- to sil.lemma-%s-", routine, tabSm_2.getSM(), sil_lemma);
                log.debug(logmess);
            }
        }

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****APPENDING in function %s. getSM_1 -%s- to sil.lemma-%s-", routine, tabSm_2.getSM(), sil_lemma);
            log.debug(logmess);
        }

        sil_lemma = sil_lemma + tabSm_1.getSM();
        sil.setLemma(sil_lemma);
        sil_lemma = sil.getLemma();
        response.setSil(sil);

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****APPENDED in function %s. getSM_1 -%s- to sil.lemma-%s-", routine, tabSm_1.getSM(), sil_lemma);
            log.debug(logmess);
        }

        if (valueDebug) {
            logmess = String.format("DEEPFLOW ****VALUES in function %s. Elements in TabSFCodSet -%d-", routine, tabsCodSet.size());
            log.debug(logmess);
        }

        /*MEM TabSFCodSet SHOULD BE 1 RECORD*/
        //if (tabsCodSet.size() > 1) {
        tabCodSet = tabsCodSet.get(0);

        //}
        C_COD_S = tabCodSet.getC_COD_S();
        C_COD_P = tabCodSet.getC_COD_P();

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING in function %s. getC_COD_S (WAS getSM_cod_S) -%s- to sil.codice-%s-", routine, C_COD_S, sil_codice);
            log.debug(logmess);

        }

        sil.setCodice(C_COD_S);
        sil_codice = sil.getCodice();
        response.setSil(sil);

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPIED in function %s. getC_COD_S (WAS getSM_cod_S) -%s- to sil.codice-%s-", routine, C_COD_S, sil_codice);
            log.debug(logmess);

        }
        if (callerDebug && deepFlowDebug) {
            logmess = String.format("CALLING  build_lemma  with parameters sil.lemma -%s-, sil.codice -%s-", routine, sil.getLemma(), sil.getCodice());
            log.debug(logmess);
        }

        tablemmaendigq.getBuildLemmaSet(sil.getLemma(), sil.getCodice());
        sil.setLemma(tablemmaendigq.build_lemma());
        response.setSil(sil);

        if (callerDebug && deepFlowDebug) {
            logmess = String.format("CALLING  set_codlem3eagles  with parameters areal.pr_key -%s-, sil.codice -%s-", routine, areal.getPr_key(), sil.getCodice());
            log.debug(logmess);
        }
        response = sillib.set_codlem3eagles(response, travellingtables, travellingqueries, sil_codice);
        travellingtables = sillib.getTravellingtables();
        //setSil(set_codlem3eagles(areal, sil.getCodice()));
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNING in function %s. EOS to areal.clem", routine);
            log.debug(logmess);
        }

        areal.setClem(EOS);
        travellingtables.setCopiedLessario(areal);
        setTravellingtables(travellingtables);
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNED in function %s. EOS to areal.clem -%s-", routine, areal.getClem());
            log.debug(logmess);
        }

        if (callerDebug && deepFlowDebug) {
            logmess = String.format("CALLING  pushLemma  with parameters areal.pr_key -%s-, IPOLEMMA", routine, areal.getPr_key());
            log.debug(logmess);
        }
        /* RDG*/
        travellingtables.setCopiedLessario(areal); /* set areal as copiedlessario */
        response = sillib.pushLemma(response, travellingtables, travellingqueries, IPOLEMMA);
//pushLemma(areal, IPOLEMMA);
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNING in function %s. EOS to areal.clem", routine);
            log.debug(logmess);
        }
        travellingtables = sillib.getTravellingtables();
        travellingtables.setCopiedLessario(travellingtables.getCopiedLessario());

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java for lessario with pr_key -%s-", routine, lesId);
            log.debug(logmess);
        }
        return response;
    } // end lemsm1

    public AucepsResponse lemsm2(AucepsResponse response, TravellingTables travellingtables, TravellingQueries travellingqueries) {//TabLessario areal, TabSM tabSm_1, TabSM tabSm_2, List<TabSFCodSet> tabsCodSet, boolean isanysm1, boolean isanysm2) {
        String routine = CLASS_NAME + "/lemsm2";
        String logmess = "";
        String condition = "";
        SilType sil = response.getSil();

        // tables 
        TabLessario areal = travellingtables.getCopiedLessario();
        TabSM tabSm_1 = travellingtables.getFirstTabSm();
        TabSM tabSm_2 = travellingtables.getSecondTabSm();
        TabSFCodSet tabSfCodSet = travellingtables.getTabSfCodSet();

        //List
        List<TabSFCodSet> tabsSfCodSet = travellingtables.getListOfTabSFCodSet();

        //queries
        TabLemmaEndingQuery tablemmaendigq = travellingqueries.getTablemmaendq();
        tablemmaendigq.setConn(travellingqueries.getConn());

        Sillib sillib = new Sillib();

        String lesId = "";
        String areal_les = areal.getLes();
        String sil_lemma = sil.getLemma();
        String sil_codice = sil.getCodice();
        lesId = areal.getPr_key();

//        //booleans
//        boolean isanysm1 = travellingtables.isIsanySM1();
//        boolean isanysm2 = travellingtables.isIsanySM2();
        //sil_lemma = sil.getLemma();
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING in %s areal.les -%s- on sil.lemma -%s-", routine, areal.getLes(), sil_lemma);
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****APPENDING in %s getSM(2) -%s- to sil.lemma -%s-", routine, tabSm_2.getSM(), sil_lemma);
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPYING in %s tabSfCodSet.getC_COD_P  -%s- on sil.lemma -%s-", routine, tabSfCodSet.getC_COD_P(), sil_lemma);
            log.debug(logmess);
        }
        sil_lemma = areal.getLes();
        sil_lemma = sil_lemma + tabSm_2.getSM();
        /*MEM TabSFCodSet SHOULD BE 1 RECORD*/
        //if (tabsCodSet.size() > 1) {
        tabSfCodSet = tabsSfCodSet.get(0);
        sil_codice = tabSfCodSet.getC_COD_P();

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPIED in %s areal.les -%s- on sil.lemma -%s-", routine, areal.getLes(), sil_lemma);
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****APPENDED in %s getSM(2) -%s- to sil.lemma -%s-", routine, tabSm_2.getSM(), sil_lemma);
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPIED in %s tabSfCodSet.getC_COD_P  -%s- on sil.lemma -%s-", routine, tabSfCodSet.getC_COD_P(), sil_lemma);
            log.debug(logmess);
        }

        sil.setLemma(sil_lemma);
        sil.setCodice(sil_codice);
        response.setSil(sil);

        /*if (deepFlowDebug) {
         printf("        ****COPYING areal->les on sil.lemma \n");
         printf("        ****APPENDING getSM(SM2) to sil.lemma \n");
         printf("        ****COPYING getSM_cod_P() on sil.codice \n");
         }
         strcpy(sil.lemma, areal->les);
         strcat(sil.lemma, getSM(SM2));
         strcpy(sil.codice, getSM_cod_P());

         if (deepFlowDebug) {
         printf("        ****COPIED areal->les %s on sil.lemma %s \n", areal->les, sil.lemma);
         printf("        ****APPENDED getSM(SM2) to sil.lemma %s \n", sil.lemma);
         printf("        ****COPIED getSM_cod_P() on sil.codice %s\n", sil.codice);
         }*/
        if (callerDebug && deepFlowDebug) {
            logmess = String.format("CALLING  build_lemma  with parameters sil.lemma -%s-, sil.codice -%s-", routine, sil.getLemma(), sil.getCodice());
            log.debug(logmess);
        }

        tablemmaendigq = travellingqueries.getTablemmaendq();
        tablemmaendigq.setConn(travellingqueries.getConn());

        tablemmaendigq.getBuildLemmaSet(sil.getLemma(), sil.getCodice());
        sil.setLemma(tablemmaendigq.build_lemma());
        response.setSil(sil);
        response = sillib.set_codlem3eagles(response, travellingtables, travellingqueries, sil.getCodice());
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNING in function %s. EOS to areal.clem", routine);
            log.debug(logmess);
        }
        travellingtables = sillib.getTravellingtables();
        areal = travellingtables.getCopiedLessario();
        areal.setClem(EOS);
        travellingtables.setCopiedLessario(areal);

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNED in function %s. EOS to areal.clem -%s-", routine, areal.getClem());
            log.debug(logmess);
        }

        if (callerDebug && deepFlowDebug) {
            logmess = String.format("CALLING  pushLemma  with parameters areal.pr_key -%s-, IPERLEMMA_INT", routine, areal.getPr_key());
            log.debug(logmess);
        }
        /* RDG*/
        travellingtables.setCopiedLessario(areal);  /* set areal as copiedlessario */ 

        response = sillib.pushLemma(response, travellingtables, travellingqueries, IPERLEMMA_INT);
        sil = response.getSil();
        //pushLemma(areal, IPOLEMMA);
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNING in function %s. EOS to areal.clem", routine);
            log.debug(logmess);
        }
        travellingtables = sillib.getTravellingtables();
//        areal=travellingtables.getCopiedLessario();
//        travellingtables.setCopiedLessario(areal);
//        setCopiedLessario(areal);
        setTravellingtables(travellingtables);
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java for lessario with pr_key -%s-", routine, lesId);
            log.debug(logmess);
        }
        return response;

    } // en lemsm2

    public AucepsResponse compsf(AucepsResponse response, TravellingTables travellingtables, TravellingQueries travellingqueries) {
        String routine = CLASS_NAME + "/compsf";
        String logmess = "";
        String buffer = "";
        SilType sil = response.getSil();

        // get the last updated tables
        TabLessario areavs = travellingtables.getTabLessario();
        TabLessario areal = travellingtables.getCopiedLessario();
        TabSI tabSi = travellingtables.getTabSI();

        String lesSi = areavs.getSi();
        String a_gra = areavs.getA_gra();
        String cod_noseg = areavs.getCodLE();
        String gender = areavs.getGen();
        String getSIcod = tabSi.getSI_cod();

        Sillib sillib = new Sillib();

        //List
        List<TabSFCodSet> tabsCodSet = travellingtables.getListOfTabSFCodSet();

        //queries
        TabSfQuery tabsfq = travellingqueries.getTabsfq();
        tabsfq.setConn(travellingqueries.getConn());

        int mode = 0;
        String condition = "";
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Comparator.java with parameters a_gra -%s-", routine, a_gra);
            log.debug(logmess);
        }
        if (areavs.getCodles().charAt(0) == 'v') {// if areavs.codles)[0] == 'v'

            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s areavs.codles[0] = v  OK", routine, areavs.getCodles().charAt(0));
                log.debug(logmess);
            }
            condition = String.format("( LEFT(%s,%s) LIKE '%s' )",
                    C_COD, areavs.getCodles().length(), areavs.getCodles());
        } else {
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s areavs.codles[0] = v  KO", routine, areavs.getCodles().charAt(0));
                log.debug(logmess);
            }
            if (!cod_noseg.equals("")) { // if areavs.cod_noseg
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s cod_noseg -%s- NOT EMPTY", routine, cod_noseg);
                    log.debug(logmess);
                }

                if (areavs.getPt().equals("x")) {
                    mode = 5;
                } else {
                    mode = 3;
                }
                condition = String.format(
                        "(%s='%s') WHERE (%s='%s') ",
                        "cod_le.cod_LE", cod_noseg, C_COD, areavs.getCodles());
            } else { // else areavs.cod_noseg
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s cod_noseg -%s-  EMPTY", routine, cod_noseg);
                    log.debug(logmess);
                }
                if (areavs.getPt().equals("x")) {
                    mode = 4;
                }
                condition = String.format("(%s='%s')", C_COD, areavs.getCodles());
            } // end else areavs.cod_noseg

            switch (gender) {
                case "m":
                case "f":
                case "n":
                    condition = String.format("%s AND (%s='%s') ", condition, C07F, gender);

                    break;
                case "1":
                    condition = String.format("%s AND ( (%s='m') OR (%s='n') ) ", condition, C07F, C07F);

                    break;
                case "2":
                    condition = String.format("%s AND ( (%s='m') OR (%s='f') ) ", condition, C07F, C07F);

                    break;
                case "3":
                    condition = String.format("%s AND ( (%s='n') OR (%s='f') ) ", condition, C07F, C07F);

                    break;

            }
        }

        travellingtables.setTabLessario(areavs);
        setTravellingtables(travellingtables);

        if (callerDebug && deepFlowDebug) {
            logmess = String.format("CALLING getSF_cod_set with condition -%s- and mode -%d- CALLER -%s-", condition, mode, routine);
            log.debug(logmess);
        }
        tabsCodSet = tabsfq.getSF_cod_set(condition, travellingtables, mode);
        if (!tabsCodSet.isEmpty()) {
            if (callerDebug) {
                logmess = String.format("CALLING areacp with tabLes with pr_key: -%s-  CALLER %s ", areavs.getPr_key(), routine);
                log.debug(logmess);
            }
            if (operationDebug) {
//                logmess = String.format("OPERATIONDEBUG SETTING setTabSfCodSet in -%s-", routine);
//                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 14 in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG SETTING setCopiedLessario in -%s-", routine);
                log.debug(logmess);

            }

            //travellingtables.setTabSfCodSet(tabsfcset);
            travellingtables.setStatus("16");
            areal = areacp(areavs);
            travellingtables.setCopiedLessario(areal);

            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****COPYING in %s areavs.les -%s- on sil.lemma -%s-", routine, areavs.getLes(), sil.getLemma());
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****COPYING in %s areavs.codles -%s- on sil.codice -%s-", routine, areavs.getCodles(), sil.getCodice());
                log.debug(logmess);

            }
            sil.setLemma(areavs.getLes());
            sil.setCodice(areavs.getCodles());
            response.setSil(sil);

            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****COPIED in %s areavs.les -%s- on sil.lemma -%s-", routine, areavs.getLes(), sil.getLemma());
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****COPIED in %s areavs.codles -%s- on sil.codice -%s-", routine, areavs.getCodles(), sil.getCodice());
                log.debug(logmess);

            }
            if (callerDebug) {
                logmess = String.format("CALLING lemtiz with tabLes with pr_key: -%s- and IPOLEMMA  CALLER %s ", areal.getPr_key(), routine);
                log.debug(logmess);
            }
            response = sillib.lemtiz(response, travellingtables, travellingqueries, IPOLEMMA);
            //        int k = lemtiz(&areal, IPOLEMMA);
            //        fprintf(stderr,"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX K=%i XXX\n", k);
            // if (lemtiz(&areal, IPOLEMMA)) {
            if (response.isExitInLemtiz()) {

                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s lemtiz -%s- TRUE", routine, response.isExitInLemtiz());
                    log.debug(logmess);
                }
                if (callerDebug) {
                    logmess = String.format("CALLING lemv with tabLes with pr_key: -%s- and IPERLEMMA  CALLER %s ", areal.getPr_key(), routine);
                    log.debug(logmess);
                }
                response = sillib.lemv(response, travellingtables, travellingqueries, IPERLEMMA);

            } else {
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s lemtiz -%s- TRUE", routine, response.isExitInLemtiz());
                    log.debug(logmess);
                }
                if (callerDebug) {
                    logmess = String.format("CALLING lemv with tabLes with pr_key: -%s- and IPOLEMMA  CALLER %s ", areal.getPr_key(), routine);
                    log.debug(logmess);
                }
                response = sillib.lemv(response, travellingtables, travellingqueries, IPOLEMMA);
            }
        }

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters a_gra -%s-", routine, a_gra);
            log.debug(logmess);
        }

        //System.err.println("GIULIA 5 in COMPSF  AS " + response.getAnalyses().toString() + "-" + response.getAnalyses().getNumAnalysis() + "-");
        //System.err.println("GIULIA 5 in COMPSF CA " + response.getCur_analysis().toString());
        return response;
    }// end compsf

    /**
     * @return the travellingtables
     */
    public TravellingTables getTravellingtables() {
        return travellingtables;
    }

    /**
     * @param travellingtables the travellingtables to set
     */
    public void setTravellingtables(TravellingTables travellingtables) {
        this.travellingtables = travellingtables;
    }

    /**
     * @return the sil
     */
    public SilType getSil() {
        return sil;
    }

    /**
     * @param sil the sil to set
     */
    public void setSil(SilType sil) {
        this.sil = sil;
    }

}
