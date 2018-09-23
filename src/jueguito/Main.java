
package jueguito;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel Torres
 */


public class Main extends javax.swing.JFrame {

    private class HiloTiempo extends Thread{
        
        @Override
        public void run(){
            int cont=0;
            while(true){
                lb_tiempo.setText("Tiempo: "+cont);
                cont++;
            }
        }
    }
    
    HiloMusica hm;
    Thread hilo;
    HiloTiempo hto;
    
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        adminTiempo th = new adminTiempo(lb_tiempo);
        th.start();
        
        hm=new HiloMusica();
        hilo = new Thread();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_login = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_login_user = new javax.swing.JTextField();
        tf_login_pwd = new javax.swing.JPasswordField();
        bt_login = new javax.swing.JButton();
        jd_register = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        tf_registrar_user = new javax.swing.JTextField();
        tf_registrar_pwd = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_signup = new javax.swing.JButton();
        jd_users = new javax.swing.JDialog();
        jd_2d = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        lb_m8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        lb_tiempo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_listaUsuarios = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_login = new javax.swing.JMenuItem();
        jmi_register = new javax.swing.JMenuItem();
        jmi_logout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmi_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jd_login.setTitle("Sign In");

        jPanel2.setToolTipText("");

        jLabel3.setText("Username:");

        jLabel4.setText("Password:");

        bt_login.setText("Sign In");
        bt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_login)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_login_user)
                            .addComponent(tf_login_pwd, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_login_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tf_login_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_login)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jd_register.setTitle("Register");

        jLabel1.setText("Usuario:");

        jLabel2.setText("Password:");

        bt_signup.setText("Registrar");
        bt_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_signupMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_signup)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tf_registrar_user, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_registrar_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_registrar_user)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_registrar_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(bt_signup)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_registerLayout = new javax.swing.GroupLayout(jd_register.getContentPane());
        jd_register.getContentPane().setLayout(jd_registerLayout);
        jd_registerLayout.setHorizontalGroup(
            jd_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_registerLayout.setVerticalGroup(
            jd_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registerLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jd_usersLayout = new javax.swing.GroupLayout(jd_users.getContentPane());
        jd_users.getContentPane().setLayout(jd_usersLayout);
        jd_usersLayout.setHorizontalGroup(
            jd_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_usersLayout.setVerticalGroup(
            jd_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_2d.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pm.png"))); // NOI18N
        jd_2d.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        lb_m8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/m8bit.png"))); // NOI18N
        jd_2d.getContentPane().add(lb_m8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 251, 208));

        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Wilkommen");
        jd_2d.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 23, -1, -1));

        jButton1.setText("< )))");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jd_2d.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        jToggleButton1.setText("Play");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jToggleButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jToggleButton1KeyPressed(evt);
            }
        });
        jd_2d.getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, -1, -1));

        lb_tiempo.setText("jLabel6");
        jd_2d.getContentPane().add(lb_tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_listaUsuarios.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_listaUsuarios);

        jMenu1.setText("File");

        jmi_login.setText("Login");
        jmi_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_loginActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_login);

        jmi_register.setText("Register");
        jmi_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_registerActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_register);

        jmi_logout.setText("Log Out");
        jMenu1.add(jmi_logout);
        jMenu1.add(jSeparator1);

        jmi_exit.setText("Exit");
        jMenu1.add(jmi_exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem1.setText("Users");
        jMenu2.add(jMenuItem1);

        jMenu3.setText("Activities");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("2D");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_loginActionPerformed
        jd_login.pack();
        jd_login.setModal(true);
        jd_login.setLocationRelativeTo(this);
        jd_login.setVisible(true);
    }//GEN-LAST:event_jmi_loginActionPerformed

    private void bt_signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_signupMouseClicked

        String user = tf_registrar_user.getText();
        String password = tf_registrar_pwd.getText();

        boolean valid = true;
        try {

            for (User u : lista) {
                if (user.equals(u.getUser())) {
                    valid = false;
                }
            }

            if (valid) {

                lista.add(new User(user, password));
                DefaultListModel modeloLista = (DefaultListModel) jl_listaUsuarios.getModel();
                modeloLista.addElement(new User(user, password));
                jl_listaUsuarios.setModel(modeloLista);

                JOptionPane.showMessageDialog(jd_register, "Agregado con exito");

                tf_registrar_user.setText("");
                tf_registrar_pwd.setText("");

            } else {
                JOptionPane.showMessageDialog(jd_register, "Ya existe un usuario con ese nombre");
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_bt_signupMouseClicked

    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked
        String user = tf_login_user.getText();
        String password = tf_login_pwd.getText();

        boolean valido = false;
        try {

            for (int i = 0; i < lista.size(); i++) {
                if (user.equals(lista.get(i).getUser()) && password.equals(lista.get(i).getPassword())) {
                    valido = true;
                }

            }
            /*
            for (User u : lista) {
                System.out.println(u.getPassword());
                if(user.equals(u.getUser()) && password.equals(u.getPassword())){
                    valido = true;
                }
            }
             */
            if (valido) {

                JOptionPane.showMessageDialog(jd_login, "Welcome");

                tf_login_user.setText("");
                tf_login_pwd.setText("");

            } else {
                JOptionPane.showMessageDialog(jd_login, "Usuario/Contraseña incorrecta");
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_bt_loginMouseClicked

    private void jmi_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_registerActionPerformed
        jd_register.pack();
        jd_register.setModal(true);
        jd_register.setLocationRelativeTo(this);
        jd_register.setVisible(true);
    }//GEN-LAST:event_jmi_registerActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jd_2d.pack();
        jd_2d.setModal(true);
        jd_2d.setLocationRelativeTo(this);
        jd_2d.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jToggleButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jToggleButton1KeyPressed

        moveImg(evt);

    }//GEN-LAST:event_jToggleButton1KeyPressed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        hilo.start();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void moveImg(java.awt.event.KeyEvent evt) {

        switch (evt.getKeyCode()) {
            case KeyEvent.VK_UP:
                moveUp();
                break;
            case KeyEvent.VK_DOWN:
                moveDown();
                break;
            case KeyEvent.VK_LEFT:
                moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                moveRight();
                break;
            default:
                System.out.println("Inválida");
                break;

        }
    }

    private void moveUp() {
        lb_m8.setLocation(lb_m8.getX(), lb_m8.getY() - 10);
    }

    private void moveDown() {
        lb_m8.setLocation(lb_m8.getX(), lb_m8.getY() + 10);
    }

    private void moveLeft() {
        lb_m8.setLocation(lb_m8.getX() - 10, lb_m8.getY());
    }

    private void moveRight() {
        lb_m8.setLocation(lb_m8.getX() + 10, lb_m8.getY());
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_signup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JDialog jd_2d;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_register;
    private javax.swing.JDialog jd_users;
    private javax.swing.JList<String> jl_listaUsuarios;
    private javax.swing.JMenuItem jmi_exit;
    private javax.swing.JMenuItem jmi_login;
    private javax.swing.JMenuItem jmi_logout;
    private javax.swing.JMenuItem jmi_register;
    private javax.swing.JLabel lb_m8;
    private javax.swing.JLabel lb_tiempo;
    private javax.swing.JPasswordField tf_login_pwd;
    private javax.swing.JTextField tf_login_user;
    private javax.swing.JPasswordField tf_registrar_pwd;
    private javax.swing.JTextField tf_registrar_user;
    // End of variables declaration//GEN-END:variables
    ArrayList<User> lista = new ArrayList();
}
