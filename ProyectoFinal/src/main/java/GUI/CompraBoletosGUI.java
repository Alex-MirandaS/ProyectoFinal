/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Programa.Principal;

/**
 *
 * @author Alexs
 */
public class CompraBoletosGUI extends javax.swing.JFrame {

    private Principal principal;

    public CompraBoletosGUI(Principal principal) {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.principal = principal;
        principal.getControlCBoletos().llenarLugares(listadoLugarPartida);
        principal.getControlCBoletos().llenarLugares(listadoLugarDestino);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        listadoLugarPartida = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        listadoLugarDestino = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fechaVuelo = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cViajeros = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("          ");
        getContentPane().add(jLabel2, java.awt.BorderLayout.LINE_END);

        jLabel3.setText("          ");
        getContentPane().add(jLabel3, java.awt.BorderLayout.LINE_START);

        jLabel5.setText(" ");
        getContentPane().add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jPanel7.setLayout(new java.awt.GridLayout(1, 3));

        jLabel16.setText(" ");
        jPanel7.add(jLabel16);

        jLabel17.setText(" ");
        jPanel7.add(jLabel17);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel18.setText("   ");
        jPanel8.add(jLabel18, java.awt.BorderLayout.LINE_END);

        jLabel19.setText(" ");
        jPanel8.add(jLabel19, java.awt.BorderLayout.PAGE_END);

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        jPanel8.add(aceptar, java.awt.BorderLayout.CENTER);

        jLabel20.setText(" ");
        jPanel8.add(jLabel20, java.awt.BorderLayout.PAGE_START);

        jPanel7.add(jPanel8);

        getContentPane().add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.GridLayout(2, 2));

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel6.setText("Lugar de Partida");
        jPanel2.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        jLabel10.setText("   ");
        jPanel2.add(jLabel10, java.awt.BorderLayout.LINE_START);

        jPanel2.add(listadoLugarPartida, java.awt.BorderLayout.CENTER);

        jLabel11.setText(" ");
        jPanel2.add(jLabel11, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel2);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel7.setText("Destino");
        jPanel4.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        jLabel1.setText(" ");
        jPanel4.add(jLabel1, java.awt.BorderLayout.PAGE_END);

        jLabel12.setText("   ");
        jPanel4.add(jLabel12, java.awt.BorderLayout.LINE_START);

        jPanel4.add(listadoLugarDestino, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel8.setText("Fecha de Vuelo(HH/MM)");
        jPanel5.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        jLabel13.setText("   ");
        jPanel5.add(jLabel13, java.awt.BorderLayout.LINE_START);
        jPanel5.add(fechaVuelo, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel9.setText("Cantidad de viajeros");
        jPanel6.add(jLabel9, java.awt.BorderLayout.PAGE_START);

        jLabel15.setText("   ");
        jPanel6.add(jLabel15, java.awt.BorderLayout.LINE_START);
        jPanel6.add(cViajeros, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        principal.getControlCBoletos().verificarDatos(listadoLugarPartida, listadoLugarDestino, fechaVuelo, cViajeros);
    }//GEN-LAST:event_aceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField cViajeros;
    private javax.swing.JTextField fechaVuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JComboBox<String> listadoLugarDestino;
    private javax.swing.JComboBox<String> listadoLugarPartida;
    // End of variables declaration//GEN-END:variables
}
