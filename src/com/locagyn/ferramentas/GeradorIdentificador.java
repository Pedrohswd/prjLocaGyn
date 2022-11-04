/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.ferramentas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ejmcc
 */
public class GeradorIdentificador {

    public static void criarArquivoDeID() throws FileNotFoundException, IOException {
        String nomeDoArquivo = "./src/com/locagyn/arquivosdedados/idGerado.txt";
        //String nomeDoArquivo ="idGerado.txt";
        FileWriter fw = new FileWriter(nomeDoArquivo);
        //Criar o buffer do arquivo
        BufferedWriter bw = new BufferedWriter(fw);
        //Escreve no arquivo
        String saida = 1 + "";
        bw.write(saida);
        //fecha o arquivo
        bw.close();
    }

    public static int getID() throws FileNotFoundException, IOException {
        String nomeDoArquivo = "./src/com/locagyn/arquivosdedados/idGerado.txt";
        File arquivo = new File("./src/com/locagyn/arquivosdedados/idGerado.txt");
        if (!arquivo.exists()){
            arquivo.createNewFile();
            nomeDoArquivo = "./src/com/locagyn/arquivosdedados/idGerado.txt";
            FileWriter fileWriter = new FileWriter(arquivo);
            BufferedWriter bufW = new BufferedWriter(fileWriter);
            String saida = 0 + "";
            bufW.write(saida);
            bufW.close();
        }
        if (arquivo.list()== null){
            FileWriter fileWriter = new FileWriter(arquivo);
            BufferedWriter bufW = new BufferedWriter(fileWriter);
            String saida = 0 + "";
            bufW.write(saida);
            bufW.close();
        }
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = br.readLine();
        int id = Integer.parseInt(linha);
        br.close();
        id++;
        //cria o arquivo
        FileWriter fw = new FileWriter(nomeDoArquivo);
        //Criar o buffer do arquivo
        BufferedWriter bw = new BufferedWriter(fw);
        //Escreve no arquivo
        String saida = id + "";
        bw.write(saida);
        //fecha o arquivo
        bw.close();
        return id;
    }
}
