/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lemlat3app;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import org.apache.log4j.Logger;

/**
 * Read database values from property file
 *
 * @author riccardodelgratta
 */
public class PropertyLoader {

    private String propName;
    static final String CLASS_NAME = PropertyLoader.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    public PropertyLoader(String propName) {
        this.propName = propName;
    }

    public Properties propertyLoader(String propName) {
        
        String logmess="";
        String routine="propertyLoader";

        Properties prop = new Properties();
        try {
            InputStream inputStream = PropertyLoader.class.getResourceAsStream(propName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propName + "' not found in the classpath");
            }

        } catch (Exception e) {
            logmess = String.format("property file '" + propName + "' not found in the classpath %s", routine);
            log.fatal(logmess);
            

        }
        return prop;

    }

}
