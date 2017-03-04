/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.headers.table.query;


import it.cnr.ilc.jauceps.lib.impl.table.TabSPF;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;

import java.sql.Connection;
import java.util.List;

/**
 * <P>
 * PORTING</P>
 * <p>
 * porting of porting of query_table_TABSPF_alpha.h</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public abstract class ATabSpfQuery {

    Connection conn;
    TravellingTables travellingtables;

    /**
     * Constructor
     *
     * @param conn the connection to use
     */
    public ATabSpfQuery(Connection conn) {
        this.conn = conn;
    }

    /**
     * Query the table TABSPF POST FINAL SEGMENTS (SPF) to create a resultset of
     * records which correspond to either:
     * <ul>
     * <li>The segment <code>str</code> ends with one of the segments in table
     * TABSPF and comp_code STARTS with 'e' or is blank if <code>spf_n</code> is
     * 0. Or</li>
     * <li>The segment <code>str</code> ends with one of the segments in table
     * TABSPF and comp_code DOES NOT START with 'e' or is blank if
     * <code>spf_n</code> is 1.</li>
     * </ul>
     *
     * @param str the segment from table TABSPF to search
     * @param spf_n Type of comp_code. 0: comp_cod starts with e (or is blank);
     * 1: comp_cod does not start with e (or is blank);
     * @return The resultset according to input parameters.
     */
    public abstract List<TabSPF> getSPFset(String str, int spf_n);

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
