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
public class TabSM {
    Vars vars=new Vars();
    private String EOS=vars.getEOS();
    
    
    /**
     * comp_code of tablesm
     */
    private String SM=EOS;

    public TabSM() {
        setSM(EOS);
       
    }

    
    /**
     * constructor
     * @param segment the segment
     */
    public TabSM(String segment) {
        this.SM=segment;
        
    }

    /**
     * @return the SM
     */
    public String getSM() {
        return SM;
    }

    /**
     * @param SM the SM to set
     */
    public void setSM(String SM) {
        this.SM = SM;
    }

   
    
}
