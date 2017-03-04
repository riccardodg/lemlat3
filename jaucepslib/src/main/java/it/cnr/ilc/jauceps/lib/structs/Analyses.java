/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.structs;

import java.util.ArrayList;
import java.util.List;

/**<p>PORTING</p>
 * <p>porting of struct Analyses in aucepsLIB_alpha.h</p>
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class Analyses {

    private String in_form;
    private String alt_in_form;

    private short numAnalysis=0;
    private List<Analysis> listOfAnalysis = new ArrayList<Analysis>();

    public Analyses(List<Analysis> listOfAnalysis, String in_form, String alt_in_form, short numAnalysis) {
        this.in_form = in_form;
        this.alt_in_form = alt_in_form;
        this.numAnalysis = numAnalysis;
        this.listOfAnalysis = listOfAnalysis;
    }

    /**
     *
     * void constructor
     */
    public Analyses() {
    }

    /**
     * @return the in_form
     */
    public String getIn_form() {
        return in_form;
    }

    /**
     * @return the alt_in_form
     */
    public String getAlt_in_form() {
        return alt_in_form;
    }

    /**
     * @return the numAnalysis
     */
    public short getNumAnalysis() {
        return numAnalysis;
    }

    /**
     * @return the analyses
     */
    public List<Analysis> getListOfAnalysis() {
        return listOfAnalysis;
    }

    /**
     * @param in_form the in_form to set
     */
    public void setIn_form(String in_form) {
        this.in_form = in_form;
    }

    /**
     * @param alt_in_form the alt_in_form to set
     */
    public void setAlt_in_form(String alt_in_form) {
        this.alt_in_form = alt_in_form;
    }

    /**
     * @param numAnalysis the numAnalysis to set
     */
    public void setNumAnalysis(short numAnalysis) {
        this.numAnalysis = numAnalysis;
    }

    /**
     * @param listOfAnalysis the analyses to set
     */
    public void setListOfAnalysis(List<Analysis> listOfAnalysis) {
        this.listOfAnalysis = listOfAnalysis;
    }

    @Override
    public String toString() {
        return "Analyses {" + "in_form=" + in_form + ", alt_in_form=" + alt_in_form + ", numAnalysis=" + numAnalysis + ", listOfAnalysis=" + listOfAnalysis.toString() + '}';
    }
    

}
