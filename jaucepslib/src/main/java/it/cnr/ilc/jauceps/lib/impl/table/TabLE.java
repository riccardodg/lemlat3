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
 * This class manages the table tab_le</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabLE {
    Vars vars=new Vars();
    private String EOS=vars.getEOS();
    private String LE_LESid=EOS; 
    private String LE_CODLE=EOS;
    private String LE_LEMMA=EOS;

    public TabLE() {
        setLE_CODLE(EOS);
        setLE_LEMMA(EOS);
        setLE_LESid(EOS);
    }
    
    public TabLE(String tabLE_LESid,String tabLE_CODLE,String tabLE_LEMMA) {
        this.LE_LESid=tabLE_LESid;
        this.LE_CODLE=tabLE_CODLE;
        this.LE_LEMMA=tabLE_LEMMA;
    }

    /**
     * substitute getLE_LESid
     * @return the LE_LESid
     */
    public String getLE_LESid() {
        return LE_LESid;
    }

    /** 
     * substitute getCodLE
     * @return the LE_CODLE
     */
    public String getLE_CODLE() {
        return LE_CODLE;
    }

    /**
     * substitute getLE
     * @return the LE_LEMMA
     */
    public String getLE_LEMMA() {
        return LE_LEMMA;
    }

    /**
     * @param LE_LESid the LE_LESid to set
     */
    public void setLE_LESid(String LE_LESid) {
        this.LE_LESid = LE_LESid;
    }

    /**
     * @param LE_CODLE the LE_CODLE to set
     */
    public void setLE_CODLE(String LE_CODLE) {
        this.LE_CODLE = LE_CODLE;
    }

    /**
     * @param LE_LEMMA the LE_LEMMA to set
     */
    public void setLE_LEMMA(String LE_LEMMA) {
        this.LE_LEMMA = LE_LEMMA;
    }
    
}
