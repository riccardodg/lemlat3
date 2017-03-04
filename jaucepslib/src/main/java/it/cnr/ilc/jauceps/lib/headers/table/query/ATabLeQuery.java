/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.headers.table.query;

import it.cnr.ilc.jauceps.lib.impl.table.TabLE;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;



import java.sql.Connection;
import java.util.List;


/**
 *  <P>
 * PORTING</P>
 * <p>
 * porting of porting of query_table_TABLE_alpha.h</p>
 *  @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public abstract class ATabLeQuery {

    Connection conn;
    TravellingTables travellingtables;

    /**
     * Constructor
     *
     * @param conn
     */
    public ATabLeQuery(Connection conn) {
        this.conn = conn;
    }

    /**
     * Return the resultset corresponding to <code>str</code> from table TABLE
     *
     * @param str what to query
     * @return the resultset corresponding to <code>str</code>
     */
    public abstract List<TabLE> getLEset(String str);

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
