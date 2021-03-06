/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import ConexaoBancoDados.Conexao;
import ConexaoBancoDados.ModeloTabela;
import Controles.ControllerCliente;
import Modelos.ModelCliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MARCELO DUARTE
 */
public class CadastroCliente1 extends javax.swing.JFrame {

    Conexao conecta = new Conexao();
    
    
    
    ModelCliente modelCliente = new ModelCliente();
    ControllerCliente controllerCliente = new ControllerCliente();
    ArrayList<ModelCliente> listaModelCliente = new ArrayList<>();
    String tipoCadastro;

    // ModeloTabela modeloTabela = new ModeloTabela(dados,Colunas);
   
    /**
     * Creates new form FormCadastroCliente
     */
    public CadastroCliente1() {
        initComponents();
        
        setLocationRelativeTo(null);
        this.carregarClientes();
        //conecta.conexaoBanco();
        //prencherTabela("select id_cliente,nome,CPF,RG,numBeneficio,Telefone from cliente order by id_cliente;");

    }

         private void carregarClientes() {
        listaModelCliente = controllerCliente.getListaClienteController();
        DefaultTableModel modelo = (DefaultTableModel) Tabela_Cliente.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listaModelCliente.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCliente.get(i).getCodigo(),
                listaModelCliente.get(i).getNome(),
                listaModelCliente.get(i).getCpf(),
                listaModelCliente.get(i).getRg(),
                listaModelCliente.get(i).getTelefone(),
                listaModelCliente.get(i).getNumBeneficio()
                    
            });
        }
    }
         
         
         
         
         
         
             private boolean salvarCliente() {
        modelCliente.setNome(this.tfNome.getText());
        modelCliente.setEndereco(this.tfCPF.getText());
        modelCliente.setBairro(this.tfRG.getText());
        modelCliente.setCidade(this.tfTelefone.getText());
        modelCliente.setUf(this.tfNumBeneficio.getText());
        

        //salvar 
        if (controllerCliente.salvarClienteController(modelCliente)>0) {
            JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
           // this.desabilitarCampos();
            this.carregarClientes();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel_priCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Painel_Cliente = new javax.swing.JPanel();
        Cliente_nome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        Cliente_Cpf = new javax.swing.JLabel();
        Cliente_Rg = new javax.swing.JLabel();
        tfCPF = new javax.swing.JTextField();
        tfRG = new javax.swing.JTextField();
        Cliente_Telefone = new javax.swing.JLabel();
        Cliente_Email = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        idCliente = new javax.swing.JLabel();
        Campo_idCliente = new javax.swing.JTextField();
        Mae_Cliente = new javax.swing.JLabel();
        Pai_Cliente = new javax.swing.JLabel();
        Campo_maeCliente = new javax.swing.JTextField();
        Campo_paiCliente = new javax.swing.JTextField();
        Cliente_Matricula = new javax.swing.JLabel();
        tfNumBeneficio = new javax.swing.JTextField();
        Painel_cliEndereco = new javax.swing.JPanel();
        Cliente_Endereco = new javax.swing.JLabel();
        Cliente_Cidade = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        Cliente_numero = new javax.swing.JLabel();
        campoNumeroCasa = new javax.swing.JTextField();
        Cliente_Complemento = new javax.swing.JLabel();
        Cliente_Estado = new javax.swing.JLabel();
        campoEstado = new javax.swing.JTextField();
        Cliente_Cep = new javax.swing.JLabel();
        campoCEP = new javax.swing.JTextField();
        campoComplemento = new javax.swing.JTextField();
        campoBairro = new javax.swing.JTextField();
        Painel_cliBotao = new javax.swing.JPanel();
        Concluir_Cadastro = new javax.swing.JButton();
        Cliente_Novo = new javax.swing.JButton();
        Cliente_Altera = new javax.swing.JButton();
        Cliente_Exclui = new javax.swing.JButton();
        Cliente_Sai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Cliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Painel_priCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("                                CADASTRAMENTO DE CLIENTES");

        Painel_Cliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Cliente_nome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cliente_nome.setText("Nome");

        tfNome.setEditable(false);

        Cliente_Cpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cliente_Cpf.setText("CPF");

        Cliente_Rg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cliente_Rg.setText("RG");

        tfCPF.setEditable(false);
        tfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCPFActionPerformed(evt);
            }
        });

        tfRG.setEditable(false);

        Cliente_Telefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cliente_Telefone.setText("Telefone");

        Cliente_Email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cliente_Email.setText("E-Mail");

        jTextField2.setEditable(false);

        tfTelefone.setEditable(false);

        idCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idCliente.setText("ID Cliente");

        Campo_idCliente.setEditable(false);

        Mae_Cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mae_Cliente.setText("Mãe");

        Pai_Cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pai_Cliente.setText("Pai");

        Campo_maeCliente.setEditable(false);
        Campo_maeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_maeClienteActionPerformed(evt);
            }
        });

        Campo_paiCliente.setEditable(false);

        Cliente_Matricula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cliente_Matricula.setText("Nº de Beneficio");

        tfNumBeneficio.setEditable(false);

        javax.swing.GroupLayout Painel_ClienteLayout = new javax.swing.GroupLayout(Painel_Cliente);
        Painel_Cliente.setLayout(Painel_ClienteLayout);
        Painel_ClienteLayout.setHorizontalGroup(
            Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Painel_ClienteLayout.createSequentialGroup()
                        .addComponent(Cliente_Telefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cliente_Email)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel_ClienteLayout.createSequentialGroup()
                        .addGroup(Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mae_Cliente)
                            .addComponent(Cliente_nome)
                            .addComponent(Pai_Cliente)
                            .addComponent(Cliente_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Painel_ClienteLayout.createSequentialGroup()
                                .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Cliente_Rg)
                                .addGap(18, 18, 18)
                                .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Cliente_Matricula))
                            .addComponent(Campo_maeCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Campo_paiCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfNome))))
                .addGap(18, 18, 18)
                .addGroup(Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_ClienteLayout.createSequentialGroup()
                        .addComponent(idCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Campo_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfNumBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        Painel_ClienteLayout.setVerticalGroup(
            Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cliente_nome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idCliente)
                    .addComponent(Campo_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cliente_Cpf)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cliente_Rg)
                    .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cliente_Matricula)
                    .addComponent(tfNumBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campo_maeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mae_Cliente))
                .addGap(18, 18, 18)
                .addGroup(Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campo_paiCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pai_Cliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cliente_Telefone)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cliente_Email)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Painel_cliEndereco.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Cliente_Endereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cliente_Endereco.setText("Endereço");

        Cliente_Cidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cliente_Cidade.setText("Cidade");

        campoEndereco.setEditable(false);

        campoCidade.setEditable(false);
        campoCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCidadeActionPerformed(evt);
            }
        });

        Cliente_numero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cliente_numero.setText("Nº");

        campoNumeroCasa.setEditable(false);

        Cliente_Complemento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cliente_Complemento.setText("Complemento");

        Cliente_Estado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cliente_Estado.setText("Estado");

        campoEstado.setEditable(false);

        Cliente_Cep.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cliente_Cep.setText("CEP");

        campoCEP.setEditable(false);

        campoComplemento.setEditable(false);

        javax.swing.GroupLayout Painel_cliEnderecoLayout = new javax.swing.GroupLayout(Painel_cliEndereco);
        Painel_cliEndereco.setLayout(Painel_cliEnderecoLayout);
        Painel_cliEnderecoLayout.setHorizontalGroup(
            Painel_cliEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_cliEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_cliEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cliente_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cliente_Cidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_cliEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Painel_cliEnderecoLayout.createSequentialGroup()
                        .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Cliente_numero)
                        .addGap(18, 18, 18)
                        .addComponent(campoNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(Cliente_Complemento)
                        .addGap(18, 18, 18)
                        .addComponent(campoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(Painel_cliEnderecoLayout.createSequentialGroup()
                        .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cliente_Estado)
                        .addGap(18, 18, 18)
                        .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Cliente_Cep)
                        .addGap(32, 32, 32)
                        .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        Painel_cliEnderecoLayout.setVerticalGroup(
            Painel_cliEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_cliEnderecoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Painel_cliEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cliente_Endereco)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cliente_numero)
                    .addComponent(Cliente_Complemento)
                    .addComponent(campoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel_cliEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cliente_Cidade)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cliente_Estado)
                    .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cliente_Cep)
                    .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Painel_cliBotao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Concluir_Cadastro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Concluir_Cadastro.setText("CONCLUIR CADASTRO");
        Concluir_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Concluir_CadastroActionPerformed(evt);
            }
        });

        Cliente_Novo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Cliente_Novo.setText("NOVO CADASTRO");
        Cliente_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cliente_NovoActionPerformed(evt);
            }
        });

        Cliente_Altera.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Cliente_Altera.setText("ALTERAR CADASTRO");
        Cliente_Altera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cliente_AlteraActionPerformed(evt);
            }
        });

        Cliente_Exclui.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Cliente_Exclui.setText("EXCLUIR CADASTRO");
        Cliente_Exclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cliente_ExcluiActionPerformed(evt);
            }
        });

        Cliente_Sai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Cliente_Sai.setForeground(new java.awt.Color(255, 0, 0));
        Cliente_Sai.setText("SAIR");
        Cliente_Sai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cliente_SaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_cliBotaoLayout = new javax.swing.GroupLayout(Painel_cliBotao);
        Painel_cliBotao.setLayout(Painel_cliBotaoLayout);
        Painel_cliBotaoLayout.setHorizontalGroup(
            Painel_cliBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_cliBotaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Concluir_Cadastro)
                .addGap(26, 26, 26)
                .addComponent(Cliente_Novo)
                .addGap(27, 27, 27)
                .addComponent(Cliente_Altera)
                .addGap(27, 27, 27)
                .addComponent(Cliente_Exclui)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(Cliente_Sai)
                .addGap(23, 23, 23))
        );
        Painel_cliBotaoLayout.setVerticalGroup(
            Painel_cliBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_cliBotaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Painel_cliBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Concluir_Cadastro)
                    .addComponent(Cliente_Novo)
                    .addComponent(Cliente_Altera)
                    .addComponent(Cliente_Exclui)
                    .addComponent(Cliente_Sai))
                .addGap(78, 78, 78))
        );

        Tabela_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Cidade", "RG", "Bairro", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela_Cliente);

        javax.swing.GroupLayout Painel_priClienteLayout = new javax.swing.GroupLayout(Painel_priCliente);
        Painel_priCliente.setLayout(Painel_priClienteLayout);
        Painel_priClienteLayout.setHorizontalGroup(
            Painel_priClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_priClienteLayout.createSequentialGroup()
                .addGroup(Painel_priClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_priClienteLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel_priClienteLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(Painel_priClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(Painel_cliEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Painel_cliBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Painel_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel_priClienteLayout.setVerticalGroup(
            Painel_priClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_priClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Painel_cliEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Painel_cliBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_priCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_priCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCPFActionPerformed

    private void campoCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCidadeActionPerformed

    private void Campo_maeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_maeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_maeClienteActionPerformed

    private void Concluir_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Concluir_CadastroActionPerformed
        if (tipoCadastro.equals("novo")){
            salvarCliente();
        } else if(tipoCadastro.equals("alteracao")){
            alteraCliente();
        }
        
        /*  try {
            PreparedStatement pst = conecta.con.prepareCall("insert into cliente(nome,"
                    + "CPF,RG,Telefone,numBeneficio) values (?,?,?,?,?);");

            pst.setString(1, Campo_cliNome.getText());
            pst.setString(2, Campo_cliCpf.getText());
            pst.setString(3, Campo_cliRg.getText());
            pst.setString(4, Campo_cliTelefone.getText());
            pst.setString(5, Campo_cliBeneficio.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");

            prencherTabela("select id_cliente,nome,CPF,RG,numBeneficio,Telefone from cliente order by id_cliente;");

            //tabelaEstados.remove(this);
            //prencherTabela("select * from estados order by id_estados;");
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }//GEN-LAST:event_Concluir_CadastroActionPerformed

    private void Cliente_SaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cliente_SaiActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Cliente_SaiActionPerformed

    private void Cliente_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cliente_NovoActionPerformed
        tfNome.setEditable(true);
        tfCPF.setEditable(true);
        tfRG.setEditable(true);
        tfTelefone.setEditable(true);
        tfNumBeneficio.setEditable(true);
        Campo_paiCliente.setEditable(true);
        Campo_maeCliente.setEditable(true);
        campoEndereco.setEditable(true);
        campoComplemento.setEditable(true);
        campoCidade.setEditable(true);
        campoEstado.setEditable(true);
        campoCEP.setEditable(true);
        campoNumeroCasa.setEditable(true);
        Campo_idCliente.setEditable(true);


    }//GEN-LAST:event_Cliente_NovoActionPerformed

    private void Cliente_ExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cliente_ExcluiActionPerformed
     int linha = Tabela_Cliente.getSelectedRow();
        String nome = (String) Tabela_Cliente.getValueAt(linha, 1);
        int codigo = (int) Tabela_Cliente.getValueAt(linha, 0);

        //pegunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                + " excluir o registro:\n" + "\n " + nome + "?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada    
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerCliente.excluirClienteController(codigo)) {
                JOptionPane.showMessageDialog(this, "Registro excluido com suscesso!");
                carregarClientes();
            }else{
            JOptionPane.showMessageDialog(this, "Erro ao e os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
        
        /*        try {
            PreparedStatement pst = conecta.con.prepareCall("delete from cliente where id_cliente = ?");
            pst.setString(1, Campo_idCliente.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deletado");
            prencherTabela("select id_cliente,nome,CPF,RG,numBeneficio,Telefone from cliente order by id_cliente;");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Deletar");
        }*/
    }//GEN-LAST:event_Cliente_ExcluiActionPerformed

    private void Cliente_AlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cliente_AlteraActionPerformed
           novoCliente();
        habilitarCampos();
        recuperarCliente();
        tipoCadastro = "alteracao";
    }//GEN-LAST:event_Cliente_AlteraActionPerformed

    private void novoCliente(){
       // habilitarCampos();
        Campo_idCliente.setText("Novo");
        tfNome.setText("");
        campoEndereco.setText("");
        campoCidade.setText("");
        campoBairro.setText("");
        tfRG.setText("");
        campoCEP.setText("");
        tfTelefone.setText("");
        tipoCadastro = "novo";
    }
    
    
     private void habilitarCampos(){
        tfNome.setEditable(true);
        campoEndereco.setEditable(true);
        campoBairro.setEditable(true);
        campoCidade.setEditable(true);
        campoCEP.setEditable(true);
        tfRG.setEditable(true);
        tfTelefone.setEditable(true);
        Concluir_Cadastro.setEnabled(true);
    }
     
     
     private boolean recuperarCliente() {
        //recebe a linha selecionada
        int linha = this.Tabela_Cliente.getSelectedRow();

        //pega o codigo do cliente na linha selecionada
        int codigo = (Integer) Tabela_Cliente.getValueAt(linha, 0);

        try {
            //recupera os dados do banco
            modelCliente = controllerCliente.getClienteController(codigo);
            //seta os dados na interface
            this.Campo_idCliente.setText(String.valueOf(modelCliente.getCodigo()));
            this.tfNome.setText(modelCliente.getNome());
            this.campoEndereco.setText(modelCliente.getEndereco());
            this.campoBairro.setText(modelCliente.getBairro());
            this.campoCidade.setText(modelCliente.getCidade());
            this.tfRG.setText(modelCliente.getUf());
            this.campoCEP.setText(modelCliente.getCep());
            this.tfTelefone.setText(modelCliente.getTelefone());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
     
     
     
       private boolean alteraCliente() {
        modelCliente.setCodigo(Integer.parseInt(this.Campo_idCliente.getText()));
        modelCliente.setNome(this.tfNome.getText());
        modelCliente.setEndereco(this.campoEndereco.getText());
        modelCliente.setBairro(this.campoBairro.getText());
        modelCliente.setCidade(this.campoCidade.getText());
        modelCliente.setUf(this.tfRG.getText());
        modelCliente.setCep(this.campoCEP.getText());
        modelCliente.setTelefone(this.tfTelefone.getText());

        //alterar 
        if (controllerCliente.atualizarClienteController(modelCliente)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.desabilitarCampos();
            this.carregarClientes();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
     
     
       
           protected void desabilitarCampos(){
        tfNome.setEditable(false);
        campoEndereco.setEditable(false);
        campoBairro.setEditable(false);
        campoCidade.setEditable(false);
        campoCEP.setEditable(false);
        tfRG.setEditable(false);
        tfTelefone.setEditable(false);
        Concluir_Cadastro.setEnabled(false);
    }
       
     
     
     
     public void prencherTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"ID", "Nome", "CPF", "RG", "Numero Benefício", "Telefone"};

        conecta.executaSQL(sql);

        try {

            // conecta.rs = conecta.stm.executeQuery();
            conecta.rs.first();

            do {
                dados.add(new Object[]{conecta.rs.getInt("id_cliente"), conecta.rs.getString("nome"), conecta.rs.getString("CPF"),
                    conecta.rs.getString("RG"), conecta.rs.getString("numBeneficio"), conecta.rs.getString("Telefone")});

            } while (conecta.rs.next());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Preencher com o ArrayList");

        }

        ModeloTabela modeloTabela = new ModeloTabela(dados, Colunas);

        Tabela_Cliente.setModel(modeloTabela);
        Tabela_Cliente.getColumnModel().getColumn(0).setPreferredWidth(100);
        Tabela_Cliente.getColumnModel().getColumn(0).setResizable(false);
        Tabela_Cliente.getColumnModel().getColumn(1).setPreferredWidth(100);
        Tabela_Cliente.getColumnModel().getColumn(1).setResizable(false);
        Tabela_Cliente.getColumnModel().getColumn(2).setPreferredWidth(100);
        Tabela_Cliente.getColumnModel().getColumn(2).setResizable(false);
        Tabela_Cliente.getColumnModel().getColumn(3).setPreferredWidth(100);
        Tabela_Cliente.getColumnModel().getColumn(3).setResizable(false);
        Tabela_Cliente.getColumnModel().getColumn(4).setPreferredWidth(100);
        Tabela_Cliente.getColumnModel().getColumn(4).setResizable(false);
        Tabela_Cliente.getColumnModel().getColumn(5).setPreferredWidth(100);
        Tabela_Cliente.getColumnModel().getColumn(5).setResizable(false);

        Tabela_Cliente.getTableHeader().setReorderingAllowed(false);
        Tabela_Cliente.setAutoResizeMode(Tabela_Cliente.AUTO_RESIZE_OFF);
        Tabela_Cliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JOptionPane.showMessageDialog(null, "Funcionaste");

    }

    
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
            java.util.logging.Logger.getLogger(CadastroCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_idCliente;
    private javax.swing.JTextField Campo_maeCliente;
    private javax.swing.JTextField Campo_paiCliente;
    private javax.swing.JButton Cliente_Altera;
    private javax.swing.JLabel Cliente_Cep;
    private javax.swing.JLabel Cliente_Cidade;
    private javax.swing.JLabel Cliente_Complemento;
    private javax.swing.JLabel Cliente_Cpf;
    private javax.swing.JLabel Cliente_Email;
    private javax.swing.JLabel Cliente_Endereco;
    private javax.swing.JLabel Cliente_Estado;
    private javax.swing.JButton Cliente_Exclui;
    private javax.swing.JLabel Cliente_Matricula;
    private javax.swing.JButton Cliente_Novo;
    private javax.swing.JLabel Cliente_Rg;
    private javax.swing.JButton Cliente_Sai;
    private javax.swing.JLabel Cliente_Telefone;
    private javax.swing.JLabel Cliente_nome;
    private javax.swing.JLabel Cliente_numero;
    private javax.swing.JButton Concluir_Cadastro;
    private javax.swing.JLabel Mae_Cliente;
    private javax.swing.JLabel Pai_Cliente;
    private javax.swing.JPanel Painel_Cliente;
    private javax.swing.JPanel Painel_cliBotao;
    private javax.swing.JPanel Painel_cliEndereco;
    private javax.swing.JPanel Painel_priCliente;
    private javax.swing.JTable Tabela_Cliente;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoCEP;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoComplemento;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoEstado;
    private javax.swing.JTextField campoNumeroCasa;
    private javax.swing.JLabel idCliente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumBeneficio;
    private javax.swing.JTextField tfRG;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
