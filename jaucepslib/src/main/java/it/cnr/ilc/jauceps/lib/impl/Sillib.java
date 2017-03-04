/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl;

import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabFEDefinition.C03;
import it.cnr.ilc.jauceps.lib.impl.table.Tab3Eagles;
import it.cnr.ilc.jauceps.lib.impl.table.TabCodLE;
import it.cnr.ilc.jauceps.lib.impl.table.TabFE;
import it.cnr.ilc.jauceps.lib.impl.table.TabFE3CodSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabFECodMorSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabLE;
import it.cnr.ilc.jauceps.lib.impl.table.TabLessario;
import it.cnr.ilc.jauceps.lib.impl.table.TabSAI;
import it.cnr.ilc.jauceps.lib.impl.table.TabSF;
import it.cnr.ilc.jauceps.lib.impl.table.TabSFCodMorSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabSI;
import it.cnr.ilc.jauceps.lib.impl.table.TabSPF;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabCodLeQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabEaglesQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabLemmaEndingQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery;
import it.cnr.ilc.jauceps.lib.outputobjects.AucepsResponse;
import it.cnr.ilc.jauceps.lib.structs.Analyses;
import it.cnr.ilc.jauceps.lib.structs.Analysis;
import static it.cnr.ilc.jauceps.lib.structs.LES_Q_MODE.BY_CLEM;
import static it.cnr.ilc.jauceps.lib.structs.LES_Q_MODE.BY_KEY;
import it.cnr.ilc.jauceps.lib.structs.Lemma;
import it.cnr.ilc.jauceps.lib.structs.Lemmas;
import static it.cnr.ilc.jauceps.lib.structs.Segments.SM1;
import it.cnr.ilc.jauceps.lib.structs.SilType;
import static it.cnr.ilc.jauceps.lib.structs.THREE_EAGLES_MODE.BY_CODLEM;
import static it.cnr.ilc.jauceps.lib.structs.THREE_EAGLES_MODE.BY_CODLES;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingQueries;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;
import it.cnr.ilc.latmorphlib.structs.LEM_TYPE;
import static it.cnr.ilc.latmorphlib.structs.LEM_TYPE.LEMMA_AGG;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author Riccardo Del Gratta
 * @mail riccardo.delgratta@{gmail.com|ilc.cnr.it}
 */
public class Sillib {

    private TravellingTables travellingtables;
    private RunAnalyses runanalyses = new RunAnalyses();

    static final String CLASS_NAME = Sillib.class.getName();

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
    boolean operationDebug = vars.isOperationDebug();
    String EOS = vars.getEOS();

    public SilType spferic(SilType sil, TabSPF tab) {

        String routine = Sillib.class.getName() + "/spferic";
        String logmess = "";

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java", routine);
            log.debug(logmess);
        }
        int length = 0;
        String rad_spfe = "";
        length = sil.getForm().length() - tab.getSPF().length();
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING in %s N chars %d of sil.form %s on sil.rad_spfe %s", routine, length, sil.getForm(), rad_spfe);
            log.debug(logmess);

        }
        rad_spfe = sil.getForm().substring(0, length);
        sil.setRad_spfe(rad_spfe);
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPIED in %s N chars %d of sil.form %s on sil.rad_spfe %s", routine, length, sil.getForm(), rad_spfe);
            log.debug(logmess);

        }

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java. rad_spfe %s", routine, rad_spfe);
            log.debug(logmess);
        }

        return sil;
    }

    public SilType spfric(SilType sil, TabSPF tab) {
        String routine = Sillib.class.getName() + "/spfric";
        String logmess = "";
        int length;
        String rad_spf = "";

        length = sil.getRad_spfe().length() - tab.getSPF().length();
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java", routine);
            log.debug(logmess);
        }

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING in %s N chars %d of sil.rad_spfe %s on sil.rad_spf %s", routine, length, sil.getRad_spfe(), rad_spf);
            log.debug(logmess);
        }
        rad_spf = sil.getRad_spfe().substring(0, length);
        sil.setRad_spf(rad_spf);

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPIED in %s N chars %d of sil.rad_spfe %s on sil.rad_spf %s", routine, length, sil.getRad_spfe(), rad_spf);
            log.debug(logmess);
        }

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java", routine);
            log.debug(logmess);
        }

        return sil;
    }

    public SilType sfric(SilType sil, TabSF tabSf) {
        String routine = CLASS_NAME + "/sfric";
        String logmess = "";
        int length = 0;
        int diff = 0;
        String rad_sf = "";
        length = tabSf.getLSEG();

        diff = sil.getRad_si().length() - length;
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java", routine);
            log.debug(logmess);
        }

        if (deepFlowDebug) {

            logmess = String.format("DEEPFLOW ****COPYING in %s N chars %d of sil.rad_si -%s- on sil.rad_sf -%s-", routine, diff, sil.getRad_si(), rad_sf);
            log.debug(logmess);
        }

        rad_sf = sil.getRad_si().substring(0, diff);
        sil.setRad_sf(rad_sf);

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPIED in %s N chars %d of sil.rad_si -%s- on sil.rad_sf -%s-", routine, diff, sil.getRad_si(), rad_sf);
            log.debug(logmess);
        }

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java", routine);
            log.debug(logmess);
        }

        return sil;

    }

    public SilType siric(SilType sil, TabSI tab) {
        String routine = Sillib.class.getName() + "/siric";
        String logmess = "";
        int length;
        String rad_si = tab.getSI(), rad_spf = "";

        rad_spf = sil.getRad_spf();
        length = rad_si.length();
        //System.err.println("PRIMA rad_spf-"+rad_spf+"- length -"+length+ "- rad_si -"+rad_si+"-");
        rad_si = rad_spf.substring(length);
        //System.err.println("DOPO rad_spf-"+rad_spf+"- length -"+length+ "- rad_si -"+rad_si+"-");

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java", routine);
            log.debug(logmess);
        }
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING in %s N chars %d of sil.rad_spf %s on sil.rad_si %s", routine, length, sil.getRad_spf(), rad_si);
            log.debug(logmess);
        }

        sil.setRad_si(rad_si);

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPIED in %s N chars %d of sil.rad_spf %s on sil.rad_si %s", routine, length, sil.getRad_spf(), rad_si);
            log.debug(logmess);
        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java", routine);
            log.debug(logmess);
        }

        return sil;
    } // end siric

    public SilType sairic(SilType sil, TabSAI tabSai) {
        //SilType lsil = getSil();
        String routine = CLASS_NAME + "/sairic";
        String logmess = "";
        int index = tabSai.getSAI().length();
        int radLength = sil.getRadical().length();
        String ind_alt = "", rad_alt = "", rad_sai = "";
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java", routine);
            log.debug(logmess);
        }
        /* copying the substring check lenght*/
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING in %s N chars %d of sil.radical %s on sil.rad_sai %s", routine, index, sil.getRadical(), sil.getRad_sai());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPYING in %s  getSai_cod -%s- on sil.ind_alt %s", routine, tabSai.getSAI_cod(), sil.getInd_alt());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPYING in %s  getSai_alt -%s- on sil.rad_alt %s", routine, tabSai.getSAI_alt(), sil.getRad_alt());
            log.debug(logmess);

        }
        if (index > radLength) {
            rad_sai = "";

        } else {
            rad_sai = sil.getRadical().substring(index);
        }
        sil.setRad_sai(rad_sai);

        ind_alt = tabSai.getSAI_cod();
        sil.setInd_alt(ind_alt);
        rad_alt = tabSai.getSAI_alt() + rad_sai;
        sil.setRad_alt(rad_alt);

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPIED in %s N chars %d of sil.radical %s on sil.rad_sai %s", routine, index, sil.getRadical(), sil.getRad_sai());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPIED in %s  getSai_cod -%s- on sil.ind_alt %s", routine, tabSai.getSAI_cod(), sil.getInd_alt());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPIED in %s  getSai_alt -%s- on sil.rad_alt %s", routine, tabSai.getSAI_alt(), sil.getRad_alt());
            log.debug(logmess);

        }
        //setSil(sil);
        return sil;

    } // end sairic

    public SilType smric(SilType sil, TravellingTables travellingtables, String rad_sf, int sm_n) {

        //smric(sil.getRad_sf(), sil.getRad_sm1(), SM1);
        String routine = CLASS_NAME + "/smric";
        String logmess = "";
        String rad_sm = "";
        int length = 0, length_sm = 0;

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java", routine);
            log.debug(logmess);
        }

        if (sm_n == SM1) {
            rad_sm = travellingtables.getFirstTabSm().getSM();

        } else {
            rad_sm = travellingtables.getSecondTabSm().getSM();

        }

        //System.err.println("AAAAAA rad_sm -" + rad_sm + "- " + rad_sf + "-");
        length_sm = rad_sm.length();
        length = rad_sf.length() - rad_sm.length();
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING in %s N chars  of sil.rad_sf %s on sil.rad_sm %s for mode -%d-", routine, rad_sm, sil.getRad_sf(), sm_n);
            log.debug(logmess);

        }
        rad_sm = rad_sf.substring(0, length);
        if (sm_n == SM1) {
            sil.setRad_sm1(rad_sm);
        } else {
            sil.setRad_sm2(rad_sm);
        }

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPIED in %s N chars of sil.rad_sf %s on sil.rad_sm %s for mode -%d-", routine, rad_sm, sil.getRad_sf(), sm_n);
            log.debug(logmess);

        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java", routine);
            log.debug(logmess);
        }
        return sil;

    }

    public AucepsResponse lemtiz(AucepsResponse response, TravellingTables travellingtables, TravellingQueries travellingqueries, LEM_TYPE lem_type) {
        String routine = CLASS_NAME + "/lemtiz";
        String logmess;// = "";
        TabLessario areal_add;
        String[] segments;// = new String[7];
        String encFE = "", les_id, add_lem = null;
        SilType sil = response.getSil();

        Analyses analyses = response.getAnalyses();

        // for debug
        int numA = analyses.getNumAnalysis();
        Analysis cur_analysis = new Analysis();

        //System.err.println("GIULIA 3a in LEMTIZ  CA " + cur_analysis.toString() + "-" + numA + "-");
        //System.err.println("GIULIA 3b in LEMTIZ LOS " + analyses.getListOfAnalysis() + "-" + numA + "-");
        //System.err.println("GIULIA 3c in LEMTIZ RES " + response.toString() + "-" + numA + "-");
        // tables
        TabLessario areal = travellingtables.getCopiedLessario();
        TabLE tabLe = travellingtables.getTabLe();

        les_id = areal.getPr_key();
        /* FORME ECC*/
        TabFEQuery tabfeq = travellingqueries.getTabfeq();
        tabfeq.setConn(travellingqueries.getConn());

        //queries13
        TabLessarioQuery tablessarioq = travellingqueries.getTablessarioq();
        tablessarioq.setConn(travellingqueries.getConn());
        TabLemmaEndingQuery tablemmaendingq = travellingqueries.getTablemmaendq();
        tablemmaendingq.setConn(travellingqueries.getConn());
        // list.
        List<TabFE> tabsFe;// = travellingtables.getListOfTabFE();

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in %s with s.pr_key -%s- #Analysis -%d-", routine, CLASS_NAME, areal.getPr_key(), numA);
            log.debug(logmess);
        }

        /* FORME ECC*/ if (callerDebug || deepFlowDebug) {
            logmess = String.format("CALLING getFEset les_id=-%s- and #Anaysis -%d- CALLER %s", les_id, numA, routine);
            log.debug(logmess);
        }
        tabsFe = tabfeq.getFEset(les_id);
        if (!tabsFe.isEmpty()) {
            TabFE tabFe = tabsFe.iterator().next();
            encFE = tabFe.getEncFE();
            add_lem = tabFe.getAddLem();
            travellingtables.setListOfTabFE(tabsFe);
            travellingtables.setTabFe(tabFe);
        }

        /* TABS LESSARIO */
        List<TabLessario> tabsLessario;// = travellingtables.getListOfTabLessario();
        /* TABS LESSARIO */

 /* FIRST BLOCK */
        if (areal.getCodles().compareTo("fe") == 0) { // getCodLes IS fe
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s areal.codles==fe -%s- a OK", routine, areal.getCodles());
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****ASSIGNING in %s getEncFE(areal->les_id) -%s- to sil.segment[6]", routine, les_id);
                log.debug(logmess);
            }

            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****ASSIGNING in %s getEncFE(areal->les_id) -%s- to sil.segment[6]", routine, les_id);
                log.debug(logmess);

            }
            segments = sil.getSegment();

            segments[6] = encFE;

            sil.setSegment(segments);
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****ASSIGNED in %s getEncFE -%s- to sil.segment[6]", routine, encFE);
                log.debug(logmess);

            }
            response.setSil(sil);
            if (analysisDebug) {
                logmess = String.format("ANALYSES DEBUG in -%s- FIRST BLOCK AucepsResponse -%s-", routine, response.toString());
                log.debug(logmess);

            }

        }
        /* END FIRST BLOCK */

 /* SECOND  BLOCK */
        if (areal.getLem() != null && !areal.getLem().equals("")) { // if second block IFSB_2

            if (areal.getLem().startsWith("-") || areal.getLem().startsWith("=")) { //if third block IFSB_3
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s areal.lem =='-' or '='  -%s-  OK", routine, areal.getLem());
                    log.debug(logmess);
                    logmess = String.format("DEEPFLOW ****ASSIGNING in %s areal.les -%s- to sil.lemma -%s-", routine, areal.getLes(), sil.getLemma());
                    log.debug(logmess);
                }
                sil.setLemma(areal.getLes());
                if (deepFlowDebug) {

                    logmess = String.format("DEEPFLOW ****ASSIGNED in %s areal.les -%s- to sil.lemma -%s-", routine, areal.getLes(), sil.getLemma());
                    log.debug(logmess);
                }
                /* if lem startswith - or = get the substring from position 1*/
                int l = areal.getLem().length();
                if (l > 1) {
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****ASSIGNING in %s areal.lem+1 -%s- to sil.lemma -%s-", routine, areal.getLem(), sil.getLemma());
                        log.debug(logmess);
                    }
                    String lem = sil.getLemma();
                    lem = lem + areal.getLem().substring(1, l);
                    sil.setLemma(lem);
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****ASSIGNED in %s areal.lem+1 -%s- to sil.lemma -%s-", routine, areal.getLem(), sil.getLemma());
                        log.debug(logmess);
                    }
                }

            } else { // else if third block IFSB_3 (ELSESB_3)
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s areal.lem =='-' or '='  -%s-  KO", routine, areal.getLem());
                    log.debug(logmess);
                    logmess = String.format("DEEPFLOW ****ASSIGNING in %s areal.lem -%s- to sil.lemma -%s-", routine, areal.getLem(), sil.getLemma());
                    log.debug(logmess);
                } // else if second block IFSB_2
                sil.setLemma(areal.getLem());
                if (deepFlowDebug) {

                    logmess = String.format("DEEPFLOW ****ASSIGNED in %s areal.lem -%s- to sil.lemma -%s-", routine, areal.getLem(), sil.getLemma());
                    log.debug(logmess);
                }

                if (valueDebug) {

                    logmess = String.format("****VALUES of sil.lemma -%s- in routine -%s-", sil.getLemma(), routine);
                    log.debug(logmess);
                }
            } // end if third block IFSB_3
            response.setSil(sil);
            if (callerDebug) {
                logmess = String.format("CALLING set_codlem3eagles in  Sillib.java. else if third block IFSB_3 (ELSESB_3) and #Analysis -%d- CALLER %s", numA, routine);
                log.debug(logmess);
            }
            //sil = set_codlem3eagles(areal, "");
            response = set_codlem3eagles(response, travellingtables, travellingqueries, "");
            if (analysisDebug) {
                logmess = String.format("ANALYSES DEBUG in -%s- after set_codlem3eagles SECOND BLOCK AucepsResponse -%s-", routine, response.toString());
                log.debug(logmess);

            }
            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from set_codlem3eagles in lemtiz in -%s-", routine);
                log.debug(logmess);

            }
            travellingtables = getTravellingtables();
            setTravellingtables(travellingtables);
            response.setSil(sil);

            if (callerDebug) {
                logmess = String.format("CALLING pushLemma in  -%s- (IFSB_2) and #Analysis -%d-. CALLER %s ", CLASS_NAME, numA, routine);
                log.debug(logmess);
            }
            // ARRIVATOQUI//
            /*areal=copiedlessario*/
 /* RDG*/
            travellingtables.setCopiedLessario(areal);
            /* set areal as copiedlessario */
            response = pushLemma(response, travellingtables, travellingqueries, lem_type);
            if (analysisDebug) {
                logmess = String.format("ANALYSES DEBUG in -%s- after pushLemma SECOND BLOCK AucepsResponse -%s-", routine, response.toString());
                log.debug(logmess);

            }

            if (areal.getCodles().compareTo("fe") == 0) { //IFSB_3
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s strcmp(areal->codles, fe) THEY ARE EQUAL OK IFSB_3", routine);
                    log.debug(logmess);
                }
                if (callerDebug) {
                    logmess = String.format("CALLING getAddLem in  Sillib.java. SECOND BLOCK IFSB_3 witn les_id -%s- and #Analysis -%d- CALLER %s", areal.getPr_key(), numA, routine);
                    log.debug(logmess);
                    logmess = String.format("CALLING getLESset in  Sillib.java. SECOND BLOCK IFSB_3 witn addLem -%s- and BY_KEY and #Analysis -%d- CALLER %s", add_lem, numA, routine);
                    log.debug(logmess);

                }
                if (add_lem != null) {
                    if (operationDebug) {
                        logmess = String.format("OPERATIONDEBUG SETTING setFirstListOfTabSpf in -%s-", routine);
                        log.debug(logmess);

                    }
                    tabsLessario = tablessarioq.getLESset(add_lem, BY_KEY);
//                    if (operationDebug) {
//                        logmess = String.format("OPERATIONDEBUG SETTING setFirstListOfTabSpf in -%s-", routine);
//                        log.debug(logmess);
//
//                    }
                    for (Iterator<TabLessario> TabLESit = tabsLessario.iterator(); TabLESit.hasNext();) {
                        areal_add = TabLESit.next();
                        /* ATTENTION: only one row or null*/

                        travellingtables.setCopiedLessario(areal_add);

                        if (callerDebug) {
                            logmess = String.format("CALLING lemtiz CALLER -%s- in sillib.c SECOND BLOCK IFSB_3 witn areal_add.les_id -%s- as copiedLessario and LEMMA_AGG and #Analysis -%d-", routine, areal_add.getPr_key(), numA);
                            log.debug(logmess);
                        }
                        response = lemtiz(response, travellingtables, travellingqueries, LEMMA_AGG);
                        if (analysisDebug) {
                            logmess = String.format("ANALYSES DEBUG in -%s- after lemtiz in SECOND BLOCK IFSB_3 LOOP  tabLessario add_lem !=null LEMMA_AGG AucepsResponse -%s-", routine, response.toString());
                            log.debug(logmess);

                        }
                        //lemtiz(areal_add, tabLe, LEMMA_AGG);

                    } // rof lessario
                } // null add_lem

            } //END IFSB_3
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java with s.pr_key -%s- II BLOCK IFSB_1", routine, areal.getPr_key());
                log.debug(logmess);
            }
            response.setSil(sil);
            response.setExitInLemtiz(true);

            //System.err.println("GIULIA 3a in LEMTIZ II BLOCK IFSB_1 AS  CA " + cur_analysis.toString() + "-" + numA + "-");
            //System.err.println("GIULIA 3b in LEMTIZ II BLOCK IFSB_1 AS LOS " + analyses.getListOfAnalysis() + "-" + numA + "-");
            //System.err.println("GIULIA 3c in LEMTIZ II BLOCK IFSB_1 AS RES " + response.toString() + "-" + numA + "-");
            return response;

        } else // else if second block IFSB_2 (ELSESB_2)
        {
            if (areal.getCodles().compareTo("fe") != 0) { //if areal->codles, "fe" IFSB_4
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s strcmp(areal->codles, fe) THEY ARE DIFFERENT OK IFSB_4", routine);
                    log.debug(logmess);
                }
                if (sil.getIsLE() == 1) { // sil.isLE is true if=1 isLE IFSB_5
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****CHECKED in %s sil.isLE -%d- OK (1) IFSB_5", routine, sil.getIsLE());
                        log.debug(logmess);
                        logmess = String.format("DEEPFLOW ****COPYING in %s getLE -%s- on sil.lemma -%s-",
                                routine, tabLe.getLE_LEMMA(), sil.getLemma());
                        log.debug(logmess);
                        logmess = String.format("DEEPFLOW ****COPYING in %s areal.codles -%s- on sil.codice -%s-",
                                routine, areal.getCodles(), sil.getCodice());
                        log.debug(logmess);
                    }
                    sil.setLemma(tabLe.getLE_LEMMA());
                    sil.setCodice(areal.getCodles());
                    response.setSil(sil);
                    if (deepFlowDebug) {

                        logmess = String.format("DEEPFLOW ****COPIED in %s getLE -%s- on sil.lemma -%s-",
                                routine, tabLe.getLE_LEMMA(), sil.getLemma());
                        log.debug(logmess);
                        logmess = String.format("DEEPFLOW ****COPIED in %s areal.codles -%s- on sil.codice -%s-",
                                routine, areal.getCodles(), sil.getCodice());
                        log.debug(logmess);
                    }
                    if (analysisDebug) {
                        logmess = String.format("ANALYSES DEBUG in -%s- IFSB_5 AucepsResponse -%s-", routine, response.toString());
                        log.debug(logmess);

                    }

                } else { //ELSESB_5
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****CHECKED in %s sil.isLE -%d- KO (0) ELSESB_5", routine, sil.getIsLE());
                        log.debug(logmess);
                        logmess = String.format("DEEPFLOW ****COPYING in %s areal.les -%s- on sil.lemma -%s-",
                                routine, areal.getLes(), sil.getLemma());
                        log.debug(logmess);
                        logmess = String.format("DEEPFLOW ****COPYING in %s areal.codles -%s- on sil.codice -%s-",
                                routine, areal.getCodles(), sil.getCodice());
                        log.debug(logmess);
                    }
                    sil.setLemma(areal.getLes());
                    sil.setCodice(areal.getCodles());
                    response.setSil(sil);
                    if (deepFlowDebug) {

                        logmess = String.format("DEEPFLOW ****COPIED in %s areal.les -%s- on sil.lemma -%s-",
                                routine, areal.getLes(), sil.getLemma());
                        log.debug(logmess);
                        logmess = String.format("DEEPFLOW ****COPIED in %s areal.codles -%s- on sil.codice -%s-",
                                routine, areal.getCodles(), sil.getCodice());
                        log.debug(logmess);
                    }
                    if (analysisDebug) {
                        logmess = String.format("ANALYSES DEBUG in -%s- ELSESB_5 AucepsResponse -%s-", routine, response.toString());
                        log.debug(logmess);

                    }

                    if (callerDebug) {
                        logmess = String.format("CALLING build_lemma CALLER -%s- in LemmaEnding.java SECOND BLOCK ELSESB_5 with sil.lemma-%s- sil.codice -%s- sil.lemma -%s- and #Analysis -%d-);",
                                routine, sil.getLemma(), sil.getCodice(), sil.getLemma(), numA);
                        log.debug(logmess);
                    }

                    tablemmaendingq.getBuildLemmaSet(sil.getLemma(), sil.getCodice());
                    sil.setLemma(tablemmaendingq.build_lemma());
                    response.setSil(sil);
                    if (analysisDebug) {
                        logmess = String.format("ANALYSES DEBUG in -%s- ELSESB_5 after build_lemma AucepsResponse -%s-", routine, response.toString());
                        log.debug(logmess);

                    }

                } // end isLE IFSB_5

                if (callerDebug) {
                    logmess = String.format("CALLING set_codlem3eagles in  Sillib.java and #Analysis -%d-. CALLER %s", numA, routine);
                    log.debug(logmess);
                }
                //System.err.println("MARONNA X0PLB4SC3E" + response + "-" + numA + "-");
                response = set_codlem3eagles(response, travellingtables, travellingqueries, "");
                if (analysisDebug) {
                    logmess = String.format("ANALYSES DEBUG in -%s- IFSB_4 after set_codlem3eagles AucepsResponse -%s-", routine, response.toString());
                    log.debug(logmess);

                }
                //System.err.println("MARONNA X0PLASC3E" + response + "-" + numA + "-");

                if (callerDebug) {
                    logmess = String.format("CALLING pushLemma in  Sillib.java and #Analysis -%d-. CALLER %s", numA, routine);
                    log.debug(logmess);
                }
                /* RDG*/
                travellingtables.setCopiedLessario(areal);
                /* set areal as copiedlessario */

                response = pushLemma(response, travellingtables, travellingqueries, lem_type);
                if (analysisDebug) {
                    logmess = String.format("ANALYSES DEBUG in -%s- IFSB_4 after pushLemma AucepsResponse -%s-", routine, response.toString());
                    log.debug(logmess);

                }
                //pushLemma(areal, lem_type);
                if (flowDebug || deepFlowDebug) {
                    logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java with s.pr_key -%s- II BLOCK IFSB_4", routine, areal.getPr_key());
                    log.debug(logmess);
                }
                response.setSil(sil);
                response.setExitInLemtiz(true);

                //System.err.println("GIULIA 3a in LEMTIZ II BLOCK IFSB_4   CA " + cur_analysis.toString() + "-" + numA + "-");
                //System.err.println("GIULIA 3b in LEMTIZ II BLOCK IFSB_4  LOS " + analyses.getListOfAnalysis() + "-" + numA + "-");
                //System.err.println("GIULIA 3c in LEMTIZ II BLOCK IFSB_4  RES " + response.toString() + "-" + numA + "-");
                return response;

            }//end if areal->codles, "fe" IFSB_4 // end if second block IFSB_2
        }
        /* END SECOND BLOCK */
        //response.setSil(sil);
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java with s.pr_key -%s- III BLOCK", routine, areal.getPr_key());
            log.debug(logmess);
        }
        response.setExitInLemtiz(false);

        //System.err.println("GIULIA 3a in LEMTIZ III BLOCK  CA " + cur_analysis.toString() + "-" + numA + "-");
        //System.err.println("GIULIA 3b in LEMTIZ III BLOCK LOS " + analyses.getListOfAnalysis() + "-" + numA + "-");
        //System.err.println("GIULIA 3c in LEMTIZ III BLOCK RES " + response.toString() + "-" + numA + "-");
        //response.getAnalyses().setNumAnalysis((short) (numA + 1));
        return response;
    } // end lmtiz

    public AucepsResponse set_codlem3eagles(AucepsResponse response, TravellingTables travellingtables, TravellingQueries travellingqueries, String codice) {
        SilType sil = response.getSil();
        String routine = CLASS_NAME + "/set_codlem3eagles";
        String logmess = "";

        // tables
        TabLessario areal = travellingtables.getCopiedLessario();
        List<Tab3Eagles> tabs3e = travellingtables.getListOfTab3Eagles();

        // queries
        TabEaglesQuery tab3eq = travellingqueries.getTab3eq();
        tab3eq.setConn(travellingqueries.getConn());

        // for debug
        int numA = response.getAnalyses().getNumAnalysis();
        //System.err.println("MARONNA X0SC3EI " + response + "-" + numA + "-");
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java with s.pr_key -%s- and codice -%s- and #Analysis -%d-", routine, areal.getPr_key(), codice, numA);
            log.debug(logmess);
        }
        if (areal.getCodlem().compareTo("") != 0) { // if areal->codlem IF1c
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s areal.codlem !=''  OK IF1", routine, areal.getLem());
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****ASSIGNING in %s areal.codlem -%s- to sil.codice -%s-", routine, areal.getCodlem(), sil.getCodice());
                log.debug(logmess);
            }
            sil.setCodice(areal.getCodlem());
            codice = sil.getCodice();
            if (deepFlowDebug) {

                logmess = String.format("DEEPFLOW ****ASSIGNED in %s areal.codlem -%s- to sil.codice -%s-", routine, areal.getCodlem(), sil.getCodice());
                log.debug(logmess);
            }

            if (callerDebug || deepFlowDebug) {
                logmess = String.format("CALLING get3EaglesSet cod2search=-%s- CALLER %s and BY_CODLEM", codice, routine);
                log.debug(logmess);
            }
            if (deepFlowDebug) {

                logmess = String.format("DEEPFLOW ****ASSIGNING in %s eagles codes  to sil.eagles codes", routine);
                log.debug(logmess);
            }
            //System.err.println("MARONNA X0SC3EI a " + response + "-" + numA + "-");
            tabs3e = tab3eq.get3EaglesSet(codice, BY_CODLEM);
            travellingtables.setListOfTab3Eagles(tabs3e);

            String[] codes = sil.getEagles3();
            Tab3Eagles tab3e = tabs3e.iterator().next();
            travellingtables.setTab3e(tab3e);

            codes[0] = tab3e.getC01();
            codes[1] = tab3e.getC02();
            codes[2] = tab3e.getC03();
            sil.setEagles3(codes);
            setTravellingtables(travellingtables);
            response.setSil(sil);
            //System.err.println("MARONNA X0SC3EI b " + response + "-" + numA + "-");

            if (deepFlowDebug) {

                logmess = String.format("DEEPFLOW ****ASSIGNED in %s eagles codes  to sil.eagles codes", routine);
                log.debug(logmess);
            }

        } else {// if areal->codlem ELSE1

            if (codice.compareTo("") != 0) { //IF2

                if (callerDebug) {
                    logmess = String.format("CALLING get3EaglesSet cod2search=-%s- CALLER %s and BY_CODLES IF2 and #Analysis -%d-", codice, routine, numA);
                    log.debug(logmess);
                }
                //System.err.println("MARONNA X0SC3EI c " + response + "-" + numA + "-");

            } else { //else IF2 ELSE2
                codice = areal.getCodles();
                if (callerDebug) {
                    logmess = String.format("CALLING get3EaglesSet cod2search(areal)=-%s- CALLER %s and BY_CODLES ELSE IF2 and #Analysis -%d-", codice, routine, numA);
                    log.debug(logmess);
                }
                //System.err.println("MARONNA X0SC3EI d " + response + "-" + numA + "-");

            }
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****ASSIGNING in %s eagles codlem  to sil.codlem and #Analysis -%d-", routine, numA);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****ASSIGNING in %s eagles codes  to sil.eagles codes and #Analysis -%d-", routine, numA);
                log.debug(logmess);
            }
            //System.err.println("MARONNA X0SC3EI e " + response + "-" + numA + "-");
            tabs3e = tab3eq.get3EaglesSet(codice, BY_CODLES);
            travellingtables.setListOfTab3Eagles(tabs3e);
            //System.err.println("MARONNA X0SC3EI e1 " + response + "-" + numA + "-");

            String[] codes = new String[3];// = sil.getEagles3();
            //System.err.println("MARONNA X0SC3EI e2 " + response + "-" + numA + "-");
            String eCodLem;
            Tab3Eagles tab3e = tabs3e.iterator().next();
            //System.err.println("MARONNA X0SC3EI e31 " + response + "-" + numA + "-");
            travellingtables.setTab3e(tab3e);
            //System.err.println("MARONNA X0SC3EI e32 " + response + "-" + numA + "-");
            eCodLem = tab3e.getCodLem();
            //System.err.println("MARONNA X0SC3EI e33 " + response + "-" + numA + "-");
            codes[0] = tab3e.getC01();
            //System.err.println("MARONNA X0SC3EI e33a " + response + "-" + numA + "-");
            codes[1] = tab3e.getC02();
            //System.err.println("MARONNA X0SC3EI e33b " + response + "-" + numA + "-");
            codes[2] = tab3e.getC03();
            //System.err.println("MARONNA X0SC3EI e33c " + response + "-" + numA + "-");
            //System.err.println("MARONNA X0SC3EI e3 " + response + "-" + numA + "-");
            sil.setCodice(eCodLem);
            sil.setEagles3(codes);
            //System.err.println("MARONNA X0SC3EI e4 " + response + "-" + numA + "-");
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****ASSIGNED in %s eagles codlem -%s- to sil.codice -%s- and #Analysis -%d-", routine, eCodLem, sil.getCodice(), numA);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****ASSIGNED in %s eagles codes  to sil.eagles codes and #Analysis -%d-", routine, numA);
                log.debug(logmess);
            }
            response.setSil(sil);
            setTravellingtables(travellingtables);
            //System.err.println("MARONNA X0SC3EI f " + response + "-" + numA + "-");
        }
        if (areal.getType() != null && !areal.getType().equals("")) {
            String[] codes = sil.getEagles3();
            codes[1] = areal.getType();
            sil.setEagles3(codes);
        }
        response.setSil(sil);
        //System.err.println("MARONNA X0SC3EI g " + response + "-" + numA + "-");
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java with s.pr_key -%s- and codice -%s- and #Analysis -%d-", routine, areal.getPr_key(), codice, numA);
            log.debug(logmess);
        }
        setTravellingtables(travellingtables);
        //System.err.println("MARONNA X0SC3E0" + response + "-" + numA + "-");
        return response;
    } // end set_codlem3eagles

    public AucepsResponse lemv(AucepsResponse response, TravellingTables travellingtables, TravellingQueries travellingqueries, LEM_TYPE lem_type) {
        String routine = CLASS_NAME + "/lemv";
        String logmess = "";
        SilType sil = response.getSil();
        TabLessario areavs = travellingtables.getTabLessario();
        /* the original lessario */

        TabLessario areal = travellingtables.getCopiedLessario();

        //queries
        TabLessarioQuery tablessarioq = travellingqueries.getTablessarioq();
        tablessarioq.setConn(travellingqueries.getConn());

        /* TABS LESSARIO */
        List<TabLessario> tabsLessario = travellingtables.getListOfTabLessario();

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java with s.pr_key -%s-", routine, areal.getPr_key());
            log.debug(logmess);
        }

        if (("v".equals(areavs.getClem())) || ("k".equals(areavs.getClem()))) {
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s areal.clem==v Or k -%s- OK", routine, areal.getClem());
                log.debug(logmess);

            }
            response.setExitInLemv(true);
            return response;
        } else if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHECKED in %s areal.clem==v Or k -%s- KO", routine, areal.getClem());
            log.debug(logmess);

        }
        /* loop over lessario */
        if (callerDebug) {
            logmess = String.format("CALLING getLESset with parameters n_id: -%s- CALLER %s ", areavs.getN_id(), routine);
            log.debug(logmess);
        }
        tabsLessario = tablessarioq.getLESset(areavs.getN_id(), BY_CLEM);
        if (operationDebug) {
            logmess = String.format("OPERATIONDEBUG SETTING setListOfTabLessario in -%s-", routine);
            log.debug(logmess);

        }
        travellingtables.setListOfTabLessario(tabsLessario);
        //for (Iterator<TabLessario> TabLESit = tabsLessario.iterator(); TabLESit.hasNext();)
        for (TabLessario tabLessario : tabsLessario) {
            //tabLessario = TabLESit.next(); /* ATTENTION: only one row or null*/
            /*TO CHECK areal=tablessario??*/

            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING setTabLessario in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 8 in -%s-", routine);
                log.debug(logmess);

            }
            /*RDG
            was areal=tabLessario
             */
            travellingtables.setTabLessario(areavs);
            /* set areavs as tabLessario */
            travellingtables.setStatus("8");

            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING setCopiedTabLessario in -%s-", routine);
                log.debug(logmess);

            }
            areal = tabLessario;
            travellingtables.setCopiedLessario(tabLessario);

            if ((areavs.getLes().compareTo(areal.getLes()) != 0) || (areavs.getCodles().compareTo(areal.getCodles()) != 0)) {
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s areavs.les -%s- and areavs.codles -%s- with areal.les -%s- and areal.codles -%s-",
                            routine,
                            areavs.getLes(), areavs.getCodles(),
                            areal.getLes(), areal.getCodles());
                    log.debug(logmess);

                }
                if (callerDebug) {
                    logmess = String.format("CALLING lemtiz CALLER -%s- in sillib.c SECOND BLOCK IFSB_3 witn areal.les_id -%s-", routine, areal.getPr_key());
                    log.debug(logmess);
                }
                response = lemtiz(response, travellingtables, travellingqueries, lem_type);

                //System.err.println("GIULIA 4 in LEMV  AS " + response.getAnalyses().toString() + "-" + response.getAnalyses().getNumAnalysis() + "-");
                //System.err.println("GIULIA 4 in LEMV  CA " + response.getCur_analysis().toString() + "-" + response.getAnalyses().getNumAnalysis() + "-");
                //lemtiz(areal, tabLe, lem_type);
            }

        } //rof lessario
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java with s.pr_key -%s-", routine, areal.getPr_key());
            log.debug(logmess);
        }

        setTravellingtables(travellingtables);
        response.setExitInLemv(false);

        return response;

    } // end lemv

    public AucepsResponse pushLemma(AucepsResponse response, TravellingTables travellingtables, TravellingQueries travellingqueries, LEM_TYPE lem_type) {
        String routine = CLASS_NAME + "/pushLemma";
        String logmess = "";

        SilType sil = response.getSil();
        //System.err.println("MARONNA PLI " + response.toString());

        // Analyses
        Analyses analyses = response.getAnalyses();
        int numA = analyses.getNumAnalysis();
        //Analysis cur_analysis = new Analysis();
        Analysis cur_analysis = response.getCur_analysis();

        //tables
        TabLessario areavs = travellingtables.getTabLessario();
        /* the original lessario */

        TabLessario areal = travellingtables.getCopiedLessario();
        /* the copied lessario */

        // lists
        List<TabCodLE> tabsCodLE = travellingtables.getListOfTabCodLe();
        List<TabSFCodMorSet> tabsSfCodMorSet = travellingtables.getListOfTabSFCodMorSet();
        List<TabFE3CodSet> tabsFe3CodSet = travellingtables.getListOfTabFE3CodSet();
        List<TabFECodMorSet> tabsFeCodMorSet = travellingtables.getListOfTabFECodMorSet();

        List<String> codes = addElemToList();
        /*RDG*/
        String codLE
                = //areal.getCodLE();
                travellingtables.getTabLe().getLE_CODLE(); /* get the codle from table */
        int n_cod_morf = 0;

        //System.err.println("MARONNA X0  CURRENT LEMMA " + response.getSil().getLemma() + " CURRENT SIL " + sil);
        // queries
        TabCodLeQuery tabcodleq = travellingqueries.getTabcodleq();
        tabcodleq.setConn(travellingqueries.getConn());

        TabSfQuery tabsfq = travellingqueries.getTabsfq();
        tabsfq.setConn(travellingqueries.getConn());

        TabFEQuery tabfeq = travellingqueries.getTabfeq();
        tabfeq.setConn(travellingqueries.getConn());

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in -%s- with s.pr_key -%s- and lem_type -%s- #Analysis -%d- for lemma -%s- and areavs.codles -%s-", routine, CLASS_NAME, areal.getPr_key(), lem_type.toString(), numA, response.getSil().getLemma(), areavs.getCodles());
            log.debug(logmess);
        }
        if (analysisDebug) {
            logmess = String.format("ANALYSES DEBUG in -%s- lem_type -%s- AucepsResponse -%s-", routine, lem_type.toString(), response.toString());
            log.debug(logmess);

        }

        switch (lem_type) {
            case IPOLEMMA:
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****COMPARING areavs.codles -%s- -> IF1", areavs.getCodles());
                    log.debug(logmess);
                }
                /*areavs.codles IS DIFFERENT from any value in codes*/
                if (!codes.contains(areavs.getCodles())) { //IF1
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****COMPARED areavs.codles -%s- -> IF1", areavs.getCodles());
                        log.debug(logmess);
                    }
                    if (callerDebug) {
                        logmess = String.format("CALLING newAnalysis. CALLER %s  with IPOLEMMA and IF1 and #Analysis -%d-", routine, numA);
                        log.debug(logmess);
                    }

                    response = runanalyses.newAnalysis(response);
                    if (analysisDebug) {
                        logmess = String.format("ANALYSES DEBUG in -%s- after runanalyses.newAnalysis IPOLEMMA IF1 AucepsResponse -%s-", routine, response.toString());
                        log.debug(logmess);

                    }
                    cur_analysis = response.getCur_analysis();

                    sil = response.getSil();
                    if (sil.getIsLE() == 1) {
                        if (deepFlowDebug) {
                            logmess = String.format("DEEPFLOW ****CHECKED in %s sil.isLE -%d-", routine, sil.getIsLE());
                            log.debug(logmess);

                        }

                        if (callerDebug || deepFlowDebug) {
                            logmess = String.format("CALLING getCodLEset in TabCodLEQuery.java with parameter: codLE -%s- and #Analysis -%d-. CALLER %s", codLE, numA, routine);
                            log.debug(logmess);

                        }

                        tabsCodLE = tabcodleq.getCodLEset(codLE);
                        if (operationDebug) {
                            logmess = String.format("OPERATIONDEBUG SETTING setListOfTabCodLe in -%s-", routine);
                            log.debug(logmess);

                        }
                        travellingtables.setListOfTabCodLe(tabsCodLE);
                        int codle = 0;

                        for (TabCodLE tabCodLE : tabsCodLE) { // getCod_morf_setLE
                            //for (Iterator<TabCodLE> TabCodLEit = tabsCodLE.iterator(); TabCodLEit.hasNext();) {
                            if (operationDebug) {
                                logmess = String.format("OPERATIONDEBUG SETTING setTabCodLe in -%s-", routine);
                                log.debug(logmess);
                                logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 7 in -%s-", routine);
                                log.debug(logmess);

                            }

                            travellingtables.setStatus("7");
                            travellingtables.setTabCodLe(tabCodLE);

                            if (deepFlowDebug) {
                                logmess = String.format("DEEPFLOW LOOP CODLE. Counters codle -%d- isanyCODLE -%s-", codle, travellingtables.isIsanyCodle());
                                log.debug(logmess);
                            }
                            /*
                             if (deepFlowDebug)
                             printf("        ****(MEM)COPYING 7 of getCod_morf() to curAnalysis->cod_morf_4_10[curAnalysis->n_cod_morf] -> IF1 and sil.isLE OK\n");
                             memcpy(curAnalysis->cod_morf_4_10[curAnalysis->n_cod_morf], (char*) getCod_morf(), 7);*/
                            n_cod_morf = cur_analysis.getN_cod_morf();
                            if (deepFlowDebug) {
                                logmess = String.format("DEEPFLOW ****COPYING codes -%s- on curAnalysis->n_cod_morf -%s- at position n_cod_morf -%d-", tabCodLE.getCodes(), Arrays.toString(cur_analysis.getCod_morf_4_10()), n_cod_morf);
                                log.debug(logmess);
                            }

                            cur_analysis.getCod_morf_4_10()[n_cod_morf] = tabCodLE.getCodes();

                            n_cod_morf++;
                            cur_analysis.setN_cod_morf((short) n_cod_morf);
                        } //rof getCod_morf_setLE
                        setTravellingtables(travellingtables);
                        response.setCur_analysis(cur_analysis);
                        if (analysisDebug) {
                            logmess = String.format("ANALYSES DEBUG in -%s- after getCod_morf_setLE and islE=1 IPOLEMMA IF1 AucepsResponse -%s-", routine, response.toString());
                            log.debug(logmess);

                        }

                        //setSil(sil);
                    } else { //isLE=0
                        if (deepFlowDebug) {
                            logmess = String.format("DEEPFLOW ****CHECKED in %s sil.isLE -%d-", routine, sil.getIsLE());
                            log.debug(logmess);

                        }
                        if (callerDebug || deepFlowDebug) {
                            logmess = String.format("CALLING getCod_morf_set in TabSfQuery.java with parameter: "
                                    + "codLES -%s- "
                                    + "and segment -%s- "
                                    + "and cod_noseg -%s- and gen -%s- and pt -%s- and #Analysis -%d-. CALLER %s", areal.getCodles(),
                                    sil.getSegment()[4], areal.getCodLE(), areal.getGen(), 'x',
                                    numA,
                                    routine);
                            log.debug(logmess);

                        }
                        /*a->codles, a->gen,
                         a->cod_noseg, a->pt == 'x');*/
                        // TO DO getCod_morf_set
                        //System.err.println("MARONNA X0PL " + response.toString());
                        //System.err.println("MARONNA X0PL  CURRENT LEMMA " + response.getSil().getLemma() + " CURRENT SIL " + sil);
                        tabsSfCodMorSet = tabsfq.getSFCod_morf_set(travellingtables, sil.getSegment()[4]); //getCod_morf_set
                        if (operationDebug) {
                            logmess = String.format("OPERATIONDEBUG SETTING setListOfTabSFCodMorSet in -%s-", routine);
                            log.debug(logmess);

                        }
                        travellingtables.setListOfTabSFCodMorSet(tabsSfCodMorSet);
                        for (TabSFCodMorSet tabCodSfMorSet : tabsSfCodMorSet) {
                            if (operationDebug) {
                                logmess = String.format("OPERATIONDEBUG SETTING setTabSFCodMorSet in -%s-", routine);
                                log.debug(logmess);
                                logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 9 in -%s-", routine);
                                log.debug(logmess);

                            }

                            travellingtables.setStatus("9");
                            travellingtables.setTabSFCodMorSet(tabCodSfMorSet);

                            n_cod_morf = cur_analysis.getN_cod_morf();

                            String[] tempcodes = cur_analysis.getCod_morf_4_10();
                            //System.err.println("ZZZZZZZZZZZZZ 1a " + n_cod_morf + " " + Arrays.toString(tempcodes));
                            //System.err.println("ZZZZZZZZZZZZZ 1b " + cur_analysis.getLemmas() + " " + Arrays.toString(tempcodes));
                            tempcodes[n_cod_morf] = tabCodSfMorSet.getCodes();
                            cur_analysis.setCod_morf_4_10(tempcodes);
                            //cur_analysis.getCod_morf_4_10()[n_cod_morf] = tabCodSfMorSet.getCodes();

                            n_cod_morf++;
                            cur_analysis.setN_cod_morf((short) n_cod_morf);
                            //System.err.println("ZZZZZZZZZZZZZ 2 " + n_cod_morf + " " + Arrays.toString(cur_analysis.getCod_morf_4_10()));

                            //System.err.println("MARONNA X0PLAGCMS " + response.toString());
                            //System.err.println("MARONNA X0PLAGCMS  CURRENT LEMMA " + response.getSil().getLemma() + " CURRENT SIL " + sil);
                        } // rof tabsSfCodMorSet
                        setTravellingtables(travellingtables);
                        response.setCur_analysis(cur_analysis);
                        if (analysisDebug) {
                            logmess = String.format("ANALYSES DEBUG in -%s- after getSFCod_morf_set and islE=0 IPOLEMMA IF1 AucepsResponse -%s-", routine, response.toString());
                            log.debug(logmess);

                        }

                    } // end isLE=0

                    travellingtables = getTravellingtables();
                    if (callerDebug || deepFlowDebug) {
                        logmess = String.format("CALLING newLemma in %s with tabFe3CodSet NULL and lem_type -%s- and #Analysis -%d- CALLER %s", CLASS_NAME, lem_type.toString(), numA, routine);
                        log.debug(logmess);

                    }

                    response = newLemma(response, travellingtables, cur_analysis, lem_type, null);
                    if (analysisDebug) {
                        logmess = String.format("ANALYSES DEBUG in -%s- after newLemma IPOLEMMA IF1 AucepsResponse -%s-", routine, response.toString());
                        log.debug(logmess);

                    }
                    // if needed get the new runanalyses
                } else {//ELSE IF

                    if (callerDebug || deepFlowDebug) {
                        logmess = String.format("CALLING get3Code_set_fe in TabFEQuery.java with parameter: "
                                + "areavs pk -%s- and #Analysis -%d-. CALLER %s", areavs.getPr_key(), numA, routine);
                        log.debug(logmess);

                    }
                    //System.err.println("ESTICAXXI 1"+C03);
                    tabsFe3CodSet = tabfeq.get3Code_set_fe(areavs.getPr_key());
                    if (operationDebug) {
                        logmess = String.format("OPERATIONDEBUG SETTING setListOfTabFECodSet in -%s-", routine);
                        log.debug(logmess);

                    }
                    travellingtables.setListOfTabFE3CodSet(tabsFe3CodSet);
                    // loop over tabsFeCodSet
                    for (TabFE3CodSet tabFe3CodSet : tabsFe3CodSet) {
                        if (operationDebug) {
                            logmess = String.format("OPERATIONDEBUG SETTING setTabSFCodMorSet in -%s-", routine);
                            log.debug(logmess);
                            logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 10 in -%s-", routine);
                            log.debug(logmess);

                        }

                        travellingtables.setStatus("10");
                        travellingtables.setTabFe3CodSet(tabFe3CodSet);

                        if (callerDebug) {
                            logmess = String.format("CALLING newAnalysis. CALLER %s  with IPOLEMMA and ELSE IF1 and #Analysis -%d-", routine, numA);
                            log.debug(logmess);
                        }

                        response = runanalyses.newAnalysis(response);
                        cur_analysis = response.getCur_analysis();
                        if (analysisDebug) {
                            logmess = String.format("ANALYSES DEBUG in -%s- after runanalyses.newAnalysis IPOLEMMA ELSE1 AucepsResponse -%s-", routine, response.toString());
                            log.debug(logmess);

                        }
                        // response.setSil(sil);
                        //sil = response.getSil();
                        if (callerDebug || deepFlowDebug) {
                            logmess = String.format("CALLING getCod_morf_set_fe in TabFEQuery.java with parameter: "
                                    + "areavs pk -%s- and tabfe3codes.codes -%s- and #Analysis -%d-. CALLER %s", areavs.getPr_key(), tabFe3CodSet.getCodes(), numA, routine);
                            log.debug(logmess);

                        }
                        tabsFeCodMorSet = tabfeq.getCod_morf_set_fe(travellingtables, areavs.getPr_key());
                        if (operationDebug) {
                            logmess = String.format("OPERATIONDEBUG SETTING setListOfTabFECodMorSet in -%s-", routine);
                            log.debug(logmess);

                        }
                        travellingtables.setListOfTabFECodMorSet(tabsFeCodMorSet);
                        for (TabFECodMorSet tabFeCodMorSet : tabsFeCodMorSet) {
                            if (operationDebug) {
                                logmess = String.format("OPERATIONDEBUG SETTING setTabSFCodMorSet in -%s-", routine);
                                log.debug(logmess);
                                logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 11 in -%s-", routine);
                                log.debug(logmess);

                            }

                            travellingtables.setStatus("11");
                            travellingtables.setTabFeCodMorSet(tabFeCodMorSet);

                            if (deepFlowDebug) {
                                logmess = String.format("DEEPFLOW ****COPYING codes -%s- on curAnalysis->n_cod_morf -%s- at position n_cod_morf -%s-", tabFeCodMorSet.getCodes(), Arrays.toString(cur_analysis.getCod_morf_4_10()), n_cod_morf);
                                log.debug(logmess);
                            }
                            n_cod_morf = cur_analysis.getN_cod_morf();
                            cur_analysis.getCod_morf_4_10()[n_cod_morf] = tabFeCodMorSet.getCodes();

                            n_cod_morf++;
                            cur_analysis.setN_cod_morf((short) n_cod_morf);
                        } //rof getCod_morf_set_fe
                        // new lemma with tabFe3CodSet not null
                        travellingtables = getTravellingtables();
                        response.setCur_analysis(cur_analysis);

                        if (analysisDebug) {
                            logmess = String.format("ANALYSES DEBUG in -%s- after tabfeq.getCod_morf_set_fe IPOLEMMA ELSE1 AucepsResponse -%s-", routine, response.toString());
                            log.debug(logmess);

                        }

                        //sil = getSil();
                        if (callerDebug || deepFlowDebug) {
                            logmess = String.format("CALLING newLemma in Sillib.java with tabFe3CodSet NOT NULL (codes -%s-) and lem_type -%s- and #Analysis -%d-  CALLER %s", tabFe3CodSet.getCodes(), lem_type.toString(), numA, routine);
                            log.debug(logmess);

                        }

                        response = newLemma(response, travellingtables, cur_analysis, lem_type, tabFe3CodSet);
                        if (analysisDebug) {
                            logmess = String.format("ANALYSES DEBUG in -%s- after newLemma IPOLEMMA ELSE1 AucepsResponse -%s-", routine, response.toString());
                            log.debug(logmess);

                        }
                    } // rof tabsFe3CodSet

                } //END IF1
                break;
            case IPERLEMMA:
            case IPERLEMMA_INT:
                if (!codes.contains(areavs.getCodles())) { //IF2
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****COMPARED areavs.codles -%s- -> IF1", areavs.getCodles());
                        log.debug(logmess);
                    }
                    if (callerDebug || deepFlowDebug) {
                        logmess = String.format("CALLING newLemma in Sillib.java with tabFe3CodSet NULL and lem_type -%s- and #Analysis -%d- CALLER %s", lem_type.toString(), numA, routine);
                        log.debug(logmess);

                    }
                    ////System.err.println("MARONNA X1 " + response.toString());
                    response = newLemma(response, travellingtables, cur_analysis, lem_type, null);
                    if (analysisDebug) {
                        logmess = String.format("ANALYSES DEBUG in -%s- after newLemma lem_type -%s- IF2 AucepsResponse -%s-", routine,
                                lem_type.toString(), response.toString());
                        log.debug(logmess);

                    }

                } else {// ELSE IF2
                    if (callerDebug || deepFlowDebug) {
                        logmess = String.format("CALLING get3Code_set_fe in TabFEQuery.java with parameter: "
                                + "areavs pk -%s- and #Analysis -%d-. CALLER %s", areavs.getPr_key(), numA, routine);
                        log.debug(logmess);

                    }
                    tabsFe3CodSet = tabfeq.get3Code_set_fe(areavs.getPr_key());
                    if (operationDebug) {
                        logmess = String.format("OPERATIONDEBUG SETTING setListOfTabFECodSet in -%s-", routine);
                        log.debug(logmess);

                    }
                    travellingtables.setListOfTabFE3CodSet(tabsFe3CodSet);
                    for (TabFE3CodSet tabFe3CodSet : tabsFe3CodSet) {
                        if (operationDebug) {
                            logmess = String.format("OPERATIONDEBUG SETTING setTabSFCodMorSet in -%s-", routine);
                            log.debug(logmess);
                            logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 10 in -%s-", routine);
                            log.debug(logmess);

                        }

                        travellingtables.setStatus("10");
                        travellingtables.setTabFe3CodSet(tabFe3CodSet);
                        // new lemma with tabFe3CodSet not null
                        travellingtables = getTravellingtables();
                        //sil = getSil();
                        if (callerDebug || deepFlowDebug) {
                            logmess = String.format("CALLING newLemma in Sillib.java with tabFe3CodSet NOT NULL (codes -%s-) and lem_type -%s- and #Analysis -%d-  CALLER %s", tabFe3CodSet.getCodes(), lem_type.toString(), numA, routine);
                            log.debug(logmess);

                        }

                        response = newLemma(response, travellingtables, cur_analysis, lem_type, tabFe3CodSet);
                        if (analysisDebug) {
                            logmess = String.format("ANALYSES DEBUG in -%s- after newLemma lem_type -%s- ELSE2 AucepsResponse -%s-", routine,
                                    lem_type.toString(), response.toString());
                            log.debug(logmess);

                        }

                    } // rof tabsFe3CodSet
                }
                break;
            case LEMMA_AGG:
                // AS ABOVE??//
                if (!codes.contains(areavs.getCodles())) { //IF3
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****COMPARED areavs.codles -%s- -> IF1", areavs.getCodles());
                        log.debug(logmess);
                    }
                    if (callerDebug || deepFlowDebug) {
                        logmess = String.format("CALLING newLemma in Sillib.java with tabFe3CodSet NULL and lem_type -%s- and #Analysis -%d- CALLER %s", lem_type.toString(), numA, routine);
                        log.debug(logmess);

                    }

                    response = newLemma(response, travellingtables, cur_analysis, lem_type, null);
                    if (analysisDebug) {
                        logmess = String.format("ANALYSES DEBUG in -%s- after newLemma lem_type -%s- IF3 AucepsResponse -%s-", routine,
                                lem_type.toString(), response.toString());
                        log.debug(logmess);

                    }

                } else {// ELSE IF3
                    if (callerDebug || deepFlowDebug) {
                        logmess = String.format("CALLING get3Code_set_fe in TabFEQuery.java with parameter: "
                                + "areavs pk -%s- and #Anaysis -%d-. CALLER %s", areavs.getPr_key(), numA, routine);
                        log.debug(logmess);

                    }
                    tabsFe3CodSet = tabfeq.get3Code_set_fe(areavs.getPr_key());
                    if (operationDebug) {
                        logmess = String.format("OPERATIONDEBUG SETTING setListOfTabFECodSet in -%s-", routine);
                        log.debug(logmess);

                    }
                    travellingtables.setListOfTabFE3CodSet(tabsFe3CodSet);
                    for (TabFE3CodSet tabFe3CodSet : tabsFe3CodSet) {
                        if (operationDebug) {
                            logmess = String.format("OPERATIONDEBUG SETTING setTabSFCodMorSet in -%s-", routine);
                            log.debug(logmess);
                            logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 10 in -%s-", routine);
                            log.debug(logmess);

                        }

                        travellingtables.setStatus("10");
                        travellingtables.setTabFe3CodSet(tabFe3CodSet);
                        // new lemma with tabFe3CodSet not null
                        travellingtables = getTravellingtables();
                        //sil = getSil();
                        if (callerDebug || deepFlowDebug) {
                            logmess = String.format("CALLING newLemma in Sillib.java with tabFe3CodSet NOT NULL (codes -%s-) and lem_type -%s- and #Analysis -%d- CALLER %s", tabFe3CodSet.getCodes(), lem_type.toString(), numA, routine);
                            log.debug(logmess);

                        }

                        response = newLemma(response, travellingtables, cur_analysis, lem_type, tabFe3CodSet);
                        if (analysisDebug) {
                            logmess = String.format("ANALYSES DEBUG in -%s- after newLemma lem_type -%s- ELSE3 AucepsResponse -%s-", routine,
                                    lem_type.toString(), response.toString());
                            log.debug(logmess);

                        }

                    } // rof tabsFe3CodSet
                }

                break;

        }
        analyses.setNumAnalysis((short) (numA + 1));
        response.setAnalyses(analyses);
        //System.err.println("MARONNA PLO " + response.toString());
        return response;
    } // end pushLemma

    public AucepsResponse newLemma(AucepsResponse response, TravellingTables travellingtables, Analysis cur_analysis, LEM_TYPE lem_type, TabFE3CodSet tabFe3CodSet) {
        String routine = CLASS_NAME + "/newLemma";
        String logmess = "";
        SilType sil = response.getSil();
        TabLessario areal = travellingtables.getCopiedLessario();

        // Lemma
        Lemma curLemma = new Lemma();

        Lemmas lemmas = cur_analysis.getLemmas();
        int numL = lemmas.getNumL();
        List<Lemma> lems = lemmas.getLemmas();
        int numA = response.getAnalyses().getNumAnalysis();
        //System.err.println("MARONNA X0NLI " + response.toString());
        //System.err.println("MARONNA X0NLI  CURRENT LEMMA " + response.getSil().getLemma() + " CURRENT SIL " + sil);

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java with a.pr_key -%s- for #Analysis -%d-", routine, areal.getPr_key(), numA);
            log.debug(logmess);
        }
        //System.err.println("GIULIA 1a NULL in NEWLEMMA LEMMA  " + curLemma.getOut_lemma() + "-" + numA + "-" + Arrays.toString(curLemma.getCod_morf_1_3()));
        //System.err.println("GIULIA 1b NULL in NEWLEMMA LEMMA  " + curLemma.getOut_lemma() + "-" + numA + "-" + Arrays.toString(curLemma.getCod_morf_1_3()));
        //System.err.println("GIULIA 1b1 NULL in NEWLEMMA LEMMA  " + response.toString() + "-" + numA + "-" + lemmas.toString());

        // COPYING //
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING areal.n_id -%s- on curLemma.n_id -%s- ", areal.getN_id(), curLemma.getN_id());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPYING areal.gen -%s- on curLemma.gen -%s- ", areal.getGen(), curLemma.getGen());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPYING areal.codles -%s- on curLemma.codles -%s- ", areal.getCodles(), curLemma.getCodles());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPYING sil.lemma -%s- on curLemma.out_lemma -%s- ", sil.getLemma(), curLemma.getOut_lemma());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPYING sil.codice -%s- on curLemma.cod_lemma -%s- ", sil.getCodice(), curLemma.getCod_lemma());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPYING areal.les_id -%s- on curLemma.les_id -%s- ", areal.getPr_key(), curLemma.getLes_id());
            log.debug(logmess);
            if (tabFe3CodSet == null) {
                logmess = String.format("DEEPFLOW ****COPYING sil.3eagles -%s- on curLemma.Cod_morf_1_3 -%s- ",
                        Arrays.toString(sil.getEagles3()),
                        Arrays.toString(curLemma.getCod_morf_1_3()));
            } else {
                logmess = String.format("DEEPFLOW ****COPYING threecod_fe -%s- on curLemma.Cod_morf_1_3 -%s- ",
                        tabFe3CodSet.getCodes(),
                        Arrays.toString(curLemma.getCod_morf_1_3()));
            }
            log.debug(logmess);
        }
        curLemma.setN_id(areal.getN_id());
        curLemma.setGen(areal.getGen());
        curLemma.setCodles(areal.getCodles());
        curLemma.setOut_lemma(sil.getLemma());
        curLemma.setCod_lemma(sil.getCodice());
        curLemma.setLes_id(Integer.parseInt(areal.getPr_key()));
        curLemma.setType(lem_type);
        if (tabFe3CodSet == null) {
            //System.err.println("GIULIA 2a NULL in NEWLEMMA LEMMA  " + curLemma.getOut_lemma() + "-" + numA + "-" + Arrays.toString(curLemma.getCod_morf_1_3()));
            curLemma.setCod_morf_1_3(sil.getEagles3());
            //System.err.println("GIULIA 2b NULL in NEWLEMMA LEMMA  " + curLemma.getOut_lemma() + "-" + numA + "-" + Arrays.toString(curLemma.getCod_morf_1_3()));
            //System.err.println("GIULIA 2b1 NULL in NEWLEMMA LEMMA  " + response.toString() + "-" + numA + "-" + lemmas.toString());
        } else {
            String[] codes = new String[3];
            codes[0] = tabFe3CodSet.getC01();
            codes[1] = tabFe3CodSet.getC02();
            codes[2] = tabFe3CodSet.getC03();
            //System.err.println("GIULIA 2b NOT NULL in NEWLEMMA LEMMA  " + curLemma.getOut_lemma() + "-" + numA + "-"
            // + Arrays.toString(curLemma.getCod_morf_1_3()));
            curLemma.setCod_morf_1_3(codes);
            //System.err.println("GIULIA 2b NOT NULL in NEWLEMMA LEMMA  " + curLemma.getOut_lemma() + "-" + numA + "-" + Arrays.toString(curLemma.getCod_morf_1_3()));
            //System.err.println("GIULIA 2b1 NOT NULL in NEWLEMMA LEMMA  " + response.toString() + "-" + numA + "-" + lemmas.toString());
        }

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****MANAGED areal.n_id -%s- for lemma -%s- and #Analysis -%d-", areal.getN_id(), curLemma.getOut_lemma(), numA);
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPIED areal.n_id -%s- on curLemma.n_id -%s- ", areal.getN_id(), curLemma.getN_id());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPIED areal.gen -%s- on curLemma.gen -%s- ", areal.getGen(), curLemma.getGen());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPIED areal.codles -%s- on curLemma.codles -%s- ", areal.getCodles(), curLemma.getCodles());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPIED sil.lemma -%s- on curLemma.lemma -%s- ", sil.getLemma(), curLemma.getOut_lemma());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPIED sil.codice -%s- on curLemma.cod_lemma -%s- ", sil.getCodice(), curLemma.getCod_lemma());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPIED areal.les_id -%s- on curLemma.les_id -%s- ", areal.getPr_key(), curLemma.getLes_id());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPIED sil.3eagles -%s- on curLemma.Cod_morf_1_3 -%s- ",
                    Arrays.toString(sil.getEagles3()),
                    Arrays.toString(curLemma.getCod_morf_1_3()));
            log.debug(logmess);
        }

        lems.add(curLemma);
        numL = numL + 1;
        lemmas.setNumL(numL);
        lemmas.setLemmas(lems);
        cur_analysis.setLemmas(lemmas);
        response.setCur_analysis(cur_analysis);
//        //System.err.println("GIULIA 2 in NEWLEMMA LOS " + response.getAnalyses().getListOfAnalysis() + "-" + numA + "-");
//        //System.err.println("GIULIA 2 in NEWLEMMA AS " + response.getAnalyses().toString() + "-" + numA + "-");
//        //System.err.println("GIULIA 2 in NEWLEMMA CA " + cur_analysis.toString()+ "-" + numA + "-");
//        
        //System.err.println("GIULIA 2c in NEWLEMMA LEMMA  " + curLemma.getOut_lemma() + "-" + numA + "-" + lemmas.toString());
        //System.err.println("GIULIA 2d in NEWLEMMA LEMMA  " + response.toString() + "-" + numA + "-" + lemmas.toString());

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java with a.pr_key -%s-", routine, areal.getPr_key());
            log.debug(logmess);
        }
        //System.err.println("MARONNA X0NLO " + response.toString());
        //System.err.println("MARONNA X0NLO  CURRENT LEMMA " + curLemma.getOut_lemma() + " CURRENT SIL " + sil);
        //System.err.println("MARONNA X0NLO  CURRENT LEMMA AND CODES " + curLemma.getOut_lemma() + " - " +Arrays.toString(curLemma.getCod_morf_1_3())+ " -CURRENT SIL " + sil);
        //System.err.println("MARONNA X0NLO AGAIN " + response.toString());
        return response;
    } // end newLemma

    /**
     * Create the list with some codles to search
     *
     * @return the list
     */
    private List<String> addElemToList() {
        List<String> mylist = new ArrayList<String>();

        mylist.add("fe");
        mylist.add("n");
        mylist.add("pr");
        mylist.add("v");
        mylist.add("p1");
        mylist.add("p2");
        mylist.add("p3");
        mylist.add("p4");
        mylist.add("p5");
        mylist.add("p6");
        mylist.add("p7");
        mylist.add("p8");
        mylist.add("p9");
        mylist.add("p18");

        return mylist;
    }

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

}
