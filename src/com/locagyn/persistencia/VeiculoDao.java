/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.ferramentas.GeradorIdentificador;
import com.locagyn.modelos.Veiculo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pedro
 */
public class VeiculoDao implements IVeiculoDao {

    private String nomeDoArquivoNoDisco;

    public VeiculoDao() {
        nomeDoArquivoNoDisco = "./src/com/locagyn/arquivosdedados/Veiculo.txt";
    }

    @Override
    public void incluir(Veiculo objeto) throws Exception {
        try {
            // cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            // Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setId(GeradorIdentificador.getID());
            // Escreve no arquivo
            bw.write(objeto.toString() + "\n");
            // fecha o arquivo
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void alterar(Veiculo objeto) throws Exception {
        try {
            Veiculo objetoVeiculo = new Veiculo();
            Iterator<Veiculo> lista = listagem().iterator();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            while (lista.hasNext()) {
                Veiculo aux = lista.next();
                if (aux.getId() == objeto.getId()) {
                    bw.write(objeto.toString() + "\n");

                } else {
                    bw.write(aux.toString() + "\n");
                }
            }
            bw.close();

        } catch (Exception e) {
        }
    }

    @Override
    public ArrayList<Veiculo> listagem() throws Exception {
        try {
            ArrayList<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();
            File arquivo = new File("./src/com/locagyn/arquivosdedados/Modelo.txt");
            if (!arquivo.exists()) {
                arquivo.createNewFile();
                nomeDoArquivoNoDisco = "./src/com/locagyn/arquivosdedados/Modelo.txt";
            }
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                IModeloDao objetoModelo = new ModeloDao();
                ICategoriaDao objetoCategoria = new CategoriaDao();
                Veiculo objetoVeiculo = new Veiculo();
                String vetorString[] = linha.split(";");
                System.out.printf(linha);
                objetoVeiculo.setId(Integer.parseInt(vetorString[0]));
                objetoVeiculo.setPlaca(vetorString[1]);
                objetoVeiculo.setRenavam(Integer.parseInt(vetorString[2]));
                objetoVeiculo.setPrecoDeCompra(Float.parseFloat(vetorString[3]));
                objetoVeiculo.setPrecoDeVenda(Float.parseFloat(vetorString[4]));
                objetoVeiculo.setAnoFabricacao(Integer.parseInt(vetorString[5]));
                objetoVeiculo.setAnoModelo(Integer.parseInt(vetorString[6]));
                objetoVeiculo.setTipoDeCombutivel(vetorString[7]);
                objetoVeiculo.setQuilometragem(Integer.parseInt(vetorString[8]));
                objetoVeiculo.setTipoDeVeiculo(vetorString[9]);
                int idModelo= Integer.parseInt(vetorString[10]);
                objetoVeiculo.setModelo(objetoModelo.buscar(idModelo));
                objetoVeiculo.setSituacao(vetorString[11]);
                int idCategoria= Integer.parseInt(vetorString[12]);
                objetoVeiculo.setCategoria(objetoCategoria.buscar(idCategoria));
                
                listaDeVeiculos.add(objetoVeiculo);

            }
            br.close();
            return listaDeVeiculos;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public String selecionarVeiculos(int id) throws Exception {
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {
            Veiculo objetoVeiculo = new Veiculo();
            IModeloDao objetoModelo = new ModeloDao();
            String vetorString[] = linha.split(";");
            objetoVeiculo.setId(Integer.parseInt(vetorString[0]));
            String saida = vetorString[0] + ";";
            saida += vetorString[1] + ";";
            saida += vetorString[2] + ";";
            saida += vetorString[3] + ";";
            saida += vetorString[4] + ";";
            saida += vetorString[5] + ";";
            saida += vetorString[6] + ";";
            saida += vetorString[7] + ";";
            saida += vetorString[8] + ";";
            saida += vetorString[9] + ";";
            saida += vetorString[10];
            
            
            
            
            if (objetoVeiculo.getId() == id) {
                br.close();
                return saida;
            }
        }
        return null;   
    }
}
