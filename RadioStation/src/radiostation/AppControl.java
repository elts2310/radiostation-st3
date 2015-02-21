/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation;

import java.sql.Connection;
import javax.persistence.EntityManager;

/**
 *
 * @author eliastsourapas
 */
public class AppControl {
    private EntityManager emLocal;        
    private EntityManager emRemote;        
    private EntityManager emThread;        
    private static Connection connection;
    private static final String dbURL = "jdbc:derby://localhost:1527/radiostation_db;user=radio;password=station";
    
}
