/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation;

import java.sql.Connection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import radiostation_POJO.Musicgroup;
import radiostation_POJO.Musicproductioncompany;
import radiostation_POJO.Album;

/**
 *
 * @author eliastsourapas
 */
public class AppControl {
    private static EntityManagerFactory emFact;
    private static EntityManager emLocal;        
    //private EntityManager emRemote;        
    //private EntityManager emThread;        
    //private static Connection connection;
    //private static final String dbURL = "jdbc:derby://localhost:1527/radiostation_db;user=radio;password=station";

    public static void Connecting(){
        try{
            emFact = Persistence.createEntityManagerFactory("RadioStationPU");
            emLocal = emFact.createEntityManager();
        }catch(Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "DB connection Failed", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static Musicgroup getMGroupByName(String inGroupName){
        Musicgroup MG;
        Query FindByName = emLocal.createNamedQuery("Musicgroup.findByMusicgroupName", Musicgroup.class);
        try{
            FindByName.setParameter("musicgroupName", inGroupName);
            MG = (Musicgroup)FindByName.getSingleResult();
        }catch(Exception e){
            return(null);
        }
        return MG;
    }
    
    public static Musicproductioncompany getMPCByName(String inGroupName){
        Musicproductioncompany MPC;
        Query FindByName = emLocal.createNamedQuery("Musicproductioncompany.findByMpcName", Musicproductioncompany.class);
        try{
            FindByName.setParameter("mpcName", inGroupName);
            MPC = (Musicproductioncompany)FindByName.getSingleResult();
        }catch(Exception e){
            return(null);
        }
        return MPC;
    }
    
    public static boolean SaveAlbum(Album album) {
        try{
            emLocal.getTransaction().begin();
            emLocal.persist(album);
            emLocal.getTransaction().commit();
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public EntityManager getLocalEntityManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
