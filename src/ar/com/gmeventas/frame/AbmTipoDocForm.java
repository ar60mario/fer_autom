/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.gmeventas.frame;

import ar.com.gmeventas.entities.TipoDoc;
import ar.com.gmeventas.main.MainFrame;
import ar.com.gmeventas.services.TipoDocService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mario
 */
public class AbmTipoDocForm extends javax.swing.JFrame {

    private List<TipoDoc> tipos = null;

    /**
     * Creates new form TipoDocForm
     */
    public AbmTipoDocForm() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(100, 100, 255));
        this.setLocationRelativeTo(null);
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipoDoc = new javax.swing.JTable();
        volverBtn = new javax.swing.JButton();
        nuevoBtn = new javax.swing.JButton();
        modificarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        tablaTipoDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción"
            }
        ));
        jScrollPane1.setViewportView(tablaTipoDoc);
        if (tablaTipoDoc.getColumnModel().getColumnCount() > 0) {
            tablaTipoDoc.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        volverBtn.setText("Volver");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        nuevoBtn.setText("Nuevo");
        nuevoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoBtnActionPerformed(evt);
            }
        });

        modificarBtn.setText("Modificar");
        modificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevoBtn)
                        .addGap(119, 119, 119)
                        .addComponent(modificarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volverBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverBtn)
                    .addComponent(nuevoBtn)
                    .addComponent(modificarBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void nuevoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoBtnActionPerformed
        nuevo();
    }//GEN-LAST:event_nuevoBtnActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        modificar();
    }//GEN-LAST:event_modificarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AbmTipoDocForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbmTipoDocForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbmTipoDocForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbmTipoDocForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AbmTipoDocForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarBtn;
    private javax.swing.JButton nuevoBtn;
    private javax.swing.JTable tablaTipoDoc;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        try {
            tipos = new TipoDocService().getAllTipoDocs();
        } catch (Exception ex) {
            Logger.getLogger(AbmTipoDocForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (tipos != null && !tipos.isEmpty()) {
            DefaultTableModel model = (DefaultTableModel) tablaTipoDoc.getModel();
            for (TipoDoc tipo : tipos) {
                Object ob[] = new Object[2];
                ob[0] = tipo.getCodigo();
                ob[1] = tipo.getDescripcion();
                model.addRow(ob);
            }
            tablaTipoDoc.setModel(model);
        }
    }

    private void nuevo() {
        NuevoTipoDocForm ntdf = new NuevoTipoDocForm();
        ntdf.setVisible(true);
        this.dispose();
    }

    private void modificar() {
        int row = tablaTipoDoc.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar para modificar");
        } else {
            TipoDoc td = tipos.get(row);
            ModificarTipoDocForm mtdf = new ModificarTipoDocForm(td);
            mtdf.setVisible(true);
            this.dispose();
        }
    }
}
