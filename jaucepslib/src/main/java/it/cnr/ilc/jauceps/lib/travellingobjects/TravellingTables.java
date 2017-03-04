/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.travellingobjects;



import it.cnr.ilc.jauceps.lib.impl.table.Tab3Eagles;
import it.cnr.ilc.jauceps.lib.impl.table.TabCodLE;
import it.cnr.ilc.jauceps.lib.impl.table.TabCodLem3Eagles;
import it.cnr.ilc.jauceps.lib.impl.table.TabFE;
import it.cnr.ilc.jauceps.lib.impl.table.TabFE3CodSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabFECodMorSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabLE;
import it.cnr.ilc.jauceps.lib.impl.table.TabLemmaEnding;
import it.cnr.ilc.jauceps.lib.impl.table.TabLessario;
import it.cnr.ilc.jauceps.lib.impl.table.TabSAI;
import it.cnr.ilc.jauceps.lib.impl.table.TabSF;
import it.cnr.ilc.jauceps.lib.impl.table.TabSFCodMorSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabSFCodSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabSI;
import it.cnr.ilc.jauceps.lib.impl.table.TabSM;
import it.cnr.ilc.jauceps.lib.impl.table.TabSPF;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


/**
 * This class contains all table and codes updated at runtime. Use it instead of
 * sending various values as input parameters.
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TravellingTables {

    /**
     * different values according to different loops</br>
     * <ul>
     * <li>0 init</li>
     * <li>1 loop tabspf1</li>
     * <li>2 loop tabspf2</li>
     * <li>3 loop tabsi</li>
     * <li>4 loop table (in lemmi_ecc)</li>
     * <li>5 loop tablessario (in lemmi_ecc)</li>
     * <li>6 loop tabSAI (in comp_le)</li>
     * <li>7 loop CodLe (in pushLemma)</li>
     * <li>8 loop tablessario (in lemv sillib)</li>
     * <li>9 loop tabcodmorset (in pushlemma sillib)</li>
     * <li>10 loop 3cod_set from fe (in pushlemma sillib)</li>
     * <li>11 loop tabSAI (in analysis)</li>
     * <li>12 loop tablessario (in analysis)</li>
     * <li>13 loop tablessario (in analysis outloop)</li>
     * <li>14 loop tabfscodset (in compsm2)</li>
     * <li>15 loop tabfscodset (in compsm1)</li>
     * <li>16 loop tabfscodset (in compsf)</li>
     * <li>17 loop tablessario (in lemtiz)</li>
     * <li>20 loop tabsf</li>
     * <li>21 loop tabsm1 </li>
     * <li>22 loop tabsm1</li>
     * <li>11 loop cod_mor_set_fe from fe (in pushlemma sillib)</li>
     * </ul>
     *
     */
    private String status = "0";
    private String ttId="";

    // connection
    private Connection conn;

    // void constructor
    public TravellingTables() {
    }

    /**
     * Constructor with connection
     *
     * @param conn
     */
    public TravellingTables(Connection conn) {
        this.conn = conn;
    }
    // tables

    /**
     * SEGMENTI INIZIALI
     */
    private TabSI tabSI = new TabSI();
    /**
     * SEGMENTI ALTERNATIVI INIZIALI (ACC-ADC)
     */
    private TabSAI tabSAI = new TabSAI();

    /**
     * Lessario
     */
    private TabLessario tabLessario;

    /**
     * Copy of tabLessario
     */
    private TabLessario copiedLessario = new TabLessario();

    /**
     * Tab TAB_LE
     */
    private TabLE tabLe = new TabLE();

    /**
     * SEGMENTI POST FINALI 1
     */
    private TabSPF FirstTabSpf = new TabSPF();

    /**
     * SEGMENTI POST FINALI 2
     */
    private TabSPF SecondTabSpf = new TabSPF();

    /**
     * SEGMENTI MEDIANI 1
     */
    private TabSM FirstTabSm = new TabSM();

    /**
     * SEGMENTI MEDIANI 1
     */
    private TabSM SecondTabSm = new TabSM();

    /**
     * FORME ECCEZIONALI
     */
    private TabFE tabFe = new TabFE();

    /**
     * FORME ECCEZIONALI COD SET
     */
    private TabFE3CodSet tabFe3CodSet = new TabFE3CodSet();

    /**
     * TabCodLem3Eagles REDUNDANT
     */
    private TabCodLem3Eagles tabCodLem3Eagles = new TabCodLem3Eagles();

    /**
     * FORME ECCEZIONALI COD MOR
     */
    private TabFECodMorSet tabFeCodMorSet = new TabFECodMorSet();

    /**
     * TAB 3 CODES EAGLES
     */
    private Tab3Eagles tab3e = new Tab3Eagles();

    /**
     * TAB CODES FROM COD_LE
     */
    private TabCodLE tabCodLe = new TabCodLE();

    /**
     * SEGMENTI FINALI
     */
    private TabSF tabSf = new TabSF();

    /**
     * COD MORF FROM TABSF AND/OR TABSM
     */
    private TabSFCodMorSet tabSFCodMorSet = new TabSFCodMorSet();

    /**
     * LEMMA ENDING
     */
    private TabLemmaEnding tabLemmaEnding = new TabLemmaEnding();

    /**
     * COD FROM TABSF AND/OR TABSM
     *
     */
    private TabSFCodSet tabSfCodSet = new TabSFCodSet();

    // list of tables
    private List<Tab3Eagles> ListOfTab3Eagles = new ArrayList<>();
    private List<TabCodLE> ListOfTabCodLe = new ArrayList<>();
    private List<TabCodLem3Eagles> ListOfTabCodLem3Eagles = new ArrayList<>();
    private List<TabFE> ListOfTabFE = new ArrayList<>();
    private List<TabFE3CodSet> ListOfTabFE3CodSet = new ArrayList<>();
    private List<TabFECodMorSet> ListOfTabFECodMorSet = new ArrayList<>();
    private List<TabLE> ListOfTabLE = new ArrayList<>();
    private List<TabLemmaEnding> ListOfTabLemmaEnding = new ArrayList<>();
    private List<TabLessario> ListOfTabLessario = new ArrayList<>();
    private List<TabSAI> ListOfTabSAI = new ArrayList<>();
    private List<TabSF> ListOfTabSF = new ArrayList<>();
    private List<TabSFCodMorSet> ListOfTabSFCodMorSet = new ArrayList<>();
    private List<TabSFCodSet> ListOfTabSFCodSet = new ArrayList<>();
    private List<TabSI> ListOfTabSI = new ArrayList<>();
    private List<TabSM> FirstListOfTabSM = new ArrayList<>();
    private List<TabSM> SecondListOfTabSM = new ArrayList<>();
    private List<TabSPF> FirstListOfTabSpf = new ArrayList<>();
    private List<TabSPF> SecondListOfTabSpf = new ArrayList<>();

    //booleans to check if the
    private boolean isanySI = false;
    private boolean isanySAI = false;
    private boolean isanyLes = false;
    private boolean isanyLE = false;
    private boolean isanySPF1 = false;
    private boolean isanySPF2 = false;
    private boolean isanySM1 = false;
    private boolean isanySM2 = false;
    private boolean isanyFE = false;
    private boolean isanyFE3CodSet = false;
    private boolean isanyFECodMorSet = false;
    private boolean isany3E = false;
    private boolean isanyCodle = false;
    private boolean isanySF = false;
    private boolean isanySFCodMorSet = false;
    private boolean isanySFCodSet = false;
    private boolean isanyLemmaEnding = false;
    private boolean isanyTabCodLem3Eagles = false;
    
    // getter & setter
    /**
     * @return the status
     */
    public String getStatus() {
        //return status+"-";
        return status;//+"-";
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        String prev=getStatus();
        status=prev+status;
        this.status = status;
    }

    /**
     * @return the ttId
     */
    public String getTtId() {
        return ttId;
    }

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @return the tabSI
     */
    public TabSI getTabSI() {
        return tabSI;
    }

    /**
     * @return the tabSAI
     */
    public TabSAI getTabSAI() {
        return tabSAI;
    }

    /**
     * @return the tabLessario
     */
    public TabLessario getTabLessario() {
        return tabLessario;
    }

    /**
     * @return the copiedLessario
     */
    public TabLessario getCopiedLessario() {
        return copiedLessario;
    }

    /**
     * @return the tabLe
     */
    public TabLE getTabLe() {
        return tabLe;
    }

    /**
     * @return the FirstTabSpf
     */
    public TabSPF getFirstTabSpf() {
        return FirstTabSpf;
    }

    /**
     * @return the SecondTabSpf
     */
    public TabSPF getSecondTabSpf() {
        return SecondTabSpf;
    }

    /**
     * @return the FirstTabSm
     */
    public TabSM getFirstTabSm() {
        return FirstTabSm;
    }

    /**
     * @return the SecondTabSm
     */
    public TabSM getSecondTabSm() {
        return SecondTabSm;
    }

    /**
     * @return the tabFe
     */
    public TabFE getTabFe() {
        return tabFe;
    }

    /**
     * @return the tabFe3CodSet
     */
    public TabFE3CodSet getTabFe3CodSet() {
        return tabFe3CodSet;
    }

    /**
     * @return the tabCodLem3Eagles
     */
    public TabCodLem3Eagles getTabCodLem3Eagles() {
        return tabCodLem3Eagles;
    }

    /**
     * @return the tabFeCodMorSet
     */
    public TabFECodMorSet getTabFeCodMorSet() {
        return tabFeCodMorSet;
    }

    /**
     * @return the tab3e
     */
    public Tab3Eagles getTab3e() {
        return tab3e;
    }

    /**
     * @return the tabCodLe
     */
    public TabCodLE getTabCodLe() {
        return tabCodLe;
    }

    /**
     * @return the tabSf
     */
    public TabSF getTabSf() {
        return tabSf;
    }

    /**
     * @return the tabSFCodMorSet
     */
    public TabSFCodMorSet getTabSFCodMorSet() {
        return tabSFCodMorSet;
    }

    /**
     * @return the tabLemmaEnding
     */
    public TabLemmaEnding getTabLemmaEnding() {
        return tabLemmaEnding;
    }

    /**
     * @return the tabSfCodSet
     */
    public TabSFCodSet getTabSfCodSet() {
        return tabSfCodSet;
    }

    /**
     * @return the ListOfTab3Eagles
     */
    public List<Tab3Eagles> getListOfTab3Eagles() {
        return ListOfTab3Eagles;
    }

    /**
     * @return the ListOfTabCodLe
     */
    public List<TabCodLE> getListOfTabCodLe() {
        return ListOfTabCodLe;
    }

    /**
     * @return the ListOfTabCodLem3Eagles
     */
    public List<TabCodLem3Eagles> getListOfTabCodLem3Eagles() {
        return ListOfTabCodLem3Eagles;
    }

    /**
     * @return the ListOfTabFE
     */
    public List<TabFE> getListOfTabFE() {
        return ListOfTabFE;
    }

    /**
     * @return the ListOfTabFE3CodSet
     */
    public List<TabFE3CodSet> getListOfTabFE3CodSet() {
        return ListOfTabFE3CodSet;
    }

    /**
     * @return the ListOfTabFECodMorSet
     */
    public List<TabFECodMorSet> getListOfTabFECodMorSet() {
        return ListOfTabFECodMorSet;
    }

    /**
     * @return the ListOfTabLE
     */
    public List<TabLE> getListOfTabLE() {
        return ListOfTabLE;
    }

    /**
     * @return the ListOfTabLemmaEnding
     */
    public List<TabLemmaEnding> getListOfTabLemmaEnding() {
        return ListOfTabLemmaEnding;
    }

    /**
     * @return the ListOfTabLessario
     */
    public List<TabLessario> getListOfTabLessario() {
        return ListOfTabLessario;
    }

    /**
     * @return the ListOfTabSAI
     */
    public List<TabSAI> getListOfTabSAI() {
        return ListOfTabSAI;
    }

    /**
     * @return the ListOfTabSF
     */
    public List<TabSF> getListOfTabSF() {
        return ListOfTabSF;
    }

    /**
     * @return the ListOfTabSFCodMorSet
     */
    public List<TabSFCodMorSet> getListOfTabSFCodMorSet() {
        return ListOfTabSFCodMorSet;
    }

    /**
     * @return the ListOfTabSFCodSet
     */
    public List<TabSFCodSet> getListOfTabSFCodSet() {
        return ListOfTabSFCodSet;
    }

    /**
     * @return the ListOfTabSI
     */
    public List<TabSI> getListOfTabSI() {
        return ListOfTabSI;
    }

    /**
     * @return the FirstListOfTabSM
     */
    public List<TabSM> getFirstListOfTabSM() {
        return FirstListOfTabSM;
    }

    /**
     * @return the SecondListOfTabSM
     */
    public List<TabSM> getSecondListOfTabSM() {
        return SecondListOfTabSM;
    }

    /**
     * @return the FirstListOfTabSpf
     */
    public List<TabSPF> getFirstListOfTabSpf() {
        return FirstListOfTabSpf;
    }

    /**
     * @return the SecondListOfTabSpf
     */
    public List<TabSPF> getSecondListOfTabSpf() {
        return SecondListOfTabSpf;
    }

    /**
     * @return the isanySI
     */
    public boolean isIsanySI() {
        return isanySI;
    }

    /**
     * @return the isanySAI
     */
    public boolean isIsanySAI() {
        return isanySAI;
    }

    /**
     * @return the isanyLes
     */
    public boolean isIsanyLes() {
        return isanyLes;
    }

    /**
     * @return the isanyLE
     */
    public boolean isIsanyLE() {
        return isanyLE;
    }

    /**
     * @return the isanySPF1
     */
    public boolean isIsanySPF1() {
        return isanySPF1;
    }

    /**
     * @return the isanySPF2
     */
    public boolean isIsanySPF2() {
        return isanySPF2;
    }

    /**
     * @return the isanySM1
     */
    public boolean isIsanySM1() {
        return isanySM1;
    }

    /**
     * @return the isanySM2
     */
    public boolean isIsanySM2() {
        return isanySM2;
    }

    /**
     * @return the isanyFE
     */
    public boolean isIsanyFE() {
        return isanyFE;
    }

    /**
     * @return the isanyFE3CodSet
     */
    public boolean isIsanyFE3CodSet() {
        return isanyFE3CodSet;
    }

    /**
     * @return the isanyFECodMorSet
     */
    public boolean isIsanyFECodMorSet() {
        return isanyFECodMorSet;
    }

    /**
     * @return the isany3E
     */
    public boolean isIsany3E() {
        return isany3E;
    }

    /**
     * @return the isanyCodle
     */
    public boolean isIsanyCodle() {
        return isanyCodle;
    }

    /**
     * @return the isanySF
     */
    public boolean isIsanySF() {
        return isanySF;
    }

    /**
     * @return the isanySFCodMorSet
     */
    public boolean isIsanySFCodMorSet() {
        return isanySFCodMorSet;
    }

    /**
     * @return the isanySFCodSet
     */
    public boolean isIsanySFCodSet() {
        return isanySFCodSet;
    }

    /**
     * @return the isanyLemmaEnding
     */
    public boolean isIsanyLemmaEnding() {
        return isanyLemmaEnding;
    }

    /**
     * @return the isanyTabCodLem3Eagles
     */
    public boolean isIsanyTabCodLem3Eagles() {
        return isanyTabCodLem3Eagles;
    }

    /**
     * @param ttId the ttId to set
     */
    public void setTtId(String ttId) {
        this.ttId = ttId;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    /**
     * @param tabSI the tabSI to set
     */
    public void setTabSI(TabSI tabSI) {
        this.tabSI = tabSI;
    }

    /**
     * @param tabSAI the tabSAI to set
     */
    public void setTabSAI(TabSAI tabSAI) {
        this.tabSAI = tabSAI;
    }

    /**
     * @param tabLessario the tabLessario to set
     */
    public void setTabLessario(TabLessario tabLessario) {
        this.tabLessario = tabLessario;
    }

    /**
     * @param copiedLessario the copiedLessario to set
     */
    public void setCopiedLessario(TabLessario copiedLessario) {
        this.copiedLessario = copiedLessario;
    }

    /**
     * @param tabLe the tabLe to set
     */
    public void setTabLe(TabLE tabLe) {
        this.tabLe = tabLe;
    }

    /**
     * @param FirstTabSpf the FirstTabSpf to set
     */
    public void setFirstTabSpf(TabSPF FirstTabSpf) {
        this.FirstTabSpf = FirstTabSpf;
    }

    /**
     * @param SecondTabSpf the SecondTabSpf to set
     */
    public void setSecondTabSpf(TabSPF SecondTabSpf) {
        this.SecondTabSpf = SecondTabSpf;
    }

    /**
     * @param FirstTabSm the FirstTabSm to set
     */
    public void setFirstTabSm(TabSM FirstTabSm) {
        this.FirstTabSm = FirstTabSm;
    }

    /**
     * @param SecondTabSm the SecondTabSm to set
     */
    public void setSecondTabSm(TabSM SecondTabSm) {
        this.SecondTabSm = SecondTabSm;
    }

    /**
     * @param tabFe the tabFe to set
     */
    public void setTabFe(TabFE tabFe) {
        this.tabFe = tabFe;
    }

    /**
     * @param tabFe3CodSet the tabFe3CodSet to set
     */
    public void setTabFe3CodSet(TabFE3CodSet tabFe3CodSet) {
        this.tabFe3CodSet = tabFe3CodSet;
    }

    /**
     * @param tabCodLem3Eagles the tabCodLem3Eagles to set
     */
    public void setTabCodLem3Eagles(TabCodLem3Eagles tabCodLem3Eagles) {
        this.tabCodLem3Eagles = tabCodLem3Eagles;
    }

    /**
     * @param tabFeCodMorSet the tabFeCodMorSet to set
     */
    public void setTabFeCodMorSet(TabFECodMorSet tabFeCodMorSet) {
        this.tabFeCodMorSet = tabFeCodMorSet;
    }

    /**
     * @param tab3e the tab3e to set
     */
    public void setTab3e(Tab3Eagles tab3e) {
        this.tab3e = tab3e;
    }

    /**
     * @param tabCodLe the tabCodLe to set
     */
    public void setTabCodLe(TabCodLE tabCodLe) {
        this.tabCodLe = tabCodLe;
    }

    /**
     * @param tabSf the tabSf to set
     */
    public void setTabSf(TabSF tabSf) {
        this.tabSf = tabSf;
    }

    /**
     * @param tabSFCodMorSet the tabSFCodMorSet to set
     */
    public void setTabSFCodMorSet(TabSFCodMorSet tabSFCodMorSet) {
        this.tabSFCodMorSet = tabSFCodMorSet;
    }

    /**
     * @param tabLemmaEnding the tabLemmaEnding to set
     */
    public void setTabLemmaEnding(TabLemmaEnding tabLemmaEnding) {
        this.tabLemmaEnding = tabLemmaEnding;
    }

    /**
     * @param tabSfCodSet the tabSfCodSet to set
     */
    public void setTabSfCodSet(TabSFCodSet tabSfCodSet) {
        this.tabSfCodSet = tabSfCodSet;
    }

    /**
     * @param ListOfTab3Eagles the ListOfTab3Eagles to set
     */
    public void setListOfTab3Eagles(List<Tab3Eagles> ListOfTab3Eagles) {
        this.ListOfTab3Eagles = ListOfTab3Eagles;
    }

    /**
     * @param ListOfTabCodLe the ListOfTabCodLe to set
     */
    public void setListOfTabCodLe(List<TabCodLE> ListOfTabCodLe) {
        this.ListOfTabCodLe = ListOfTabCodLe;
    }

    /**
     * @param ListOfTabCodLem3Eagles the ListOfTabCodLem3Eagles to set
     */
    public void setListOfTabCodLem3Eagles(List<TabCodLem3Eagles> ListOfTabCodLem3Eagles) {
        this.ListOfTabCodLem3Eagles = ListOfTabCodLem3Eagles;
    }

    /**
     * @param ListOfTabFE the ListOfTabFE to set
     */
    public void setListOfTabFE(List<TabFE> ListOfTabFE) {
        this.ListOfTabFE = ListOfTabFE;
    }

    /**
     * @param ListOfTabFE3CodSet the ListOfTabFE3CodSet to set
     */
    public void setListOfTabFE3CodSet(List<TabFE3CodSet> ListOfTabFE3CodSet) {
        this.ListOfTabFE3CodSet = ListOfTabFE3CodSet;
    }

    /**
     * @param ListOfTabFECodMorSet the ListOfTabFECodMorSet to set
     */
    public void setListOfTabFECodMorSet(List<TabFECodMorSet> ListOfTabFECodMorSet) {
        this.ListOfTabFECodMorSet = ListOfTabFECodMorSet;
    }

    /**
     * @param ListOfTabLE the ListOfTabLE to set
     */
    public void setListOfTabLE(List<TabLE> ListOfTabLE) {
        this.ListOfTabLE = ListOfTabLE;
    }

    /**
     * @param ListOfTabLemmaEnding the ListOfTabLemmaEnding to set
     */
    public void setListOfTabLemmaEnding(List<TabLemmaEnding> ListOfTabLemmaEnding) {
        this.ListOfTabLemmaEnding = ListOfTabLemmaEnding;
    }

    /**
     * @param ListOfTabLessario the ListOfTabLessario to set
     */
    public void setListOfTabLessario(List<TabLessario> ListOfTabLessario) {
        this.ListOfTabLessario = ListOfTabLessario;
    }

    /**
     * @param ListOfTabSAI the ListOfTabSAI to set
     */
    public void setListOfTabSAI(List<TabSAI> ListOfTabSAI) {
        this.ListOfTabSAI = ListOfTabSAI;
    }

    /**
     * @param ListOfTabSF the ListOfTabSF to set
     */
    public void setListOfTabSF(List<TabSF> ListOfTabSF) {
        this.ListOfTabSF = ListOfTabSF;
    }

    /**
     * @param ListOfTabSFCodMorSet the ListOfTabSFCodMorSet to set
     */
    public void setListOfTabSFCodMorSet(List<TabSFCodMorSet> ListOfTabSFCodMorSet) {
        this.ListOfTabSFCodMorSet = ListOfTabSFCodMorSet;
    }

    /**
     * @param ListOfTabSFCodSet the ListOfTabSFCodSet to set
     */
    public void setListOfTabSFCodSet(List<TabSFCodSet> ListOfTabSFCodSet) {
        this.ListOfTabSFCodSet = ListOfTabSFCodSet;
    }

    /**
     * @param ListOfTabSI the ListOfTabSI to set
     */
    public void setListOfTabSI(List<TabSI> ListOfTabSI) {
        this.ListOfTabSI = ListOfTabSI;
    }

    /**
     * @param FirstListOfTabSM the FirstListOfTabSM to set
     */
    public void setFirstListOfTabSM(List<TabSM> FirstListOfTabSM) {
        this.FirstListOfTabSM = FirstListOfTabSM;
    }

    /**
     * @param SecondListOfTabSM the SecondListOfTabSM to set
     */
    public void setSecondListOfTabSM(List<TabSM> SecondListOfTabSM) {
        this.SecondListOfTabSM = SecondListOfTabSM;
    }

    /**
     * @param FirstListOfTabSpf the FirstListOfTabSpf to set
     */
    public void setFirstListOfTabSpf(List<TabSPF> FirstListOfTabSpf) {
        this.FirstListOfTabSpf = FirstListOfTabSpf;
    }

    /**
     * @param SecondListOfTabSpf the SecondListOfTabSpf to set
     */
    public void setSecondListOfTabSpf(List<TabSPF> SecondListOfTabSpf) {
        this.SecondListOfTabSpf = SecondListOfTabSpf;
    }

    /**
     * @param isanySI the isanySI to set
     */
    public void setIsanySI(boolean isanySI) {
        this.isanySI = isanySI;
    }

    /**
     * @param isanySAI the isanySAI to set
     */
    public void setIsanySAI(boolean isanySAI) {
        this.isanySAI = isanySAI;
    }

    /**
     * @param isanyLes the isanyLes to set
     */
    public void setIsanyLes(boolean isanyLes) {
        this.isanyLes = isanyLes;
    }

    /**
     * @param isanyLE the isanyLE to set
     */
    public void setIsanyLE(boolean isanyLE) {
        this.isanyLE = isanyLE;
    }

    /**
     * @param isanySPF1 the isanySPF1 to set
     */
    public void setIsanySPF1(boolean isanySPF1) {
        this.isanySPF1 = isanySPF1;
    }

    /**
     * @param isanySPF2 the isanySPF2 to set
     */
    public void setIsanySPF2(boolean isanySPF2) {
        this.isanySPF2 = isanySPF2;
    }

    /**
     * @param isanySM1 the isanySM1 to set
     */
    public void setIsanySM1(boolean isanySM1) {
        this.isanySM1 = isanySM1;
    }

    /**
     * @param isanySM2 the isanySM2 to set
     */
    public void setIsanySM2(boolean isanySM2) {
        this.isanySM2 = isanySM2;
    }

    /**
     * @param isanyFE the isanyFE to set
     */
    public void setIsanyFE(boolean isanyFE) {
        this.isanyFE = isanyFE;
    }

    /**
     * @param isanyFE3CodSet the isanyFE3CodSet to set
     */
    public void setIsanyFE3CodSet(boolean isanyFE3CodSet) {
        this.isanyFE3CodSet = isanyFE3CodSet;
    }

    /**
     * @param isanyFECodMorSet the isanyFECodMorSet to set
     */
    public void setIsanyFECodMorSet(boolean isanyFECodMorSet) {
        this.isanyFECodMorSet = isanyFECodMorSet;
    }

    /**
     * @param isany3E the isany3E to set
     */
    public void setIsany3E(boolean isany3E) {
        this.isany3E = isany3E;
    }

    /**
     * @param isanyCodle the isanyCodle to set
     */
    public void setIsanyCodle(boolean isanyCodle) {
        this.isanyCodle = isanyCodle;
    }

    /**
     * @param isanySF the isanySF to set
     */
    public void setIsanySF(boolean isanySF) {
        this.isanySF = isanySF;
    }

    /**
     * @param isanySFCodMorSet the isanySFCodMorSet to set
     */
    public void setIsanySFCodMorSet(boolean isanySFCodMorSet) {
        this.isanySFCodMorSet = isanySFCodMorSet;
    }

    /**
     * @param isanySFCodSet the isanySFCodSet to set
     */
    public void setIsanySFCodSet(boolean isanySFCodSet) {
        this.isanySFCodSet = isanySFCodSet;
    }

    /**
     * @param isanyLemmaEnding the isanyLemmaEnding to set
     */
    public void setIsanyLemmaEnding(boolean isanyLemmaEnding) {
        this.isanyLemmaEnding = isanyLemmaEnding;
    }

    /**
     * @param isanyTabCodLem3Eagles the isanyTabCodLem3Eagles to set
     */
    public void setIsanyTabCodLem3Eagles(boolean isanyTabCodLem3Eagles) {
        this.isanyTabCodLem3Eagles = isanyTabCodLem3Eagles;
    }

    
}
