/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;
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
        
        btnHamburguesas.setVisible(false);
        btnPapas1.setVisible(false);
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setVentanaCompleta(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        btnSalir = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnEmpleados = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnMenu = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnFactura = new RSMaterialComponent.RSButtonMaterialIconOne();
        jSeparator1 = new javax.swing.JSeparator();
        btnMesa = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnHamburguesas = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnPapas1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        pnlSlider = new rojerusan.RSPanelsSlider();
        panelReloj1 = new iPane.panelReloj();
        panelPapas1 = new iPane.panelPapas();
        panelMenú1 = new iPane.panelMenú();
        panelEmpleados2 = new iPane.panelEmpleados();
        panelClientes1 = new iPane.panelClientes();

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
            .addGap(0, 141, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
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

        btnEmpleados.setBackground(new java.awt.Color(227, 223, 11));
        btnEmpleados.setText("      EMPLEADOS");
        btnEmpleados.setToolTipText("");
        btnEmpleados.setBackgroundHover(new java.awt.Color(227, 223, 11));
        btnEmpleados.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.TRANSFER_WITHIN_A_STATION);
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
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
        btnMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesaActionPerformed(evt);
            }
        });

        btnHamburguesas.setBackground(new java.awt.Color(227, 223, 11));
        btnHamburguesas.setText("      Hamburguesas");
        btnHamburguesas.setToolTipText("");
        btnHamburguesas.setAutoscrolls(true);
        btnHamburguesas.setBackgroundHover(new java.awt.Color(227, 223, 11));
        btnHamburguesas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KITCHEN);
        btnHamburguesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHamburguesasActionPerformed(evt);
            }
        });

        btnPapas1.setBackground(new java.awt.Color(227, 223, 11));
        btnPapas1.setText("      Papas");
        btnPapas1.setToolTipText("");
        btnPapas1.setAutoscrolls(true);
        btnPapas1.setBackgroundHover(new java.awt.Color(227, 223, 11));
        btnPapas1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KITCHEN);
        btnPapas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnHamburguesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnPapas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHamburguesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPapas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlSlider.add(panelReloj1, "card5");
        pnlSlider.add(panelPapas1, "card3");

        panelMenú1.setName("panelMenú1"); // NOI18N
        pnlSlider.add(panelMenú1, "card3");

        panelEmpleados2.setName("panelEmpleados2"); // NOI18N
        pnlSlider.add(panelEmpleados2, "card4");

        panelClientes1.setName("panelClientes"); // NOI18N
        pnlSlider.add(panelClientes1, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        login log = new login();
        log.setVisible(true);  
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        if (!btnEmpleados.isSelected()){
            btnMenu.setSelected(false);
            btnEmpleados.setSelected(true);
            btnMesa.setSelected(false);
            btnFactura.setSelected(false);
            
            pnlSlider.setPanelSlider(1,panelEmpleados2, RSPanelsSlider.DIRECT.RIGHT);
            btnHamburguesas.setVisible(false);
            btnPapas1.setVisible(false);
          
        }
        
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
    
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        if (!btnMenu.isSelected()){
            btnMenu.setSelected(true);
            btnEmpleados.setSelected(false);
            btnMesa.setSelected(false);
            btnFactura.setSelected(false);
            
            pnlSlider.setPanelSlider(1,panelMenú1, RSPanelsSlider.DIRECT.RIGHT);
            btnHamburguesas.setVisible(true);
            btnPapas1.setVisible(true);
            
        }else{
            
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnHamburguesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHamburguesasActionPerformed
    
            btnHamburguesas.setSelected(true);
            pnlSlider.setPanelSlider(1,panelMenú1, RSPanelsSlider.DIRECT.RIGHT);
        
    }//GEN-LAST:event_btnHamburguesasActionPerformed

    private void btnPapas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapas1ActionPerformed
            btnPapas1.setSelected(true);
            pnlSlider.setPanelSlider(1,panelPapas1, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnPapas1ActionPerformed

    private void btnMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesaActionPerformed
 if (!btnMesa.isSelected()){
            btnMenu.setSelected(false);
            btnEmpleados.setSelected(false);
            btnMesa.setSelected(true);
            btnFactura.setSelected(false);
            
            pnlSlider.setPanelSlider(1,panelClientes1, RSPanelsSlider.DIRECT.RIGHT);
            btnHamburguesas.setVisible(false);
            btnPapas1.setVisible(false);
          
        }            
    }//GEN-LAST:event_btnMesaActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconOne btnEmpleados;
    private RSMaterialComponent.RSButtonMaterialIconOne btnFactura;
    private RSMaterialComponent.RSButtonMaterialIconOne btnHamburguesas;
    public static RSMaterialComponent.RSButtonMaterialIconOne btnMenu;
    private RSMaterialComponent.RSButtonMaterialIconOne btnMesa;
    private RSMaterialComponent.RSButtonMaterialIconOne btnPapas1;
    private RSMaterialComponent.RSButtonMaterialIconOne btnSalir;
    private javax.swing.JSeparator jSeparator1;
    private iPane.panelClientes panelClientes1;
    private iPane.panelEmpleados panelEmpleados2;
    private iPane.panelMenú panelMenú1;
    private iPane.panelPapas panelPapas1;
    private iPane.panelReloj panelReloj1;
    public static rojerusan.RSPanelsSlider pnlSlider;
    public static rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojerusan.RSPanelImage rSPanelImage1;
    // End of variables declaration//GEN-END:variables
}
