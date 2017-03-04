/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.headers.table.query;

import it.cnr.ilc.jauceps.lib.impl.table.Tab3Eagles;
import it.cnr.ilc.jauceps.lib.structs.THREE_EAGLES_MODE;

import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;
import java.sql.Connection;
import java.util.List;

/**
 * <P>
 * PORTING</P>
 * <p>
 * porting of query_table_EAGLES_alpha.h</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public abstract class ATabEaglesQuery {

    Connection conn;
    TravellingTables travellingtables;

    /**
     * Constructor
     *
     * @param conn
     */
    public ATabEaglesQuery(Connection conn) {
        this.conn = conn;
    }

    /**
     * This function merges get_codlem3eagles and get3eagles in
     * query_table_EAGLES_alpha.c.
     * <p>
     * According to <code>mode</code>, the function extracts the codlem and 3
     * eagles codes querying for <code>cod2search</code> in codlem or codles.
     *
     * @param cod2search the code to search for
     * @param mode BY_CODLEM and BY_CODLES
     * @return A list of @see Tab3Eagles
     */
    public abstract List<Tab3Eagles> get3EaglesSet(String cod2search, THREE_EAGLES_MODE mode);

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
