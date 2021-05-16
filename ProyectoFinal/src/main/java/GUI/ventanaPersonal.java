/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Programa.Principal;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Alexs
 */
public class ventanaPersonal extends javax.swing.JFrame {

    private Principal prin;

    public ventanaPersonal(Principal prin) {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.prin = prin;
        prin.getControlVentanaPersonal().llenarTablaVuelos(tablaVuelos, listaVuelos);
        prin.getControlVentanaPersonal().cambiarDatos(listaVuelos, codigoAvión1, estado1, aereopuertoActual1, aereoDestino1, cPasajeros1);
    }

    public JPanel getAdministrador() {
        return administrador;
    }

    public JPanel getGerente() {
        return gerente;
    }

    public JPanel getOperadorVuelo() {
        return operadorVuelo;
    }

    public JLabel getAereoDestino1() {
        return aereoDestino1;
    }

    public JLabel getAereopuertoActual1() {
        return aereopuertoActual1;
    }

    public JLabel getcPasajeros1() {
        return cPasajeros1;
    }

    public JLabel getCodigoAvión1() {
        return codigoAvión1;
    }

    public JLabel getEstado1() {
        return estado1;
    }

    public JComboBox<String> getListaVuelos() {
        return listaVuelos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        operadorVuelo = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        listaVuelos = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        añadirVuelo1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        estado1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        aereopuertoActual1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        aereoDestino1 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        codigoAvión1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cPasajeros1 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVuelos = new javax.swing.JTable();
        gerente = new javax.swing.JPanel();
        administrador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel9.setText(" ");
        jPanel5.add(jLabel9, java.awt.BorderLayout.PAGE_START);

        jLabel10.setText(" ");
        jPanel5.add(jLabel10, java.awt.BorderLayout.PAGE_END);

        jLabel11.setText("   ");
        jPanel5.add(jLabel11, java.awt.BorderLayout.LINE_END);

        jLabel12.setText("   ");
        jPanel5.add(jLabel12, java.awt.BorderLayout.LINE_START);

        jPanel6.setLayout(new java.awt.GridLayout(1, 3));
        jPanel6.add(jLabel13);
        jPanel6.add(jLabel14);

        salir.setText("Salir");
        jPanel6.add(salir);

        jPanel5.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.BorderLayout());

        operadorVuelo.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new java.awt.GridLayout(4, 0));

        jPanel13.setLayout(new java.awt.GridLayout(1, 3));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vuelo: ");
        jPanel13.add(jLabel7);

        listaVuelos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaVuelosItemStateChanged(evt);
            }
        });
        jPanel13.add(listaVuelos);

        jPanel14.setLayout(new java.awt.BorderLayout());

        jLabel15.setText(" ");
        jPanel14.add(jLabel15, java.awt.BorderLayout.LINE_START);

        añadirVuelo1.setText("Añadir Vuelo");
        jPanel14.add(añadirVuelo1, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel14);

        jPanel12.add(jPanel13);

        jPanel15.setLayout(new java.awt.GridLayout(1, 6));

        jLabel16.setText("Estado:");
        jPanel15.add(jLabel16);
        jPanel15.add(estado1);

        jLabel17.setText("Aereo. Actual:");
        jPanel15.add(jLabel17);
        jPanel15.add(aereopuertoActual1);

        jLabel18.setText("Aereo. Destino:");
        jPanel15.add(jLabel18);
        jPanel15.add(aereoDestino1);

        jPanel12.add(jPanel15);

        jPanel16.setLayout(new java.awt.GridLayout(1, 4));

        jLabel19.setText("Código Avión:");
        jPanel16.add(jLabel19);
        jPanel16.add(codigoAvión1);

        jLabel20.setText("Cantidad Pasajeros:");
        jPanel16.add(jLabel20);
        jPanel16.add(cPasajeros1);

        jPanel12.add(jPanel16);

        jPanel17.setLayout(new java.awt.GridLayout(1, 4));

        jButton5.setText("Iniciar Vuelo");
        jPanel17.add(jButton5);

        jButton6.setText("Cancelar Vuelo");
        jPanel17.add(jButton6);

        jButton7.setText("Posponer Vuelo");
        jPanel17.add(jButton7);

        jButton8.setText("Distribución Avión");
        jPanel17.add(jButton8);

        jPanel12.add(jPanel17);

        operadorVuelo.add(jPanel12, java.awt.BorderLayout.PAGE_END);

        jPanel18.setLayout(new java.awt.BorderLayout());

        tablaVuelos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaVuelos);

        jPanel18.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        operadorVuelo.add(jPanel18, java.awt.BorderLayout.CENTER);

        jTabbedPane2.addTab("Operador Vuelos", operadorVuelo);

        javax.swing.GroupLayout gerenteLayout = new javax.swing.GroupLayout(gerente);
        gerente.setLayout(gerenteLayout);
        gerenteLayout.setHorizontalGroup(
            gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );
        gerenteLayout.setVerticalGroup(
            gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Gerente", gerente);

        javax.swing.GroupLayout administradorLayout = new javax.swing.GroupLayout(administrador);
        administrador.setLayout(administradorLayout);
        administradorLayout.setHorizontalGroup(
            administradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );
        administradorLayout.setVerticalGroup(
            administradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Administrador", administrador);

        jPanel1.add(jTabbedPane2, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaVuelosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaVuelosItemStateChanged
        prin.getControlVentanaPersonal().cambiarDatos(listaVuelos, codigoAvión1, estado1, aereopuertoActual1, aereoDestino1, cPasajeros1);
    }//GEN-LAST:event_listaVuelosItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel administrador;
    private javax.swing.JLabel aereoDestino1;
    private javax.swing.JLabel aereopuertoActual1;
    private javax.swing.JButton añadirVuelo1;
    private javax.swing.JLabel cPasajeros1;
    private javax.swing.JLabel codigoAvión1;
    private javax.swing.JLabel estado1;
    private javax.swing.JPanel gerente;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JComboBox<String> listaVuelos;
    private javax.swing.JPanel operadorVuelo;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaVuelos;
    // End of variables declaration//GEN-END:variables
}
