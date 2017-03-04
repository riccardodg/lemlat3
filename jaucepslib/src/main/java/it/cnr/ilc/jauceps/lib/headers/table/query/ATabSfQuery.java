/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.headers.table.query;


import it.cnr.ilc.jauceps.lib.impl.table.TabSF;
import it.cnr.ilc.jauceps.lib.impl.table.TabSFCodMorSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabSFCodSet;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;

import java.sql.Connection;
import java.util.List;

/**
 * <P>
 * PORTING</P>
 * <p>
 * porting of query_table_TABSF_alpha.h</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public abstract class ATabSfQuery {

    Connection conn;
    TravellingTables travellingtables;

    /**
     * Constructor
     *
     * @param conn
     */
    public ATabSfQuery(Connection conn) {
        this.conn = conn;
    }

    /**
     * This function extracts the final segments from @see TabSF.
     * <ul>
     * <li>The segment <code>str</code> ends with one of the segments in table
     * TABSF</li>
     * </ul>
     *
     * @param str What to query
     * @return result set from the table TABSF (Final Segments)
     */
    public abstract List<TabSF> getSFset(String str);

    /**
     * This function gets the codes from TABSF and creates a list of @see TabSFCodSet
     * <code>mode</code> parameter:
     * <ul>
     * <li>0 Only TABSF is accessed;</li>
     * <li>1 TABSF and TABSM are accessed. TODO QUERY ;</li>
     * <li>2 TABSF and twice TABSM (TABSM2 as alias) are accessed;</li>
     * <li>3 TABSF and TABCODLE are accessed;</li>
     * <li>4 Only TABSF is accessed. TODO QUERY ;</li>
     * <li>5 TABSF and TABCODLE are accessed. Code c08 of TABCODLE is fixed to
     * p;</li>
     * </ul>
     *
     *
     * @param condition The condition to apply in the query
     * @param travellingtables The travellingTables object from which the values of the segments are extracted
     * @param mode the mode used to switch among the queries
     * @return the list of @see TabSFCodSet
     */
    public abstract List<TabSFCodSet> getSF_cod_set(String condition, TravellingTables travellingtables, int mode);

    /**
     * Extract the morpho codes from different tables 
     * @param seg the segment to search for
     * @param travellingtables  The travellingTables object from which the values of the segments are extracted
     *
     * @return a list of TabSFCodMorSet
     */
    public abstract List<TabSFCodMorSet> getSFCod_morf_set(TravellingTables travellingtables, String seg);

   
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
