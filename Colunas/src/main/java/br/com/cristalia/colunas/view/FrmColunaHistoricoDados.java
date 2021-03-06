package br.com.cristalia.colunas.view;

import br.com.cristalia.biblioteca.dao.CampanhaDAO;
import br.com.cristalia.biblioteca.model.Campanha;
import br.com.cristalia.biblioteca.util.Frames;
import br.com.cristalia.biblioteca.util.Pdf;
import br.com.cristalia.biblioteca.util.Senha;
import br.com.cristalia.biblioteca.dao.ColunaLogDAO;
import br.com.cristalia.biblioteca.dao.UsuarioDAO;
import br.com.cristalia.biblioteca.model.ColunaLog;
import br.com.cristalia.biblioteca.model.ColunaUtil;
import br.com.cristalia.biblioteca.model.Usuario;
import java.awt.Cursor;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael.lopes
 */
public class FrmColunaHistoricoDados extends javax.swing.JDialog {

    private Campanha campanha;
    private ColunaUtil colunaUtil;
    private ColunaLog colunaLog;
    private boolean novo = false;
    private File anexo = null;

    /**
     * Creates new form FrmConfigAcesso
     *
     * @param parent
     * @param modal
     * @param colUtil
     * @param novoRegistro
     */
    public FrmColunaHistoricoDados(java.awt.Frame parent, boolean modal, ColunaUtil colUtil, Boolean novoRegistro) {
        super(parent, modal);
        initComponents();
        init();
        colunaUtil = colUtil;
        novo = novoRegistro;
    }

    public FrmColunaHistoricoDados(java.awt.Frame parent, boolean modal, ColunaLog colLog) {
        super(parent, modal);
        initComponents();
        init();
        colunaLog = colLog;
        carregarDados();
    }

    private void init() {
        Frames.setUpFrame(this, "Histórico", true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvarUsuario = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtObs = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtArquivo = new javax.swing.JTextField();
        btnAnexar = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        txtDataInicio = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        txtMetodologia = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ckbSentido = new javax.swing.JCheckBox();
        ckbPreColuna = new javax.swing.JCheckBox();
        ckbPreFiltro = new javax.swing.JCheckBox();
        txtAnalise = new javax.swing.JTextField();
        txtCampanha = new javax.swing.JTextField();
        btnProcurarCampanha = new javax.swing.JButton();
        txtSetor = new javax.swing.JTextField();
        txtEquipamento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSalvarUsuario.setText("Ok");
        btnSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUsuarioActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Histórico"));

        jLabel10.setText("Obs:");

        jLabel5.setText("Campanha:");

        jLabel28.setText("Setor:");

        jLabel29.setText("Equipamento:");

        jLabel38.setText("Anexo:");

        txtArquivo.setEditable(false);

        btnAnexar.setText("Anexar");
        btnAnexar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexarActionPerformed(evt);
            }
        });

        jLabel41.setText("Data Início:");

        jLabel24.setText("Método:");

        txtMetodologia.setEditable(false);
        txtMetodologia.setBackground(new java.awt.Color(204, 204, 204));

        jLabel31.setText("Análise:");

        ckbSentido.setText("Invetido");

        ckbPreColuna.setText("Pré-Coluna");

        ckbPreFiltro.setText("Pré-Filtro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbSentido)
                    .addComponent(ckbPreFiltro)
                    .addComponent(ckbPreColuna))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ckbSentido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbPreColuna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbPreFiltro))
        );

        txtAnalise.setEditable(false);
        txtAnalise.setBackground(new java.awt.Color(204, 204, 204));

        txtCampanha.setEditable(false);
        txtCampanha.setBackground(new java.awt.Color(204, 204, 204));

        btnProcurarCampanha.setText("Buscar");
        btnProcurarCampanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarCampanhaActionPerformed(evt);
            }
        });

        txtSetor.setEditable(false);
        txtSetor.setBackground(new java.awt.Color(204, 204, 204));

        txtEquipamento.setEditable(false);
        txtEquipamento.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCampanha)
                            .addComponent(txtMetodologia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcurarCampanha))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtArquivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnexar))
                            .addComponent(txtObs, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(txtAnalise)
                                .addGap(71, 71, 71))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                    .addComponent(txtSetor)
                                    .addComponent(txtEquipamento, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(67, 67, 67)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCampanha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurarCampanha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAnalise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAnexar))
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarUsuario)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUsuarioActionPerformed
        salvar();
    }//GEN-LAST:event_btnSalvarUsuarioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        fechar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAnexarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexarActionPerformed
        try {
            anexo = Pdf.carregar();
            if (anexo != null) {
                txtArquivo.setText(anexo.getName());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao anexar dados: " + ex);
        }
    }//GEN-LAST:event_btnAnexarActionPerformed

    private void btnProcurarCampanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarCampanhaActionPerformed
        abrirCampanha();
    }//GEN-LAST:event_btnProcurarCampanhaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmColunaHistoricoDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmColunaHistoricoDados dialog = new FrmColunaHistoricoDados(new javax.swing.JFrame(), true, null, null);
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
    private javax.swing.JButton btnProcurarCampanha;
    public static javax.swing.JButton btnSalvarUsuario;
    private javax.swing.JCheckBox ckbPreColuna;
    private javax.swing.JCheckBox ckbPreFiltro;
    private javax.swing.JCheckBox ckbSentido;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    public static javax.swing.JTextField txtAnalise;
    private javax.swing.JTextField txtArquivo;
    public static javax.swing.JTextField txtCampanha;
    public static com.toedter.calendar.JDateChooser txtDataInicio;
    public static javax.swing.JTextField txtEquipamento;
    public static javax.swing.JTextField txtMetodologia;
    private javax.swing.JTextField txtObs;
    public static javax.swing.JTextField txtSetor;
    // End of variables declaration//GEN-END:variables

    private void carregarDados() {
        ColunaLogDAO colLogDAO = new ColunaLogDAO();
        try {
            campanha = new CampanhaDAO().findCampanhaById(colunaLog.getCampanha().getId());
            colunaLog = colLogDAO.findById(ColunaLog.class, colunaLog.getId());
            txtCampanha.setText(campanha.getCampanha());
            txtMetodologia.setText(campanha.getMetodologia().stream().findFirst().get().getCodMetodo());
            txtAnalise.setText(campanha.getAnalise().stream().findFirst().get().getAnalise());
            txtSetor.setText(campanha.getSetor().getSiglaSetor());
            txtEquipamento.setText(campanha.getEquipamento().getTag());
            if(colunaLog.getAnexo() != null){
                txtArquivo.setText(colunaLog.getAnexo().getNome());
            }
            ckbSentido.setSelected(colunaLog.getSentido());
            ckbPreColuna.setSelected(colunaLog.getPrecoluna());
            ckbPreFiltro.setSelected(colunaLog.getPrefiltro());
            txtDataInicio.setDate(colunaLog.getDataInicio());
            txtObs.setText(colunaLog.getObs().toUpperCase().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e);
        }
    }

    private void salvar() {
        Senha senha = new Senha();
        try {
            if (txtCampanha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campanha inválida");
                txtCampanha.requestFocus();
            } else if (txtDataInicio.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Data Inicial Inválida");
                txtDataInicio.requestFocus();
            } else if (novo) {
                if (senha.Salvar()) {
                    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    criar();
                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                    dispose();
                }
            } else {
                if (senha.Salvar()) {
                    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    atulizar();
                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                    dispose();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados: " + e);
        }
    }

    private void criar() {
        try {
            ColunaLog colLog = new ColunaLog();
            ColunaLogDAO colLogDAO = new ColunaLogDAO();
            colLog.setCampanha(campanha);
            if (anexo != null) {
                colLog.setAnexo(Pdf.salvar(anexo, "Anexo de Coluna"));
            }
            colLog.setColunaUtil(colunaUtil);
            colLog.setSentido(ckbSentido.isSelected());
            colLog.setPrecoluna(ckbPreColuna.isSelected());
            colLog.setPrefiltro(ckbPreFiltro.isSelected());
            colLog.setDataInicio(txtDataInicio.getDate());
            colLog.setUsuarioInicio(new UsuarioDAO().findById(Usuario.class,
                    Long.valueOf(System.getProperty("user_id"))));
            colLog.setObs(txtObs.getText().toUpperCase().trim());
            colLog.setVersion(0);
            colLogDAO.salvar(colLog);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criar dados: " + ex);
        }
    }

    private void atulizar() {
        try {
            ColunaLogDAO colLogDAO = new ColunaLogDAO();
            if (campanha != null) {
                colunaLog.setCampanha(campanha);
            }
            if (anexo != null) {
                colunaLog.setAnexo(Pdf.salvar(anexo, "Anexo de Coluna"));
            }
            colunaLog.setSentido(ckbSentido.isSelected());
            colunaLog.setPrecoluna(ckbPreColuna.isSelected());
            colunaLog.setPrefiltro(ckbPreFiltro.isSelected());
            colunaLog.setDataInicio(txtDataInicio.getDate());
            colunaLog.setObs(txtObs.getText().toUpperCase().trim());
            colunaLog.setVersion(colunaLog.getVersion() + 1);
            colLogDAO.salvar(colunaLog);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criar dados: " + ex);
        }
    }

    private void abrirCampanha() {
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            Campanha camp = new Campanha();
            FrmProcurarCampanha frmcamp = new FrmProcurarCampanha(null, true, camp);
            frmcamp.setVisible(true);
            if (camp.getId() != null) {
                campanha = new CampanhaDAO().findCampanhaById(camp.getId());
                txtCampanha.setText(campanha.getCampanha());
                txtMetodologia.setText(campanha.getMetodologia().stream().findFirst().get().getCodMetodo());
                txtAnalise.setText(campanha.getAnalise().stream().findFirst().get().getAnalise());
                txtSetor.setText(campanha.getSetor().getSiglaSetor());
                txtEquipamento.setText(campanha.getEquipamento().getTag());
            }
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + ex);
        }
    }

    private void fechar() {
        Frames.fecharFrame(this);
    }
}
