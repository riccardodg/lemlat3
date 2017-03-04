/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.app.utils;

import it.cnr.ilc.jauceps.lib.impl.table.TabCodMorfDescr;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabCodMorfQuery;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingQueries;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class ResponseManager {

    private TravellingTables travellingtables;
    private TravellingQueries travellingqueries;

    public String[] segmentizer(String[] segments, short hasPart) {
        String[] retStr = new String[3];// 
        //init 
        retStr[0] = ""; // part
        retStr[1] = "";//enc
        retStr[2] = "";//segments

        String enc = segments[6];
        String part = segments[5];
        String outSegStr = "";

        if (!"".equals(enc)) {
            retStr[0] = enc;

        }

        if (hasPart == 1) {
            retStr[1] = part;
        }

        if (!"".equals(segments[0])) {
            outSegStr = segments[0] + "*";
        }
        outSegStr = outSegStr + segments[1];

        for (int s = 2; s < 5; s++) {
            if (!"".equals(segments[s])) {
                //System.err.println("SEGS " + Arrays.toString(segments) + " " + segments[s] + " " + outSegStr + " " + a);
                outSegStr = outSegStr + " -" + segments[s];
            }
        }
        //po.println(outSegStr);
        if (hasPart == 1 && !"".equals(part)) {
            outSegStr = outSegStr + " -" + part;
        }

        retStr[2] = outSegStr;

        return retStr;
    }

    public String getlemmaMorfCodes(String[] codes) {
        String ret = "";
        for (String code : codes) {
            ret = ret + code;
        }
        return ret;
    }

    public String[] getCodMorfDescription(String[] codes, int offset) {
        TabCodMorfQuery tabcodmordescq = travellingqueries.getTabcodmorfq();
        tabcodmordescq.setConn(travellingqueries.getConn());
        String[] retcodes=new String[codes.length];
        //System.err.println("CVCVV "+Arrays.toString(codes));
        for (int k = 0; k < codes.length; k++) {
            if (!"-".equals(codes[k])) {
                List<TabCodMorfDescr> tabs = tabcodmordescq.getCodMorfDescrSet(k + offset, codes[k]);
                for (TabCodMorfDescr tab : tabs) {
                    retcodes[k]=tab.getField_descr()+":"+tab.getValue_descr();
                    //po.println(String.format("%s:\t%s", tab.getField_descr(), tab.getValue_descr()));
                }
            }
        }
        //System.err.println("CVCVV "+Arrays.toString(retcodes));
        return retcodes;
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

    /**
     * @return the travellingqueries
     */
    public TravellingQueries getTravellingqueries() {
        return travellingqueries;
    }

    /**
     * @param travellingqueries the travellingqueries to set
     */
    public void setTravellingqueries(TravellingQueries travellingqueries) {
        this.travellingqueries = travellingqueries;
    }

}
