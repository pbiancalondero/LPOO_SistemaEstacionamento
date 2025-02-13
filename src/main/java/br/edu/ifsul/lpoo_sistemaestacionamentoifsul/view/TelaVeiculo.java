/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifsul.lpoo_sistemaestacionamentoifsul.view;

import com.mycompany.lpoo_sistemaestacionamentoifsul.dao.PersistenciaJPA;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.stream.Collectors;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.VeiOficial;
import model.Veiculo;

/**
 *
 * @author paula
 */
public class TelaVeiculo extends javax.swing.JFrame {
    PersistenciaJPA jpa = new PersistenciaJPA();

    /**
     * Creates new form TelaVeiculo
     */
    public TelaVeiculo() {
        initComponents();
        loadVeiculosCadastrados();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup3 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeiculos = new javax.swing.JTable();
        lblPlaca = new javax.swing.JLabel();
        txtBuscaPlaca = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        ckbVeiOficial = new javax.swing.JCheckBox();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setText("Veículos cadastrados");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        tblVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Placa", "Proprietário", "Oficial"
            }
        ));
        tblVeiculos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblVeiculosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblVeiculos);

        lblPlaca.setText("Placa:");

        txtBuscaPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaPlacaActionPerformed(evt);
            }
        });
        txtBuscaPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaPlacaKeyReleased(evt);
            }
        });

        ckbVeiOficial.setText("Veículo Oficial");
        ckbVeiOficial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbVeiOficialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ckbVeiOficial)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ckbVeiOficial)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitulo))
                .addGap(90, 90, 90)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnNovo)
                        .addGap(72, 72, 72)
                        .addComponent(btnEditar)
                        .addGap(76, 76, 76)
                        .addComponent(btnRemover)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlaca)
                            .addComponent(txtBuscaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnRemover))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        TelaCadastroVeiculo tela = new TelaCadastroVeiculo(this, rootPaneCheckingEnabled);
        tela.setVisible(true);

        loadVeiculosCadastrados();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        Veiculo veiculoSel = getVeiculoSelecionado();
        if (veiculoSel != null) {
            int delOp = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja remover veículo " + veiculoSel + "?");
            if (delOp == JOptionPane.YES_OPTION) {
                jpa.conexaoAberta();
                try {

                    // Passo 1: Desvincular relacionamentos e salvar as alterações
                    if (veiculoSel.getProprietario() != null || veiculoSel.getModelo() != null) {
                        veiculoSel.setProprietario(null);
                        veiculoSel.setModelo(null);
                        
                        /*
                        Após setar os relacionamentos para null, o estado do objeto pode ter sido alterado, 
                        e ele não está mais sendo tratado como parte do contexto de persistência (EntityManager). 
                        Isso ocorre porque as modificações não foram sincronizadas com o banco antes da tentativa de remoção.
                        
                        Ao modificar os relacionamentos (setar para null), essas alterações precisam ser sincronizadas com o banco antes de tentar a remoção
                        */
                        jpa.persist(veiculoSel);
                        jpa.fecharConexao();
                        
                        jpa.conexaoAberta();
                    }

                    // Passo 2: Remover o objeto
                    jpa.remover(veiculoSel);
                    JOptionPane.showMessageDialog(rootPane, "Veículo removido com sucesso!");

                    loadVeiculosCadastrados(); // Atualiza a tabela
                } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("Erro ao remover veículo " + veiculoSel + "\nErro: " + e.getMessage());
                } finally {
                    jpa.fecharConexao();
                }

            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void tblVeiculosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblVeiculosKeyReleased
        
    }//GEN-LAST:event_tblVeiculosKeyReleased

    private void ckbVeiOficialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbVeiOficialActionPerformed
        boolean filtrarOficiais = ckbVeiOficial.isSelected();

        jpa.conexaoAberta();
        // Busca os veículos com base no filtro
        loadVeiculosCadastrados(jpa.getVeiculos(filtrarOficiais));
        jpa.fecharConexao();
    }//GEN-LAST:event_ckbVeiOficialActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
 Veiculo veiculoSel = getVeiculoSelecionado();
        if (veiculoSel != null) {
            TelaCadastroVeiculo tela = new TelaCadastroVeiculo(this, rootPaneCheckingEnabled);
            tela.setVeiculo(veiculoSel);
            tela.setVisible(true);
            loadVeiculosCadastrados(); // Atualiza a tabela após edição

        
    }          }//GEN-LAST:event_btnEditarActionPerformed

    private void txtBuscaPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaPlacaActionPerformed

    private void txtBuscaPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaPlacaKeyReleased
        if (txtBuscaPlaca.getText().trim().isEmpty()) {
            loadVeiculosCadastrados();
        } else {
            jpa.conexaoAberta();
            loadVeiculosCadastrados(jpa.getVeiculos(txtBuscaPlaca.getText().trim()));

            jpa.fecharConexao();
        }
    }//GEN-LAST:event_txtBuscaPlacaKeyReleased

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
            java.util.logging.Logger.getLogger(TelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPessoa().setVisible(true);
            }
        });
    }
    
    public void loadVeiculosCadastrados() {
        // Abre a conexão
        jpa.conexaoAberta();
        try {

            // Busca os veículos cadastrados
            List<Veiculo> listaVeiculos = jpa.getVeiculos(); // Método criado no DAO

            // Obtém o modelo da tabela
            DefaultTableModel modeloTabela = (DefaultTableModel) tblVeiculos.getModel();

            // Limpa a tabela 
            modeloTabela.setRowCount(0);

            // Adiciona os veículos ao modelo da tabela
            for (Veiculo veiculo : listaVeiculos) {
                Object[] linha = {
                    veiculo,
                    veiculo.getProprietario() != null ? veiculo.getProprietario().getNome() : "",
                    veiculo instanceof VeiOficial ? "Sim" : "Não"
                };
                modeloTabela.addRow(linha);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar os veículos: " + e.getMessage());
        } finally {
            // Fecha a conexão
            jpa.fecharConexao();
        }

    }

    public void loadVeiculosCadastrados(List<Veiculo> listaVeiculos) {

        try {

            // Obtém o modelo da tabela
            DefaultTableModel modeloTabela = (DefaultTableModel) tblVeiculos.getModel();

            // Limpa a tabela 
            modeloTabela.setRowCount(0);

            // Adiciona os veículos ao modelo da tabela
            for (Veiculo veiculo : listaVeiculos) {
                Object[] linha = {
                    veiculo,
                    veiculo.getProprietario() != null ? veiculo.getProprietario().getNome() : "",
                    veiculo instanceof VeiOficial ? "Sim" : "Não"
                };
                modeloTabela.addRow(linha);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar os veículos: " + e.getMessage());
        }

    }

    public Veiculo getVeiculoSelecionado() {
        int linhaSelecionada = tblVeiculos.getSelectedRow(); // Obtém a linha selecionada
        if (linhaSelecionada >= 0) { // Quando não tem nenhum objeto selecionado retorna -1
            DefaultTableModel modeloTabela = (DefaultTableModel) tblVeiculos.getModel();
            Veiculo veiculoSelecionado = (Veiculo) modeloTabela.getValueAt(linhaSelecionada, 0); // A coluna 0 contém o objeto Veiculo
            return veiculoSelecionado;
        } else {
            JOptionPane.showMessageDialog(this, "Nenhuma linha selecionada.");
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox ckbVeiOficial;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblVeiculos;
    private javax.swing.JTextField txtBuscaPlaca;
    // End of variables declaration//GEN-END:variables
}
