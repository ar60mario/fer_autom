/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.gmeventas.main;

import ar.com.gmeventas.entities.Factura;
import ar.com.gmeventas.entities.RenglonFc;
import ar.com.gmeventas.frame.AbmClienteFrame;
import ar.com.gmeventas.frame.AbmProductoFrame;
import ar.com.gmeventas.frame.AbmProductosInactivosFrame;
import ar.com.gmeventas.frame.AbmProductosTopFrame;
import ar.com.gmeventas.frame.AbmProductosTopInactivosFrame;
import ar.com.gmeventas.frame.AbmRubroFrame;
import ar.com.gmeventas.frame.AbmStockFrame;
import ar.com.gmeventas.frame.AbmSubRubroFrame;
import ar.com.gmeventas.frame.AbmTipoDocForm;
import ar.com.gmeventas.frame.AjustarStockFrame;
import ar.com.gmeventas.frame.BackupFrame;
import ar.com.gmeventas.frame.DuplicadoFacturaFrame;
import ar.com.gmeventas.frame.DuplicadoFacturaPdfFrame;
import ar.com.gmeventas.frame.FacturaWebFrame;
import ar.com.gmeventas.frame.FacturaWebPanificadosFrame;
import ar.com.gmeventas.frame.FacturarFrame;
import ar.com.gmeventas.frame.FacturarPanificadosFrame;
import ar.com.gmeventas.frame.InformeStockFrame;
import ar.com.gmeventas.frame.InformeStockProductosFrame;
import ar.com.gmeventas.frame.InformeVentasPorPeriodoFrame;
import ar.com.gmeventas.frame.ModificarConfiguracionTopFrame;
import ar.com.gmeventas.frame.NotaCreditoFrame;
import ar.com.gmeventas.frame.RecuperarDeAfipFrame;
import ar.com.gmeventas.frame.RemitoFrame;
import ar.com.gmeventas.frame.RemitoPanificadosFrame;
import ar.com.gmeventas.frame.StockPeriodoProductoCompraFrame;
import ar.com.gmeventas.frame.StockPeriodoProductoFrame;
import ar.com.gmeventas.frame.VerificarAfipFrame;
import ar.com.gmeventas.services.FacturaService;
import ar.com.gmeventas.services.FcService;
import ar.com.gmeventas.services.RenglonFcService;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(100, 100, 255));
        this.setLocationRelativeTo(null);
//        duplicadoPdfMnu.setVisible(false);
        clientesMnu.setVisible(false);
        tipoDocMnu.setVisible(false);
        stockValorizadoMnu.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salirBtn = new javax.swing.JButton();
        randomBtn = new javax.swing.JButton();
        notaCreditoBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        configuracionMnu = new javax.swing.JMenuItem();
        productosUtilizadosMnu = new javax.swing.JMenuItem();
        verInactivosMnu = new javax.swing.JMenuItem();
        productosMnu = new javax.swing.JMenuItem();
        productosInactivosMnu = new javax.swing.JMenuItem();
        rubrosMnu = new javax.swing.JMenuItem();
        subRubrosMnu = new javax.swing.JMenuItem();
        clientesMnu = new javax.swing.JMenuItem();
        tipoDocMnu = new javax.swing.JMenuItem();
        stockMnu = new javax.swing.JMenuItem();
        stockValorizadoMnu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        verificarAfipMnu = new javax.swing.JMenuItem();
        recuperarAfipMnu = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        backupMnu = new javax.swing.JMenuItem();
        duplicadoPdfMnu = new javax.swing.JMenuItem();
        ajustarStockMnu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        ventasPorPeriodoMnu = new javax.swing.JMenuItem();
        stockTodosMnu = new javax.swing.JMenuItem();
        informeStockMnu = new javax.swing.JMenuItem();
        cantidadesVendidasEntreFechasMnu = new javax.swing.JMenuItem();
        cantidadesCompradasEntreFechasMnu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        versionMnu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("FACTURACION AUTOMATICA");

        salirBtn.setText("Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        randomBtn.setText("Fc Automática");
        randomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomBtnActionPerformed(evt);
            }
        });

        notaCreditoBtn.setText("Nota de Crédito");
        notaCreditoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaCreditoBtnActionPerformed(evt);
            }
        });

        jMenu1.setText("Abm");

        configuracionMnu.setText("Configuración");
        configuracionMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracionMnuActionPerformed(evt);
            }
        });
        jMenu1.add(configuracionMnu);

        productosUtilizadosMnu.setText("Productos utilizados");
        productosUtilizadosMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosUtilizadosMnuActionPerformed(evt);
            }
        });
        jMenu1.add(productosUtilizadosMnu);

        verInactivosMnu.setText("Productos Utilizados Inactivos");
        verInactivosMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verInactivosMnuActionPerformed(evt);
            }
        });
        jMenu1.add(verInactivosMnu);

        productosMnu.setText("Productos");
        productosMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosMnuActionPerformed(evt);
            }
        });
        jMenu1.add(productosMnu);

        productosInactivosMnu.setText("Productos Inactivos");
        productosInactivosMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosInactivosMnuActionPerformed(evt);
            }
        });
        jMenu1.add(productosInactivosMnu);

        rubrosMnu.setText("Rubros");
        rubrosMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rubrosMnuActionPerformed(evt);
            }
        });
        jMenu1.add(rubrosMnu);

        subRubrosMnu.setText("Sub Rubros");
        subRubrosMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subRubrosMnuActionPerformed(evt);
            }
        });
        jMenu1.add(subRubrosMnu);

        clientesMnu.setText("Clientes");
        clientesMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesMnuActionPerformed(evt);
            }
        });
        jMenu1.add(clientesMnu);

        tipoDocMnu.setText("Tipo Documento");
        tipoDocMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoDocMnuActionPerformed(evt);
            }
        });
        jMenu1.add(tipoDocMnu);

        stockMnu.setText("Stock");
        stockMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockMnuActionPerformed(evt);
            }
        });
        jMenu1.add(stockMnu);

        stockValorizadoMnu.setText("STOCK VALORIZADO");
        stockValorizadoMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockValorizadoMnuActionPerformed(evt);
            }
        });
        jMenu1.add(stockValorizadoMnu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Verificar");

        verificarAfipMnu.setText("Estado Afip");
        verificarAfipMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarAfipMnuActionPerformed(evt);
            }
        });
        jMenu2.add(verificarAfipMnu);

        recuperarAfipMnu.setText("Recuperar de Afip");
        recuperarAfipMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperarAfipMnuActionPerformed(evt);
            }
        });
        jMenu2.add(recuperarAfipMnu);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Herramientas");

        backupMnu.setText("Backup");
        backupMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupMnuActionPerformed(evt);
            }
        });
        jMenu5.add(backupMnu);

        duplicadoPdfMnu.setText("Duplicado Fc en Pdf");
        duplicadoPdfMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duplicadoPdfMnuActionPerformed(evt);
            }
        });
        jMenu5.add(duplicadoPdfMnu);

        ajustarStockMnu.setText("AJUSTAR STOCK");
        ajustarStockMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajustarStockMnuActionPerformed(evt);
            }
        });
        jMenu5.add(ajustarStockMnu);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Informes");

        ventasPorPeriodoMnu.setText("Ventas X Período");
        ventasPorPeriodoMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasPorPeriodoMnuActionPerformed(evt);
            }
        });
        jMenu4.add(ventasPorPeriodoMnu);

        stockTodosMnu.setText("Stock Todos los Productos");
        stockTodosMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockTodosMnuActionPerformed(evt);
            }
        });
        jMenu4.add(stockTodosMnu);

        informeStockMnu.setText("Stock de Productos Utilizados");
        informeStockMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informeStockMnuActionPerformed(evt);
            }
        });
        jMenu4.add(informeStockMnu);

        cantidadesVendidasEntreFechasMnu.setText("CANTIDADES VENDIDAS ENTRE FECHAS");
        cantidadesVendidasEntreFechasMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadesVendidasEntreFechasMnuActionPerformed(evt);
            }
        });
        jMenu4.add(cantidadesVendidasEntreFechasMnu);

        cantidadesCompradasEntreFechasMnu.setText("CANTIDADES COMPRADAS ENTRE FECHAS");
        cantidadesCompradasEntreFechasMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadesCompradasEntreFechasMnuActionPerformed(evt);
            }
        });
        jMenu4.add(cantidadesCompradasEntreFechasMnu);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("?");

        versionMnu.setText("Versión");
        versionMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versionMnuActionPerformed(evt);
            }
        });
        jMenu3.add(versionMnu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(randomBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                        .addComponent(salirBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notaCreditoBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(361, Short.MAX_VALUE)
                .addComponent(notaCreditoBtn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirBtn)
                    .addComponent(randomBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void randomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomBtnActionPerformed
        facturar();
    }//GEN-LAST:event_randomBtnActionPerformed

    private void productosUtilizadosMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosUtilizadosMnuActionPerformed
        abmProdTop();
    }//GEN-LAST:event_productosUtilizadosMnuActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Desea Salir del programa?", "Atención", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            salir();
        }
    }//GEN-LAST:event_salirBtnActionPerformed

    private void configuracionMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracionMnuActionPerformed
        configuracion();
    }//GEN-LAST:event_configuracionMnuActionPerformed

    private void verInactivosMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verInactivosMnuActionPerformed
        abmProdTopInactivos();
    }//GEN-LAST:event_verInactivosMnuActionPerformed

    private void verificarAfipMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarAfipMnuActionPerformed
        verificarAfip();
    }//GEN-LAST:event_verificarAfipMnuActionPerformed

    private void versionMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_versionMnuActionPerformed
        menuVersion();
    }//GEN-LAST:event_versionMnuActionPerformed

    private void productosMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosMnuActionPerformed
        productos();
    }//GEN-LAST:event_productosMnuActionPerformed

    private void rubrosMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rubrosMnuActionPerformed
        rubros();
    }//GEN-LAST:event_rubrosMnuActionPerformed

    private void subRubrosMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subRubrosMnuActionPerformed
        subRubros();
    }//GEN-LAST:event_subRubrosMnuActionPerformed

    private void clientesMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesMnuActionPerformed
        clientes();
    }//GEN-LAST:event_clientesMnuActionPerformed

    private void tipoDocMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDocMnuActionPerformed
        documento();
    }//GEN-LAST:event_tipoDocMnuActionPerformed

    private void ventasPorPeriodoMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasPorPeriodoMnuActionPerformed
        informeVXP();
    }//GEN-LAST:event_ventasPorPeriodoMnuActionPerformed

    private void stockMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockMnuActionPerformed
        abmStock();
    }//GEN-LAST:event_stockMnuActionPerformed

    private void informeStockMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informeStockMnuActionPerformed
        informeStock();
    }//GEN-LAST:event_informeStockMnuActionPerformed

    private void duplicadoPdfMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duplicadoPdfMnuActionPerformed
        duplicadoPdf();
    }//GEN-LAST:event_duplicadoPdfMnuActionPerformed

    private void backupMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupMnuActionPerformed
        backup();
    }//GEN-LAST:event_backupMnuActionPerformed

    private void recuperarAfipMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperarAfipMnuActionPerformed
        recuperar();
    }//GEN-LAST:event_recuperarAfipMnuActionPerformed

    private void productosInactivosMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosInactivosMnuActionPerformed
        productosInactivos();
    }//GEN-LAST:event_productosInactivosMnuActionPerformed

    private void cantidadesVendidasEntreFechasMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadesVendidasEntreFechasMnuActionPerformed
        cantidadesVendidas();
    }//GEN-LAST:event_cantidadesVendidasEntreFechasMnuActionPerformed

    private void cantidadesCompradasEntreFechasMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadesCompradasEntreFechasMnuActionPerformed
        cantidadesCompradas();
    }//GEN-LAST:event_cantidadesCompradasEntreFechasMnuActionPerformed

    private void notaCreditoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaCreditoBtnActionPerformed
        notaCredito();
    }//GEN-LAST:event_notaCreditoBtnActionPerformed

    private void stockTodosMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockTodosMnuActionPerformed
        stockTodos();
    }//GEN-LAST:event_stockTodosMnuActionPerformed

    private void stockValorizadoMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockValorizadoMnuActionPerformed
        stockValorizado();
    }//GEN-LAST:event_stockValorizadoMnuActionPerformed

    private void ajustarStockMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajustarStockMnuActionPerformed
        ajustarStock();
    }//GEN-LAST:event_ajustarStockMnuActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ajustarStockMnu;
    private javax.swing.JMenuItem backupMnu;
    private javax.swing.JMenuItem cantidadesCompradasEntreFechasMnu;
    private javax.swing.JMenuItem cantidadesVendidasEntreFechasMnu;
    private javax.swing.JMenuItem clientesMnu;
    private javax.swing.JMenuItem configuracionMnu;
    private javax.swing.JMenuItem duplicadoPdfMnu;
    private javax.swing.JMenuItem informeStockMnu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton notaCreditoBtn;
    private javax.swing.JMenuItem productosInactivosMnu;
    private javax.swing.JMenuItem productosMnu;
    private javax.swing.JMenuItem productosUtilizadosMnu;
    private javax.swing.JButton randomBtn;
    private javax.swing.JMenuItem recuperarAfipMnu;
    private javax.swing.JMenuItem rubrosMnu;
    private javax.swing.JButton salirBtn;
    private javax.swing.JMenuItem stockMnu;
    private javax.swing.JMenuItem stockTodosMnu;
    private javax.swing.JMenuItem stockValorizadoMnu;
    private javax.swing.JMenuItem subRubrosMnu;
    private javax.swing.JMenuItem tipoDocMnu;
    private javax.swing.JMenuItem ventasPorPeriodoMnu;
    private javax.swing.JMenuItem verInactivosMnu;
    private javax.swing.JMenuItem verificarAfipMnu;
    private javax.swing.JMenuItem versionMnu;
    // End of variables declaration//GEN-END:variables

    private void salir() {
        System.exit(0);
    }

    private void configuracion() {
        ModificarConfiguracionTopFrame mctf = new ModificarConfiguracionTopFrame();
        mctf.setVisible(true);
        this.dispose();
    }

    private void facturar() {
        FacturarFrame ff = new FacturarFrame();
        ff.setVisible(true);
        this.dispose();
    }

    private void facturaWebUnica() {
        FacturaWebFrame fwf = new FacturaWebFrame();
        fwf.setVisible(true);
        this.dispose();
    }

    private void productos() {
        AbmProductoFrame apf = new AbmProductoFrame(null);
        apf.setVisible(true);
        this.dispose();
    }

    private void rubros() {
        AbmRubroFrame arf = new AbmRubroFrame();
        arf.setVisible(true);
        this.dispose();
    }

    private void subRubros() {
        AbmSubRubroFrame arf = new AbmSubRubroFrame();
        arf.setVisible(true);
        this.dispose();
    }

    private void clientes() {
        AbmClienteFrame acf = new AbmClienteFrame();
        acf.setVisible(true);
        this.dispose();
    }

    private void documento() {
        AbmTipoDocForm atdf = new AbmTipoDocForm();
        atdf.setVisible(true);
        this.dispose();
    }

    private void informeVXP() {
        InformeVentasPorPeriodoFrame ivppf = new InformeVentasPorPeriodoFrame(null, null, null);
        ivppf.setVisible(true);
        this.dispose();
    }

    private void recuperar() {
        RecuperarDeAfipFrame ivppf = new RecuperarDeAfipFrame();
        ivppf.setVisible(true);
        this.dispose();
    }

    private void informeStock() {
        InformeStockFrame isf = new InformeStockFrame();
        isf.setVisible(true);
        this.dispose();
    }

    private void duplicadoFc() {
        DuplicadoFacturaFrame dff = new DuplicadoFacturaFrame();
        dff.setVisible(true);
        this.dispose();
    }

    private void facturaPanificados() {
        FacturaWebPanificadosFrame fwpf = new FacturaWebPanificadosFrame();
        fwpf.setVisible(true);
        this.dispose();
    }

    private void facturarPanificados() {
        FacturarPanificadosFrame ff = new FacturarPanificadosFrame();
        ff.setVisible(true);
        this.dispose();
    }

    private void duplicadoPdf() {
        DuplicadoFacturaPdfFrame dff = new DuplicadoFacturaPdfFrame();
        dff.setVisible(true);
        this.dispose();
    }

    private void borrarTemporales() {
        int a = JOptionPane.showConfirmDialog(this, "CONFIRME ELIMINAR TEMPORALES", "Atención", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            List<RenglonFc> renglones = null;
            try {
                renglones = new RenglonFcService().getAllrenglones();
            } catch (Exception ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (renglones != null && !renglones.isEmpty()) {
                for (RenglonFc r : renglones) {
                    try {
                        new RenglonFcService().deleteRenglon(r);
                    } catch (Exception ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            List<Factura> facturas = null;
            try {
                facturas = new FcService().getAllFacturas();
            } catch (Exception ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (facturas != null && !facturas.isEmpty()) {
                for (Factura fc : facturas) {
                    try {
                        new FcService().deleteFactura(fc);
                    } catch (Exception ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "PROCESO TERMINADO");
        }
    }

    private void backup() {
        BackupFrame bf = new BackupFrame();
        bf.setVisible(true);
        this.dispose();
    }

    private void productosInactivos() {
        AbmProductosInactivosFrame apif = new AbmProductosInactivosFrame();
        apif.setVisible(true);
        this.dispose();
    }

    private void cantidadesVendidas() {
        StockPeriodoProductoFrame sppf = new StockPeriodoProductoFrame();
        sppf.setVisible(true);
        this.dispose();
    }

    private void cantidadesCompradas() {
        StockPeriodoProductoCompraFrame sppcf = new StockPeriodoProductoCompraFrame();
        sppcf.setVisible(true);
        this.dispose();
    }

    private void notaCredito() {
        NotaCreditoFrame ncf = new NotaCreditoFrame();
        ncf.setVisible(true);
        this.dispose();
    }

    private void stockTodos() {
        InformeStockProductosFrame ispf = new InformeStockProductosFrame();
        ispf.setVisible(true);
        this.dispose();
    }

    private void stockValorizado() {
        
    }

    private void abmProdTop() {
        AbmProductosTopFrame apt = new AbmProductosTopFrame();
        apt.setVisible(true);
        this.dispose();
    }

    private void abmProdTopInactivos() {
        AbmProductosTopInactivosFrame apt = new AbmProductosTopInactivosFrame();
        apt.setVisible(true);
        this.dispose();
    }

    private void abmStock() {
        AbmStockFrame asf = new AbmStockFrame();
        asf.setVisible(true);
        this.dispose();
    }

    private void verificarAfip() {
        VerificarAfipFrame vaf = new VerificarAfipFrame();
        vaf.setVisible(true);
        this.dispose();
    }

    private void menuVersion() {
        VersionFrame vf = new VersionFrame();
        vf.setVisible(true);
        this.dispose();
    }

    private void ajustarStock() {
        AjustarStockFrame asf = new AjustarStockFrame();
        asf.setVisible(true);
        this.dispose();
    }
}
