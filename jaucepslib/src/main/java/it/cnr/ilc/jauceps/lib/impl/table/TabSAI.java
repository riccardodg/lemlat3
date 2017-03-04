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
 * This class manages the table tab_sai</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabSAI {

    Vars vars = new Vars();
    private String EOS = vars.getEOS();
    /**
     * Segment of tablesai
     */
    private String SAI = EOS;

    /**
     * Segment of tablesai (alternate)
     */
    private String SAI_alt = EOS;

    /**
     * comp_code of tableasi
     */
    private String SAI_cod = EOS;

    public TabSAI() {
        setSAI(EOS);
        setSAI_cod(EOS);
        setSAI_alt(EOS);
    }

    public TabSAI(String SAI, String SAI_cod, String SAI_alt) {
        this.SAI = SAI;
        this.SAI_cod = SAI_cod;
        this.SAI_alt = SAI_alt;
    }

    /**
     * @return the SAI
     */
    public String getSAI() {
        return SAI;
    }

    /**
     * @return the SAI_cod
     */
    public String getSAI_cod() {
        return SAI_cod;
    }

    /**
     * porting of getSI in query_table_TABSI_alpha.c
     *
     * @param SAI the SAI to set
     */
    public void setSAI(String SAI) {
        this.SAI = SAI;
    }

    /**
     * porting of getSI_cod in query_table_TABSI_alpha.c
     *
     * @param SAI_cod the SAI_cod to set
     */
    public void setSAI_cod(String SAI_cod) {
        this.SAI_cod = SAI_cod;
    }

    /**
     * @return the SAI_alt
     */
    public String getSAI_alt() {
        return SAI_alt;
    }

    /**
     * @param SAI_alt the SAI_alt to set
     */
    public void setSAI_alt(String SAI_alt) {
        this.SAI_alt = SAI_alt;
    }

}
