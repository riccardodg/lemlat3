/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.headers.table.query;

import it.cnr.ilc.jauceps.lib.impl.table.TabCodLE;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;

import java.sql.Connection;
import java.util.List;

/**
 * <P>
 * PORTING</P>
 * <p>
 * porting of query_table_TABLE_alpha.h</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public abstract class ATabCodLEQuery {

    Connection conn;
    TravellingTables travellingtables;

    /**
     * Constructor
     *
     * @param conn
     */
    public ATabCodLEQuery(Connection conn) {
        this.conn = conn;
    }

    /**
     * <p>
     * PORTING</P>
     * <p>
     * porting of getCod_morf_setLE which originally was in
     * query_table_TABSF_alpha.c
     * </p>
     * In this version each single code from c04 to c10 is extracted along with
     * their concat
     *
     * @param str the cod_le to search for.
     * @return a list of @see TabCodLE
     */
    public abstract List<TabCodLE> getCodLEset(String str);

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
