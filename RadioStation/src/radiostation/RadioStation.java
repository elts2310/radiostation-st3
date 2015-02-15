/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author eliastsourapas
 */
public class RadioStation {

    /**
     * @param args the command line arguments
     */
    
    private static Connection connection;
    private static final String dbURL = "jdbc:derby://localhost:1527/RadioStation;user=GE3;password=GE3";
    
    public static void createConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            connection = DriverManager.getConnection(dbURL);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException except) {
            System.out.println("ERROR: " + except.getMessage());
        }
    }
    
    public static void shutdown() {
        try {
            if (connection != null) {
                DriverManager.getConnection(dbURL + ";shutdown=true");
                connection.close();
            }
        }    
            catch (SQLException sqlExcept) {
                    
            }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI.MainMenu().setVisible(true);
            }
        });
        
    }
    
    
}
