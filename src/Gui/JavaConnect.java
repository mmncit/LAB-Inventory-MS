/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

/**
 *
 * @author Mamun
 */
import java.sql.*;
import javax.swing.*;
public class JavaConnect {
    
     Connection conn = null;
    public static Connection ConnecrDb(){
        
        
        try{
        
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Mamun\\Documents\\NetBeansProjects\\New_Computer_final\\ComputerJava.sqlite");
            
            return conn;
        
        }
        catch(Exception e){
            
            
            System.out.println("not found");
            return null;
        
        
        }
    
    
    } 
}
