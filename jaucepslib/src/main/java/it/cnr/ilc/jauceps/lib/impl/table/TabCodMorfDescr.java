/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table;

import it.cnr.ilc.jauceps.lib.impl.Vars;

/**
 * <p>
 * PORTING</p>
 * <p>
 * Porting of method get_3eagles</p>
 * <p>
 * This class manages the table lemma_ending</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabCodMorfDescr {

    Vars vars = new Vars();
    private String EOS = vars.getEOS();

    private String field_descr = EOS;
    private String value_descr = EOS;

    /**
     * Void constructor
     */
    public TabCodMorfDescr() {
    }

 
    /**
     * 
     * @param field_descr
     * @param value_descr 
     */
    public TabCodMorfDescr(String field_descr, String value_descr) {
        this.field_descr=field_descr;
        this.value_descr=value_descr;
    }
    /**
     * @return the field_descr
     */
    public String getField_descr() {
        return field_descr;
    }

    /**
     * @param field_descr the field_descr to set
     */
    public void setField_descr(String field_descr) {
        this.field_descr = field_descr;
    }

    /**
     * @return the value_descr
     */
    public String getValue_descr() {
        return value_descr;
    }

    /**
     * @param value_descr the value_descr to set
     */
    public void setValue_descr(String value_descr) {
        this.value_descr = value_descr;
    }

    
}
