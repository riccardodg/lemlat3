/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.app.utils;

import it.cnr.ilc.jauceps.lib.outputobjects.AucepsResponse;
import it.cnr.ilc.jauceps.lib.structs.Analyses;
import it.cnr.ilc.jauceps.lib.structs.Analysis;
import it.cnr.ilc.jauceps.lib.structs.Lemma;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingQueries;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/**
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class JsonResponse {

    AucepsResponse response;

    private TravellingTables travellingtables;
    private TravellingQueries travellingqueries;

    public JsonResponse(AucepsResponse response) {
        this.response = response;
    }

    public String dump() {
        ResponseManager manager = new ResponseManager();
        manager.setTravellingqueries(getTravellingqueries());
        manager.setTravellingtables(getTravellingtables());
        String ret = "";
        JsonObjectBuilder responseBuilder = Json.createObjectBuilder();

        JsonArrayBuilder analysesArrayBuilder = Json.createArrayBuilder();
        JsonObjectBuilder analysisObjBuilder;//= Json.createArrayBuilder();

        JsonArrayBuilder lemmasArrayBuilder;// = Json.createArrayBuilder();
        JsonObjectBuilder lemmaObjBuilder;//=Json.createObjectBuilder();

        JsonObjectBuilder formMorfCode;
        JsonArrayBuilder formArrayMorfCodesBuilder;// = Json.createArrayBuilder();

        JsonArrayBuilder lemmaMorfCodesArrayBuilder;
        JsonObjectBuilder lemmaObjMorfCodesBuilder;// = Json.createArrayBuilder();

        Analyses analyses = response.getAnalyses();
        String labelInForm = "input_wordform";
        String labelAltForm = "analyzed_wordform";
        String labelnumA = "number_of_analyses";
        String labelFound = "found";
        String labelAnalysis = "analyses";
        String labelSegments = "segments";
        String labelId = "id";
        String labelEnc = "enclitica";
        String labelPart = "part";
        String labelNumL = "num_lemma";
        String labelLemmas = "lemmas";
        String labelLemma = "lemma";
        String labelValues = "values";
        String labelMorfCodes = "morpho_codes";
        String labelLemType = "lem_type";

        String[] segs;

        responseBuilder.add(labelInForm, analyses.getIn_form());
        responseBuilder.add(labelAltForm, analyses.getAlt_in_form());

        
        if (analyses.getNumAnalysis() == 0) {
            responseBuilder.add(labelFound, "false");
            responseBuilder.add(labelnumA, (int) (0));
        } else {
            responseBuilder.add(labelFound, "true");
            //responseBuilder.add(labelnumA, (int) (analyses.getNumAnalysis()));
            responseBuilder.add(labelnumA, (int) (analyses.getListOfAnalysis().size()));
            
        }
        int id = 1;
        for (Analysis analysis : analyses.getListOfAnalysis()) {
            lemmasArrayBuilder = Json.createArrayBuilder();
            formArrayMorfCodesBuilder = Json.createArrayBuilder();

            analysisObjBuilder = Json.createObjectBuilder();
            segs = manager.segmentizer(analysis.getSegments(), analysis.getPart());

            analysisObjBuilder.add(labelId, id);
            if (!"".equals(segs[0])) {
                analysisObjBuilder.add(labelEnc, segs[0]);
            }
            if (!"".equals(segs[1])) {
                analysisObjBuilder.add(labelPart, segs[1]);
            }
            analysisObjBuilder.add(labelNumL, analysis.getLemmas().getNumL());
            analysisObjBuilder.add(labelSegments, segs[2]);

            // form morphocodes
            for (short i = 0; i < analysis.getN_cod_morf(); i++) {
                String code = analysis.getCod_morf_4_10()[i];
                String[] codes;
                formMorfCode = Json.createObjectBuilder();
                formMorfCode.add(labelId, i + 1);
                formMorfCode.add(labelValues, code);
                codes = manager.getCodMorfDescription(code.split(""), 4);
                for (String val : codes) {
                    try {
                        formMorfCode.add(val.split(":")[0], val.split(":")[1]);
                    } catch (Exception e) {
                    }
                }
                formArrayMorfCodesBuilder.add(formMorfCode);

            }
            analysisObjBuilder.add(labelMorfCodes, formArrayMorfCodesBuilder);
            // lemmas
            int l = 1;
            for (Lemma lemma : analysis.getLemmas().getLemmas()) {
                String[] codes;
                lemmaObjBuilder = Json.createObjectBuilder();
                lemmaObjBuilder.add(labelId, l);
                lemmaObjBuilder.add(labelLemma, lemma.getOut_lemma());
                lemmaObjBuilder.add(labelLemType,lemma.getType().toString());

                // lemma morfocodes
                lemmaObjMorfCodesBuilder = Json.createObjectBuilder();
                lemmaMorfCodesArrayBuilder = Json.createArrayBuilder();

                lemmaObjMorfCodesBuilder.add(labelValues, manager.getlemmaMorfCodes(lemma.getCod_morf_1_3()));

                codes = manager.getCodMorfDescription(lemma.getCod_morf_1_3(), 1);
                for (String val : codes) {
                    try {
                        lemmaObjMorfCodesBuilder.add(val.split(":")[0], val.split(":")[1]);
                    } catch (Exception e) {
                    }
                }
                

                lemmaMorfCodesArrayBuilder.add(lemmaObjMorfCodesBuilder);
                lemmaObjBuilder.add(labelMorfCodes, lemmaMorfCodesArrayBuilder);

                lemmasArrayBuilder.add(lemmaObjBuilder);
                l++;
            }
            analysisObjBuilder.add(labelLemmas, lemmasArrayBuilder);

            analysesArrayBuilder.add(analysisObjBuilder);
            id++;
        }

        responseBuilder.add(labelAnalysis, analysesArrayBuilder);
        JsonObject obj = responseBuilder.build();
        //System.err.println("JSON ARRAY "+obj.toString());
        return obj.toString();
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

    /**
     * @return the travellingqueries
     */
    public TravellingQueries getTravellingqueries() {
        return travellingqueries;
    }

    /**
     * @param travellingqueries the travellingqueries to set
     */
    public void setTravellingqueries(TravellingQueries travellingqueries) {
        this.travellingqueries = travellingqueries;
    }

}
