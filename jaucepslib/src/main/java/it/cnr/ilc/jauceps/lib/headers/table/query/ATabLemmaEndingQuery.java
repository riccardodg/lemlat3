/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.headers.table.query;

import it.cnr.ilc.jauceps.lib.impl.table.TabLemmaEnding;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;



import java.sql.Connection;
import java.util.List;

/**
 * <P>
 * PORTING</P>
 * <p>
 * porting of porting of query_table_LEMMAENDING_alpha.h</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public abstract class ATabLemmaEndingQuery {

    Connection conn;
    TravellingTables travellingtables;

    /**
     * Constructor
     *
     * @param conn
     */
    public ATabLemmaEndingQuery(Connection conn) {
        this.conn = conn;
    }

    /**
     * This function review the C function build_lemma
     *
     * @param in_str the lemma from sil
     * @param cod the code of the lemma from sil
     * @return The resultset according to the input parameters
     */
    public abstract List<TabLemmaEnding> getBuildLemmaSet(String in_str, String cod);

    /**
     * Essentially returns the lemma which was out_str parameter in the original
     * C function
     *
     * @return
     */
    public abstract String build_lemma();

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
