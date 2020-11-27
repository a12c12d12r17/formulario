/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.conectar;
import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author camilo
 */
public class formulario extends javax.swing.JFrame {
    conectar conecto;
    
    PreparedStatement ps;
    ResultSet rs;
    
     private static Connection conn;
     
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/dbcarpinteria";
    public formulario(){
        initComponents();
    }
    
    public Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            if(conn != null){
                System.out.println("la conexion se establecio bien");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar con la DB "+e);
        }
        return conn;
    }
    public void desconectar (){
        conn = null;
        if(conn==null){
            System.out.println("se desconecto la base de datos");
        }
    }
    public void borrarCajas(){
        cajanombre.setText(null);
        cajaEmail.setText(null);
        cajacontrasena.setText(null);
    }
    /**
     * Creates new form formulario
     */


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cajanombre = new javax.swing.JTextField();
        cajaEmail = new javax.swing.JTextField();
        cajacontrasena = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jlabel222 = new javax.swing.JLabel();
        bconectar = new javax.swing.JButton();
        bdesconectar = new javax.swing.JButton();
        benviar = new javax.swing.JButton();
        cajatelefono = new javax.swing.JTextField();
        cajaciudad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cajadireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel.setText("Nombre:");
        getContentPane().add(jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 50, 40));

        jLabel2.setText("Emai:l");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));
        getContentPane().add(cajanombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 200, -1));
        getContentPane().add(cajaEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 200, -1));
        getContentPane().add(cajacontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 200, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Formulario de registro carpinteria");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 24, 260, 20));

        jlabel222.setText("telefono:");
        getContentPane().add(jlabel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        bconectar.setText("conectar");
        bconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bconectarActionPerformed(evt);
            }
        });
        getContentPane().add(bconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        bdesconectar.setText("desconectar");
        bdesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdesconectarActionPerformed(evt);
            }
        });
        getContentPane().add(bdesconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        benviar.setText("enviar");
        benviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benviarActionPerformed(evt);
            }
        });
        getContentPane().add(benviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        cajatelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajatelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(cajatelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 200, -1));
        getContentPane().add(cajaciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 200, -1));

        jLabel1.setText("ciudad:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel5.setText("direccion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        cajadireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajadireccionActionPerformed(evt);
            }
        });
        getContentPane().add(cajadireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 200, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-vectorial-de-carpintería-en-fondo-blanco-símbolo-carpintero-vector-plano-partir-la-colección-herramientas-y-utensilios-164500342.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 100, 70));

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel7.setText(" pepeSierra");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 140, 20));

        jlfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/74682882-herramientas-de-carpintería-sobre-fondo-de-madera-vista-superior-espacio-vacío-para-el-texto-en-el-lado-.jpg"))); // NOI18N
        getContentPane().add(jlfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //comportamiento del boton conectar
    
    private void bconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bconectarActionPerformed
        // TODO add your handling code here:
        conecto = new conectar();
        Connection reg = conecto.getConnection();
    }//GEN-LAST:event_bconectarActionPerformed

    private void bdesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdesconectarActionPerformed
        // TODO add your handling code here:
        conecto.desconectar();
    }//GEN-LAST:event_bdesconectarActionPerformed

    private void benviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benviarActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        try{
            conn = getConnection();
            ps = conn.prepareStatement("insert INTO datos(nombre, email, contrasena, fechareg, n_telefono, ciudad, direccion ) VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, cajanombre.getText());
            ps.setString(2, cajaEmail.getText());
            ps.setString(3,cajacontrasena.getText());
            ps.setDate(4, Date.valueOf(LocalDate.now()));
            ps.setString(5, cajatelefono.getText());
            ps.setString(6, cajaciudad.getText());
            ps.setString(7, cajadireccion.getText());
            
            int result = ps.executeUpdate();
            if(result > 0){
                System.out.println("datos enviados");
                borrarCajas();
            }else{
                System.out.println("no se enviarion los datos");
            }
            conn.close();
        }catch(Exception e){
            System.out.println("error "+e);
        }
        
    }//GEN-LAST:event_benviarActionPerformed

    private void cajatelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajatelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajatelefonoActionPerformed

    private void cajadireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajadireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajadireccionActionPerformed

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
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bconectar;
    private javax.swing.JButton bdesconectar;
    private javax.swing.JButton benviar;
    private javax.swing.JTextField cajaEmail;
    private javax.swing.JTextField cajaciudad;
    private javax.swing.JTextField cajacontrasena;
    private javax.swing.JTextField cajadireccion;
    private javax.swing.JTextField cajanombre;
    private javax.swing.JTextField cajatelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlabel222;
    private javax.swing.JLabel jlfondo;
    // End of variables declaration//GEN-END:variables
}
