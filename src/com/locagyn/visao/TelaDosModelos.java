/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.locagyn.visao;

import com.locagyn.controle.IModeloControle;
import com.locagyn.controle.MarcaControle;
import com.locagyn.controle.ModeloControle;
import com.locagyn.modelos.Marca;
import com.locagyn.modelos.Modelo;
import com.locagyn.persistencia.IMarcaDao;
import com.locagyn.persistencia.IModeloDao;
import com.locagyn.persistencia.MarcaDao;
import com.locagyn.persistencia.ModeloDao;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.locagyn.utils.jTableRender;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emill
 */
public class TelaDosModelos extends javax.swing.JFrame {

    // atributos
    MarcaControle obj = new MarcaControle();
    IModeloControle modeloControle = new ModeloControle();

    /**
     * Creates new form TelaDosModelos
     */
    public TelaDosModelos() {
        initComponents();
        jTextFieldIdentificador.setEnabled(false);
        jTextFieldUrlModelo.setEnabled(false);
        this.setLocationRelativeTo(null);
        try {

            IModeloDao incluirMarca = new ModeloDao();
            imprimirDadosNaGrid(incluirMarca.listagem());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Incluir imagem!");
        }
        jTextFieldUrlModelo.setEnabled(false);
        this.setLocationRelativeTo(null);
        MarcaDao objeto = new MarcaDao();
        try {
            ArrayList<Marca> lista = objeto.listagem();

            String[] listaCombo = new String[lista.size()];
            for (int pos = 0; pos < lista.size(); pos++) {
                listaCombo[pos] = lista.get(pos).getDescricao();
                jComboBoxMarcaLogo.addItem(listaCombo[pos]);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Marca Não Existe");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUrlModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIdentificador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDescricaoModelos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabelImagemModelo = new javax.swing.JLabel();
        jLabelMarcaLogo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableModelos = new javax.swing.JTable();
        BotaoBuscarImagem = new javax.swing.JButton();
        BotaoIncluir = new javax.swing.JButton();
        BotaoAlterar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBoxMarcaLogo = new javax.swing.JComboBox<>();
        jLabelMarcaLogoTable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(176, 198, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setText("ID:");

        jTextFieldUrlModelo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldUrlModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel3.setText("Marca:");

        jTextFieldIdentificador.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdentificador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel4.setText("Descrição:");

        jTextFieldDescricaoModelos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDescricaoModelos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldDescricaoModelos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoModelosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoModelosKeyTyped(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel5.setText("URL:");

        jLabelImagemModelo.setBackground(new java.awt.Color(0, 0, 0));
        jLabelImagemModelo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "MODELO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabelMarcaLogo.setBackground(new java.awt.Color(0, 0, 0));

        jTableModelos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableModelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICADOR", "DESCRIÇÃO", "URL", "MODELO", "MARCA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableModelos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableModelos.setGridColor(new java.awt.Color(0, 0, 0));
        jTableModelos.setRowHeight(50);
        jTableModelos.setShowGrid(true);
        jTableModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableModelosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableModelos);
        if (jTableModelos.getColumnModel().getColumnCount() > 0) {
            jTableModelos.getColumnModel().getColumn(3).setCellRenderer(new jTableRender());
            jTableModelos.getColumnModel().getColumn(4).setCellRenderer(new jTableRender());
        }

        BotaoBuscarImagem.setBackground(new java.awt.Color(0, 0, 0));
        BotaoBuscarImagem.setForeground(new java.awt.Color(255, 255, 255));
        BotaoBuscarImagem.setText("BUSCAR MODELO");
        BotaoBuscarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarImagemActionPerformed(evt);
            }
        });

        BotaoIncluir.setBackground(new java.awt.Color(0, 0, 0));
        BotaoIncluir.setForeground(new java.awt.Color(255, 255, 255));
        BotaoIncluir.setText("INCLUIR");
        BotaoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIncluirActionPerformed(evt);
            }
        });

        BotaoAlterar.setBackground(new java.awt.Color(0, 0, 0));
        BotaoAlterar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoAlterar.setText("ALTERAR");
        BotaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar Marca");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxMarcaLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcaLogoActionPerformed(evt);
            }
        });

        jLabelMarcaLogoTable.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "MARCA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jLabelMarcaLogoTable.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabelMarcaLogoTable.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabelMarcaLogoTable.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxMarcaLogo, 0, 124, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(BotaoIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoAlterar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelMarcaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMarcaLogoTable, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotaoBuscarImagem))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDescricaoModelos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldUrlModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 119, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImagemModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoBuscarImagem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDescricaoModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUrlModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelImagemModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8)
                                .addComponent(jComboBoxMarcaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))
                            .addComponent(jLabelMarcaLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoAlterar)
                            .addComponent(BotaoIncluir)
                            .addComponent(jButton1))
                        .addGap(12, 12, 12))
                    .addComponent(jLabelMarcaLogoTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMarcaLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcaLogoActionPerformed
        // TODO add your handling code here:
        try {
            atualizarCombobox();
        } catch (Exception erro) {
            Logger.getLogger(TelaDosModelos.class.getName()).log(Level.SEVERE, null, erro);
        }
    }//GEN-LAST:event_jComboBoxMarcaLogoActionPerformed

    private void jTextFieldDescricaoModelosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoModelosKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoModelosKeyTyped

    public static void atualizarCombobox() throws Exception {
        /*feito como método static para acesso a rotinas de cadastro de marca e assim
        ter a atualização sem que seja preciso dar run novamente no projeto*/
        try {
            IMarcaDao objeto = new MarcaDao();
            ArrayList<Marca> lista = objeto.listagem();
            for (int i = 0; i < lista.size(); i++) {
                if (jComboBoxMarcaLogo.getSelectedItem().equals(lista.get(i).getDescricao())) {
                    ImageIcon iconlogo = new ImageIcon(lista.get(i).getUrl());
                    iconlogo.setImage(iconlogo.getImage().getScaledInstance(jLabelMarcaLogo.getWidth(), jLabelMarcaLogo.getHeight(), 1));
                    jLabelMarcaLogo.setIcon(iconlogo);
                }
            }
        } catch (Exception erro) {
            Logger.getLogger(TelaDosModelos.class.getName()).log(Level.SEVERE, null, erro);

        }

    }

    private void jTableModelosMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            MarcaControle marcaControle = new MarcaControle();
            jTextFieldIdentificador.setText(jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 0).toString());
            jTextFieldDescricaoModelos.setText(jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 1).toString());
            jTextFieldUrlModelo.setText(jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 2).toString());
            String nomeArquivo = (String) this.jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 2);
            jTextFieldUrlModelo.setText(nomeArquivo);
            ImageIcon iconLogoModelo = new ImageIcon(nomeArquivo);
            iconLogoModelo.setImage(iconLogoModelo.getImage().getScaledInstance(jLabelImagemModelo.getWidth(), jLabelImagemModelo.getHeight(), 1));
            jLabelImagemModelo.setIcon(iconLogoModelo);

            //Aqui ta a gambiarra linda do cauan que pega a imagem da logo da marca do modelo do carro.
            ImageIcon iconLogoMarca = new ImageIcon((String) jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 3));
            //iconLogoMarca.setImage(iconLogoMarca.getImage().getScaledInstance(jLabelMarcaLogoTable.getWidth(), jLabelMarcaLogoTable.getHeight(), 1));
            iconLogoMarca.setImage(iconLogoMarca.getImage().getScaledInstance(jLabelMarcaLogoTable.getWidth(), jLabelMarcaLogoTable.getHeight(), 1));
            jLabelMarcaLogoTable.setIcon(iconLogoMarca);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }

    private void imprimirDadosNaGrid(ArrayList<Modelo> listaDeMarcas) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableModelos.getModel();
            // Limpa a tabela
            model.setNumRows(0);
            Iterator<Modelo> lista = listaDeMarcas.iterator();
            while (lista.hasNext()) {
                String[] saida = new String[4];
                Modelo aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getDescricao();
                saida[2] = aux.getUrl();
                saida[3] = obj.buscar(aux.getMarca().getId()).getUrl();
                // Incluir nova linha na Tabela
                model.addRow(saida);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }

    }

    private void BotaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BotaoIncluirActionPerformed
        // TODO add your handling code here:
        try {
            int idMarca = 0;
            File path = new File(jTextFieldUrlModelo.getText());
            String logo = ".\\src\\com\\locadora\\modelos\\" + path.getName();

            MarcaControle objeto1 = new MarcaControle();

            Modelo objeto = new Modelo(0, jTextFieldDescricaoModelos.getText(), jTextFieldUrlModelo.getText(), objeto1.buscar(idMarca));
            ArrayList<Marca> lista = obj.listagem();
            for (int i = 0; i < lista.size(); i++) {
                if (jComboBoxMarcaLogo.getSelectedItem().equals(lista.get(i).getDescricao())) {
                    objeto.setMarca(lista.get(i));
                }
            }
            modeloControle.incluir(objeto);
            jTextFieldDescricaoModelos.setText("");
            imprimirDadosNaGrid(modeloControle.listagem());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }

    }// GEN-LAST:event_BotaoIncluirActionPerformed

    private void BotaoBuscarImagemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BotaoBuscarImagemActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser fc = new JFileChooser();
            File logo = new File("./src/com/locadora/modelos");
            fc.setCurrentDirectory(logo);
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.showOpenDialog(this);
            File arquivo = fc.getSelectedFile();
            String nomeDoArquivo = arquivo.getPath();
            String nome = arquivo.getName();
            String url = logo.getPath();
            url += "/" + nome;
            System.out.println(url);
            jTextFieldUrlModelo.setText(url);
            ImageIcon iconLogo = new ImageIcon(nomeDoArquivo);
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(jLabelImagemModelo.getWidth(), jLabelImagemModelo.getHeight(), 1));
            jLabelImagemModelo.setIcon(iconLogo);

        } catch (Exception erro) {
           JOptionPane.showMessageDialog(this, erro);
        }

    }// GEN-LAST:event_BotaoBuscarImagemActionPerformed

    private void BotaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BotaoAlterarActionPerformed
        // TODO add your handling code here:
        try {
            int idMarca = 0;
            MarcaControle objeto1 = new MarcaControle();

            Modelo objeto = new Modelo(Integer.parseInt(jTextFieldIdentificador.getText()), jTextFieldDescricaoModelos.getText(), jTextFieldUrlModelo.getText(), objeto1.buscar(idMarca));
            ArrayList<Marca> lista = obj.listagem();
            for (int i = 0; i < lista.size(); i++) {
                if (jComboBoxMarcaLogo.getSelectedItem().equals(lista.get(i).getDescricao())) {
                    objeto.setMarca(lista.get(i));
                }
            }
            modeloControle.alterar(objeto);
            jTextFieldDescricaoModelos.setText("");
            imprimirDadosNaGrid(modeloControle.listagem());

        } catch (Exception ex) {

        }
        jTextFieldDescricaoModelos.setText("");
    }

    private void jTextFieldDescricaoModelosKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextFieldDescricaoModelosKeyReleased
        // TODO add your handling code here:
        int posicao = jTextFieldDescricaoModelos.getCaretPosition();
        jTextFieldDescricaoModelos.setText(jTextFieldDescricaoModelos.getText().toUpperCase());
        jTextFieldDescricaoModelos.setCaretPosition(posicao);
    }// GEN-LAST:event_jTextFieldDescricaoModelosKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // Trazer a tela de cadastro de marcas
        try {

            TelaDasMarcas telaMarca = new TelaDasMarcas();
            telaMarca.setLocationRelativeTo(null);
            telaMarca.setVisible(true);
            this.setVisible(false);
            telaMarca.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }

    }// GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */

        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDosModelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterar;
    private javax.swing.JButton BotaoBuscarImagem;
    private javax.swing.JButton BotaoIncluir;
    private javax.swing.JButton jButton1;
    public static javax.swing.JComboBox<String> jComboBoxMarcaLogo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelImagemModelo;
    public static javax.swing.JLabel jLabelMarcaLogo;
    private javax.swing.JLabel jLabelMarcaLogoTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableModelos;
    private javax.swing.JTextField jTextFieldDescricaoModelos;
    private javax.swing.JTextField jTextFieldIdentificador;
    private javax.swing.JTextField jTextFieldUrlModelo;
    // End of variables declaration//GEN-END:variables
}
