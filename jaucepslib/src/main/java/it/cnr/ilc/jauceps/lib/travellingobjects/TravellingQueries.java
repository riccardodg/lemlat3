package it.cnr.ilc.jauceps.lib.travellingobjects;

import it.cnr.ilc.jauceps.lib.impl.table.query.TabCodLeQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabCodMorfQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabEaglesQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabLemmaEndingQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery;

import java.sql.Connection;

/**
 * This class contains all table and codes updated at runtime. Use it instead of
 * sending various values as input parameters
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TravellingQueries {

    private String  tqId = "";

    // connection
    private Connection conn;

    /**
     * Constructor with connection
     */
    public TravellingQueries(Connection conn) {
        this.conn = conn;
    }

    // queries
    private TabSiQuery tabsiq = new TabSiQuery(conn);
    private TabSaiQuery tabsaiq = new TabSaiQuery(conn);
    private TabSfQuery tabsfq = new TabSfQuery(conn);
    private TabSpfQuery FirstTabSpfq = new TabSpfQuery(conn);
    private TabSpfQuery SecondTabSpfq = new TabSpfQuery(conn);
    private TabSmQuery FirstTabSmq = new TabSmQuery(conn);
    private TabSmQuery SecondTabSmq = new TabSmQuery(conn);
    private TabLeQuery tableq = new TabLeQuery(conn);
    private TabLessarioQuery tablessarioq = new TabLessarioQuery(conn);
    private TabFEQuery tabfeq = new TabFEQuery(conn);
    private TabEaglesQuery tab3eq = new TabEaglesQuery(conn);
    private TabCodLeQuery tabcodleq = new TabCodLeQuery(conn);
    private TabLemmaEndingQuery tablemmaendq = new TabLemmaEndingQuery(conn);
    private TabCodMorfQuery tabcodmorfq = new TabCodMorfQuery(conn);

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
     * @return the FirstTabSpfq
     */
    public TabSpfQuery getFirstTabSpfq() {
        return FirstTabSpfq;
    }

    /**
     * @param FirstTabSpfq the FirstTabSpfq to set
     */
    public void setFirstTabSpfq(TabSpfQuery FirstTabSpfq) {

        this.FirstTabSpfq = FirstTabSpfq;
    }

    /**
     * @return the SecondTabSpfq
     */
    public TabSpfQuery getSecondTabSpfq() {
        return SecondTabSpfq;
    }

    /**
     * @param SecondTabSpfq the SecondTabSpfq to set
     */
    public void setSecondTabSpfq(TabSpfQuery SecondTabSpfq) {
        this.SecondTabSpfq = SecondTabSpfq;
    }

    /**
     * @return the tabsiq
     */
    public TabSiQuery getTabsiq() {
        return tabsiq;
    }

    /**
     * @param tabsiq the tabsiq to set
     */
    public void setTabsiq(TabSiQuery tabsiq) {
        this.tabsiq = tabsiq;
    }

    /**
     * @return the tabsfq
     */
    public TabSfQuery getTabsfq() {
        return tabsfq;
    }

    /**
     * @param tabsfq the tabsfq to set
     */
    public void setTabsfq(TabSfQuery tabsfq) {
        this.tabsfq = tabsfq;
    }

    /**
     * @return the FirstTabSmq
     */
    public TabSmQuery getFirstTabSmq() {
        return FirstTabSmq;
    }

    /**
     * @param FirstTabSmq the FirstTabSmq to set
     */
    public void setFirstTabSmq(TabSmQuery FirstTabSmq) {
        this.FirstTabSmq = FirstTabSmq;
    }

    /**
     * @return the SecondTabSmq
     */
    public TabSmQuery getSecondTabSmq() {
        return SecondTabSmq;
    }

    /**
     * @param SecondTabSmq the SecondTabSmq to set
     */
    public void setSecondTabSmq(TabSmQuery SecondTabSmq) {
        this.SecondTabSmq = SecondTabSmq;
    }

    // getter & setter
    

    /**
     * @return the tabsaiq
     */
    public TabSaiQuery getTabsaiq() {
        return tabsaiq;
    }

    /**
     * @param tabsaiq the tabsaiq to set
     */
    public void setTabsaiq(TabSaiQuery tabsaiq) {
        this.tabsaiq = tabsaiq;
    }

    /**
     * @return the tableq
     */
    public TabLeQuery getTableq() {
        return tableq;
    }

    /**
     * @param tableq the tableq to set
     */
    public void setTableq(TabLeQuery tableq) {
        this.tableq = tableq;
    }

    /**
     * @return the tablessarioq
     */
    public TabLessarioQuery getTablessarioq() {
        return tablessarioq;
    }

    /**
     * @param tablessarioq the tablessarioq to set
     */
    public void setTablessarioq(TabLessarioQuery tablessarioq) {
        this.tablessarioq = tablessarioq;
    }

    /**
     * @return the tabfeq
     */
    public TabFEQuery getTabfeq() {
        return tabfeq;
    }

    /**
     * @param tabfeq the tabfeq to set
     */
    public void setTabfeq(TabFEQuery tabfeq) {
        this.tabfeq = tabfeq;
    }

    /**
     * @return the tab3eq
     */
    public TabEaglesQuery getTab3eq() {
        return tab3eq;
    }

    /**
     * @param tab3eq the tab3eq to set
     */
    public void setTab3eq(TabEaglesQuery tab3eq) {
        this.tab3eq = tab3eq;
    }

    /**
     * @return the tabcodleq
     */
    public TabCodLeQuery getTabcodleq() {
        return tabcodleq;
    }

    /**
     * @param tabcodleq the tabcodleq to set
     */
    public void setTabcodleq(TabCodLeQuery tabcodleq) {
        this.tabcodleq = tabcodleq;
    }

    /**
     * @return the tablemmaendq
     */
    public TabLemmaEndingQuery getTablemmaendq() {
        return tablemmaendq;
    }

    /**
     * @param tablemmaendq the tablemmaendq to set
     */
    public void setTablemmaendq(TabLemmaEndingQuery tablemmaendq) {
        this.tablemmaendq = tablemmaendq;
    }

    /**
     * @return the tqId
     */
    public String getTqId() {
        return tqId;
    }

    /**
     * @param tqId the tqId to set
     */
    public void setTqId(String tqId) {
        this.tqId = tqId;
    }

    /**
     * @return the tabcodmorfq
     */
    public TabCodMorfQuery getTabcodmorfq() {
        return tabcodmorfq;
    }

    /**
     * @param tabcodmorfq the tabcodmorfq to set
     */
    public void setTabcodmorfq(TabCodMorfQuery tabcodmorfq) {
        this.tabcodmorfq = tabcodmorfq;
    }
}
