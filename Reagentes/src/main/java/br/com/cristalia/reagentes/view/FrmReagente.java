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
package br.com.cristalia.reagentes.view;

import br.com.cristalia.biblioteca.model.Reagente;
import br.com.cristalia.biblioteca.util.AcessoSistema;
import br.com.cristalia.biblioteca.util.DataHora;
import br.com.cristalia.biblioteca.util.Frames;
import br.com.cristalia.biblioteca.util.Pdf;
import br.com.cristalia.biblioteca.util.Senha;
import br.com.cristalia.biblioteca.util.TableSorter;
import br.com.cristalia.reagentes.dao.ReagenteDAO;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafael.lopes
 */
public class FrmReagente extends javax.swing.JFrame {

    private String ACESSO = new AcessoSistema().getAcessoSistema(this);

    /**
     * Creates new form NewJDialog
     */
    public FrmReagente() {
        initComponents();
        Frames.setUpFrame(this, "Reagentes", false);
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

        tblPaneMetodologia = new javax.swing.JTabbedPane();
        pnlMetodologia = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReagente = new javax.swing.JTable();
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
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btnCertificado = new javax.swing.JButton();
        pnlDados = new javax.swing.JPanel();
        pnlAuditoria = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGruposAuditoria = new javax.swing.JTable();
        txtPesquisarAuditoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Materiais"));

        tblReagente.setAutoCreateRowSorter(true);
        tblReagente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reagente_Id", "Código", "n° ID", "Reagente", "Endereçamento", "Versão", "Obs"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReagente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblReagente.setSurrendersFocusOnKeystroke(true);
        tblReagente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReagenteMouseClicked(evt);
            }
        });
        tblReagente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblReagenteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblReagente);
        if (tblReagente.getColumnModel().getColumnCount() > 0) {
            tblReagente.getColumnModel().getColumn(0).setMinWidth(100);
            tblReagente.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblReagente.getColumnModel().getColumn(0).setMaxWidth(100);
            tblReagente.getColumnModel().getColumn(1).setMinWidth(80);
            tblReagente.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblReagente.getColumnModel().getColumn(1).setMaxWidth(80);
            tblReagente.getColumnModel().getColumn(2).setMinWidth(80);
            tblReagente.getColumnModel().getColumn(2).setPreferredWidth(80);
            tblReagente.getColumnModel().getColumn(2).setMaxWidth(80);
            tblReagente.getColumnModel().getColumn(4).setMinWidth(120);
            tblReagente.getColumnModel().getColumn(4).setPreferredWidth(120);
            tblReagente.getColumnModel().getColumn(4).setMaxWidth(120);
            tblReagente.getColumnModel().getColumn(5).setMinWidth(80);
            tblReagente.getColumnModel().getColumn(5).setPreferredWidth(80);
            tblReagente.getColumnModel().getColumn(5).setMaxWidth(80);
            tblReagente.getColumnModel().getColumn(6).setMinWidth(0);
            tblReagente.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblReagente.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

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
        jToolBar1.add(jSeparator9);

        btnCertificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon_certificado_32.png"))); // NOI18N
        btnCertificado.setText("FISPQ");
        btnCertificado.setFocusable(false);
        btnCertificado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCertificado.setPreferredSize(new java.awt.Dimension(60, 60));
        btnCertificado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertificadoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCertificado);

        javax.swing.GroupLayout pnlMetodologiaLayout = new javax.swing.GroupLayout(pnlMetodologia);
        pnlMetodologia.setLayout(pnlMetodologiaLayout);
        pnlMetodologiaLayout.setHorizontalGroup(
            pnlMetodologiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMetodologiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMetodologiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMetodologiaLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarMetodologia))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMetodologiaLayout.setVerticalGroup(
            pnlMetodologiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMetodologiaLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMetodologiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblPaneMetodologia.addTab("Reagentes", pnlMetodologia);

        pnlDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Auditoria Material"));

        tblGruposAuditoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reagente_Id", "Versão", "MOD", "Cod_Reagente", "Cod_Reagente_MOD", "Reagente", "Reagente_MOD", "Controlado", "Controlado_MOD", "CasNumber", "CasNumber_MOD", "Grau", "Grau_MOD", "Pureza", "Pureza_MOD", "FispqLink", "FispqLink_MOD", "Obs", "Obs_MOD", "NumeroIdentificacao", "NumeroIdentificacao_MOD", "Enderecamento", "Enderecamento_MOD", "Armazenamento", "Armazenamento_MOD", "QtdEstoqueMin", "QtdEstoqueMin_MOD", "QtdEstoqueMax", "QtdEstoqueMax_MOD", "Unidade", "Unidade_MOD", "Inflamabilidade", "Inflamabilidade_MOD", "Reatividade", "Reatividade_MOD", "Especifico", "Especifico_MOD", "Computador / AD_User ", "Usuario", "Data Modificação", "Motivo", "Validação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
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
            tblGruposAuditoria.getColumnModel().getColumn(0).setMinWidth(120);
            tblGruposAuditoria.getColumnModel().getColumn(0).setPreferredWidth(120);
            tblGruposAuditoria.getColumnModel().getColumn(1).setMinWidth(80);
            tblGruposAuditoria.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblGruposAuditoria.getColumnModel().getColumn(1).setMaxWidth(80);
            tblGruposAuditoria.getColumnModel().getColumn(2).setMinWidth(100);
            tblGruposAuditoria.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblGruposAuditoria.getColumnModel().getColumn(2).setMaxWidth(100);
            tblGruposAuditoria.getColumnModel().getColumn(37).setMinWidth(200);
            tblGruposAuditoria.getColumnModel().getColumn(37).setPreferredWidth(200);
            tblGruposAuditoria.getColumnModel().getColumn(38).setMinWidth(150);
            tblGruposAuditoria.getColumnModel().getColumn(38).setPreferredWidth(150);
            tblGruposAuditoria.getColumnModel().getColumn(39).setMinWidth(120);
            tblGruposAuditoria.getColumnModel().getColumn(39).setPreferredWidth(120);
            tblGruposAuditoria.getColumnModel().getColumn(40).setMinWidth(800);
            tblGruposAuditoria.getColumnModel().getColumn(40).setPreferredWidth(800);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
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

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAuditoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAuditoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblPaneMetodologia.addTab("Audit Trail", pnlDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tblPaneMetodologia)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tblPaneMetodologia)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblReagenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReagenteMouseClicked
        if (evt.getClickCount() == 2) {
            atualizar();
        }
    }//GEN-LAST:event_tblReagenteMouseClicked

    private void tblReagenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblReagenteKeyReleased
        if (tblReagente.getSelectedRow() != -1) {
            if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                deletar();
            }
        }
    }//GEN-LAST:event_tblReagenteKeyReleased

    private void txtPesquisarMetodologiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarMetodologiaKeyReleased
        TableSorter.TableSorter(tblReagente, txtPesquisarMetodologia);
    }//GEN-LAST:event_txtPesquisarMetodologiaKeyReleased

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        abrir();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblReagente.getSelectedRow() != -1) {
            atualizar();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblReagente.getSelectedRow() != -1) {
            deletar();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        read();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtPesquisarAuditoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarAuditoriaKeyReleased
        TableSorter.TableSorter(tblGruposAuditoria, txtPesquisarAuditoria);
    }//GEN-LAST:event_txtPesquisarAuditoriaKeyReleased

    private void btnCertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertificadoActionPerformed
        if (tblReagente.getSelectedRow() != -1) {
            try {
                ReagenteDAO reagenteDAO = new ReagenteDAO();
                setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                Reagente reagente = reagenteDAO.findById(Reagente.class,(Long) tblReagente.getValueAt(tblReagente.getSelectedRow(), 0));
                if (reagente.getFispq()!= null) {
                    Pdf.view(reagente.getFispq().getId());
                } else {
                    JOptionPane.showMessageDialog(this, "Esse registro não possui Fispq anexado!",
                        "Erro de Fispq", JOptionPane.WARNING_MESSAGE);
                }
                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e);
            } finally {
                read();
            }
        }
    }//GEN-LAST:event_btnCertificadoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReagente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmReagente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCertificado;
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
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel pnlAuditoria;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlMetodologia;
    private javax.swing.JTable tblGruposAuditoria;
    private javax.swing.JTabbedPane tblPaneMetodologia;
    private javax.swing.JTable tblReagente;
    private javax.swing.JTextField txtPesquisarAuditoria;
    private javax.swing.JTextField txtPesquisarMetodologia;
    // End of variables declaration//GEN-END:variables

    public final void read() {
        DefaultTableModel model = (DefaultTableModel) tblReagente.getModel();
        ReagenteDAO reagenteDAO = new ReagenteDAO();
        model.setNumRows(0);
        try {
            for (Reagente reagente : reagenteDAO.findEntities(Reagente.class)) {
                model.addRow(new Object[]{
                    reagente.getId(),
                    reagente.getCodReagente(),
                    reagente.getNumeroIdentificacao(),
                    reagente.getReagente(),
                    reagente.getEnderecamento(),
                    reagente.getVersion(),
                    reagente.getObs()
                });
            }
            carregarAuditoria();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e);
        }
    }

    private void abrir() {
        try {
            new FrmReagenteDados(null, true).setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e);
        } finally {
            read();
        }
    }

    private void atualizar() {
        ReagenteDAO reagenteDAO = new ReagenteDAO();
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            Reagente reagente = reagenteDAO.findById(Reagente.class,
                    (Long) tblReagente.getValueAt(tblReagente.getSelectedRow(), 0));
            new FrmReagenteDados(null, true, reagente).setVisible(true);
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e);
        } finally {
            read();
        }
    }

    private void deletar() {
        ReagenteDAO reagenteDAO = new ReagenteDAO();
        Senha senha = new Senha();
        try {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Realmente deseja Excluir esse registro?", "Aviso", JOptionPane.YES_NO_OPTION);
            if (dialogResult == 0) {
                if (senha.Salvar()) {
                    Reagente reagente = reagenteDAO.findById(Reagente.class,
                            (Long) tblReagente.getValueAt(tblReagente.getSelectedRow(), 0));
                    reagenteDAO.remover(Reagente.class, reagente.getId());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excuir o dado: " + e.getMessage(), "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
        } finally {
            read();
        }
    }

    private void carregarAuditoria() {
        DefaultTableModel model = (DefaultTableModel) tblGruposAuditoria.getModel();
        ReagenteDAO reagenteDAO = new ReagenteDAO();
        model.setNumRows(0);
        try {
            for (Reagente reagente : reagenteDAO.readAuditoria()) {
                model.addRow(new Object[]{
                    reagente.getId(),
                    reagente.getVersion(),
                    reagente.getAudit().getMOD() == 0 ? "Criado"
                    : (reagente.getAudit().getMOD() == 1 ? "Modificado" : "Removido"),
                    reagente.getCodReagente(),
                    reagente.getCodReagente_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getReagente(),
                    reagente.getReagente_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getControlado(),
                    reagente.getControlado_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getCasNumber(),
                    reagente.getCasNumber_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getGrau(),
                    reagente.getGrau_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getPureza(),
                    reagente.getPureza_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getFispq().getId(),
                    reagente.getFispq_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getObs(),
                    reagente.getObs_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getNumeroIdentificacao(),
                    reagente.getNumeroIdentificacao_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getEnderecamento(),
                    reagente.getEnderecamento_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getArmazenamento(),
                    reagente.getArmazenamento_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getQtdEstoqueMin(),
                    reagente.getQtdEstoqueMin_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getQtdEstoqueMax(),
                    reagente.getQtdEstoqueMax_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getUnidade(),
                    reagente.getUnidade_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getInflamabilidade(),
                    reagente.getInflamabilidade_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getReatividade(),
                    reagente.getReatividade_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getEspecifico(),
                    reagente.getEspecifico_MOD() == false ? "Não Alterado" : "Alterado",
                    reagente.getAudit().getComputador() + " / " + reagente.getAudit().getUserComputador(),
                    reagente.getAudit().getUltimaModificacaoPor(),
                    DataHora.getStringDateTime(reagente.getAudit().getUltimaModificacao()),
                    reagente.getAudit().getMotivo()
                });
            }
        } catch (Exception e) {
        }

    }

}