/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JTextField;

/**
 *
 * @author Alexs
 */
public class PedirPasaporte extends javax.swing.JPanel {

    /**
     * Creates new form pedirPasaporte
     */
    public PedirPasaporte() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pasajeroNumero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        codPasaporte = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setText("  ");
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jLabel2.setText("  ");
        add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jLabel3.setText("               ");
        add(jLabel3, java.awt.BorderLayout.LINE_END);

        jLabel4.setText("               ");
        add(jLabel4, java.awt.BorderLayout.LINE_START);

        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        pasajeroNumero.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pasajeroNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pasajeroNumero.setText("PASAJERO XD");
        jPanel1.add(pasajeroNumero);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel6.setText("No. Pasaporte  ");
        jPanel2.add(jLabel6, java.awt.BorderLayout.LINE_START);
        jPanel2.add(codPasaporte, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getCodPasaporte() {
        return codPasaporte;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codPasaporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pasajeroNumero;
    // End of variables declaration//GEN-END:variables
}
