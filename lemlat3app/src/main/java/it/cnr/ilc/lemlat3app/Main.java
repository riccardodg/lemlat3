package it.cnr.ilc.lemlat3app;


import java.util.Properties;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riccardodelgratta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Main.main()");
        PropertyLoader propLoad=new PropertyLoader("/db.properties");
       Properties prop = propLoad.propertyLoader("/db.properties");
       String host=prop.getProperty("host");
       System.err.println("host "+host);
    }
    
}
