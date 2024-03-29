package br.com.cristalia.colunas.view;

import br.com.cristalia.biblioteca.util.AcessoSistema;
import br.com.cristalia.biblioteca.util.DataHora;
import br.com.cristalia.biblioteca.util.Frames;
import br.com.cristalia.biblioteca.util.Senha;
import br.com.cristalia.biblioteca.util.TableSorter;
import br.com.cristalia.biblioteca.dao.ColunaVagaDAO;
import br.com.cristalia.biblioteca.model.ColunaVaga;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author rafael
 */
public class FrmColunaVaga extends javax.swing.JFrame {

    private String ACESSO = new AcessoSistema().getAcessoSistema(this);

    /**
     * Creates new form FrmConfigGrupo
     */
    public FrmColunaVaga() {
        initComponents();
        Frames.setUpFrame(this, "Vagas de Colunas", false);
        read();
        btnNovo.setEnabled(AcessoSistema.criarDados(ACESSO));
        btnEditar.setEnabled(AcessoSistema.editarDados(ACESSO));
        btnExcluir.setEnabled(AcessoSistema.deletarDados(ACESSO));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnNovo = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnEditar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnExcluir = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnAtualizar = new javax.swing.JButton();
        pnlUsuarios = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVaga = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlAuditoriaGrupos = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGruposAuditoria = new javax.swing.JTable();
        txtPesquisarAuditoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

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

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Vagas"));

        tblVaga.setAutoCreateRowSorter(true);
        tblVaga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaga_ID", "Storage / Vaga", "Obs", "Versão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVaga.setSurrendersFocusOnKeystroke(true);
        tblVaga.getTableHeader().setReorderingAllowed(false);
        tblVaga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVagaMouseClicked(evt);
            }
        });
        tblVaga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblVagaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblVaga);
        if (tblVaga.getColumnModel().getColumnCount() > 0) {
            tblVaga.getColumnModel().getColumn(0).setMinWidth(80);
            tblVaga.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblVaga.getColumnModel().getColumn(0).setMaxWidth(80);
            tblVaga.getColumnModel().getColumn(1).setMinWidth(150);
            tblVaga.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblVaga.getColumnModel().getColumn(3).setMinWidth(80);
            tblVaga.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblVaga.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        jLabel4.setText("Pesquisar:");

        javax.swing.GroupLayout pnlUsuariosLayout = new javax.swing.GroupLayout(pnlUsuarios);
        pnlUsuarios.setLayout(pnlUsuariosLayout);
        pnlUsuariosLayout.setHorizontalGroup(
            pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUsuariosLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlUsuariosLayout.setVerticalGroup(
            pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vagas", jPanel1);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Auditoria de Grupos"));

        tblGruposAuditoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaga_ID", "Versão", "MOD", "Vaga", "Vaga_MOD", "Storage_ID", "Storage_ID_MOD", "Obs", "Obs_MOD", "Computador / AD_User ", "Usuario", "Data Modificação", "Motivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGruposAuditoria.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(tblGruposAuditoria);
        if (tblGruposAuditoria.getColumnModel().getColumnCount() > 0) {
            tblGruposAuditoria.getColumnModel().getColumn(0).setMinWidth(80);
            tblGruposAuditoria.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblGruposAuditoria.getColumnModel().getColumn(0).setMaxWidth(80);
            tblGruposAuditoria.getColumnModel().getColumn(1).setMinWidth(80);
            tblGruposAuditoria.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblGruposAuditoria.getColumnModel().getColumn(1).setMaxWidth(80);
            tblGruposAuditoria.getColumnModel().getColumn(2).setMinWidth(100);
            tblGruposAuditoria.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblGruposAuditoria.getColumnModel().getColumn(2).setMaxWidth(100);
            tblGruposAuditoria.getColumnModel().getColumn(3).setMinWidth(300);
            tblGruposAuditoria.getColumnModel().getColumn(3).setPreferredWidth(300);
            tblGruposAuditoria.getColumnModel().getColumn(4).setMinWidth(100);
            tblGruposAuditoria.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblGruposAuditoria.getColumnModel().getColumn(4).setMaxWidth(100);
            tblGruposAuditoria.getColumnModel().getColumn(5).setMinWidth(300);
            tblGruposAuditoria.getColumnModel().getColumn(5).setPreferredWidth(300);
            tblGruposAuditoria.getColumnModel().getColumn(6).setMinWidth(100);
            tblGruposAuditoria.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblGruposAuditoria.getColumnModel().getColumn(6).setMaxWidth(100);
            tblGruposAuditoria.getColumnModel().getColumn(7).setMinWidth(80);
            tblGruposAuditoria.getColumnModel().getColumn(7).setPreferredWidth(80);
            tblGruposAuditoria.getColumnModel().getColumn(7).setMaxWidth(80);
            tblGruposAuditoria.getColumnModel().getColumn(8).setMinWidth(100);
            tblGruposAuditoria.getColumnModel().getColumn(8).setPreferredWidth(100);
            tblGruposAuditoria.getColumnModel().getColumn(8).setMaxWidth(100);
            tblGruposAuditoria.getColumnModel().getColumn(9).setMinWidth(300);
            tblGruposAuditoria.getColumnModel().getColumn(9).setPreferredWidth(300);
            tblGruposAuditoria.getColumnModel().getColumn(10).setMinWidth(200);
            tblGruposAuditoria.getColumnModel().getColumn(10).setPreferredWidth(200);
            tblGruposAuditoria.getColumnModel().getColumn(11).setMinWidth(200);
            tblGruposAuditoria.getColumnModel().getColumn(11).setPreferredWidth(200);
            tblGruposAuditoria.getColumnModel().getColumn(12).setMinWidth(500);
            tblGruposAuditoria.getColumnModel().getColumn(12).setPreferredWidth(500);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        txtPesquisarAuditoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarAuditoriaKeyReleased(evt);
            }
        });

        jLabel5.setText("Pesquisar:");

        javax.swing.GroupLayout pnlAuditoriaGruposLayout = new javax.swing.GroupLayout(pnlAuditoriaGrupos);
        pnlAuditoriaGrupos.setLayout(pnlAuditoriaGruposLayout);
        pnlAuditoriaGruposLayout.setHorizontalGroup(
            pnlAuditoriaGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAuditoriaGruposLayout.createSequentialGroup()
                .addGroup(pnlAuditoriaGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlAuditoriaGruposLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarAuditoria)))
                .addContainerGap())
        );
        pnlAuditoriaGruposLayout.setVerticalGroup(
            pnlAuditoriaGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAuditoriaGruposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAuditoriaGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarAuditoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAuditoriaGrupos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAuditoriaGrupos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("Audit Trail", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        abrirVaga();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblVaga.getSelectedRow() != -1) {
            deletar();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        read();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tblVagaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVagaMouseClicked
        if (evt.getClickCount() == 2) {
            atualizar();
        }
    }//GEN-LAST:event_tblVagaMouseClicked

    private void tblVagaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblVagaKeyPressed
        if (tblVaga.getSelectedRow() != -1) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                atualizar();
            }
            if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                deletar();
            }
        }
    }//GEN-LAST:event_tblVagaKeyPressed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        TableSorter.TableSorter(tblVaga, txtPesquisar);
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void txtPesquisarAuditoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarAuditoriaKeyReleased
        TableSorter.TableSorter(tblGruposAuditoria, txtPesquisarAuditoria);
    }//GEN-LAST:event_txtPesquisarAuditoriaKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblVaga.getSelectedRow() != -1) {
            atualizar();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmColunaVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmColunaVaga().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel pnlAuditoriaGrupos;
    private javax.swing.JPanel pnlUsuarios;
    private javax.swing.JTable tblGruposAuditoria;
    private javax.swing.JTable tblVaga;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtPesquisarAuditoria;
    // End of variables declaration//GEN-END:variables

    private void read() {
        DefaultTableModel model = (DefaultTableModel) tblVaga.getModel();
        ColunaVagaDAO colVagaDAO = new ColunaVagaDAO();
        model.setNumRows(0);
        try {
            for (ColunaVaga colVaga : colVagaDAO.findAll()) {
                model.addRow(new Object[]{
                    colVaga.getId(),
                    colVaga.getColunaStorage().getSetor().getSetor()
                    + " - " + colVaga.getColunaStorage().getTipo()
                    + ": " + colVaga.getColunaStorage().getNumero()
                    + " -  Vaga: " + colVaga.getVaga(),
                    colVaga.getObs(),
                    colVaga.getVersion()
                });
            }
            carregarAuditoria();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e);
        }
    }

    private void abrirVaga() {
        try {
            new FrmColunaVagaDados(null, true).setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e);
        } finally {
            read();
        }
    }

    private void deletar() {
        if (AcessoSistema.deletarDados(ACESSO)) {
        Senha senha = new Senha();
        try {
            int dialogResult = JOptionPane.showConfirmDialog(null,
                    "Realmente Deseja Excluir Esse Registro?", "Aviso", JOptionPane.YES_NO_OPTION);
            if (dialogResult == 0) {
                setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                ColunaVagaDAO colVagaDAO = new ColunaVagaDAO();
                try {
                    if (senha.Salvar()) {
                        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                        colVagaDAO.remover(ColunaVaga.class,
                                (Long) tblVaga.getValueAt(tblVaga.getSelectedRow(), 0));
                        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao excuir o dado: " + e.getMessage(), "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
                }
                read();
                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        } catch (Exception e) {
        }
        }
    }

    private void atualizar() {
        if (AcessoSistema.editarDados(ACESSO)) {
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            ColunaVagaDAO colVagaDAO = new ColunaVagaDAO();
            FrmColunaVagaDados frm = new FrmColunaVagaDados(null, true,
                    colVagaDAO.findById(ColunaVaga.class,
                            (Long) tblVaga.getValueAt(tblVaga.getSelectedRow(), 0)));
            frm.setVisible(true);
            read();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir os dados: " + ex);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }
    }

    private void carregarAuditoria() {
        DefaultTableModel model = (DefaultTableModel) tblGruposAuditoria.getModel();
        ColunaVagaDAO colVagaDAO = new ColunaVagaDAO();
        model.setNumRows(0);
        try {
            for (ColunaVaga colVaga : colVagaDAO.readAuditoria()) {
                model.addRow(new Object[]{
                    colVaga.getId(),
                    colVaga.getVersion(),
                    colVaga.getAudit().getMOD() == 0 ? "Criado"
                    : (colVaga.getAudit().getMOD() == 1 ? "Modificado" : "Removido"),
                    colVaga.getVaga(),
                    colVaga.getVaga_MOD() == false ? "Não Alterado" : "Alterado",
                    colVaga.getColunaStorage().getId(),
                    colVaga.getColunaStorage_MOD() == false ? "Não Alterado" : "Alterado",
                    colVaga.getObs(),
                    colVaga.getObs_MOD() == false ? "Não Alterado" : "Alterado",
                    colVaga.getAudit().getComputador() + " / "
                    + colVaga.getAudit().getUserComputador(),
                    colVaga.getAudit().getUltimaModificacaoPor(),
                    DataHora.getStringDateTime(colVaga.getAudit().getUltimaModificacao()),
                    colVaga.getAudit().getMotivo()
                });
            }
        } catch (Exception e) {
        }
    }

}
