package br.com.cristalia.colunas.view;

import br.com.cristalia.biblioteca.dao.AnaliseDAO;
import br.com.cristalia.biblioteca.dao.ArquivosDAO;
import br.com.cristalia.biblioteca.dao.MetodologiaDAO;
import br.com.cristalia.biblioteca.dao.SetorDAO;
import br.com.cristalia.biblioteca.model.Analise;
import br.com.cristalia.biblioteca.model.Arquivos;
import br.com.cristalia.biblioteca.model.Metodologia;
import br.com.cristalia.biblioteca.model.Setor;
import br.com.cristalia.biblioteca.util.ComboBox;
import br.com.cristalia.biblioteca.util.FieldFormatLimit;
import br.com.cristalia.biblioteca.util.Frames;
import br.com.cristalia.biblioteca.util.Pdf;
import br.com.cristalia.biblioteca.util.Senha;
import br.com.cristalia.biblioteca.dao.ColunaDAO;
import br.com.cristalia.biblioteca.dao.ColunaUtilDAO;
import br.com.cristalia.biblioteca.dao.ColunaVagaDAO;
import br.com.cristalia.biblioteca.model.Coluna;
import br.com.cristalia.biblioteca.model.ColunaUtil;
import br.com.cristalia.biblioteca.model.ColunaVaga;
import javax.swing.JOptionPane;
import java.awt.Cursor;
import java.io.File;
import java.util.TreeMap;

/**
 *
 * @author rafael.lopes
 */
public class FrmColunasCromatograficasDados extends javax.swing.JDialog {

    private ColunaUtil colunaUtil;
    private ColunaVaga colunaVaga;
    private boolean novoColuna = false;
    private final TreeMap<Long, String> categoryMapSetor = new TreeMap<>();
    private final TreeMap<Long, String> categoryMapColuna = new TreeMap<>();
    private final TreeMap<Long, String> categoryMapMetodo = new TreeMap<>();
    private final TreeMap<Long, String> categoryMapAnalise = new TreeMap<>();
    private final TreeMap<Long, String> categoryMapVaga = new TreeMap<>();
    private File certificado = null;

    /**
     * Creates new form FrmConfigAcesso
     *
     * @param parent
     * @param modal
     */
    public FrmColunasCromatograficasDados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initFrame();
        novoColuna = true;
        ckbEstoque.setSelected(true);
    }

    public FrmColunasCromatograficasDados(java.awt.Frame parent, boolean modal, ColunaUtil colUtil) {
        super(parent, modal);
        initComponents();
        initFrame();
        colunaUtil = colUtil;
        carregarDados();
    }

    private void initFrame() {
        Frames.setUpFrame(this, "Dados da Coluna", true);
        txtSerialNumber.setDocument(new FieldFormatLimit(30, FieldFormatLimit.TUDO));
        readSetor();
        readAnalise();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        btnProcurarColuna = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        txtObsColuna = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtDataAtivacao = new com.toedter.calendar.JDateChooser();
        jLabel35 = new javax.swing.JLabel();
        txtVaga = new javax.swing.JTextField();
        btnVagaColuna = new javax.swing.JButton();
        cmbSetor = new javax.swing.JComboBox();
        btnProcurarMetodo = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtColuna = new javax.swing.JTextField();
        txtMetodologia = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtDataVerificacao = new com.toedter.calendar.JDateChooser();
        jLabel38 = new javax.swing.JLabel();
        txtArquivo = new javax.swing.JTextField();
        btnAnexar = new javax.swing.JButton();
        ckbEstoque = new javax.swing.JCheckBox();
        cmbAnalise = new javax.swing.JComboBox();
        btnSalvarMetodo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações da Coluna"));

        jLabel27.setText("Coluna:");

        jLabel42.setText("Serial Number:");

        btnProcurarColuna.setText("Buscar");
        btnProcurarColuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarColunaActionPerformed(evt);
            }
        });

        jLabel37.setText("Obs:");

        jLabel41.setText("Ativação:");

        jLabel35.setText("Vaga:");

        txtVaga.setEditable(false);
        txtVaga.setBackground(new java.awt.Color(204, 204, 204));

        btnVagaColuna.setText("Vaga");
        btnVagaColuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVagaColunaActionPerformed(evt);
            }
        });

        btnProcurarMetodo.setText("Buscar");
        btnProcurarMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarMetodoActionPerformed(evt);
            }
        });

        jLabel24.setText("Método:");

        jLabel28.setText("Setor:");

        jLabel31.setText("Análise:");

        txtColuna.setEditable(false);
        txtColuna.setBackground(new java.awt.Color(204, 204, 204));

        txtMetodologia.setEditable(false);
        txtMetodologia.setBackground(new java.awt.Color(204, 204, 204));

        jLabel43.setText("Verificação:");

        jLabel38.setText("Certificado:");

        txtArquivo.setEditable(false);

        btnAnexar.setText("Anexar");
        btnAnexar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexarActionPerformed(evt);
            }
        });

        ckbEstoque.setText("Estoque");
        ckbEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbSetor, 0, 200, Short.MAX_VALUE)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtVaga))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVagaColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbEstoque)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDataAtivacao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataVerificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 491, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtMetodologia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProcurarMetodo))
                            .addComponent(cmbAnalise, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtColuna)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProcurarColuna))
                            .addComponent(txtObsColuna)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtArquivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnexar)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(btnProcurarColuna)
                    .addComponent(txtColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(btnProcurarMetodo)
                    .addComponent(txtMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(cmbAnalise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(cmbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVagaColuna)
                        .addComponent(ckbEstoque)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDataAtivacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDataVerificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtObsColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnexar))
                .addContainerGap())
        );

        btnSalvarMetodo.setText("Ok");
        btnSalvarMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMetodoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvarMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarMetodo)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMetodoActionPerformed
        try {
            Senha senha = new Senha();
            if (txtColuna.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Coluna inválida");
                txtColuna.requestFocus();
            } else if (txtMetodologia.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Metodologia inválida");
                txtMetodologia.requestFocus();
            } else if (txtSerialNumber.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Número Serial da Coluna inválido");
                txtSerialNumber.requestFocus();
            } else if (cmbSetor.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Setor inválido");
                cmbSetor.requestFocus();
            } else if (txtVaga.getText().isEmpty() && !ckbEstoque.isSelected()) {
                JOptionPane.showMessageDialog(null, "Vaga inválida");
                cmbAnalise.requestFocus();
            } else if (novoColuna) {
                if (senha.Salvar()) {
                    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    criar();
                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                    dispose();
                }
            } else {
                if (senha.Salvar()) {
                    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    atualizar();
                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                    dispose();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar dados: " + e);
        }
    }//GEN-LAST:event_btnSalvarMetodoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int option = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza de que deseja fechar esse registro?\nOs dados inseridos não serão salvos!",
                "Confirmação de Cancelamento",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnProcurarColunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarColunaActionPerformed
        Coluna col = new Coluna();
        try {
            FrmProcurarColuna frm = new FrmProcurarColuna(null, true, col);
            frm.setVisible(true);
            if (col.getId() != null) {
                setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                Coluna coluna = new ColunaDAO().findById(Coluna.class, col.getId());
                String name = coluna.getFabricanteColuna().getConfiguracao() + " "
                        + coluna.getMarcaColuna().getConfiguracao() + " - "
                        + coluna.getTipoColuna().getConfiguracao() + " "
                        + coluna.getTamanhoColuna().getConfiguracao() + "mm x "
                        + coluna.getDiametroColuna().getConfiguracao() + "mm x "
                        + coluna.getParticulaColuna().getConfiguracao() + "µm ";
                txtColuna.setText(name);
                categoryMapColuna.clear();
                categoryMapColuna.put(coluna.getId(), name);
                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + ex);
        }
    }//GEN-LAST:event_btnProcurarColunaActionPerformed

    private void btnVagaColunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVagaColunaActionPerformed
        ColunaVaga vaga = new ColunaVaga();
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        FrmProcurarVaga frm = new FrmProcurarVaga(null, true, vaga);
        frm.setVisible(true);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        try {
            vaga = new ColunaVagaDAO().findById(ColunaVaga.class, vaga.getId());
            String name = vaga.getColunaStorage().getSetor().getSiglaSetor()
                    + " - " + vaga.getColunaStorage().getTipo()
                    + ": " + vaga.getColunaStorage().getNumero()
                    + " -  Vaga: " + vaga.getVaga();
            txtVaga.setText(name);
            categoryMapVaga.clear();
            categoryMapVaga.put(vaga.getId(), name);
            ckbEstoque.setSelected(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + ex);
        }
    }//GEN-LAST:event_btnVagaColunaActionPerformed

    private void btnAnexarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexarActionPerformed
        try {
            certificado = Pdf.carregar();
            if (certificado != null) {
                txtArquivo.setText(certificado.getName());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao anexar dados: " + ex);
        }
    }//GEN-LAST:event_btnAnexarActionPerformed

    private void btnProcurarMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarMetodoActionPerformed
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            Metodologia mtd = new Metodologia();
            FrmProcurarMetodologia frmMtd = new FrmProcurarMetodologia(null, true, mtd);
            frmMtd.setVisible(true);
            if (mtd.getId() != null) {
                String name = mtd.getCodMetodo() + " - " + mtd.getMetodo();
                txtMetodologia.setText(name);
                categoryMapMetodo.clear();
                categoryMapMetodo.put(mtd.getId(), name);
            }
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + ex);
        }
    }//GEN-LAST:event_btnProcurarMetodoActionPerformed

    private void ckbEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbEstoqueActionPerformed
        if (ckbEstoque.isSelected()) {
            txtVaga.setText("");
            categoryMapVaga.clear();
        }
    }//GEN-LAST:event_ckbEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(FrmColunasCromatograficasDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmColunasCromatograficasDados dialog = new FrmColunasCromatograficasDados(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAnexar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnProcurarColuna;
    private javax.swing.JButton btnProcurarMetodo;
    public static javax.swing.JButton btnSalvarMetodo;
    private javax.swing.JButton btnVagaColuna;
    private javax.swing.JCheckBox ckbEstoque;
    private javax.swing.JComboBox cmbAnalise;
    private javax.swing.JComboBox cmbSetor;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtArquivo;
    public static javax.swing.JTextField txtColuna;
    public static com.toedter.calendar.JDateChooser txtDataAtivacao;
    public static com.toedter.calendar.JDateChooser txtDataVerificacao;
    public static javax.swing.JTextField txtMetodologia;
    private javax.swing.JTextField txtObsColuna;
    private javax.swing.JTextField txtSerialNumber;
    public static javax.swing.JTextField txtVaga;
    // End of variables declaration//GEN-END:variables

    private void readSetor() {
        cmbSetor.removeAllItems();
        cmbSetor.addItem("");
        categoryMapSetor.clear();
        SetorDAO setorDAO = new SetorDAO();
        try {
            for (Setor setor : setorDAO.findEntities(Setor.class)) {
                Long id = setor.getId();
                String name = setor.getSiglaSetor();
                cmbSetor.addItem(name);
                categoryMapSetor.put(id, name);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e);
        }
    }

    public final void readAnalise() {
        cmbAnalise.removeAllItems();
        cmbAnalise.addItem("");
        categoryMapAnalise.clear();
        AnaliseDAO anlsDAO = new AnaliseDAO();
        try {
            for (Analise anls : anlsDAO.findEntities(Analise.class, "analise", true)) {
                Long id = anls.getId();
                String name = anls.getAnalise();
                cmbAnalise.addItem(name);
                categoryMapAnalise.put(id, name);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e);
        }
    }

    private void criar() {
        ColunaUtilDAO colUtilDAO = new ColunaUtilDAO();
        ColunaVagaDAO colVagaDAO = new ColunaVagaDAO();
        try {
            ColunaUtil colUtil = new ColunaUtil();
            ColunaVaga colVaga = colVagaDAO.findById(ColunaVaga.class, ComboBox.getKeyForValue(txtVaga.getText(), categoryMapVaga));
            colUtil.setColuna(new ColunaDAO().findById(Coluna.class, ComboBox.getKeyForValue(txtColuna.getText(), categoryMapColuna)));
            colUtil.setMetodologia(new MetodologiaDAO().findById(Metodologia.class, ComboBox.getKeyForValue(txtMetodologia.getText(), categoryMapMetodo)));
            colUtil.setAnalise(new AnaliseDAO().findById(Analise.class, ComboBox.getKeyForValue(cmbAnalise.getSelectedItem().toString(), categoryMapAnalise)));
            colUtil.setSetor(new SetorDAO().findById(Setor.class, ComboBox.getKeyForValue(cmbSetor.getSelectedItem().toString(), categoryMapSetor)));
            if (ckbEstoque.isSelected()) {
                colUtil.setVaga(null);
                colUtil.setEstoque(true);
            } else {
                colUtil.setVaga(colVaga);
                colUtil.setEstoque(false);
            }
            colUtil.setDataAtivacao(txtDataAtivacao.getDate());
            colUtil.setDataVerificacao(txtDataVerificacao.getDate());
            colUtil.setObs(txtObsColuna.getText());
            colUtil.setSerialNumber(txtSerialNumber.getText());
            try {
                colUtil.setCodigoColuna(colUtilDAO.getUltimaColuna(colUtil.getColuna().getTipoColuna().getConfiguracao()) + 1);
            } catch (Exception e) {
                colUtil.setCodigoColuna(1);
            }
            if (certificado != null) {
                colUtil.setCertificado(Pdf.salvar(certificado, "Certificado de Coluna"));
            }
            colUtil.setVersion(0);
            colUtilDAO.salvar(colUtil);
            colVaga.setColunaUtil(colUtil);
            colVagaDAO.salvar(colVaga);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar dados: " + e);
        }
    }

    private void atualizar() {
        ColunaUtilDAO colUtilDAO = new ColunaUtilDAO();
        ColunaVagaDAO colVagaDAO = new ColunaVagaDAO();
        try {
            colunaUtil.setColuna(new ColunaDAO().findById(Coluna.class, ComboBox.getKeyForValue(txtColuna.getText(), categoryMapColuna)));
            colunaUtil.setMetodologia(new MetodologiaDAO().findById(Metodologia.class, ComboBox.getKeyForValue(txtMetodologia.getText(), categoryMapMetodo)));
            colunaUtil.setAnalise(new AnaliseDAO().findById(Analise.class, ComboBox.getKeyForValue(cmbAnalise.getSelectedItem().toString(), categoryMapAnalise)));
            colunaUtil.setSetor(new SetorDAO().findById(Setor.class, ComboBox.getKeyForValue(cmbSetor.getSelectedItem().toString(), categoryMapSetor)));
            colunaUtil.setDataAtivacao(txtDataAtivacao.getDate());
            colunaUtil.setDataVerificacao(txtDataVerificacao.getDate());
            colunaUtil.setObs(txtObsColuna.getText());
            colunaUtil.setSerialNumber(txtSerialNumber.getText());
            if (certificado != null) {
                colunaUtil.setCertificado(Pdf.salvar(certificado, "Certificado de Coluna"));
            }
            if (ckbEstoque.isSelected()) {
                colunaUtil.setVaga(null);
                colunaUtil.setEstoque(true);
                try {
                    colunaVaga.setColunaUtil(null);
                    colVagaDAO.salvar(colunaVaga);
                } catch (Exception e) {
                }
            } else {
                ColunaVaga colVaga = colVagaDAO.findById(ColunaVaga.class, ComboBox.getKeyForValue(txtVaga.getText(), categoryMapVaga));
                colunaUtil.setVaga(colVaga);
                colunaUtil.setEstoque(false);
                colVaga.setColunaUtil(colunaUtil);
                colVagaDAO.salvar(colVaga);
            }
            colunaUtil.setVersion(colunaUtil.getVersion() + 1);
            colUtilDAO.salvar(colunaUtil);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar dados: " + e);
        }
    }

    private void carregarDados() {
        try {
            Coluna coluna = new ColunaDAO().findById(Coluna.class, colunaUtil.getColuna().getId());
            String nameColuna = coluna.getFabricanteColuna().getConfiguracao() + " "
                    + coluna.getMarcaColuna().getConfiguracao() + " - "
                    + coluna.getTipoColuna().getConfiguracao() + " "
                    + coluna.getTamanhoColuna().getConfiguracao() + "mm x "
                    + coluna.getDiametroColuna().getConfiguracao() + "mm x "
                    + coluna.getParticulaColuna().getConfiguracao() + "µm ";
            txtColuna.setText(nameColuna);
            categoryMapColuna.clear();
            categoryMapColuna.put(coluna.getId(), nameColuna);
            Metodologia mtd = new MetodologiaDAO().findById(Metodologia.class, colunaUtil.getMetodologia().getId());
            String nameMtd = mtd.getCodMetodo() + " - " + mtd.getMetodo();
            txtMetodologia.setText(nameMtd);
            categoryMapMetodo.clear();
            categoryMapMetodo.put(mtd.getId(), nameMtd);
            ckbEstoque.setSelected(colunaUtil.getEstoque());
            if (colunaUtil.getEstoque()) {
                ckbEstoque.setSelected(true);
                txtVaga.setText("");
            }
            try {
                colunaVaga = new ColunaVagaDAO().findById(ColunaVaga.class, colunaUtil.getVaga().getId());
                String nameVaga = colunaVaga.getColunaStorage().getSetor().getSiglaSetor()
                        + " - " + colunaVaga.getColunaStorage().getTipo()
                        + ": " + colunaVaga.getColunaStorage().getNumero()
                        + " -  Vaga: " + colunaVaga.getVaga();
                txtVaga.setText(nameVaga);
                categoryMapVaga.clear();
                categoryMapVaga.put(colunaVaga.getId(), nameVaga);
            } catch (Exception e) {
            }
            try {
                Arquivos arquivo = new ArquivosDAO().findById(Arquivos.class, colunaUtil.getCertificado().getId());
                if (arquivo != null) {
                    txtArquivo.setText(arquivo.getNome());
                }
            } catch (Exception e) {
            }
            String[] analise = {colunaUtil.getAnalise().getAnalise()};
            cmbAnalise.setSelectedItem(analise[0]);
            String[] setor = {colunaUtil.getSetor().getSiglaSetor()};
            cmbSetor.setSelectedItem(setor[0]);
            txtDataAtivacao.setDate(colunaUtil.getDataAtivacao());
            txtDataVerificacao.setDate(colunaUtil.getDataVerificacao());
            txtObsColuna.setText(colunaUtil.getObs());
            txtSerialNumber.setText(colunaUtil.getSerialNumber());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e);
        }
    }

}
