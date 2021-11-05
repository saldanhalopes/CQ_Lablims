/*
 * Copyright (C) 2019 rafael.lopes
 *
 * Este programa é um software livre: você pode redistribuí-lo e / ou modificar
 * sob os termos da GNU General Public License, conforme publicado pela
 * a Free Software Foundation, seja a versão 3 da Licença, quanto
 * qualquer versão posterior.
 *
 * Este programa é distribuído na esperança de que seja útil,
 * mas SEM QUALQUER GARANTIA; sem a garantia implícita de
 * COMERCIALIZAÇÃO OU APTIDÃO PARA UM PROPÓSITO PARTICULAR. Veja o
 * GNU General Public License para obter mais detalhes.
 *
 * Você deve ter recebido uma cópia da GNU General Public License
 *  juntamente com este programa. Caso contrário, veja <http://www.gnu.org/licenses/>.
 */
package br.com.cristalia.colunas.view;

import br.com.cristalia.biblioteca.util.AcessoSistema;
import br.com.cristalia.biblioteca.util.DataHora;
import br.com.cristalia.biblioteca.util.Frames;
import br.com.cristalia.biblioteca.util.Senha;
import br.com.cristalia.biblioteca.util.TableSorter;
import br.com.cristalia.colunas.dao.ColunaConfigDAO;
import br.com.cristalia.colunas.model.ColunaConfig;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafael.lopes
 */
public class FrmColunaConfig extends javax.swing.JDialog {

    private String ACESSO = new AcessoSistema().getAcessoSistema(this);

    /**
     * Creates new form NewJDialog
     */
    public FrmColunaConfig(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Frames.setUpFrame(this, "Configurações de Colunas Cromatográficas", false);
        read();
        btnNovo.setEnabled(AcessoSistema.criarDados(ACESSO));
        btnEditar.setEnabled(AcessoSistema.editarDados(ACESSO));
        btnExcluir.setEnabled(AcessoSistema.deletarDados(ACESSO));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpnColunaConfig = new javax.swing.JTabbedPane();
        pnlColunaConfig = new javax.swing.JPanel();
        txtPesquisarMetodologia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnNovo = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnEditar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnExcluir = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnAtualizar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConfigColuna = new javax.swing.JTable();
        pnlAuditTrail = new javax.swing.JPanel();
        pnlAuditoria = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAuditoria = new javax.swing.JTable();
        txtPesquisarAuditoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtPesquisarMetodologia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarMetodologiaKeyReleased(evt);
            }
        });

        jLabel4.setText("Pesquisar:");

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon_add.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setFocusable(false);
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNovo);
        jToolBar1.add(jSeparator6);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon_edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEditar);
        jToolBar1.add(jSeparator1);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon_close.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setFocusable(false);
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setPreferredSize(new java.awt.Dimension(60, 60));
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExcluir);
        jToolBar1.add(jSeparator8);

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon_atualizar.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setFocusable(false);
        btnAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtualizar.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAtualizar);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));

        tblConfigColuna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Col_Confg_Id", "Tipo", "Valor", "Descrição", "Versão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConfigColuna.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblConfigColuna.setSurrendersFocusOnKeystroke(true);
        tblConfigColuna.getTableHeader().setReorderingAllowed(false);
        tblConfigColuna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConfigColunaMouseClicked(evt);
            }
        });
        tblConfigColuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblConfigColunaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblConfigColuna);
        if (tblConfigColuna.getColumnModel().getColumnCount() > 0) {
            tblConfigColuna.getColumnModel().getColumn(0).setMinWidth(110);
            tblConfigColuna.getColumnModel().getColumn(0).setPreferredWidth(110);
            tblConfigColuna.getColumnModel().getColumn(0).setMaxWidth(110);
            tblConfigColuna.getColumnModel().getColumn(1).setMinWidth(200);
            tblConfigColuna.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblConfigColuna.getColumnModel().getColumn(2).setMinWidth(200);
            tblConfigColuna.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblConfigColuna.getColumnModel().getColumn(3).setPreferredWidth(500);
            tblConfigColuna.getColumnModel().getColumn(4).setMinWidth(80);
            tblConfigColuna.getColumnModel().getColumn(4).setPreferredWidth(80);
            tblConfigColuna.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlColunaConfigLayout = new javax.swing.GroupLayout(pnlColunaConfig);
        pnlColunaConfig.setLayout(pnlColunaConfigLayout);
        pnlColunaConfigLayout.setHorizontalGroup(
            pnlColunaConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
            .addGroup(pnlColunaConfigLayout.createSequentialGroup()
                .addGroup(pnlColunaConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlColunaConfigLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarMetodologia))
                    .addGroup(pnlColunaConfigLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlColunaConfigLayout.setVerticalGroup(
            pnlColunaConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlColunaConfigLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlColunaConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnColunaConfig.addTab("Colunas", pnlColunaConfig);

        pnlAuditTrail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Auditoria Material"));

        tblAuditoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Col_Confg_Id", "Versão", "MOD", "Tipo", "Tipo_MOD", "Valor", "Valor_MOD", "Descrição", "Descrição_MOD", "Computador / AD_User ", "Usuario", "Data Modificação", "Motivo", "Validação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAuditoria.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(tblAuditoria);
        if (tblAuditoria.getColumnModel().getColumnCount() > 0) {
            tblAuditoria.getColumnModel().getColumn(0).setMinWidth(120);
            tblAuditoria.getColumnModel().getColumn(0).setPreferredWidth(120);
            tblAuditoria.getColumnModel().getColumn(1).setMinWidth(80);
            tblAuditoria.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblAuditoria.getColumnModel().getColumn(1).setMaxWidth(80);
            tblAuditoria.getColumnModel().getColumn(2).setMinWidth(100);
            tblAuditoria.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblAuditoria.getColumnModel().getColumn(2).setMaxWidth(100);
            tblAuditoria.getColumnModel().getColumn(9).setMinWidth(200);
            tblAuditoria.getColumnModel().getColumn(9).setPreferredWidth(200);
            tblAuditoria.getColumnModel().getColumn(10).setMinWidth(150);
            tblAuditoria.getColumnModel().getColumn(10).setPreferredWidth(150);
            tblAuditoria.getColumnModel().getColumn(11).setMinWidth(120);
            tblAuditoria.getColumnModel().getColumn(11).setPreferredWidth(120);
            tblAuditoria.getColumnModel().getColumn(12).setMinWidth(800);
            tblAuditoria.getColumnModel().getColumn(12).setPreferredWidth(800);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );

        txtPesquisarAuditoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarAuditoriaKeyReleased(evt);
            }
        });

        jLabel5.setText("Pesquisar:");

        javax.swing.GroupLayout pnlAuditoriaLayout = new javax.swing.GroupLayout(pnlAuditoria);
        pnlAuditoria.setLayout(pnlAuditoriaLayout);
        pnlAuditoriaLayout.setHorizontalGroup(
            pnlAuditoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAuditoriaLayout.createSequentialGroup()
                .addGroup(pnlAuditoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlAuditoriaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarAuditoria)))
                .addContainerGap())
        );
        pnlAuditoriaLayout.setVerticalGroup(
            pnlAuditoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAuditoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAuditoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarAuditoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlAuditTrailLayout = new javax.swing.GroupLayout(pnlAuditTrail);
        pnlAuditTrail.setLayout(pnlAuditTrailLayout);
        pnlAuditTrailLayout.setHorizontalGroup(
            pnlAuditTrailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAuditTrailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAuditoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAuditTrailLayout.setVerticalGroup(
            pnlAuditTrailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAuditTrailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAuditoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnColunaConfig.addTab("Audit Trail", pnlAuditTrail);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tpnColunaConfig)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tpnColunaConfig)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarMetodologiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarMetodologiaKeyReleased
        TableSorter.TableSorter(tblConfigColuna, txtPesquisarMetodologia);
    }//GEN-LAST:event_txtPesquisarMetodologiaKeyReleased

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        abrir();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblConfigColuna.getSelectedRow() != -1) {
            atualizar();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblConfigColuna.getSelectedRow() != -1) {
            deletar();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        read();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtPesquisarAuditoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarAuditoriaKeyReleased
        TableSorter.TableSorter(tblAuditoria, txtPesquisarAuditoria);
    }//GEN-LAST:event_txtPesquisarAuditoriaKeyReleased

    private void tblConfigColunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConfigColunaMouseClicked
        if (evt.getClickCount() == 2) {
            atualizar();
        }
    }//GEN-LAST:event_tblConfigColunaMouseClicked

    private void tblConfigColunaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblConfigColunaKeyReleased
        if (tblConfigColuna.getSelectedRow() != -1) {
            if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                deletar();
            }
        }
    }//GEN-LAST:event_tblConfigColunaKeyReleased

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmColunaConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmColunaConfig dialog = new FrmColunaConfig(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    public static javax.swing.JButton btnEditar;
    public static javax.swing.JButton btnExcluir;
    public static javax.swing.JButton btnNovo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel pnlAuditTrail;
    private javax.swing.JPanel pnlAuditoria;
    private javax.swing.JPanel pnlColunaConfig;
    private javax.swing.JTable tblAuditoria;
    private javax.swing.JTable tblConfigColuna;
    private javax.swing.JTabbedPane tpnColunaConfig;
    private javax.swing.JTextField txtPesquisarAuditoria;
    private javax.swing.JTextField txtPesquisarMetodologia;
    // End of variables declaration//GEN-END:variables

    public final void read() {
        DefaultTableModel model = (DefaultTableModel) tblConfigColuna.getModel();
        ColunaConfigDAO colConfigDAO = new ColunaConfigDAO();
        model.setNumRows(0);
        try {
            for (ColunaConfig colConfig : colConfigDAO.findEntities(ColunaConfig.class, "tipo", true)) {
                model.addRow(new Object[]{
                    colConfig.getId(),
                    colConfig.getTipo(),
                    colConfig.getConfiguracao(),
                    colConfig.getDescricao(),
                    colConfig.getVersion()
                });
            }
            carregarAuditoria();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e);
        }
    }

    private void abrir() {
        try {
            new FrmColunaConfigDados(null, true).setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e);
        } finally {
            read();
        }
    }

    private void atualizar() {
        if (AcessoSistema.editarDados(ACESSO)) {
            try {
                setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                ColunaConfig colConfig = new ColunaConfigDAO().findById(ColunaConfig.class,
                        (Long) tblConfigColuna.getValueAt(tblConfigColuna.getSelectedRow(), 0));
                new FrmColunaConfigDados(null, true, colConfig).setVisible(true);
                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e);
            } finally {
                read();
            }
        }
    }

    private void deletar() {
        if (AcessoSistema.deletarDados(ACESSO)) {
            ColunaConfigDAO colConfigDAO = new ColunaConfigDAO();
            Senha senha = new Senha();
            try {
                int dialogResult = JOptionPane.showConfirmDialog(null, "Realmente deseja Excluir esse registro?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (dialogResult == 0) {
                    if (senha.Salvar()) {
                        ColunaConfig colConfig = new ColunaConfigDAO().findById(ColunaConfig.class,
                                (Long) tblConfigColuna.getValueAt(tblConfigColuna.getSelectedRow(), 0));
                        colConfigDAO.remover(ColunaConfig.class, colConfig.getId());
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao excuir o dado: " + e.getMessage(), "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
            } finally {
                read();
            }
        }
    }

    private void carregarAuditoria() {
        DefaultTableModel model = (DefaultTableModel) tblAuditoria.getModel();
        ColunaConfigDAO colConfigDAO = new ColunaConfigDAO();
        model.setNumRows(0);
        try {
            for (ColunaConfig colConfig : colConfigDAO.readAuditoria()) {
                model.addRow(new Object[]{
                    colConfig.getId(),
                    colConfig.getVersion(),
                    colConfig.getAudit().getMOD() == 0 ? "Criado"
                    : (colConfig.getAudit().getMOD() == 1 ? "Modificado" : "Removido"),
                    colConfig.getTipo(),
                    colConfig.getTipo_MOD() == false ? "Não Alterado" : "Alterado",
                    colConfig.getConfiguracao(),
                    colConfig.getConfiguracao_MOD() == false ? "Não Alterado" : "Alterado",
                    colConfig.getDescricao(),
                    colConfig.getDescricao_MOD() == false ? "Não Alterado" : "Alterado",
                    colConfig.getAudit().getComputador() + " / " + colConfig.getAudit().getUserComputador(),
                    colConfig.getAudit().getUltimaModificacaoPor(),
                    DataHora.getStringDateTime(colConfig.getAudit().getUltimaModificacao()),
                    colConfig.getAudit().getMotivo()
                });
            }
        } catch (Exception e) {
        }

    }

}
