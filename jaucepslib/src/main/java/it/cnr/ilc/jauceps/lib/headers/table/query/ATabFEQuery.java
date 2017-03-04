/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.headers.table.query;

import it.cnr.ilc.jauceps.lib.impl.table.TabFE;
import it.cnr.ilc.jauceps.lib.impl.table.TabFE3CodSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabFECodMorSet;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;






import java.sql.Connection;
import java.util.List;

/**
 *  <P>
 * PORTING</P>
 * <p>
 * porting of query_table_FORME_ECC_alpha.h</p>
 *  @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public abstract class ATabFEQuery {

    Connection conn;
    TravellingTables travellingtables;

    /**
     * Constructor
     * @param conn 
     */
    public ATabFEQuery(Connection conn) {
        this.conn = conn;
    }

    /**
     * This function queries the forme_ecc @see TabFE table. It extracts three
     * fields les_id which is in input as well, the add_lem which identifies the
     * lemma to add and the enclitic.
     *
     * @param les_id the id to search
     * @return The resultset according to input parameter.
     *
     */
    public abstract List<TabFE> getFEset(String les_id);

    /**
     * This function queries the forme_ecc @see TabFE3CodSet table. It extracts
     * three codes
     *
     * @param les_id the id to search
     * @return The resultset according to input parameter.
     */
    public abstract List<TabFE3CodSet> get3Code_set_fe(String les_id);

    /**
     * This function queries the forme_ecc @see TabFECodMorSet table. It extracts
     * codes from 4 to 10 according to les_id and the codes extracted by @see
     * get3Code_set_fe
     *
     * @param travellingtables The travellingTables object used to get the first
     * 3 codes
     * @param les_id the id to search
     * @return
     */
    public abstract List<TabFECodMorSet> getCod_morf_set_fe(TravellingTables travellingtables, String les_id);

   

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }

}
