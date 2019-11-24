/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mamun
 */
public class ConnectionHandler {
    private String driver="oracle.jdbc.OracleDriver";
    private String databaseURL="jdbc:oracle:thin:@localhost:1521:XE";
    private String username="SYSTEM";
    private String password="123";

    public Connection getConenction() throws ClassNotFoundException, SQLException
    {
        Class.forName(driver);
        return DriverManager.getConnection(databaseURL, username, password);
    }

    
}
