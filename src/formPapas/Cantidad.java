/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formPapas;

import Code.Papas;


/**
 *
 * @author nello
 */
public class Cantidad extends javax.swing.JFrame {
private final Papas crear;
    /**
     * Creates new form Cantidad
     */
    public Cantidad() {
        initComponents();
    rsutilities.RSUtilities.setCentrarVentana(this);
    crear = new Papas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        txtCantidad = new RSMaterialComponent.RSTextFieldMaterialIcon();
        btnOk = new RSMaterialComponent.RSButtonMaterialOne();
        jLabel1 = new javax.swing.JLabel();
        comboTamaño = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(23, 156, 140));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(227, 223, 11));

        txtCantidad.setForeground(new java.awt.Color(102, 102, 102));
        txtCantidad.setColorIcon(new java.awt.Color(102, 102, 102));
        txtCantidad.setColorMaterial(new java.awt.Color(255, 204, 0));
        txtCantidad.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DIALPAD);
        txtCantidad.setPlaceholder("Cantidad");
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCantidadMouseClicked(evt);
            }
        });

        btnOk.setBackground(new java.awt.Color(26, 157, 137));
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        comboTamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeño", "Mediano", "Grande" }));
        comboTamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTamañoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMouseClicked
       // lblAdvertencia.setText(" ");
    }//GEN-LAST:event_txtCantidadMouseClicked

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        String SELECT = "Papas a la francesa";
       String PRESENTACION = (String)comboTamaño.getSelectedItem();
        int cant =Integer.parseInt(txtCantidad.getText()) ;
      if(PRESENTACION == "Pequeño"){
          int cost = 10;
          int total = cost*cant;
          crear.Papas(SELECT, PRESENTACION, cost, cant, total);

      }else if(PRESENTACION == "Mediano"){
          int cost = 13;
          int total = cost*cant;
          crear.Papas(SELECT, PRESENTACION, cost, cant, total);
      }else{
      int cost = 18;
          int total = cost*cant;
          crear.Papas(SELECT, PRESENTACION, cost, cant, total);
      }

        dispose();           
    }//GEN-LAST:event_btnOkActionPerformed

    private void comboTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTamañoActionPerformed

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
            java.util.logging.Logger.getLogger(Cantidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cantidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cantidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cantidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cantidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialOne btnOk;
    private javax.swing.JComboBox<String> comboTamaño;
    private javax.swing.JLabel jLabel1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    public static RSMaterialComponent.RSTextFieldMaterialIcon txtCantidad;
    // End of variables declaration//GEN-END:variables
}
