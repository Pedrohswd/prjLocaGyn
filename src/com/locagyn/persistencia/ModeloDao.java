/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.ferramentas.GeradorIdentificador;
import com.locagyn.modelos.Modelo;
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
public class ModeloDao implements IModeloDao {

    private String nomeDoArquivoNoDisco;

    public ModeloDao() {
        nomeDoArquivoNoDisco = "./src/com/locagyn/arquivosdedados/Modelo.txt";
    }

    @Override
    public void incluir(Modelo objeto) throws Exception {
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
    public void alterar(Modelo objeto) throws Exception {
        try {
            Modelo objetoModelo = new Modelo();
            Iterator<Modelo> lista = listagem().iterator();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            while (lista.hasNext()) {
                Modelo aux = lista.next();
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
    public ArrayList<Modelo> listagem() throws Exception {
        try {
            ArrayList<Modelo> listaDeMarcas = new ArrayList<Modelo>();
            File arquivo = new File("./src/com/locagyn/arquivosdedados/Modelo.txt");
            if (!arquivo.exists()) {
                arquivo.createNewFile();
                nomeDoArquivoNoDisco = "./src/com/locagyn/arquivosdedados/Modelo.txt";
            }
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                IMarcaDao objetoMarca = new MarcaDao();
                Modelo objetoModelo = new Modelo();
                String vetorString[] = linha.split(";");
                System.out.printf(linha);
                objetoModelo.setId(Integer.parseInt(vetorString[0]));
                objetoModelo.setDescricao(vetorString[1]);
                objetoModelo.setUrl(vetorString[2]);
                int idMarca = Integer.parseInt(vetorString[3]);
                objetoModelo.setMarca(objetoMarca.buscar(idMarca));

                listaDeMarcas.add(objetoModelo);

            }
            br.close();
            return listaDeMarcas;
        } catch (Exception erro) {
            throw erro;
        }
    }

}
