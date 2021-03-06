/*
 * Tcreate table controle_estoque(
 cod_estoque integer not null,
 cod_produto int not null,
 quant_max int not null,
 cod_tipo int not null,
 primary key(cod_estoque),
 foreign key(cod_produto) references Produtos(cod_produto),
 foreign key(cod_tipo) references tipo_produto(id)
 )
 */
package layout;

import classes.Produto;
import classes.Usuario;
import validacao.ValidaProduto;

/*
 import model.Produtos;
 import DAO.produtoDAO;
 import DAO.conectaBanco;
 import javax.swing.JOptionPane;
 import validacao.validaProduto;
 */
/**
 *
 * @author bp555787
 */
public class RegistrarProduto extends javax.swing.JFrame {

    /**
     * Creates new form registrar
     */
    public RegistrarProduto() {
        initComponents();
    }
   
    private Usuario user;
    public void setUsuario(Usuario a) {
        user = a;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMaterial = new javax.swing.JLabel();
        combTipoMaterial = new javax.swing.JComboBox();
        lblQuantidade = new javax.swing.JLabel();
        txtMedida = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtLab = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        lblLab = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblMedida = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        combTarja = new javax.swing.JComboBox();
        lblTarja = new javax.swing.JLabel();
        combStatusMaterial = new javax.swing.JComboBox();
        lblEspecie = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        combEspecie = new javax.swing.JComboBox();
        lblCodigo = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        combStatusRmedio = new javax.swing.JComboBox();
        txtQuantMax = new javax.swing.JTextField();
        lblQuantidade1 = new javax.swing.JLabel();
        txtQuantMin = new javax.swing.JTextField();
        lblQuantidade2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        lblMaterial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMaterial.setText("Tipo:");
        jPanel1.add(lblMaterial);
        lblMaterial.setBounds(20, 50, 50, 30);

        combTipoMaterial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nenhum", "Material clinico", "Material de limpeza", "Medicação" }));
        combTipoMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combTipoMaterialActionPerformed(evt);
            }
        });
        jPanel1.add(combTipoMaterial);
        combTipoMaterial.setBounds(70, 50, 140, 30);

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblQuantidade.setText("Quantidade:");
        jPanel1.add(lblQuantidade);
        lblQuantidade.setBounds(20, 110, 100, 15);
        jPanel1.add(txtMedida);
        txtMedida.setBounds(520, 150, 110, 30);

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblValor.setText("Valor:");
        jPanel1.add(lblValor);
        lblValor.setBounds(460, 100, 60, 30);
        jPanel1.add(txtLab);
        txtLab.setBounds(300, 200, 310, 30);

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome.setText("Nome:");
        jPanel1.add(lblNome);
        lblNome.setBounds(230, 50, 60, 30);

        txtProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProdutoKeyPressed(evt);
            }
        });
        jPanel1.add(txtProduto);
        txtProduto.setBounds(300, 50, 330, 30);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(10, 330, 90, 30);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(360, 330, 90, 30);

        btnRegistro.setText("Novo registro");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro);
        btnRegistro.setBounds(460, 330, 100, 30);

        lblLab.setText("laboratorio:");
        jPanel1.add(lblLab);
        lblLab.setBounds(230, 210, 80, 14);

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigo);
        txtCodigo.setBounds(300, 100, 110, 30);

        lblMedida.setText("Medida:");
        jPanel1.add(lblMedida);
        lblMedida.setBounds(460, 160, 70, 14);

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });
        jPanel1.add(txtValor);
        txtValor.setBounds(520, 100, 110, 30);

        combTarja.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nenhum", "Preta", "Amarela", "Vermelha" }));
        jPanel1.add(combTarja);
        combTarja.setBounds(100, 250, 110, 30);

        lblTarja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTarja.setText("Tarja:");
        jPanel1.add(lblTarja);
        lblTarja.setBounds(20, 250, 50, 30);

        combStatusMaterial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nenhum", "Esterializado", "não Esterializado" }));
        jPanel1.add(combStatusMaterial);
        combStatusMaterial.setBounds(300, 150, 130, 30);

        lblEspecie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEspecie.setText("Espécie :");
        jPanel1.add(lblEspecie);
        lblEspecie.setBounds(230, 250, 60, 30);

        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStatus.setText("Status:");
        jPanel1.add(lblStatus);
        lblStatus.setBounds(230, 150, 60, 30);

        combEspecie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nenhum", "Felino", "Canino" }));
        jPanel1.add(combEspecie);
        combEspecie.setBounds(300, 250, 130, 30);

        lblCodigo.setText("Codigo:");
        jPanel1.add(lblCodigo);
        lblCodigo.setBounds(230, 110, 50, 14);

        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyTyped(evt);
            }
        });
        jPanel1.add(txtQuantidade);
        txtQuantidade.setBounds(100, 100, 110, 30);

        combStatusRmedio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nenhum", "sólido", "gasoso", "líquido" }));
        jPanel1.add(combStatusRmedio);
        combStatusRmedio.setBounds(300, 150, 130, 30);

        txtQuantMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantMaxKeyTyped(evt);
            }
        });
        jPanel1.add(txtQuantMax);
        txtQuantMax.setBounds(100, 150, 110, 30);

        lblQuantidade1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblQuantidade1.setText("Qtd Max:");
        jPanel1.add(lblQuantidade1);
        lblQuantidade1.setBounds(20, 160, 60, 15);

        txtQuantMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantMinKeyTyped(evt);
            }
        });
        jPanel1.add(txtQuantMin);
        txtQuantMin.setBounds(100, 200, 110, 30);

        lblQuantidade2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblQuantidade2.setText("Qtd Min:");
        jPanel1.add(lblQuantidade2);
        lblQuantidade2.setBounds(20, 210, 50, 15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(670, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Produto produtoForm = new Produto();
        ValidaProduto v = new ValidaProduto();
        
        
        produtoForm.setCodigo(Integer.parseInt(0+txtCodigo.getText()));
        produtoForm.setQuantidade(Integer.parseInt(0+txtQuantidade.getText()));
        produtoForm.setValor(Double.parseDouble(0+txtValor.getText()));
        produtoForm.setNome(txtProduto.getText());
        produtoForm.setTipoProduto(combTipoMaterial.getSelectedIndex());
        produtoForm.setQuantMax(Integer.parseInt(0+txtQuantMax.getText()));
        produtoForm.setQuantMin(Integer.parseInt(0+txtQuantMin.getText()));
        
        //propriedades medicamentos
        produtoForm.setMedida((txtMedida.getText()));
        produtoForm.setLaboratorio(txtLab.getText());
        produtoForm.setTarja(combTarja.getSelectedItem()+"");
        produtoForm.setTipoAnimal(combEspecie.getSelectedItem()+"");
        
        if (produtoForm.getTipoProduto()==1) {
            //Material de Clinico
            produtoForm.setEstado(combStatusMaterial.getSelectedItem()+"");
        }else{
            // Medicação
            produtoForm.setEstado(combStatusRmedio.getSelectedItem()+"");
        }
        
        System.out.println(produtoForm.getEstado());
        System.out.println(produtoForm.getCodigo());
        System.out.println(produtoForm.getTipoProduto());
        System.out.println(v.validarMedicamento(produtoForm));
        if (v.validarCamposPrincipal(produtoForm)) {
            switch(produtoForm.getTipoProduto()){
                case 1:
                    //Material de Clinico
                    if (v.validarMaterialMedico(produtoForm)) {
                        produtoForm.entradaProduto(produtoForm);
                        
                    }else{
                        v.mensagemMaterial(produtoForm);
                    }
                    break;
                case 2:
                    //Material Limpeza
                        produtoForm.entradaProduto(produtoForm);
                    break;    
                case 3:
                    // Medicação
                    if (v.validarMedicamento(produtoForm)) {
                        produtoForm.entradaProduto(produtoForm);
                    }else{
                        v.mensagemMedicamento(produtoForm);
                    }
                    break;   
            }
        }else{
            v.mensagemPricipal(produtoForm);
        }
       
          
     

    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    public void soNumero(java.awt.event.KeyEvent evt) {
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }
    
    public void soValores(java.awt.event.KeyEvent evt) {
        String caracteres = "0987654321.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }
    private void combTipoMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combTipoMaterialActionPerformed
        if (combTipoMaterial.getSelectedIndex() == 3) {
            // Medicação
            lblStatus.setText("Estado:");
            combStatusRmedio.setVisible(true);
            combStatusMaterial.setVisible(false);
            //
            combEspecie.setVisible(true);
            combTarja.setVisible(true);
            combTipoMaterial.setVisible(true);
            lblEspecie.setVisible(true);
            lblLab.setVisible(true);
            lblMaterial.setVisible(true);
            lblMedida.setVisible(true);
            lblNome.setVisible(true);
            lblQuantidade.setVisible(true);
            lblTarja.setVisible(true);
            lblValor.setVisible(true);
            lblStatus.setVisible(true);
            txtLab.setVisible(true);
            txtProduto.setVisible(true);
            txtMedida.setVisible(true);
            txtCodigo.setVisible(true);
            txtValor.setVisible(true);
        } else if (combTipoMaterial.getSelectedIndex() == 2) {
            //Material Limpeza
            combStatusRmedio.setVisible(false);
            combStatusMaterial.setVisible(false);
            //
            combEspecie.setVisible(false);
            combTarja.setVisible(false);
            combTipoMaterial.setVisible(true);
            lblEspecie.setVisible(false);
            lblLab.setVisible(false);
            lblMaterial.setVisible(true);
            lblMedida.setVisible(false);
            lblNome.setVisible(true);
            lblQuantidade.setVisible(true);
            lblTarja.setVisible(false);
            lblValor.setVisible(true);
            lblStatus.setVisible(false);
            txtLab.setVisible(false);
            txtProduto.setVisible(true);
            txtMedida.setVisible(false);
            txtCodigo.setVisible(true);
            txtValor.setVisible(true);
            
        } else if (combTipoMaterial.getSelectedIndex() == 1) {
            //Material de Clinico
            lblStatus.setText("Status:");
            combStatusRmedio.setVisible(false);
            combStatusMaterial.setVisible(true);
            //
            combStatusMaterial.setVisible(true);
            combEspecie.setVisible(false);
            combTarja.setVisible(false);
            combTipoMaterial.setVisible(true);
            lblStatus.setVisible(true);
            lblEspecie.setVisible(false);
            lblLab.setVisible(false);
            lblMaterial.setVisible(true);
            lblMedida.setVisible(false);
            lblNome.setVisible(true);
            lblQuantidade.setVisible(true);
            lblTarja.setVisible(false);
            lblValor.setVisible(true);
            txtLab.setVisible(false);
            txtProduto.setVisible(true);
            txtMedida.setVisible(false);
            txtCodigo.setVisible(true);
            txtValor.setVisible(true);
        }
    }//GEN-LAST:event_combTipoMaterialActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Menu m = new Menu();
        m.setUsuario(user);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        txtCodigo.setText(null);
        txtLab.setText(null);
        txtMedida.setText(null);
        txtProduto.setText(null);
        txtValor.setText(null);
        txtQuantidade.setText(null);

    }//GEN-LAST:event_btnRegistroActionPerformed

    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyTyped
        soNumero(evt);
    }//GEN-LAST:event_txtQuantidadeKeyTyped

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        soValores(evt);
    }//GEN-LAST:event_txtValorKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        soNumero(evt);
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoKeyPressed
        if (txtProduto.getText().length() > 50) {
            evt.consume();
        }
    }//GEN-LAST:event_txtProdutoKeyPressed

    private void txtQuantMaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantMaxKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantMaxKeyTyped

    private void txtQuantMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantMinKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantMinKeyTyped

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
            java.util.logging.Logger.getLogger(RegistrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox combEspecie;
    private javax.swing.JComboBox combStatusMaterial;
    private javax.swing.JComboBox combStatusRmedio;
    private javax.swing.JComboBox combTarja;
    private javax.swing.JComboBox combTipoMaterial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblLab;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JLabel lblMedida;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblQuantidade1;
    private javax.swing.JLabel lblQuantidade2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTarja;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtLab;
    private javax.swing.JTextField txtMedida;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantMax;
    private javax.swing.JTextField txtQuantMin;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
