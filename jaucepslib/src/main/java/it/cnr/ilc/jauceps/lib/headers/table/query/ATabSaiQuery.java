/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.headers.table.query;

import it.cnr.ilc.jauceps.lib.impl.table.TabSAI;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;


import java.sql.Connection;
import java.util.List;

/**
 * <P>
 * PORTING</P>
 * <p>
 * porting of query_table_TABSAI_alpha.h</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public abstract class ATabSaiQuery {

    Connection conn;
    TravellingTables travellingtables;

    /**
     * Constructor
     *
     * @param conn
     */
    public ATabSaiQuery(Connection conn) {
        this.conn = conn;
    }

    /**
     * Return the result set from table TABSI (Initial Segments) to create a
     * resultset of records which correspond to
     * <ul>
     * <li>The segment <code>str</code> is the segment to search</li>
     * </ul>
     * The query verifies whether in the table TABSAI the segment is contained
     * into the <code>str</code>
     *
     * @param str the string to search
     * @return The resultset according to input parameter.
     *
     */
    public abstract List<TabSAI> getSAIset(String str);

   

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

    /**
     * @return the travellingtables
     */
    public TravellingTables getTravellingtables() {
        return travellingtables;
    }

    /**
     * @param travellingtables the travellingtables to set
     */
    public void setTravellingtables(TravellingTables travellingtables) {
        this.travellingtables = travellingtables;
    }

}
