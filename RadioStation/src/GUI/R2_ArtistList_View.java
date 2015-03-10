/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import radiostation_POJO.Artist;


/**
 *
 * @author eliastsourapas
 */
public class R2_ArtistList_View extends javax.swing.JFrame {
    public boolean createMode; //δημιουργία καλλιτέχνη
    public boolean editMode; //επεξεργασία καλλιτέχνη
    public boolean deleteMode; //διαγραφή καλλιτέχνη
    private List<Artist> artists = new ArrayList();
    private EntityManager em;
    public Artist newArtist; //Ο καλλιτέχνης που τροποποιείται

    /**
     * Creates new form R8_GroupAlbum_View
     */
    public R2_ArtistList_View() {
        initComponents();
    }
    
    public boolean getCreateMode() {
        return createMode;
    }
    
    public void setCreateMode(boolean createMode) {
        this.createMode = createMode;
    }
    
    public boolean getEditMode() {
        return editMode;
    }
    
    public void setEditMode(boolean editMode) {
        this.editMode = editMode;
    }
    
    public boolean getDeleteMode() {
        return deleteMode;
    }
    
    public void setDeleteMode(boolean deleteMode) {
        this.deleteMode = deleteMode;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        RadioStationPUEntityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("RadioStationPU").createEntityManager();
        artistQuery = java.beans.Beans.isDesignTime() ? null : RadioStationPUEntityManager0.createQuery("SELECT a FROM Artist a");
        artistList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : artistQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        addArtist = new javax.swing.JButton();
        editSelectedArtist = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        deleteSelectedArtist = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        artistsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Αρχείο Καλλιτεχνών");

        addArtist.setText("Προσθήκη");
        addArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArtistActionPerformed(evt);
            }
        });

        editSelectedArtist.setText("Επεξεργασία");
        editSelectedArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSelectedArtistActionPerformed(evt);
            }
        });

        exitBtn.setText("Έξοδος");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        deleteSelectedArtist.setText("Διαγραφή");
        deleteSelectedArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSelectedArtistActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, artistList, artistsTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${firstName}"));
        columnBinding.setColumnName("Όνομα");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lastName}"));
        columnBinding.setColumnName("Επώνυμο");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${artisticName}"));
        columnBinding.setColumnName("Καλλιτεχνικό Όνομα");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sex}"));
        columnBinding.setColumnName("Φύλο");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${genreId.genreName}"));
        columnBinding.setColumnName("Είδος Μουσικής");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${birthDay}"));
        columnBinding.setColumnName("Ημ/νία Γέννησης");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${birthPlace}"));
        columnBinding.setColumnName("Τόπος Γέννησης");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(artistsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addArtist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteSelectedArtist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editSelectedArtist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                        .addComponent(exitBtn))
                    .addComponent(jScrollPane2))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addArtist)
                    .addComponent(editSelectedArtist)
                    .addComponent(exitBtn)
                    .addComponent(deleteSelectedArtist))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArtistActionPerformed
        // TODO add your handling code here:
        this.createMode = true;
        this.editMode = false;
        this.deleteMode = false;
        this.setVisible(true);
        new R3_Artist_Management(this).setVisible(true);
    }//GEN-LAST:event_addArtistActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitArtistActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitArtistActionPerformed

    private void editSelectedArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSelectedArtistActionPerformed
        // TODO add your handling code here:
        this.createMode = false;
        this.editMode = true;
        this.deleteMode = false;
        if(artistsTable.getSelectedRow()==-1)
            JOptionPane.showMessageDialog(null, "Δεν έχει επιλεγεί καλλιτέχνης!");
        else{
            for(Artist art: artists){
                if(art.getArtistId()==artistsTable.getValueAt(artistsTable.getSelectedRow(), 0)){
                    newArtist = art;
                    new R3_Artist_Management(this).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_editSelectedArtistActionPerformed

    private void exitArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnActionPerformed

    private void deleteSelectedArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSelectedArtistActionPerformed
        // TODO add your handling code here:
        this.createMode = false;
        this.editMode = false;
        this.deleteMode = true;
        if(artistsTable.getSelectedRow()==-1)
            JOptionPane.showMessageDialog(null, "Δεν έχει επιλεγεί καλλιτέχνης!");
        else{
            for(Artist art: artists){
                if(art.getArtistId()==artistsTable.getValueAt(artistsTable.getSelectedRow(), 0)){
                    newArtist = art;
                    new R3_Artist_Management(this).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_deleteSelectedArtistActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(R2_ArtistList_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(R2_ArtistList_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(R2_ArtistList_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(R2_ArtistList_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new R2_ArtistList_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager RadioStationPUEntityManager0;
    private javax.swing.JButton addArtist;
    private java.util.List<radiostation_POJO.Artist> artistList;
    private javax.persistence.Query artistQuery;
    private javax.swing.JTable artistsTable;
    private javax.swing.JButton deleteSelectedArtist;
    private javax.swing.JButton editSelectedArtist;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
