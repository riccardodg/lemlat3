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
public class TabSI {Vars vars=new Vars();
    private String EOS=vars.getEOS();
    
    /**
     * Segment of tablesi
     */
    private String SI=EOS; 
    
    /**
     * comp_code of tablesi
     */
    private String SI_cod=EOS;

    public TabSI() {
        setSI(EOS);
        setSI_cod(EOS);
        
    }

    public TabSI(String SI,String SI_cod) {
        this.SI=SI;
        this.SI_cod=SI_cod;
    }

    /**
     * @return the SI
     */
    public String getSI() {
        return SI;
    }

    /**
     * @return the SI_cod
     */
    public String getSI_cod() {
        return SI_cod;
    }

    /**
     * porting of getSI in query_table_TABSI_alpha.c
     * @param SI the SI to set
     */
    public void setSI(String SI) {
        this.SI = SI;
    }

    /**
     * porting of getSI_cod in query_table_TABSI_alpha.c
     * @param SI_cod the SI_cod to set
     */
    public void setSI_cod(String SI_cod) {
        this.SI_cod = SI_cod;
    }
    
    
    
}
