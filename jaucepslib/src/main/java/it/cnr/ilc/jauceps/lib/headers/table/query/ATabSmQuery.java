/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.headers.table.query;

import it.cnr.ilc.jauceps.lib.impl.table.TabSM;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;


import java.sql.Connection;
import java.util.List;

/**
 * <P>
 * PORTING</P>
 * <p>
 * porting of query_table_TABSM_alpha.h</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public abstract class ATabSmQuery {

    Connection conn;
    TravellingTables travellingtables;

    /**
     * Constructor
     *
     * @param conn
     */
    public ATabSmQuery(Connection conn) {
        this.conn = conn;
    }

    /**
     * Return The resultset of segments from TABSM (Middle Segments)to create a
     * resultset of records which correspond to
     * <ul>
     * <li>The segment <code>str</code> (rad_sf or rad_sm1)is the segment to
     * search;</li>
     * <li>The mode <code>sm_n</code> (SM1=0; SM2=1) is the mode</li>
     * </ul>
     * The two parameters are copupled (0, rad_sf) and (1, rad_sm1)
     *
     * @param str the string to search
     * @param sm_n the mode
     * @return The resultset according to input parameters.
     */
    public abstract List<TabSM> getSMset(String str, int sm_n);

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
