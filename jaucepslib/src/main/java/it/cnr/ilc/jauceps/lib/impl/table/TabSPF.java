/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table;

import it.cnr.ilc.jauceps.lib.impl.Vars;

/**
 * This class manages the table lessario</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabSPF {
    Vars vars=new Vars();
    private String EOS=vars.getEOS();
    /**
     * Segment of tablespf
     */
    private String SPF=EOS; 
    
    /**
     * comp_code of tablespf
     */
    private String SPF_cod=EOS;

    public TabSPF() {
        setSPF(EOS);
        setSPF_cod(EOS);
    }

    /**
     * 
     * @param SPF the segment 
     * @param SPF_cod the comp_code
     */
    public TabSPF(String SPF, String SPF_cod) {
        this.SPF=SPF;
        this.SPF_cod=SPF_cod;
    }

    /**
     * porting of getSPF in query_table_TABSPF_alpha.c
     * @return the SPF
     */
    public String getSPF() {
        return SPF;
    }

    /** porting of getSPF_cod in query_table_TABSPF_alpha.c
     * @return the SPF_cod
     */
    public String getSPF_cod() {
        return SPF_cod;
    }

    /**
     * @param SPF the SPF to set
     */
    public void setSPF(String SPF) {
        this.SPF = SPF;
    }

    /**
     * @param SPF_cod the SPF_cod to set
     */
    public void setSPF_cod(String SPF_cod) {
        this.SPF_cod = SPF_cod;
    }
    
}
