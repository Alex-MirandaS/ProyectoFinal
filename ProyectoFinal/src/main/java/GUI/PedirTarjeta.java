/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Programa.Principal;
import javax.swing.JLabel;

/**
 *
 * @author Alexs
 */
public class PedirTarjeta extends javax.swing.JFrame {
    
    private Principal principal;
    
    public PedirTarjeta(Principal principal) {
        initComponents();
        this.principal = principal;
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.saldoTarjeta.setText("");
        this.precioTotal.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        codTarjeta = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        saldoTarjeta = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cVC = new javax.swing.JTextField();
        precioTotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("  ");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jLabel2.setText("  ");
        jPanel1.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jLabel3.setText("               ");
        jPanel1.add(jLabel3, java.awt.BorderLayout.LINE_END);

        jLabel4.setText("               ");
        jPanel1.add(jLabel4, java.awt.BorderLayout.LINE_START);

        jPanel2.setLayout(new java.awt.GridLayout(3, 0));

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel6.setText("No. Tarjeta  ");
        jPanel3.add(jLabel6, java.awt.BorderLayout.LINE_START);
        jPanel3.add(codTarjeta, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(2, 2));

        saldoTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        saldoTarjeta.setText("AQUI VA EL PRECIO POR BOLETO");
        jPanel4.add(saldoTarjeta);

        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("CVC   ");
        jPanel6.add(jLabel8);
        jPanel6.add(cVC);

        jPanel4.add(jPanel6);

        precioTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioTotal.setText("AQUI VA EL PRECIO TOTAL A PAGAR");
        jPanel4.add(precioTotal);

        jLabel9.setText(" ");
        jPanel4.add(jLabel9);

        jPanel2.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(1, 3));
        jPanel5.add(jLabel5);
        jPanel5.add(jLabel7);

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        jPanel5.add(aceptar);

        jPanel2.add(jPanel5);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        principal.getControlCBoletos().verificarTarjeta(codTarjeta, cVC);
    }//GEN-LAST:event_aceptarActionPerformed
    
    public JLabel getPrecioBoleto() {
        return saldoTarjeta;
    }
    
    public JLabel getPrecioTotal() {
        return precioTotal;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField cVC;
    private javax.swing.JTextField codTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel precioTotal;
    private javax.swing.JLabel saldoTarjeta;
    // End of variables declaration//GEN-END:variables
}
