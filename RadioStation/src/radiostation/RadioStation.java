/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation;

import javax.persistence.*;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import radiostation_POJO.Musicgroup;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

/**
 *
 * @author eliastsourapas
 */
public class RadioStation {

    /**
     * @param args the command line arguments
     */
    //private static EntityManagerFactory emf;
    //private static EntityManager em;
    /*Connecting;*/
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI.MainMenu().setVisible(true);
            }
        });
        
    }
    
    
}
