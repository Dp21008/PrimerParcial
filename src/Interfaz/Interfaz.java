package Interfaz;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;

    public Interfaz() {
        initComponents();
        setIconImage(getIconImage());
    }
    @Override 
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/favicon.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logoname = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        favicon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passLabel = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 550));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logoname.setForeground(new java.awt.Color(255, 255, 255));
        logoname.setText("UES FMO");
        bg.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 360, -1, -1));

        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tienda.png"))); // NOI18N
        citybg.setText("jLabel2");
        bg.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 700, 550));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        exitTxt.setFont(new java.awt.Font("Dubai Medium", 0, 22)); // NOI18N
        exitTxt.setForeground(new java.awt.Color(153, 153, 153));
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("x");
        exitTxt.setToolTipText("");
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1170, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 30));

        favicon.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        favicon.setForeground(new java.awt.Color(0, 0, 0));
        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/favicon.png"))); // NOI18N
        favicon.setText("FMOcc");
        bg.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 180, 50));

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("INICIAR SESIÓN");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        userLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(0, 0, 0));
        userLabel.setText("USUARIO");
        bg.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        userTxt.setBackground(new java.awt.Color(255, 255, 255));
        userTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userTxt.setForeground(new java.awt.Color(204, 204, 204));
        userTxt.setText("Ingrese su nombre de usuario");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        bg.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 430, -1));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 430, -1));

        passLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passLabel.setForeground(new java.awt.Color(0, 0, 0));
        passLabel.setText("CONTRASEÑA");
        bg.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        passTxt.setBackground(new java.awt.Color(255, 255, 255));
        passTxt.setForeground(new java.awt.Color(204, 204, 204));
        passTxt.setText("********");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        passTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtActionPerformed(evt);
            }
        });
        bg.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 430, -1));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 430, -1));

        loginBtn.setBackground(new java.awt.Color(0, 136, 186));

        loginBtnTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("ENTRAR");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int posicionX = evt.getXOnScreen();
        int posicionY = evt.getYOnScreen();
        this.setLocation(posicionX - xMouse, posicionY - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(new java.awt.Color(0, 136, 186));
        exitTxt.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitTxt.setForeground(new java.awt.Color(153, 153, 153));
    }//GEN-LAST:event_exitTxtMouseExited

    private void loginBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseEntered
        loginBtn.setBackground(new java.awt.Color(0, 170, 200));
    }//GEN-LAST:event_loginBtnTxtMouseEntered

    private void loginBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseExited
        loginBtn.setBackground(new java.awt.Color(0, 136, 186));
    }//GEN-LAST:event_loginBtnTxtMouseExited

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        if (userTxt.getText().equals("Ingrese su nombre de usuario")) {
            userTxt.setText("");
            userTxt.setForeground(new java.awt.Color(0, 0, 0));
        }
        if ((String.valueOf(passTxt.getPassword())).equals("")) {
            passTxt.setText("********");
            passTxt.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if ((String.valueOf(passTxt.getPassword())).equals("********")) {
            passTxt.setText("");
            passTxt.setForeground(new java.awt.Color(0, 0, 0));
        }
        if (userTxt.getText().equals("")) {
            userTxt.setText("Ingrese su nombre de usuario");
            userTxt.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_passTxtMousePressed

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
        boolean vacio1 = false;
        boolean vacio2 = false;
        int i;
        for(i=0;i<userTxt.getText().length();i++){
            if(userTxt.getText().charAt(i)==' '){
                vacio1=false;
            }else{
                vacio1=true;
                i=userTxt.getText().length()+1;
            }
        }    
        for(i=0;i<(String.valueOf(passTxt.getPassword())).length();i++){
            if((String.valueOf(passTxt.getPassword())).charAt(i)==' '){
                vacio2=false;
            }else{
                vacio2=true;
                i=(String.valueOf(passTxt.getPassword())).length()+1;
            }
        }   
        if(userTxt.getText().equals("")){
            if((String.valueOf(passTxt.getPassword())).equals("")){
                JOptionPane.showMessageDialog(null,"El usuario y contraseña no pueden estar vacíos","Error de usuario y contraseña",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"El usuario no puede estar vacío","Error de usuario",JOptionPane.ERROR_MESSAGE);
            }
        }else if((String.valueOf(passTxt.getPassword())).equals("")){
            JOptionPane.showMessageDialog(null,"La contraeña no puede estar vacía","Error de contraseña",JOptionPane.ERROR_MESSAGE);
        }else if(userTxt.getText().equals("Ingrese su nombre de usuario")){
            if((String.valueOf(passTxt.getPassword())).equals("********")){
                JOptionPane.showMessageDialog(null,"No se ha introducido el usuario ni la contraseña","Error de usuario y contraseña",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"No se ha introducido el usuario","Error de usuario",JOptionPane.ERROR_MESSAGE);
            }
        }else if((String.valueOf(passTxt.getPassword())).equals("********")){
            JOptionPane.showMessageDialog(null,"No se ha introducido la contraseña","Error de contraseña",JOptionPane.ERROR_MESSAGE);
        }else if(vacio1==false){
            if(vacio2==false){
                JOptionPane.showMessageDialog(null,"El usuario y contraseña no pueden ser únicamente espacios","Error de usuario y contraseña",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"El usuario no puede ser únicamente espacios","Error de usuario",JOptionPane.ERROR_MESSAGE);   
            }
        }else if(vacio2==false){
            JOptionPane.showMessageDialog(null,"La contraseña no puede ser únicamente espacios","Error de contraseña",JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Usuario: " + this.userTxt.getText() + "\nContraseña: " + String.valueOf(this.passTxt.getPassword()),"Datos ingresados",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel citybg;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JLabel logoname;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
