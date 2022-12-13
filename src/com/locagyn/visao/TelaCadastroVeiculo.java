                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.locagyn.visao;

import com.locagyn.controle.CategoriaControle;
import com.locagyn.controle.ICategoriaControle;
import com.locagyn.controle.IModeloControle;
import com.locagyn.controle.IVeiculoControle;
import com.locagyn.controle.ModeloControle;
import com.locagyn.controle.VeiculoControle;
import com.locagyn.enumeracao.TipoDeCombustivel;
import com.locagyn.enumeracao.TipoDeVeiculo;
import com.locagyn.enumeracao.Situacao;
import com.locagyn.modelos.Categoria;

import com.locagyn.modelos.Modelo;
import com.locagyn.modelos.Veiculo;
import java.io.File;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emill
 */
public class TelaCadastroVeiculo extends javax.swing.JFrame {

    IVeiculoControle veiculoControle = new VeiculoControle();
    ModeloControle obj = new ModeloControle();

    /**
     * Creates new form TelaCadastroVeiculo
     */
    public TelaCadastroVeiculo() throws Exception {
        initComponents();
        jTextFieldIdentificador.setEnabled(false);
        ModeloControle objeto = new ModeloControle();
        try {
            IVeiculoControle incluirVeiculo = new VeiculoControle();
            imprimirDadosNaGrid(incluirVeiculo.listagem());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar a lista de Veiculos! Verifique os arquivos.");
        }
        try {
            ArrayList<Modelo> listaModelo = objeto.listagem();

            String[] listaCombo = new String[listaModelo.size()];
            for (int pos = 0; pos < listaModelo.size(); pos++) {
                listaCombo[pos] = listaModelo.get(pos).getDescricao();
                jComboBoxModelo.addItem(listaCombo[pos]);
            }

            //categoria
            ICategoriaControle objetoCateg = new CategoriaControle();
            ArrayList<Categoria> listaCategoria = objetoCateg.listagem();

            String[] listaCateg = new String[listaCategoria.size()];
            for (int pos = 0; pos < listaCategoria.size(); pos++) {
                listaCombo[pos] = listaCategoria.get(pos).getDescricao();
                jComboBoxCategoria.addItem(listaCombo[pos]);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Falha ao listar");
        }
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldIdentificador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRenavam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAnoFabricacao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAnoModelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxTipoDeVeiculo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxTipoDeCombustivel = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldQuilometragem = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldValorVenda = new javax.swing.JTextField();
        jTextFieldValorCompra = new javax.swing.JTextField();
        jButtonAlterarVeiculo = new javax.swing.JButton();
        jButtonInculirVeiculo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabelModeloLogoTable = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableVeiculos = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jComboBoxModelo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxSituacao = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItemLocacao = new javax.swing.JMenuItem();
        jMenuItemCadastroDeMotorista = new javax.swing.JMenuItem();
        jMenuItemCadastroDeCategorias = new javax.swing.JMenuItem();
        jMenuItemCadastroDeAcessorios = new javax.swing.JMenuItem();
        jMenuItemCadastroVeiculo = new javax.swing.JMenuItem();
        jMenuItemCadastroDeCliente = new javax.swing.JMenuItem();
        jMenuItemCadastroDeModelo = new javax.swing.JMenuItem();
        jMenuItemCadastroDeMarca = new javax.swing.JMenuItem();
        jMenuItemTelaInicial = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel13.setText("Km:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(176, 198, 238));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setText("ID:");

        jTextFieldIdentificador.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setText("Placa:");

        jTextFieldPlaca.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPlacaKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel3.setText("Renavam:");

        jTextFieldRenavam.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldRenavam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldRenavamKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel4.setText("Ano de Fabricação:");

        jTextFieldAnoFabricacao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldAnoFabricacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnoFabricacaoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel5.setText("Ano do Modelo:");

        jTextFieldAnoModelo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldAnoModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnoModeloKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel6.setText("Tipo:");

        jComboBoxTipoDeVeiculo.setModel((new javax.swing.DefaultComboBoxModel(TipoDeVeiculo.values())));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel7.setText("Combustivel:");

        jComboBoxTipoDeCombustivel.setModel(new javax.swing.DefaultComboBoxModel(TipoDeCombustivel.values()));
        jComboBoxTipoDeCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoDeCombustivelActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel8.setText("Km:");

        jTextFieldQuilometragem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldQuilometragem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldQuilometragemKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel9.setText("Valor de Compra:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel10.setText("Valor de Venda:");

        jTextFieldValorVenda.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldValorVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorVendaKeyTyped(evt);
            }
        });

        jTextFieldValorCompra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldValorCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorCompraKeyTyped(evt);
            }
        });

        jButtonAlterarVeiculo.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAlterarVeiculo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonAlterarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterarVeiculo.setText("Alterar");
        jButtonAlterarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarVeiculoActionPerformed(evt);
            }
        });

        jButtonInculirVeiculo.setBackground(new java.awt.Color(0, 0, 0));
        jButtonInculirVeiculo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonInculirVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInculirVeiculo.setText("Incluir");
        jButtonInculirVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInculirVeiculoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel11.setText("Modelo:");

        jLabelModeloLogoTable.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "MODELO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jLabelModeloLogoTable.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabelModeloLogoTable.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabelModeloLogoTable.setPreferredSize(new java.awt.Dimension(25, 25));

        jTableVeiculos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICADOR", "PLACA", "RENAVAM", "PREÇO DE COMPRA", "PREÇO DE VENDA", "ANO DE FABRICAÇÃO", "ANO DO MODELO", "COMBUSTIVEL", "QUILOMETRAGEM", "TIPO DO VEICULO", "MODELO", "SITUACAO", "CATEGORIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVeiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableVeiculos.setGridColor(new java.awt.Color(0, 0, 0));
        jTableVeiculos.setRowHeight(50);
        jTableVeiculos.setShowGrid(true);
        jTableVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVeiculosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableVeiculos);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel12.setText("Categoria:");

        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel14.setText("Situação");

        jComboBoxSituacao.setModel((new javax.swing.DefaultComboBoxModel(Situacao.values())));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonInculirVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAlterarVeiculo)))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxTipoDeVeiculo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBoxTipoDeCombustivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldRenavam)
                                .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAnoModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jTextFieldValorVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jTextFieldAnoFabricacao, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jComboBoxModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(jLabelModeloLogoTable, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 123, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextFieldRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jComboBoxTipoDeCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jTextFieldValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jComboBoxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jTextFieldAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jTextFieldAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabelModeloLogoTable, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAlterarVeiculo)
                            .addComponent(jButtonInculirVeiculo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxTipoDeVeiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuOpcoes.setText("Options");

        jMenuItemLocacao.setText("Locação");
        jMenuItemLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLocacaoActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemLocacao);

        jMenuItemCadastroDeMotorista.setText("Cadastro de Motorista");
        jMenuItemCadastroDeMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroDeMotoristaActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastroDeMotorista);

        jMenuItemCadastroDeCategorias.setText("Cadastro de Categorias");
        jMenuItemCadastroDeCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroDeCategoriasActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastroDeCategorias);

        jMenuItemCadastroDeAcessorios.setText("Cadastro de Acessorios");
        jMenuItemCadastroDeAcessorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroDeAcessoriosActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastroDeAcessorios);

        jMenuItemCadastroVeiculo.setText("Cadastro de Veículo");
        jMenuItemCadastroVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroVeiculoActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastroVeiculo);

        jMenuItemCadastroDeCliente.setText("Cadastro de Cliente");
        jMenuItemCadastroDeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroDeClienteActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastroDeCliente);

        jMenuItemCadastroDeModelo.setText("Cadastro de Modelo");
        jMenuItemCadastroDeModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroDeModeloActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastroDeModelo);

        jMenuItemCadastroDeMarca.setText("Cadastro de Marca");
        jMenuItemCadastroDeMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroDeMarcaActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastroDeMarca);

        jMenuItemTelaInicial.setText("Tela Inicial");
        jMenuItemTelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaInicialActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemTelaInicial);

        jMenuBar1.add(jMenuOpcoes);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoDeCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoDeCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoDeCombustivelActionPerformed

    private void imprimirDadosNaGrid(ArrayList<Veiculo> listaDeVeiculos) throws Exception {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableVeiculos.getModel();
            ModeloControle modelo = new ModeloControle();
            CategoriaControle categoria = new CategoriaControle();
            // Limpa a tabela
            model.setNumRows(0);
            Iterator<Veiculo> lista = listaDeVeiculos.iterator();
            while (lista.hasNext()) {
                String[] saida = new String[13];
                Veiculo aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getPlaca();
                saida[2] = aux.getRenavam() + "";
                saida[3] = aux.getPrecoDeCompra() + "";
                saida[4] = aux.getPrecoDeVenda() + "";
                saida[5] = aux.getAnoFabricacao() + "";
                saida[6] = aux.getAnoModelo() + "";
                saida[7] = aux.getTipoDeCombutivel() + "";
                saida[8] = aux.getQuilometragem() + "";
                saida[9] = aux.getTipoDeVeiculo() + "";
                saida[10] = modelo.buscar(aux.getModelo().getId()).getDescricao();
                saida[11] = aux.getSituacao() + "";
                Categoria idCategoria = aux.getCategoria();
                saida[12] = categoria.buscar(idCategoria.getId()).getDescricao();

                // Incluir nova linha na Tabela
                model.addRow(saida);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }

    }
    private void jButtonInculirVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInculirVeiculoActionPerformed
        try {
            int idModelo = 0;
            ModeloControle objeto1 = new ModeloControle();
            int idCategoria = 0;
            CategoriaControle objetoCategoria = new CategoriaControle();

            Veiculo objeto = new Veiculo(0, jTextFieldPlaca.getText(), Integer.parseInt(jTextFieldRenavam.getText()), Float.parseFloat(jTextFieldValorCompra.getText()), Float.parseFloat(jTextFieldValorVenda.getText()), Integer.parseInt(jTextFieldAnoFabricacao.getText()), Integer.parseInt(jTextFieldAnoModelo.getText()), jComboBoxTipoDeCombustivel.getSelectedItem(), Integer.parseInt(jTextFieldQuilometragem.getText()), jComboBoxTipoDeVeiculo.getSelectedItem(), objeto1.buscar(idModelo), jComboBoxSituacao.getSelectedItem(), objetoCategoria.buscar(idCategoria));
            ArrayList<Modelo> lista = obj.listagem();
            for (int i = 0; i < lista.size(); i++) {
                if (jComboBoxModelo.getSelectedItem().equals(lista.get(i).getDescricao())) {
                    objeto.setModelo(lista.get(i));
                }
            }

            ArrayList<Categoria> listaCategoria = objetoCategoria.listagem();
            for (int i = 0; i < listaCategoria.size(); i++) {
                if (jComboBoxCategoria.getSelectedItem().equals(listaCategoria.get(i).getDescricao())) {
                    objeto.setCategoria(listaCategoria.get(i));
                }
            }

            veiculoControle.incluir(objeto);
            limparCampos();
            imprimirDadosNaGrid(veiculoControle.listagem());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonInculirVeiculoActionPerformed

    private void jButtonAlterarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarVeiculoActionPerformed
        // TODO add your handling code here:
        try {
            int idModelo = 0;
            ModeloControle objeto1 = new ModeloControle();
            int idCategoria = 0;
            CategoriaControle objetoCategoria = new CategoriaControle();

            Veiculo objeto = new Veiculo(Integer.parseInt(jTextFieldIdentificador.getText()), jTextFieldPlaca.getText(), Integer.parseInt(jTextFieldRenavam.getText()), Float.parseFloat(jTextFieldValorCompra.getText()), Float.parseFloat(jTextFieldValorVenda.getText()), Integer.parseInt(jTextFieldAnoFabricacao.getText()), Integer.parseInt(jTextFieldAnoModelo.getText()), jComboBoxTipoDeCombustivel.getSelectedItem(), Integer.parseInt(jTextFieldQuilometragem.getText()), jComboBoxTipoDeVeiculo.getSelectedItem(), objeto1.buscar(idModelo), jComboBoxSituacao.getSelectedItem(), objetoCategoria.buscar(idCategoria));
            ArrayList<Modelo> lista = obj.listagem();
            for (int i = 0; i < lista.size(); i++) {
                if (jComboBoxModelo.getSelectedItem().equals(lista.get(i).getDescricao())) {
                    objeto.setModelo(lista.get(i));
                }
            }
            veiculoControle.alterar(objeto);
            imprimirDadosNaGrid(veiculoControle.listagem());
            limparCampos();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jButtonAlterarVeiculoActionPerformed

    private void jTableVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVeiculosMouseClicked
        try {
            jTextFieldIdentificador.setText(jTableVeiculos.getValueAt(jTableVeiculos.getSelectedRow(), 0).toString());
            jTextFieldPlaca.setText(jTableVeiculos.getValueAt(jTableVeiculos.getSelectedRow(), 1).toString());
            jTextFieldRenavam.setText(jTableVeiculos.getValueAt(jTableVeiculos.getSelectedRow(), 2).toString());
            jTextFieldValorCompra.setText(jTableVeiculos.getValueAt(jTableVeiculos.getSelectedRow(), 3).toString());
            jTextFieldValorVenda.setText(jTableVeiculos.getValueAt(jTableVeiculos.getSelectedRow(), 4).toString());
            jTextFieldAnoFabricacao.setText(jTableVeiculos.getValueAt(jTableVeiculos.getSelectedRow(), 5).toString());
            jTextFieldAnoModelo.setText(jTableVeiculos.getValueAt(jTableVeiculos.getSelectedRow(), 6).toString());
            String combustivel = jTableVeiculos.getValueAt(jTableVeiculos.getSelectedRow(), 7).toString();
            if(combustivel == TipoDeCombustivel.DIESEL.toString())jComboBoxTipoDeCombustivel.setSelectedItem(TipoDeCombustivel.DIESEL.valueOf(combustivel));
            if(combustivel == TipoDeCombustivel.ELETRICO.toString())jComboBoxTipoDeCombustivel.setSelectedItem(TipoDeCombustivel.ELETRICO.valueOf(combustivel));
            if(combustivel == TipoDeCombustivel.ETANOL.toString())jComboBoxTipoDeCombustivel.setSelectedItem(TipoDeCombustivel.ETANOL.valueOf(combustivel));
            if(combustivel == TipoDeCombustivel.FLEX.toString())jComboBoxTipoDeCombustivel.setSelectedItem(TipoDeCombustivel.FLEX.valueOf(combustivel));
            if(combustivel == TipoDeCombustivel.GASOLINA.toString())jComboBoxTipoDeCombustivel.setSelectedItem(TipoDeCombustivel.GASOLINA.valueOf(combustivel));
            if(combustivel == TipoDeCombustivel.GNV.toString())jComboBoxTipoDeCombustivel.setSelectedItem(TipoDeCombustivel.GNV.valueOf(combustivel));

            

            jComboBoxTipoDeCombustivel.setSelectedItem(TipoDeCombustivel.ELETRICO.valueOf(combustivel));
            jTextFieldQuilometragem.setText(jTableVeiculos.getValueAt(jTableVeiculos.getSelectedRow(), 8).toString());
            String tipoDeVeiculo = jTableVeiculos.getValueAt(jTableVeiculos.getSelectedRow(), 9).toString();
            if(tipoDeVeiculo == TipoDeVeiculo.HATCH.toString())jComboBoxTipoDeVeiculo.setSelectedItem(TipoDeVeiculo.HATCH.valueOf(tipoDeVeiculo));
            if(tipoDeVeiculo == TipoDeVeiculo.PICKUP.toString())jComboBoxTipoDeVeiculo.setSelectedItem(TipoDeVeiculo.PICKUP.valueOf(tipoDeVeiculo));
            if(tipoDeVeiculo == TipoDeVeiculo.SEDAN.toString())jComboBoxTipoDeVeiculo.setSelectedItem(TipoDeVeiculo.SEDAN.valueOf(tipoDeVeiculo));
            if(tipoDeVeiculo == TipoDeVeiculo.SUV.toString())jComboBoxTipoDeVeiculo.setSelectedItem(TipoDeVeiculo.SUV.valueOf(tipoDeVeiculo));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }


    }//GEN-LAST:event_jTableVeiculosMouseClicked

    private void jMenuItemLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLocacaoActionPerformed
        // TODO add your handling code here:
        try {
            TelaDeLocacao telaLocacao = new TelaDeLocacao();
            telaLocacao.setLocationRelativeTo(null);
            telaLocacao.setVisible(true);
            this.setVisible(false);
            telaLocacao.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemLocacaoActionPerformed

    private void jMenuItemCadastroDeMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroDeMotoristaActionPerformed
        // TODO add your handling code here:
        try {
            TelaCadastroMotorista telaMotorista = new TelaCadastroMotorista();
            telaMotorista.setLocationRelativeTo(null);
            telaMotorista.setVisible(true);
            this.setVisible(false);
            telaMotorista.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemCadastroDeMotoristaActionPerformed

    private void jMenuItemCadastroDeCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroDeCategoriasActionPerformed
        // TODO add your handling code here:
        try {

            TelaDeCategoria telaCategoria = new TelaDeCategoria();
            telaCategoria.setLocationRelativeTo(null);
            telaCategoria.setVisible(true);
            this.setVisible(false);
            telaCategoria.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemCadastroDeCategoriasActionPerformed

    private void jMenuItemCadastroDeAcessoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroDeAcessoriosActionPerformed
        // TODO add your handling code here:
        try {
            TelaDeAcessorios telaAcessorios = new TelaDeAcessorios();
            telaAcessorios.setLocationRelativeTo(null);
            telaAcessorios.setVisible(true);
            this.setVisible(false);
            telaAcessorios.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemCadastroDeAcessoriosActionPerformed

    private void jMenuItemCadastroVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroVeiculoActionPerformed
        // TODO add your handling code here:
        try {

            TelaCadastroVeiculo telaVeiculo = new TelaCadastroVeiculo();
            telaVeiculo.setLocationRelativeTo(null);
            telaVeiculo.setVisible(true);
            this.setVisible(false);
            telaVeiculo.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemCadastroVeiculoActionPerformed

    private void jMenuItemCadastroDeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroDeClienteActionPerformed
        // TODO add your handling code here:
        try {

            TelaCadastroCliente cadastroCliente = new TelaCadastroCliente();
            cadastroCliente.setLocationRelativeTo(null);
            cadastroCliente.setVisible(true);
            this.setVisible(false);
            cadastroCliente.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemCadastroDeClienteActionPerformed

    private void jMenuItemCadastroDeModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroDeModeloActionPerformed
        // TODO add your handling code here:
        try {
            TelaDosModelos telaModelo = new TelaDosModelos();
            telaModelo.setLocationRelativeTo(null);
            telaModelo.setVisible(true);
            this.setVisible(false);
            telaModelo.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemCadastroDeModeloActionPerformed

    private void jMenuItemCadastroDeMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroDeMarcaActionPerformed
        // TODO add your handling code here:
        try {

            TelaDasMarcas telaMarca = new TelaDasMarcas();
            telaMarca.setLocationRelativeTo(null);
            telaMarca.setVisible(true);
            this.setVisible(false);
            telaMarca.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemCadastroDeMarcaActionPerformed

    private void jMenuItemTelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaInicialActionPerformed
        // TODO add your handling code here:
        try {

            TelaInicial telaInicial = new TelaInicial();
            telaInicial.setLocationRelativeTo(null);
            telaInicial.setVisible(true);
            this.setVisible(false);
            telaInicial.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemTelaInicialActionPerformed

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void jTextFieldPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPlacaKeyReleased
        // TODO add your handling code here:
        int posicao = jTextFieldPlaca.getCaretPosition();
        jTextFieldPlaca.setText(jTextFieldPlaca.getText().toUpperCase());
        jTextFieldPlaca.setCaretPosition(posicao);
    }//GEN-LAST:event_jTextFieldPlacaKeyReleased

    private void jTextFieldQuilometragemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuilometragemKeyTyped
        // TODO add your handling code here:
         char e = evt.getKeyChar();
        if (!Character.isDigit(e)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldQuilometragemKeyTyped

    private void jTextFieldValorCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorCompraKeyTyped
        // TODO add your handling code here:
         char e = evt.getKeyChar();
        if (!Character.isDigit(e)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldValorCompraKeyTyped

    private void jTextFieldValorVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorVendaKeyTyped
        // TODO add your handling code here:
         char e = evt.getKeyChar();
        if (!Character.isDigit(e)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldValorVendaKeyTyped

    private void jTextFieldAnoFabricacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnoFabricacaoKeyTyped
        // TODO add your handling code here:
         char e = evt.getKeyChar();
        if (!Character.isDigit(e)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldAnoFabricacaoKeyTyped

    private void jTextFieldAnoModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnoModeloKeyTyped
        // TODO add your handling code here:
         char e = evt.getKeyChar();
        if (!Character.isDigit(e)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldAnoModeloKeyTyped

    private void jTextFieldRenavamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRenavamKeyTyped
        // TODO add your handling code here:
         char e = evt.getKeyChar();
        if (!Character.isDigit(e)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldRenavamKeyTyped

    public void limparCampos() throws Exception {
        try {
            jTextFieldAnoFabricacao.setText("");
            jTextFieldAnoModelo.setText("");
            jTextFieldIdentificador.setText("");
            jTextFieldPlaca.setText("");
            jTextFieldQuilometragem.setText("");
            jTextFieldRenavam.setText("");
            jTextFieldValorCompra.setText("");
            jTextFieldValorVenda.setText("");
        } catch (Exception erro) {
            throw erro;
        }

    }

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
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCadastroVeiculo().setVisible(true);
                } catch (Exception ex) {
                    java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarVeiculo;
    private javax.swing.JButton jButtonInculirVeiculo;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxModelo;
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JComboBox<String> jComboBoxTipoDeCombustivel;
    private javax.swing.JComboBox<String> jComboBoxTipoDeVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelModeloLogoTable;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCadastroDeAcessorios;
    private javax.swing.JMenuItem jMenuItemCadastroDeCategorias;
    private javax.swing.JMenuItem jMenuItemCadastroDeCliente;
    private javax.swing.JMenuItem jMenuItemCadastroDeMarca;
    private javax.swing.JMenuItem jMenuItemCadastroDeModelo;
    private javax.swing.JMenuItem jMenuItemCadastroDeMotorista;
    private javax.swing.JMenuItem jMenuItemCadastroVeiculo;
    private javax.swing.JMenuItem jMenuItemLocacao;
    private javax.swing.JMenuItem jMenuItemTelaInicial;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableVeiculos;
    private javax.swing.JTextField jTextFieldAnoFabricacao;
    private javax.swing.JTextField jTextFieldAnoModelo;
    private javax.swing.JTextField jTextFieldIdentificador;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldQuilometragem;
    private javax.swing.JTextField jTextFieldRenavam;
    private javax.swing.JTextField jTextFieldValorCompra;
    private javax.swing.JTextField jTextFieldValorVenda;
    // End of variables declaration//GEN-END:variables
}
