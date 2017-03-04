/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table;

import it.cnr.ilc.jauceps.lib.impl.Vars;

/**<P>PORTING</p>
 * <p>getSF_cod_set with codes from SM as well</p>
 * <p>
 * This class manages the table tab_sf</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabSFCodSet {

    Vars vars = new Vars();
    private String EOS = vars.getEOS();

    private String C_COD = EOS;
    private String C_COD_P = EOS;
    private String C_COD_S = EOS;
    private String C_COD_P2 = EOS;
    private String C_COD_S2 = EOS;
    private int codeSetMode=0;

    /**
     * getSF_cod_set with case 2
     * @param C_COD comp_cod 
     * @param C_COD_P p_cod from sm1
     * @param C_COD_S s_cod from sm1
     * @param C_COD_P2 p_cod from sm2
     * @param C_COD_S2 s_cod from sm2
     */
    public TabSFCodSet(String C_COD,String C_COD_P, String C_COD_S,String C_COD_P2, String C_COD_S2) {
        this.C_COD = C_COD;
        this.C_COD_P = C_COD_P;
        this.C_COD_S = C_COD_S;
        this.C_COD_P2 = C_COD_P2;
        this.C_COD_S2 = C_COD_S2;

    }
    
    
    /**
     * getSF_cod_set with case 1
     * @param C_COD comp_code
     * @param C_COD_P p_cod from sm1
     * @param C_COD_S s_cod from sm1
     */
    public TabSFCodSet(String C_COD,String C_COD_P, String C_COD_S) {
        this.C_COD = C_COD;
        this.C_COD_P = C_COD_P;
        this.C_COD_S = C_COD_S;
    }
    
    /**
     * getSF_cod_set with case 0 and 3
     * @param C_COD comp_code
     */
    public TabSFCodSet(String C_COD) {
        this.C_COD = C_COD;
        

    }

    /**
     * void constructor
     */
    public TabSFCodSet() {
        setC_COD(C_COD);
        setC_COD_P(C_COD_P);
        setC_COD_S(C_COD_S);
        setC_COD_P2(C_COD_P2);
        setC_COD_S2(C_COD_S2);

    }
    
    

    /**
     * @return the C_COD
     */
    public String getC_COD() {
        return C_COD;
    }

    /**
     * @param C_COD the C_COD to set
     */
    public void setC_COD(String C_COD) {
        this.C_COD = C_COD;
    }

    /**
     * @return the C_COD_P
     */
    public String getC_COD_P() {
        return C_COD_P;
    }

    /**
     * @return the C_COD_S
     */
    public String getC_COD_S() {
        return C_COD_S;
    }

    /**
     * @param C_COD_P the C_COD_P to set
     */
    public void setC_COD_P(String C_COD_P) {
        this.C_COD_P = C_COD_P;
    }

    /**
     * @param C_COD_S the C_COD_S to set
     */
    public void setC_COD_S(String C_COD_S) {
        this.C_COD_S = C_COD_S;
    }

    /**
     * @return the C_COD_P2
     */
    public String getC_COD_P2() {
        return C_COD_P2;
    }

    /**
     * @return the C_COD_S2
     */
    public String getC_COD_S2() {
        return C_COD_S2;
    }

    /**
     * @param C_COD_P2 the C_COD_P2 to set
     */
    public void setC_COD_P2(String C_COD_P2) {
        this.C_COD_P2 = C_COD_P2;
    }

    /**
     * @param C_COD_S2 the C_COD_S2 to set
     */
    public void setC_COD_S2(String C_COD_S2) {
        this.C_COD_S2 = C_COD_S2;
    }

    /**
     * @return the codeSetMode
     */
    public int getCodeSetMode() {
        return codeSetMode;
    }

    /**
     * @param codeSetMode the codeSetMode to set
     */
    public void setCodeSetMode(int codeSetMode) {
        this.codeSetMode = codeSetMode;
    }

}
