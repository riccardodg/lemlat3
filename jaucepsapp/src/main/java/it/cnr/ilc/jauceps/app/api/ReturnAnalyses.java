/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.app.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import it.cnr.ilc.jauceps.app.utils.JsonResponse;
import it.cnr.ilc.jauceps.lib.impl.Vars;
import it.cnr.ilc.jauceps.lib.impl.table.TabCodMorfDescr;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabCodMorfQuery;
import it.cnr.ilc.jauceps.lib.outputobjects.AucepsResponse;
import it.cnr.ilc.jauceps.lib.structs.Analyses;
import it.cnr.ilc.jauceps.lib.structs.Analysis;
import it.cnr.ilc.jauceps.lib.structs.Lemma;
import it.cnr.ilc.jauceps.lib.structs.Lemmas;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingQueries;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;
import static it.cnr.ilc.latmorphlib.structs.LEM_TYPE.IPERLEMMA;
import static it.cnr.ilc.latmorphlib.structs.LEM_TYPE.IPERLEMMA_INT;
import static it.cnr.ilc.latmorphlib.structs.LEM_TYPE.IPOLEMMA;
import static it.cnr.ilc.latmorphlib.structs.LEM_TYPE.LEMMA_AGG;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import it.cnr.ilc.jauceps.app.utils.OutFormat;
import static it.cnr.ilc.jauceps.app.utils.OutFormat.COMPLETE;

/**
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 * Contains methods to return the analysis as a string
 */
public class ReturnAnalyses {

    AucepsResponse response;
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

    static final String CLASS_NAME = ReturnAnalyses.class.getName();
    static Logger log = Logger.getLogger(CLASS_NAME);

    TravellingQueries travellingqueries;
    TravellingTables travellingtables;
    
    private String theresponse="";

    public ReturnAnalyses(AucepsResponse response, TravellingQueries travellingqueries, TravellingTables travellingtables) {
        this.response = response;
        this.travellingtables = travellingtables;
        this.travellingqueries = travellingqueries;
    }

    public void printAnalyses(OutFormat f, BufferedWriter pobw, BufferedWriter pubw) throws IOException {
        switch (f) {
            case COMPLETE:
                returnComplete(response, pobw, pubw);
                break;
            case OLD_LL:
                returnConOutLemmas(response, pobw, pubw);
                break;
            case COMPACT:
                returnCompact(response, pobw, pubw);
                break;
            case JSON:
                returnJson(response, pobw, pubw);

                break;

        }
    }

    private void returnComplete(AucepsResponse response, BufferedWriter ps, BufferedWriter pu) throws IOException {
        Analyses analyses = response.getAnalyses();
        List<Analysis> lofanalyses = analyses.getListOfAnalysis();
        int numL = 0;
        int numanalysis = 0;
        String statStr = "";
        numanalysis = analyses.getListOfAnalysis().size();
        for (Analysis analysis : lofanalyses) {
            numL = numL + analysis.getLemmas().getLemmas().size();
        }
        statStr = String.format("# of Analysis for word -%s- -%d- and # lemmas -%d-", response.getAnalyses().getIn_form(), numanalysis, numL);

        // print stats #analysis and # lemmas 
        ps.write("AAAAAAAAAAAAAAAAAAAAA " + statStr);
        ps.newLine();
        ps.close();

    }

    /**
     * This function prints the output in the format
     *
     * @param response
     * @param pobw
     * @param pubw
     */
    private void returnConOutLemmas(AucepsResponse response, BufferedWriter pobw, BufferedWriter pubw) throws IOException {
        String routine = CLASS_NAME + "/conOutLemmas";
        String logmess = "";
        Analyses analyses = response.getAnalyses();
        Analysis curAnalysis;
        Lemmas lemmas;
        Lemma lemma;
        String header = "";
        String anaHeader = "", codmorfHeader = "";
        String footer = "";
        String segStr = "SEGMENTS:\t %s";
        String outSegStr = "";
        String in_form, alt_form;
        int numAnalyses = 0;
        String[] segments;// = new String[7];

        in_form = analyses.getIn_form();
        alt_form = analyses.getAlt_in_form();
        String enc = "", part = "";
        int hasPart = 0;
        int numeroLemmi = 0, numeroLemmi_agg = 0;
        String[] codmofs = new String[20];
        numAnalyses = (int) analyses.getListOfAnalysis().size();
        String eagles = "";
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in %s ", routine, CLASS_NAME);
            log.debug(logmess);
        }

        header = String.format("\nInput wordform : -%s-\nAnalyzed wordform : -%s-\nNumber of Analyses : -%d-", in_form, alt_form, numAnalyses);
        pobw.write(header);
        pobw.newLine();
        if (numAnalyses == 0) {
            pubw.write(header);
            pobw.newLine();
            //pubw.flush();
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW STOP NOT-FOUND Executing %s in %s ", routine, CLASS_NAME);
                log.debug(logmess);
            }

        }
        TabCodMorfQuery tabcodmordescq = travellingqueries.getTabcodmorfq();
        tabcodmordescq.setConn(travellingqueries.getConn());
        for (int a = 0; a < numAnalyses; a++) {
            segments = null;
            curAnalysis = analyses.getListOfAnalysis().get(a);
            segments = curAnalysis.getSegments();
            //System.err.println("SEGS " + Arrays.toString(segments) + " " + a);
            enc = segments[6];
            part = segments[5];
            hasPart = curAnalysis.getPart();
            outSegStr = "";
            segStr = "SEGMENTS:\t %s";

            if (numAnalyses > 1) {
                anaHeader = String.format("\n============================RESULTS OF ANALYSIS %d==============================", a + 1);
            } else {
                anaHeader = String.format("\n============================RESULT  OF ANALYSIS   ==============================", a + 1);
            }
            if (!"".equals(enc)) {
                String encStr = String.format("\nenclitica : -%s-", enc);
                pobw.write(encStr);
                pobw.newLine();

            }

            if (hasPart == 1) {
                String partStr = String.format("particella : -%s-", part);
                pobw.write(partStr);
                pobw.newLine();

            }
            // SEGMENTS

            if (!"".equals(segments[0])) {
                outSegStr = segments[0] + "*";
            }
            outSegStr = outSegStr + segments[1];
            //po.println("SEGS " + Arrays.toString(segments) + " " + outSegStr);

            for (int s = 2; s < 5; s++) {
                if (!"".equals(segments[s])) {
                    //System.err.println("SEGS " + Arrays.toString(segments) + " " + segments[s] + " " + outSegStr + " " + a);
                    outSegStr = outSegStr + " -" + curAnalysis.getSegments()[s];
                }
            }
            //po.println(outSegStr);
            if (hasPart == 1 && !"".equals(part)) {
                outSegStr = outSegStr + " -" + part;
            }
            segStr = String.format(segStr, outSegStr);
            pobw.write(anaHeader);
            pobw.newLine();
            pobw.write(segStr);
            pobw.newLine();
            //System.err.println("XXXX " + curAnalysis.toString());
            //"------------------------codici morf. %u-------------------\n"
            for (short i = 0; i < curAnalysis.getN_cod_morf(); i++) {
                codmorfHeader = String.format("------------------------codici morf. %d-------------------", i + 1);
                String temp = curAnalysis.getCod_morf_4_10()[i];
                pobw.write(codmorfHeader);
                pobw.newLine();
                pobw.write(temp + "\n");
                pobw.newLine();
                String[] codes;// = new String[7];
                codes = curAnalysis.getCod_morf_4_10()[i].split("");
                for (int k = 0; k < 7; k++) {
                    if (!"-".equals(codes[k])) {
                        List<TabCodMorfDescr> tabs = tabcodmordescq.getCodMorfDescrSet(k + 4, codes[k]);
                        for (TabCodMorfDescr tab : tabs) {
                            pobw.write(String.format("%s:\t%s", tab.getField_descr(), tab.getValue_descr()));
                            pobw.newLine();
                        }
                    }
                }
            }

            // lemmasur
            for (int l = 0; l < curAnalysis.getLemmas().getNumL(); l++) {
                lemmas = curAnalysis.getLemmas();
                lemma = lemmas.getLemmas().get(l);
                switch (lemma.getType()) {
                    case IPERLEMMA:
                    case IPOLEMMA:
                    case IPERLEMMA_INT:
                        numeroLemmi++;
                        break;
                    case LEMMA_AGG:
                        numeroLemmi_agg++;
                }
            }

            if (curAnalysis.getLemmas().getNumL() > 1) {
                pobw.write("\nLEMMI:");
                pobw.newLine();
            }
            int l = 0;
            for (l = 0; l < curAnalysis.getLemmas().getNumL(); l++) {
                lemmas = curAnalysis.getLemmas();
                lemma = lemmas.getLemmas().get(l);
                eagles = "";

                if ((lemma.getType() == IPERLEMMA) || (lemma.getType() == IPOLEMMA)
                        || (lemma.getType() == IPERLEMMA_INT)) {
                    if (curAnalysis.getLemmas().getNumL() > 1) {
                        if (lemma.getType() == IPERLEMMA) {
                            pobw.write(String.format("\t============================LEMMA %d: IPER=========================", l + 1));
                            pobw.newLine();
                        } else {
                            pobw.write(String.format("\t============================LEMMA %d: IPO =========================", l + 1));
                            pobw.newLine();
                        }
                    } else {
                        pobw.write("\t============================LEMMA ================================");
                        pobw.newLine();
                    }

                    pobw.write(String.format("\t%-30s%-5s%-6s%s\n",
                            lemma.getOut_lemma(),
                            lemma.getCod_lemma(),
                            lemma.getN_id(),
                            lemma.getGen()));
                    pobw.newLine();

                    //codici morfologici
                    if ((lemma.getType() == IPERLEMMA) || (curAnalysis.getLemmas().getNumL() == 1)) {
                        pobw.write("\t------------------------codici morfologici---------------------\n\t");
                        pobw.newLine();
                        for (int j = 0; j < 3; j++) {
                            eagles = eagles + lemma.getCod_morf_1_3()[j];
                        }
                        pobw.write(String.format("\t%-30s", eagles));
                        pobw.newLine();
                        pobw.write("\n");
                        pobw.newLine();

                        for (int j = 0; j < 3; j++) {
                            String code = lemma.getCod_morf_1_3()[j];

                            //System.err.println("ASAAA " + j + " " + code);//+ " "+codes[w]);
                            if (!"-".equals(code)) {
                                List<TabCodMorfDescr> tabs = tabcodmordescq.getCodMorfDescrSet(j + 1, code);
                                for (TabCodMorfDescr tab : tabs) {
                                    pobw.write(String.format("\t%s:\t%s", tab.getField_descr(), tab.getValue_descr()));
                                    pobw.newLine();
                                }
                            }

                        }

                    }

                }
            } // rof numlems

            if (numeroLemmi_agg > 1) {
                lemmas = curAnalysis.getLemmas();
                lemma = lemmas.getLemmas().get(l);
                eagles = "";

                if (lemma.getType() == LEMMA_AGG) {
                    pobw.write("\t============================LEMMA================================");
                    pobw.newLine();

                    pobw.write(String.format("\t%-30s%-5s%-6s%s\n",
                            lemma.getOut_lemma(),
                            lemma.getCod_lemma(),
                            lemma.getN_id(),
                            lemma.getGen()));
                    pobw.newLine();
                    pobw.write("\t------------------------codici morfologici---------------------\n\t");
                    pobw.newLine();
                    for (int j = 0; j < 3; j++) {
                        eagles = eagles + lemma.getCod_morf_1_3()[j];
                    }
                    pobw.write(String.format("\t%-30s", eagles));
                    pobw.newLine();
                    pobw.write("\n");
                    pobw.newLine();
                    for (int j = 0; j < 3; j++) {
                        String code = lemma.getCod_morf_1_3()[j];

                        //System.err.println("ASAAA " + j + " " + code);//+ " "+codes[w]);
                        if (!"-".equals(code)) {
                            List<TabCodMorfDescr> tabs = tabcodmordescq.getCodMorfDescrSet(j + 1, code);
                            for (TabCodMorfDescr tab : tabs) {
                                pobw.write(String.format("\t%s:\t%s", tab.getField_descr(), tab.getValue_descr()));
                                pobw.newLine();
                            }
                        }

                    }

                }
            }
//            String temp = curAnalysis.getLemmas().getLemmas().toString();
//            String lems = String.format("lemmas -%s- ", temp);
//
//            po.println(lems);

        } //rof analyses
        footer = String.format("\n%s\n", "This is the end my friend");
        if (!"end".equals(in_form) || response != null) {
            pobw.write(footer);
            pobw.newLine();
        }

        //pobw.flush();

        /*
        
         if (analyses.numAnalysis > 1)
         fprintf(po, "\n============================RESULTS OF ANALYSIS %u==============================\n", a + 1);
         else
         fprintf(po, "\n============================RESULT OF ANALYSIS ================================\n");
         //segmentazione
         if (*(curAnalysis->segments[6])) {
         fprintf(po, "enclitica : %s\n", curAnalysis->segments[6]);
         fprintf(po, "----------------------------------------------------------\n");
         }
         */
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in %s ", routine, CLASS_NAME);
            log.debug(logmess);
        }
    }

    private String returnCompact(AucepsResponse response, BufferedWriter pobw, BufferedWriter pubw) throws IOException {
        String routine = CLASS_NAME + "/printCompact";

        String logmess = "";
        Analyses analyses = response.getAnalyses();
        Analysis curAnalysis;
        Lemmas lemmas;
        //Lemma lemma;
        String header = "";
        String anaHeader = "", codmorfHeader = "";
        String footer = "";

        String outStr = "";
        String in_form, alt_form;
        int numAnalyses = 0;
        String[] segments;// = new String[7];
        String lemma_sep = ",";
        String field_sep = "\t";
        String lemma_pos_sep = "#";

        in_form = analyses.getIn_form();
        alt_form = analyses.getAlt_in_form();
        String enc = "", part = "";
        int hasPart = 0;
        int numeroLemmi = 0, numeroLemmi_agg = 0;
        String[] codmofs = new String[20];
        numAnalyses = (int) analyses.getListOfAnalysis().size();
        String eagles = "";
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in %s ", routine, CLASS_NAME);
            log.debug(logmess);
        }

        String temp = "";
        outStr = String.format("%s%s%s", in_form, field_sep, alt_form);
        List<String> written = new ArrayList<>();
        for (int a = 0; a < numAnalyses; a++) {

            segments = null;
            curAnalysis = analyses.getListOfAnalysis().get(a);
            lemmas = curAnalysis.getLemmas();

            for (Lemma lemma : lemmas.getLemmas()) {
                String str = lemma.getOut_lemma() + lemma_pos_sep + lemma.getCod_morf_1_3()[0];
                if (!written.contains(str)) {
                    written.add(str);
                }

                //System.err.println("not written " + written.toString());
//                if (a == 0) {
//                    temp = String.format("%s%s%s", lemma.getOut_lemma(), lemma_pos_sep, lemma.getCod_morf_1_3()[0]);
//                } else {
//                    temp = String.format("%s%s%s%s%s", temp, lemma_sep, lemma.getOut_lemma(), lemma_pos_sep, lemma.getCod_morf_1_3()[0]);
//                }
                //System.err.println("CCC 1 "+ temp+ " for "+a);
                //written.add(lemma.getOut_lemma() + lemma_pos_sep + lemma.getCod_morf_1_3()[0]);
            }

        }
        //System.err.println("WRITTEN " + written.toString());
        if (numAnalyses == 0) {
            temp = "not-found#-";
            outStr = String.format("%s%s%s", outStr, field_sep, temp);
            try {
                pubw.write(outStr);
                pubw.newLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
//            pu.println(outStr);
//            pu.flush();
        } else {
            for (int w = 0; w < written.size(); w++) {
                if (w == 0) {
                    temp = written.get(w);
                } else {
                    temp = temp + "," + written.get(w);
                }
            }
            outStr = String.format("%s%s%s", outStr, field_sep, temp);
            try {
                pobw.write(outStr);
                pobw.newLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in %s ", routine, CLASS_NAME);
            log.debug(logmess);
        }

        return outStr;
    }

    private void returnJson(AucepsResponse response, BufferedWriter pobw, BufferedWriter pubw) {
        JsonResponse jsonr = new JsonResponse(response);
        jsonr.setTravellingqueries(travellingqueries);
        jsonr.setTravellingtables(travellingtables);
        String ret = jsonr.dump();
        String indented = "";
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            Object json = mapper.readValue(ret, Object.class);
            indented = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
            
            setTheresponse(indented);

            //System.out.println(indented);//This print statement show correct way I need
        } catch (Exception e) {
        }

        //pobw.flush();
    }

    /**
     * @return the theresponse
     */
    public String getTheresponse() {
        return theresponse;
    }

    /**
     * @param theresponse the theresponse to set
     */
    public void setTheresponse(String theresponse) {
        this.theresponse = theresponse;
    }

}
