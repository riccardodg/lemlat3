/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table;

import it.cnr.ilc.jauceps.lib.impl.Vars;



/**
 * 
 * <p>
 * This class manages the final seven segments of table cod_le</p>
 *  @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabCodLE {

    Vars vars = new Vars();
    private String EOS = vars.getEOS();

    

    private String CODLe = EOS;

    public TabCodLE() {
    }

    private  String C04C = EOS;
    private  String C05C = EOS;
    private  String C06C = EOS;
    private  String C07C = EOS;
    private  String C08C = EOS;
    private  String C09C = EOS;
    private  String C10C = EOS;
    private  String codes = "-------";

    


    public TabCodLE(String CODLe, String C04C, String C05C,String C06C,String C07C,String C08C,String C09C,String C10C,String codes) {
        this.CODLe = CODLe;
        this.C04C = C04C;
        this.C05C = C05C;
        this.C06C = C06C;
        this.C07C = C07C;
        this.C08C = C08C;
        this.C09C = C09C;
        this.C10C = C10C;
        this.codes = codes;
        
        

    }

    /**
     * @return the CODLe
     */
    public String getCODLe() {
        return CODLe;
    }

    /**
     * @param CODLe the CODLe to set
     */
    public void setCODLe(String CODLe) {
        this.CODLe = CODLe;
    }

    /**
     * @return the C04C
     */
    public String getC04C() {
        return C04C;
    }

    /**
     * @param C04C the C04C to set
     */
    public void setC04C(String C04C) {
        this.C04C = C04C;
    }

    /**
     * @return the C05C
     */
    public String getC05C() {
        return C05C;
    }

    /**
     * @param C05C the C05C to set
     */
    public void setC05C(String C05C) {
        this.C05C = C05C;
    }

    /**
     * @return the C06C
     */
    public String getC06C() {
        return C06C;
    }

    /**
     * @param C06C the C06C to set
     */
    public void setC06C(String C06C) {
        this.C06C = C06C;
    }

    /**
     * @return the C07C
     */
    public String getC07C() {
        return C07C;
    }

    /**
     * @param C07C the C07C to set
     */
    public void setC07C(String C07C) {
        this.C07C = C07C;
    }

    /**
     * @return the C08C
     */
    public String getC08C() {
        return C08C;
    }

    /**
     * @param C08C the C08C to set
     */
    public void setC08C(String C08C) {
        this.C08C = C08C;
    }

    /**
     * @return the C09C
     */
    public String getC09C() {
        return C09C;
    }

    /**
     * @param C09C the C09C to set
     */
    public void setC09C(String C09C) {
        this.C09C = C09C;
    }

    /**
     * @return the C10C
     */
    public String getC10C() {
        return C10C;
    }

    /**
     * @param C10C the C10C to set
     */
    public void setC10C(String C10C) {
        this.C10C = C10C;
    }

    /**
     * @return the codes
     */
    public String getCodes() {
        return codes;
    }

    /**
     * @param codes the codes to set
     */
    public void setCodes(String codes) {
        this.codes = codes;
    }

    

}
