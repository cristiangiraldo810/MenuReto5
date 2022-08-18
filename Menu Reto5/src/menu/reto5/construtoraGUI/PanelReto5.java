/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu.reto5.construtoraGUI;

import menu.reto5.construtoraDAL.conexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class PanelReto5 extends javax.swing.JFrame {

    DefaultTableModel model;

    public PanelReto5() {
        initComponents();

        String[] titulo = {"Result", "Result", "Result", "Result"};
        model = new DefaultTableModel(null, titulo);

        tblConstrutora.setModel(model);

        mostraDatos();
        mostraDatos2();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConstrutora = new javax.swing.JTable();
        btinformacion = new javax.swing.JButton();
        btinformacion2 = new javax.swing.JButton();
        btinformacion3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnPanel.setBackground(new java.awt.Color(255, 255, 255));
        pnPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblConstrutora.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblConstrutora);

        pnPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 690, 270));

        btinformacion.setFont(new java.awt.Font("Berlin Sans FB", 1, 12)); // NOI18N
        btinformacion.setText("informacion");
        btinformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinformacionActionPerformed(evt);
            }
        });
        pnPanel.add(btinformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 180, -1));

        btinformacion2.setFont(new java.awt.Font("Berlin Sans FB", 1, 12)); // NOI18N
        btinformacion2.setText("informacion2");
        btinformacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinformacion2ActionPerformed(evt);
            }
        });
        pnPanel.add(btinformacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 220, -1));

        btinformacion3.setFont(new java.awt.Font("Berlin Sans FB", 1, 12)); // NOI18N
        btinformacion3.setText("informacion3");
        btinformacion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinformacion3ActionPerformed(evt);
            }
        });
        pnPanel.add(btinformacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/reto5/imagenes/ce57afb9-fff5-4eab-a13e-76ba7cf3ffaf.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        pnPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btinformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinformacionActionPerformed
        // TODO add your handling code here:
        conexion objConexion = new conexion();
        try {
            ResultSet resultado = objConexion.consultarRegistro("SELECT ID_Lider ,Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider will ORDER BY Ciudad_Residencia");

            while (resultado.next()) {
                System.out.println(resultado.getString("ID_Lider"));
                System.out.println(resultado.getString("Nombre"));
                System.out.println(resultado.getString("Primer_Apellido"));
                System.out.println(resultado.getString("Ciudad_Residencia"));

            }
        } catch (Exception e) {
            System.out.println("e");
        }
    }//GEN-LAST:event_btinformacionActionPerformed
    public void mostraDatos() {
        conexion objConexion = new conexion();
        try {
            ResultSet resultado = objConexion.consultarRegistro("SELECT ID_Lider ,Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider will ORDER BY Ciudad_Residencia");

            while (resultado.next()) {
                System.out.println(resultado.getString("ID_Lider"));
                System.out.println(resultado.getString("Nombre"));
                System.out.println(resultado.getString("Primer_Apellido"));
                System.out.println(resultado.getString("Ciudad_Residencia"));

                Object[] usuario = {
                    resultado.getString("ID_Lider"),
                    resultado.getString("Nombre"),
                    resultado.getString("Primer_apellido"),
                    resultado.getString("ciudad_residencia")};

                model.addRow(usuario);

            }
        } catch (Exception e) {
            System.out.println("e");

        }
    }
    private void btinformacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinformacion2ActionPerformed
        // TODO add your handling code here:
        conexion objConexion = new conexion();
        try {
            ResultSet resultado = objConexion.consultarRegistro2("SELECT ID_Proyecto ,Numero_Habitaciones ,Constructora ,Ciudad ,Clasificacion FROM Proyecto  WHERE Ciudad IN ('Barranquilla','Santa Marta','Cartagena') AND Clasificacion = 'Casa Campestre'");
            while (resultado.next()) {
                System.out.println(resultado.getString("ID_Proyecto"));
                System.out.println(resultado.getString("Construtora"));
                System.out.println(resultado.getString("Numero_Habitaciones"));
                System.out.println(resultado.getString("Ciudad"));
                System.out.println(resultado.getString("Clasificacion"));

            }
        } catch (Exception e) {
            System.out.println("p");
        }


    }//GEN-LAST:event_btinformacion2ActionPerformed
 public void mostraDatos2() {
        conexion objConexion = new conexion();
        try {
            ResultSet resultado = objConexion.consultarRegistro2("SELECT ID_Proyecto ,Numero_Habitaciones ,Constructora ,Ciudad,Clasificacion FROM Proyecto WHERE Ciudad IN ('Barranquilla','Santa Marta','Cartagena') AND Clasificacion = 'Casa Campestre'");

            while (resultado.next()) {
                System.out.println(resultado.getString("ID_Proyecto"));
                System.out.println(resultado.getString("Construtora"));
                System.out.println(resultado.getString("Numero_Habitaciones"));
                System.out.println(resultado.getString("Ciudad"));
                System.out.println(resultado.getString("Clasificacion"));

                Object[] usuario = {
                    resultado.getString("ID_Proyecto"),
                    resultado.getString("Constructora"),
                    resultado.getString("Numero_Habitaciones"),
                    resultado.getString("Ciudad"),
                    resultado.getString("Clasificacion")};

                model.addRow(usuario);

            }
        } catch (Exception e) {
            System.out.println("r");

        }
    }
    private void btinformacion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinformacion3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btinformacion3ActionPerformed
  

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
            java.util.logging.Logger.getLogger(PanelReto5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelReto5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelReto5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelReto5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelReto5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btinformacion;
    private javax.swing.JButton btinformacion2;
    private javax.swing.JButton btinformacion3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnPanel;
    private javax.swing.JTable tblConstrutora;
    // End of variables declaration//GEN-END:variables
}
