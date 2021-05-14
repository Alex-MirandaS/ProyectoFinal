/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Programa.Principal;

import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author Alexs
 */
public class VuelosGUI extends javax.swing.JFrame {

    private Principal principal;

    public VuelosGUI(Principal principal) {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.principal = principal;
    }

    public JTable getTabla() {
        return tabla;
    }

    public JComboBox<String> getListaElección() {
        return listaElección;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        listaElección = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Vuelos");
        getContentPane().add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jLabel5.setText("     ");
        getContentPane().add(jLabel5, java.awt.BorderLayout.LINE_START);

        jLabel7.setText("     ");
        getContentPane().add(jLabel7, java.awt.BorderLayout.LINE_END);

        jPanel1.setLayout(new java.awt.GridLayout(1, 3));
        jPanel1.add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("No. de Vuelo");
        jPanel1.add(jLabel2);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel9.setText(" ");
        jPanel4.add(jLabel9, java.awt.BorderLayout.PAGE_END);

        jLabel10.setText(" ");
        jPanel4.add(jLabel10, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(listaElección, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel3.setText(" ");
        jPanel3.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jLabel6.setText(" ");
        jPanel3.add(jLabel6, java.awt.BorderLayout.PAGE_END);

        jLabel8.setText("   ");
        jPanel3.add(jLabel8, java.awt.BorderLayout.LINE_END);

        aceptar.setText("ACEPTAR");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        jPanel3.add(aceptar, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.BorderLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tabla);

        jPanel2.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        principal.getControlCBoletos().inicioPasaportes(listaElección.getSelectedIndex());
    }//GEN-LAST:event_aceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> listaElección;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
