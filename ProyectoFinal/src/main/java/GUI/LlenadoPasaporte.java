/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Programa.Principal;
import javax.swing.JPanel;

/**
 *
 * @author Alexs
 */
public class LlenadoPasaporte extends javax.swing.JFrame {

    private Principal principal;

    public LlenadoPasaporte(Principal principal) {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.principal = principal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        pasaportes = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 3));
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel3.setText(" ");
        jPanel2.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jLabel4.setText("   ");
        jPanel2.add(jLabel4, java.awt.BorderLayout.LINE_END);

        jLabel5.setText(" ");
        jPanel2.add(jLabel5, java.awt.BorderLayout.PAGE_END);

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        jPanel2.add(aceptar, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout pasaportesLayout = new javax.swing.GroupLayout(pasaportes);
        pasaportes.setLayout(pasaportesLayout);
        pasaportesLayout.setHorizontalGroup(
            pasaportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pasaportesLayout.setVerticalGroup(
            pasaportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        getContentPane().add(pasaportes, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        principal.getControlCBoletos().verificarPasaportes();
    }//GEN-LAST:event_aceptarActionPerformed

    public JPanel getPasaportes() {
        return pasaportes;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pasaportes;
    // End of variables declaration//GEN-END:variables
}
