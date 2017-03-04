/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.headers.table.query;

import it.cnr.ilc.jauceps.lib.impl.table.TabLessario;
import it.cnr.ilc.jauceps.lib.structs.LES_Q_MODE;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;


import java.sql.Connection;
import java.util.List;

/**
 * <P>
 * PORTING</P>
 * <p>
 * porting of query_table_LESSARIO_alpha.h</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public abstract class ATabLessarioQuery {

    Connection conn;
    TravellingTables travellingtables;

    /**
     * Constructor
     *
     * @param conn
     */
    public ATabLessarioQuery(Connection conn) {
        this.conn = conn;
    }

    /**
     * This function gets the result set from the table LESSARIO, including
     * graphical variants from table GRAPH_VARS. Depending on
     * <code>LES_Q_MODE</code>, the table(s) are accessed differently:
     * <ul>
     * <li>if BY_LES, LESSARIO and GRAPH_VARS are joined through A_GRA and
     * GV_CODE;</li>
     * <li>if BY_CLEM or BY_KEY only LESSARIO is accessed.</li>
     * </ul>
     *
     * @param value what to query
     * @param q_mode the access mode to the LESSARIO table
     * @return list of @see TabLessario
     */
    public abstract List<TabLessario> getLESset(String value, LES_Q_MODE q_mode);

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
