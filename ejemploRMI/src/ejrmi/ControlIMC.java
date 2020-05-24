/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author al_re
 */
public class ControlIMC extends javax.swing.JFrame {
    
    private String user="";
    /**
     * Creates new form ControlIMC
     */
    public ControlIMC(String use) {
        initComponents();
        this.setLocationRelativeTo(null);
        setUser(use);
        IMC();
    }
    
    

    public String getUser() {
        return user;
    }

    public void setUser(String us) {
        this.user = us;
    }
    
    public void bienvenida(String nombre){
        texUsuario.setText(nombre);
    }
    
    public void IMC(){

          try{
           String ip= "192.168.0.12";
           // Registry reg = LocateRegistry.getRegistry("192.168.43.165", 1098);
            Registry miRegistro = LocateRegistry.getRegistry(ip, 1099);
            Calculadora c =(Calculadora)miRegistro.lookup("Calculadora");
     
            clasificacion.setText(c.Clasificacion(user));
            
            imc.setText(Float.toString(c.getIMC()));
            
            bienvenida(c.getNombre());
            
            recomendacion.setText(c.getRecomendacion());
            
            videos.setText(c.getVideo());
            
            imc.setEditable(false);
            clasificacion.setEditable(false);
            recomendacion.setEditable(false);
            videos.setEditable(false);
            
                                           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Servidor no encontrado en el IMC de ControlIMC\n" + "INTENTELO MAS TARDE");
            System.out.println(e); 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        clasificacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        videos = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        registrarAvance = new javax.swing.JButton();
        historial = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        texUsuario = new javax.swing.JLabel();
        editarDatos = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        recomendacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control IMC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText(" al Sistema de Control de IMC ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("IMC obtenido:");

        imc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imcActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Clasificación:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Videos recomendados:");

        videos.setColumns(20);
        videos.setRows(5);
        jScrollPane1.setViewportView(videos);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Recomendaciones adicionales:");

        registrarAvance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        registrarAvance.setText("Registrar Avance");
        registrarAvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarAvanceActionPerformed(evt);
            }
        });

        historial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        historial.setText("Informe");
        historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Bienvenido");

        texUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texUsuario.setText("Usuario");

        editarDatos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editarDatos.setText("Editar Datos");
        editarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarDatosActionPerformed(evt);
            }
        });

        cerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cerrarSesion.setText("cerrar sesión");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });

        recomendacion.setColumns(20);
        recomendacion.setRows(5);
        jScrollPane2.setViewportView(recomendacion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(historial)
                                .addGap(34, 34, 34)
                                .addComponent(editarDatos)
                                .addGap(36, 36, 36)
                                .addComponent(cerrarSesion))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(clasificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                            .addComponent(imc))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel5)
                    .addComponent(registrarAvance)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(texUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(texUsuario)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(imc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarAvance)
                    .addComponent(historial)
                    .addComponent(editarDatos)
                    .addComponent(cerrarSesion))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imcActionPerformed

    private void registrarAvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarAvanceActionPerformed
      try{
           String ip= "192.168.0.12";
           // Registry reg = LocateRegistry.getRegistry("192.168.43.165", 1098);
            Registry miRegistro = LocateRegistry.getRegistry(ip, 1099);
            Calculadora c =(Calculadora)miRegistro.lookup("Calculadora");
            
           
            JOptionPane.showMessageDialog(null, c.registrar(c.getIMC(), clasificacion.getText(), user));

                                           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Servidor no encontrado en registrar avance en el ControlIMC\n" + "INTENTELO MAS TARDE");
            System.out.println(e); 
        }
    }//GEN-LAST:event_registrarAvanceActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        Login log = new Login();
        log.setVisible(true);
        log.pack();
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void editarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarDatosActionPerformed
       Registro_1 edtext = new Registro_1();
       edtext.setVisible(true);
       edtext.pack();
        try{
            
           String ip= "192.168.0.12";
           // Registry reg = LocateRegistry.getRegistry("192.168.43.165", 1098);
            Registry miRegistro = LocateRegistry.getRegistry(ip, 1099);
            Calculadora c =(Calculadora)miRegistro.lookup("Calculadora");
            
            edtext.precargarDatos(c.editar(user));
                                      
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Servidor no encontrado\n" + "INTENTELO MAS TARDE");
            System.out.println(e); 
        }
      
       edtext.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_editarDatosActionPerformed

    private void historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialActionPerformed

         Tabla regi = new Tabla(user);
             regi.setVisible(true);
             regi.pack(); 
             regi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             this.dispose();
        
    }//GEN-LAST:event_historialActionPerformed

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
            java.util.logging.Logger.getLogger(ControlIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ControlIMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JTextField clasificacion;
    private javax.swing.JButton editarDatos;
    private javax.swing.JButton historial;
    private javax.swing.JTextField imc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea recomendacion;
    private javax.swing.JButton registrarAvance;
    private javax.swing.JLabel texUsuario;
    private javax.swing.JTextArea videos;
    // End of variables declaration//GEN-END:variables
}
