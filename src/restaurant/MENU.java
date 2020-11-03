/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;
import Visual.*;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author nello
 */
public class MENU extends javax.swing.JFrame {

    /**
     * Creates new form MENU
     */
    public MENU() {
        initComponents();
        
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setVentanaCompleta(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        btnSalir = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnInicio = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnMenu = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnFactura = new RSMaterialComponent.RSButtonMaterialIconOne();
        jSeparator1 = new javax.swing.JSeparator();
        btnMesa = new RSMaterialComponent.RSButtonMaterialIconOne();
        pnlSlider = new rojerusan.RSPanelsSlider();
        panelPapas1 = new iPane.panelPapas();
        panelMenú1 = new iPane.panelMenú();
        panelEmpleados1 = new iPane.panelEmpleados();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(23, 156, 140));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(227, 223, 11));
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.ESQUINA_3);

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img proyect/chef.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );

        btnSalir.setBackground(new java.awt.Color(227, 223, 11));
        btnSalir.setText("     SALIR");
        btnSalir.setToolTipText("");
        btnSalir.setAutoscrolls(true);
        btnSalir.setBackgroundHover(new java.awt.Color(227, 223, 11));
        btnSalir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EJECT);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(227, 223, 11));
        btnInicio.setText("      EMPLEADOS");
        btnInicio.setToolTipText("");
        btnInicio.setBackgroundHover(new java.awt.Color(227, 223, 11));
        btnInicio.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.TRANSFER_WITHIN_A_STATION);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(227, 223, 11));
        btnMenu.setText("     MENU");
        btnMenu.setToolTipText("");
        btnMenu.setAutoscrolls(true);
        btnMenu.setBackgroundHover(new java.awt.Color(227, 223, 11));
        btnMenu.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KITCHEN);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnFactura.setBackground(new java.awt.Color(227, 223, 11));
        btnFactura.setText("     FACTURA");
        btnFactura.setToolTipText("");
        btnFactura.setAutoscrolls(true);
        btnFactura.setBackgroundHover(new java.awt.Color(227, 223, 11));
        btnFactura.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SUBTITLES);
        btnFactura.setInheritsPopupMenu(true);
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        btnMesa.setBackground(new java.awt.Color(227, 223, 11));
        btnMesa.setText("     MESAS");
        btnMesa.setToolTipText("");
        btnMesa.setAutoscrolls(true);
        btnMesa.setBackgroundHover(new java.awt.Color(227, 223, 11));
        btnMesa.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON_ADD);

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSlider.add(panelPapas1, "card3");

        panelMenú1.setName("panelMenú1"); // NOI18N
        pnlSlider.add(panelMenú1, "card3");
        pnlSlider.add(panelEmpleados1, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        login log = new login();
        log.setVisible(true);  
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
     
        
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
    
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        if (!btnMenu.isSelected()){
            btnMenu.setSelected(true);
            btnInicio.setSelected(false);
            btnMesa.setSelected(false);
            btnFactura.setSelected(false);
            
            pnlSlider.setPanelSlider(1,panelMenú1, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconOne btnFactura;
    private RSMaterialComponent.RSButtonMaterialIconOne btnInicio;
    private RSMaterialComponent.RSButtonMaterialIconOne btnMenu;
    private RSMaterialComponent.RSButtonMaterialIconOne btnMesa;
    private RSMaterialComponent.RSButtonMaterialIconOne btnSalir;
    private javax.swing.JSeparator jSeparator1;
    private iPane.panelEmpleados panelEmpleados1;
    private iPane.panelMenú panelMenú1;
    private iPane.panelPapas panelPapas1;
    private rojerusan.RSPanelsSlider pnlSlider;
    public static rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojerusan.RSPanelImage rSPanelImage1;
    // End of variables declaration//GEN-END:variables
}
