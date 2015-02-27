/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Panos
 */

import radiostation.RadioStation;

public class MainMenu extends javax.swing.JFrame {
    private RadioStation rs = new RadioStation();

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        this.rs = new RadioStation();
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
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuRadioStation = new javax.swing.JMenu();
        menuFiles = new javax.swing.JMenu();
        menuArtist = new javax.swing.JMenuItem();
        menuGroup = new javax.swing.JMenuItem();
        menuGroupAlbum = new javax.swing.JMenuItem();
        menuArtistAlbum = new javax.swing.JMenuItem();
        menuPlaylists = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuExit = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Nanum Brush Script", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RadioStation");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Σύστημα Διαχείρισης Λιστών Τραγουδιών για Αναπαραγωγή");

        menuRadioStation.setText("Menu");

        menuFiles.setText("Διαχείριση αρχείων");

        menuArtist.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuArtist.setText("Καλλιτέχνες");
        menuArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArtistActionPerformed(evt);
            }
        });
        menuFiles.add(menuArtist);

        menuGroup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        menuGroup.setText("Συγκροτήματα");
        menuGroup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGroupActionPerformed(evt);
            }
        });
        menuFiles.add(menuGroup);

        menuGroupAlbum.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        menuGroupAlbum.setText("Άλμπουμ Συγκροτημάτων");
        menuGroupAlbum.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuGroupAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGroupAlbumActionPerformed(evt);
            }
        });
        menuFiles.add(menuGroupAlbum);

        menuArtistAlbum.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menuArtistAlbum.setText("Άλμπουμ Καλλιτεχνών");
        menuArtistAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArtistAlbumActionPerformed(evt);
            }
        });
        menuFiles.add(menuArtistAlbum);

        menuRadioStation.add(menuFiles);

        menuPlaylists.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuPlaylists.setText("Λίστες τραγουδιών");
        menuPlaylists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPlaylistsActionPerformed(evt);
            }
        });
        menuRadioStation.add(menuPlaylists);
        menuRadioStation.add(jSeparator1);

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuExit.setText("Έξοδος");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuRadioStation.add(menuExit);

        jMenuBar1.add(menuRadioStation);

        menuHelp.setText("Help");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuHelp.add(jMenuItem1);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArtistActionPerformed
        // TODO add your handling code here:
        R2_ArtistList_View alv = new R2_ArtistList_View();
        alv.setVisible(true);
    }//GEN-LAST:event_menuArtistActionPerformed

    private void menuGroupAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGroupAlbumActionPerformed
        // TODO add your handling code here:
        R8_GroupAlbum_View gav = new R8_GroupAlbum_View();
        gav.setVisible(true);
    }//GEN-LAST:event_menuGroupAlbumActionPerformed

    private void menuGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGroupActionPerformed
        // TODO add your handling code here:
        R4_GroupList_View glv = new R4_GroupList_View();
        glv.setVisible(true);
    }//GEN-LAST:event_menuGroupActionPerformed

    private void menuArtistAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArtistAlbumActionPerformed
        // TODO add your handling code here:
        R12_ArtistAlbum_View aav = new R12_ArtistAlbum_View();
        aav.setVisible(true);
    }//GEN-LAST:event_menuArtistAlbumActionPerformed

    private void menuPlaylistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPlaylistsActionPerformed
        // TODO add your handling code here:
        R16_Playlist_View plv = new R16_Playlist_View();
        plv.setVisible(true);
    }//GEN-LAST:event_menuPlaylistsActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        aboutRadioStation abrs = new aboutRadioStation();
        abrs.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menuArtist;
    private javax.swing.JMenuItem menuArtistAlbum;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFiles;
    private javax.swing.JMenuItem menuGroup;
    private javax.swing.JMenuItem menuGroupAlbum;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuPlaylists;
    private javax.swing.JMenu menuRadioStation;
    // End of variables declaration//GEN-END:variables
}
