package br.com.cristalia.reagentes.view;

import br.com.cristalia.biblioteca.dao.RegistroSolucaoReagenteDAO;
import br.com.cristalia.biblioteca.model.RegistroSolucaoReagente;
import br.com.cristalia.biblioteca.util.AcessoSistema;
import br.com.cristalia.biblioteca.util.Frames;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafael.lopes
 */
public class FrmRegistroSolucaoReagenteDados extends javax.swing.JDialog {

    private String ACESSO = new AcessoSistema().getAcessoSistema(this);
    private RegistroSolucaoReagente regsolReagente;

    /**
     * Creates new form FrmConfigAcesso
     *
     * @param parent
     * @param modal
     * @param regSol
     */
    public FrmRegistroSolucaoReagenteDados(java.awt.Frame parent, boolean modal, RegistroSolucaoReagente regSol) {
        super(parent, modal);
        initComponents();
        Frames.setUpFrame(this, "Dados da Metodologia", false);
        regsolReagente = regSol;
        limparCampos();
        carregarDados();
        btnAdicionar.setEnabled(AcessoSistema.criarDados(ACESSO));
        btnRemover.setEnabled(AcessoSistema.deletarDados(ACESSO));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSolucaoReagente1 = new javax.swing.JTable();
        btnAdicionar1 = new javax.swing.JButton();
        btnRemover1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSolucaoReagente = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAdicionar3 = new javax.swing.JButton();
        btnRemover3 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblParametro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnCancelar.setText("Fechar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Soluções / Reagentes"));

        tblSolucaoReagente1.setAutoCreateRowSorter(true);
        tblSolucaoReagente1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Lote", "Qtd", "Fabribante", "Validade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSolucaoReagente1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblSolucaoReagente1.setSurrendersFocusOnKeystroke(true);
        tblSolucaoReagente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSolucaoReagente1MouseClicked(evt);
            }
        });
        tblSolucaoReagente1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblSolucaoReagente1KeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tblSolucaoReagente1);
        if (tblSolucaoReagente1.getColumnModel().getColumnCount() > 0) {
            tblSolucaoReagente1.getColumnModel().getColumn(0).setMinWidth(500);
            tblSolucaoReagente1.getColumnModel().getColumn(0).setPreferredWidth(500);
            tblSolucaoReagente1.getColumnModel().getColumn(1).setMinWidth(100);
            tblSolucaoReagente1.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblSolucaoReagente1.getColumnModel().getColumn(2).setMinWidth(80);
            tblSolucaoReagente1.getColumnModel().getColumn(2).setPreferredWidth(80);
            tblSolucaoReagente1.getColumnModel().getColumn(2).setHeaderValue("Qtd");
            tblSolucaoReagente1.getColumnModel().getColumn(3).setMinWidth(120);
            tblSolucaoReagente1.getColumnModel().getColumn(3).setPreferredWidth(120);
            tblSolucaoReagente1.getColumnModel().getColumn(3).setHeaderValue("Fabribante");
            tblSolucaoReagente1.getColumnModel().getColumn(4).setMinWidth(100);
            tblSolucaoReagente1.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblSolucaoReagente1.getColumnModel().getColumn(4).setHeaderValue("Validade");
        }

        btnAdicionar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon_plus_24.png"))); // NOI18N
        btnAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionar1ActionPerformed(evt);
            }
        });

        btnRemover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon_minus_24.png"))); // NOI18N
        btnRemover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemover1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemover1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnAdicionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemover1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 153, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipamentos"));

        tblSolucaoReagente.setAutoCreateRowSorter(true);
        tblSolucaoReagente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TAG", "Registro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSolucaoReagente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblSolucaoReagente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSolucaoReagente.setSurrendersFocusOnKeystroke(true);
        tblSolucaoReagente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSolucaoReagenteMouseClicked(evt);
            }
        });
        tblSolucaoReagente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblSolucaoReagenteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblSolucaoReagente);
        if (tblSolucaoReagente.getColumnModel().getColumnCount() > 0) {
            tblSolucaoReagente.getColumnModel().getColumn(0).setMinWidth(400);
            tblSolucaoReagente.getColumnModel().getColumn(0).setPreferredWidth(400);
            tblSolucaoReagente.getColumnModel().getColumn(1).setMinWidth(120);
            tblSolucaoReagente.getColumnModel().getColumn(1).setPreferredWidth(120);
        }

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon_plus_24.png"))); // NOI18N
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon_minus_24.png"))); // NOI18N
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Parâmetro"));

        btnAdicionar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon_plus_24.png"))); // NOI18N
        btnAdicionar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionar3ActionPerformed(evt);
            }
        });

        btnRemover3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon_minus_24.png"))); // NOI18N
        btnRemover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemover3ActionPerformed(evt);
            }
        });

        tblParametro.setAutoCreateRowSorter(true);
        tblParametro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parâmetro", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblParametro.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblParametro.setSurrendersFocusOnKeystroke(true);
        tblParametro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblParametroMouseClicked(evt);
            }
        });
        tblParametro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblParametroKeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tblParametro);
        if (tblParametro.getColumnModel().getColumnCount() > 0) {
            tblParametro.getColumnModel().getColumn(0).setMinWidth(500);
            tblParametro.getColumnModel().getColumn(0).setPreferredWidth(500);
            tblParametro.getColumnModel().getColumn(1).setMinWidth(100);
            tblParametro.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemover3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnAdicionar3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemover3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 864, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblSolucaoReagenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSolucaoReagenteKeyReleased
        if (tblSolucaoReagente.getSelectedRow() != -1) {
            if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                remover();
            }
        }
    }//GEN-LAST:event_tblSolucaoReagenteKeyReleased

    private void tblSolucaoReagenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSolucaoReagenteMouseClicked
        if (evt.getClickCount() == 2) {
            atualizar();
        }
    }//GEN-LAST:event_tblSolucaoReagenteMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (tblSolucaoReagente.getSelectedRow() != -1) {
            remover();
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        add();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void tblSolucaoReagente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSolucaoReagente1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSolucaoReagente1MouseClicked

    private void tblSolucaoReagente1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSolucaoReagente1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSolucaoReagente1KeyReleased

    private void btnAdicionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionar1ActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblSolucaoReagente1.getModel();
        model.addRow(new Object[]{"", "", "","",""});

    }//GEN-LAST:event_btnAdicionar1ActionPerformed

    private void btnRemover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemover1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblSolucaoReagente1.getModel();
        model.removeRow(tblSolucaoReagente1.getSelectedRow());
    }//GEN-LAST:event_btnRemover1ActionPerformed

    private void btnAdicionar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionar3ActionPerformed

    private void btnRemover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemover3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemover3ActionPerformed

    private void tblParametroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblParametroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblParametroMouseClicked

    private void tblParametroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblParametroKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblParametroKeyReleased

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
            java.util.logging.Logger.getLogger(FrmRegistroSolucaoReagenteDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmRegistroSolucaoReagenteDados dialog = new FrmRegistroSolucaoReagenteDados(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAdicionar1;
    private javax.swing.JButton btnAdicionar3;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnRemover1;
    private javax.swing.JButton btnRemover3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblParametro;
    private javax.swing.JTable tblSolucaoReagente;
    private javax.swing.JTable tblSolucaoReagente1;
    // End of variables declaration//GEN-END:variables

    public final void read() {
        DefaultTableModel model = (DefaultTableModel) tblSolucaoReagente.getModel();
        RegistroSolucaoReagenteDAO regsolReagenteDAO = new RegistroSolucaoReagenteDAO();
        model.setNumRows(0);
//        try {
//            for (RegistroSolucaoReagente regsolReagente : regsolReagenteDAO.findByMetodologiaId(metodo.getId())) {
//                model.addRow(new Object[]{
//                    solReagente.getId(),
//                    solReagente.getDescricao(),
//                    solReagente.getRepouso(),
//                    solReagente.getObs(),
//                    solReagente.getVersion()
//                });
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e);
//        }
    }

    private void carregarDados() {
//        try {
//            txtCodMetodo.setText(metodo.getCodMetodo().toUpperCase());
//            txtVersao.setText(metodo.getVersao().toString());
//            txtMetodo.setText(metodo.getMetodo().toUpperCase());
//            read();
//            carregarAuditoria();
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + ex);
//        }
    }

    private void limparCampos() {
//        txtCodMetodo.setText(null);
//        txtMetodo.setText(null);
//        txtVersao.setText(null);
    }

    private void add() {
//        if (AcessoSistema.criarDados(ACESSO)) {
//            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
//            try {
//                FrmMetodologiaSolucoesReagentes frm = new FrmMetodologiaSolucoesReagentes(null, true, metodo);
//                frm.setVisible(true);
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(null, "Erro ao remover Material: " + ex);
//            } finally {
//                read();
//                carregarAuditoria();
//            }
//            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
//        }
    }

    private void atualizar() {
//        if (AcessoSistema.editarDados(ACESSO)) {
//            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
//            try {
//                SolucaoReagente solRegente = new RegistroSolucaoReagenteDAO().findById(SolucaoReagente.class,
//                        (Long) tblSolucaoReagente.getValueAt(tblSolucaoReagente.getSelectedRow(), 0));
//                FrmMetodologiaSolucoesReagentes frm = new FrmMetodologiaSolucoesReagentes(null, true, metodo, solRegente);
//                frm.setVisible(true);
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(null, "Erro ao remover Material: " + ex);
//            } finally {
//                read();
//                carregarAuditoria();
//            }
//            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
//        }
    }

    private void remover() {
//        if (AcessoSistema.deletarDados(ACESSO)) {
//            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
//            Senha senha = new Senha();
//            try {
//                if (senha.Salvar()) {
//                    new RegistroSolucaoReagenteDAO().remover(SolucaoReagente.class,
//                            (Long) tblSolucaoReagente.getValueAt(tblSolucaoReagente.getSelectedRow(), 0));
//                }
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(null, "Erro ao remover Material: " + ex);
//            } finally {
//                read();
//                carregarAuditoria();
//            }
//            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
//        }
    }

    private void carregarAuditoria() {
//        DefaultTableModel model = (DefaultTableModel) tblMateriaisAuditoria.getModel();
//        RegistroSolucaoReagenteDAO solRegenteDAO = new RegistroSolucaoReagenteDAO();
//        model.setNumRows(0);
//        try {
//            for (SolucaoReagente solRegente : solRegenteDAO.readAuditoria(metodo.getId())) {
//                model.addRow(new Object[]{
//                    solRegente.getId(),
//                    solRegente.getVersion(),
//                    solRegente.getAudit().getMOD() == 0 ? "Criado"
//                    : (solRegente.getAudit().getMOD() == 1 ? "Modificado" : "Removido"),
//                    solRegente.getDescricao(),
//                    solRegente.getDescricao_MOD() == false ? "Não Alterado" : "Alterado",
//                    solRegente.getRepouso(),
//                    solRegente.getRepouso_MOD() == false ? "Não Alterado" : "Alterado",
//                    solRegente.getMetodologia().getId(),
//                    solRegente.getMetodologia_MOD() == false ? "Não Alterado" : "Alterado",
//                    solRegente.getObs(),
//                    solRegente.getObs_MOD() == false ? "Não Alterado" : "Alterado",
//                    solRegente.getAudit().getComputador() + " / " + solRegente.getAudit().getUserComputador(),
//                    solRegente.getAudit().getUltimaModificacaoPor(),
//                    DataHora.getStringDateTime(solRegente.getAudit().getUltimaModificacao()),
//                    solRegente.getAudit().getMotivo()
//                });
//            }
//        } catch (Exception e) {
//        }
    }

}
