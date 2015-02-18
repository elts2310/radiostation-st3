/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import radiostation_POJO.Album;

/**
 *
 * @author eliastsourapas
 */
public class R8_GroupAlbum_View extends javax.swing.JFrame {

    /**
     * Creates new form R8_GroupAlbum_View
     */
    public R8_GroupAlbum_View() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addGroupAlbum = new javax.swing.JButton();
        deleteSelectedGroupAlbum = new javax.swing.JButton();
        editSelectedGroupAlbum = new javax.swing.JButton();
        ExitGroupAlbum = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Άλμπουμ Συγκροτημάτων");

        addGroupAlbum.setText("Προσθήκη");
        addGroupAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupAlbumActionPerformed(evt);
            }
        });

        deleteSelectedGroupAlbum.setText("Διαγραφή");
        deleteSelectedGroupAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSelectedGroupAlbumActionPerformed(evt);
            }
        });

        editSelectedGroupAlbum.setText("Επεξεργασία");
        editSelectedGroupAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSelectedGroupAlbumActionPerformed(evt);
            }
        });

        ExitGroupAlbum.setText("Έξοδος");
        ExitGroupAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitGroupAlbumActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(addGroupAlbum)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deleteSelectedGroupAlbum)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(editSelectedGroupAlbum)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                            .addComponent(ExitGroupAlbum))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addGroupAlbum)
                    .addComponent(deleteSelectedGroupAlbum)
                    .addComponent(editSelectedGroupAlbum)
                    .addComponent(ExitGroupAlbum))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addGroupAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupAlbumActionPerformed
        // TODO add your handling code here:
        R9_GroupAlbum_Management gam = new R9_GroupAlbum_Management();
        gam.setVisible(true);
    }//GEN-LAST:event_addGroupAlbumActionPerformed

    private void ExitGroupAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitGroupAlbumActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitGroupAlbumActionPerformed

    private void deleteSelectedGroupAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSelectedGroupAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteSelectedGroupAlbumActionPerformed

    private void editSelectedGroupAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSelectedGroupAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editSelectedGroupAlbumActionPerformed

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
            java.util.logging.Logger.getLogger(R8_GroupAlbum_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(R8_GroupAlbum_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(R8_GroupAlbum_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(R8_GroupAlbum_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new R8_GroupAlbum_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitGroupAlbum;
    private javax.swing.JButton addGroupAlbum;
    private javax.swing.JButton deleteSelectedGroupAlbum;
    private javax.swing.JButton editSelectedGroupAlbum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
