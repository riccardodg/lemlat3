/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lemlat3utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;

/**
 * Read property values from a property file
 *
 * @author riccardodelgratta
 */
public class PropertyLoader {

    

    private String propFileName;
    static final String CLASS_NAME = PropertyLoader.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    /**
     * Constructor
     * @param propName the name of the property file
     */
    public PropertyLoader(String propName) {
        this.propFileName = propName;
    }

    /**
     * void constructor
     */
    public PropertyLoader() {

    }

    /**
     * Load the property file
     * @return the properties
     */
    public Properties propertyLoader() {
        String propFileName = getPropFileName();

        return propertyLoader(propFileName);
    }

    /**
     * Load the property file from @param propFileName
     * @param propFileName the properties
     * @return the properties
     */
    public Properties propertyLoader(String propFileName) {

        String logmess = "";
        String routine = "propertyLoader";
        InputStream inputStream = null;

        Properties prop = new Properties();
        try {
            inputStream = PropertyLoader.class.getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                logmess = String.format("property file '" + propFileName + "' not found in the classpath. Exiting...  %s", routine);
                log.fatal(logmess);
                System.exit(-1);
            }

        } catch (Exception e) {
            logmess = String.format("property file '" + propFileName + "' not found in the classpath. Exiting...  %s", routine);
            log.fatal(logmess);
            System.exit(-1);

        } finally {
            try {
                inputStream.close();
            } catch (IOException ex) {
                logmess = String.format("Error in closing property file '" + propFileName + "' %s %s", ex.getMessage(), routine);
                log.fatal(logmess);
                System.exit(-2);
            }
        }

        return prop;

    }

    /**
     * Get the property value for string properties
     * @param props properties
     * @param propName name of the property
     * @return the string value of the property
     */
    public String getPropertyAsString(Properties props, String propName) {
        String propValue = null;
        String logmess = "";
        String routine = "getPropertyAsString";
        propValue = props.getProperty(propName);
        if (propValue == null) {
            logmess = String.format("Property '" + propName + "' not found. Exiting... %s", routine);
            log.fatal(logmess);
            System.exit(-3);
        }
        return propValue;

    }

    /**
     * Get the property value for integer properties
     * @param props properties
     * @param propName name of the property
     * @return the integer value of the property
     */
    public int getPropertyAsInt(Properties props, String propName) {
        String propValue = null;
        int prop = -1;
        String logmess = "";
        String routine = "getPropertyAsInt";

        propValue = props.getProperty(propName);

        if (propValue == null) {
            logmess = String.format("Property '" + propName + "' not found. Exiting... %s", routine);
            log.fatal(logmess);
            System.exit(-3);
        } else {
            prop = Integer.parseInt(propValue);
        }
        return prop;

    }

    /**
     * Get the property value for boolean properties
     * @param props properties
     * @param propName name of the property
     * @return the boolean value of the property
     */
    public boolean getPropertyAsBoolean(Properties props, String propName) {
        String propValue = null;
        boolean prop = false;
        String logmess = "";
        String routine = "getPropertyAsBoolean";

        propValue = props.getProperty(propName);

        if (propValue == null) {
            logmess = String.format("Property '" + propName + "' not found. Exiting... %s", routine);
            log.fatal(logmess);
            System.exit(-3);
        } else {
            prop = Boolean.parseBoolean(propValue);
        }
        return prop;

    }
    
    /**
     * @return the propFileName
     */
    public String getPropFileName() {
        return propFileName;
    }

    /**
     * @param propFileName the propFileName to set
     */
    public void setPropFileName(String propFileName) {
        this.propFileName = propFileName;
    }

}
