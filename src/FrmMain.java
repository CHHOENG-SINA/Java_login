import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setEnableMenuData(false);
    }

   public void setEnableMenuData(boolean status){
       menutransaction.setEnabled(status);
       menureport.setEnabled(status);
       menudata.setEnabled(status);
       menusetting.setEnabled(status);
       menuitem_login.setEnabled(!status);
       menuitem_logout.setEnabled(status);
   }
   
   private void putCenterscreen(JInternalFrame frm){
       int swidth = this.getWidth();
       int sheight = this.getHeight();
       int x = (swidth - frm.getWidth())/2;
       int y = (sheight - frm.getHeight())/2;
       frm.setLocation(x, y);
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        display_panel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menufile = new javax.swing.JMenu();
        menuitem_login = new javax.swing.JCheckBoxMenuItem();
        menuitem_logout = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuitem_exit = new javax.swing.JCheckBoxMenuItem();
        menudata = new javax.swing.JMenu();
        menutransaction = new javax.swing.JMenu();
        menureport = new javax.swing.JMenu();
        menusetting = new javax.swing.JMenu();
        menuhelp = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu6.setText("jMenu6");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");

        display_panel.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout display_panelLayout = new javax.swing.GroupLayout(display_panel);
        display_panel.setLayout(display_panelLayout);
        display_panelLayout.setHorizontalGroup(
            display_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 848, Short.MAX_VALUE)
        );
        display_panelLayout.setVerticalGroup(
            display_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        menufile.setText("File");

        menuitem_login.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menuitem_login.setSelected(true);
        menuitem_login.setText("Login ");
        menuitem_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_loginActionPerformed(evt);
            }
        });
        menufile.add(menuitem_login);

        menuitem_logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuitem_logout.setSelected(true);
        menuitem_logout.setText("Logout");
        menuitem_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_logoutActionPerformed(evt);
            }
        });
        menufile.add(menuitem_logout);
        menufile.add(jSeparator1);

        menuitem_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuitem_exit.setSelected(true);
        menuitem_exit.setText("Exit");
        menuitem_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_exitActionPerformed(evt);
            }
        });
        menufile.add(menuitem_exit);

        jMenuBar1.add(menufile);

        menudata.setText("Data");
        jMenuBar1.add(menudata);

        menutransaction.setText("Transaction");
        jMenuBar1.add(menutransaction);

        menureport.setText("Report");
        jMenuBar1.add(menureport);

        menusetting.setText("Setting");
        jMenuBar1.add(menusetting);

        menuhelp.setText("Help");
        jMenuBar1.add(menuhelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(display_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(display_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuitem_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_loginActionPerformed
        try{
            
            FrmLogin frm = new FrmLogin(this);
            display_panel.add(frm);
            putCenterscreen(frm);
            frm.setVisible(true);
            
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        
        
    }//GEN-LAST:event_menuitem_loginActionPerformed

    private void menuitem_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_logoutActionPerformed
        int click = JOptionPane.showConfirmDialog(null, "Do you want to logout?","Logout", JOptionPane.YES_NO_OPTION);
        if(click == JOptionPane.YES_OPTION){
            setEnableMenuData(false);
            this.setTitle("");
        }
    }//GEN-LAST:event_menuitem_logoutActionPerformed

    private void menuitem_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuitem_exitActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel display_panel;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menudata;
    private javax.swing.JMenu menufile;
    private javax.swing.JMenu menuhelp;
    private javax.swing.JCheckBoxMenuItem menuitem_exit;
    private javax.swing.JCheckBoxMenuItem menuitem_login;
    private javax.swing.JCheckBoxMenuItem menuitem_logout;
    private javax.swing.JMenu menureport;
    private javax.swing.JMenu menusetting;
    private javax.swing.JMenu menutransaction;
    // End of variables declaration//GEN-END:variables

    private void setEnableMenu(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
