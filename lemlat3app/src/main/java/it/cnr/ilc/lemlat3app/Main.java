package it.cnr.ilc.lemlat3app;

import it.cnr.ilc.lemlat3utils.PropertyLoader;
import java.util.Properties;
import org.apache.log4j.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Main class, just to play around
 * @author riccardodelgratta
 */
public class Main {

    static final String CLASS_NAME = Main.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String routine = "main routine";
        String logmess = "a";
        
        PropertyLoader propLoad = new PropertyLoader("/lemlat3.properties");
        Properties props = propLoad.propertyLoader();
        String host = propLoad.getPropertyAsString(props, "hosta");

        boolean deb = propLoad.getPropertyAsBoolean(props, "debug");
        if (deb) {
            System.out.println("Main.main()");
            logmess = String.format("Property 'host ' with value -%s- %s", host, routine);
            log.info(logmess);
            logmess = String.format("Property 'deb ' with value -%s- %s", deb, routine);
            log.info(logmess);
        }

    }

}
