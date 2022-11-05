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
        FileWriter fw = new FileWriter(nomeDoArquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        String saida = 0 + "";
        bw.write(saida);
        bw.close();
    }

    public static int getID() throws FileNotFoundException, IOException {
        String nomeDoArquivo = "./src/com/locagyn/arquivosdedados/idGerado.txt";
        File arquivo = new File("./src/com/locagyn/arquivosdedados/idGerado.txt");
        if (!arquivo.exists()) {
            criarArquivoDeID();
        }
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = br.readLine();
        if (linha == null) {
            arquivo.delete();
            criarArquivoDeID();
            linha = br.readLine();
        }
        int id = Integer.parseInt(linha);
        br.close();
        id++;
        FileWriter fw = new FileWriter(nomeDoArquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        String saida = id + "";
        bw.write(saida);
        bw.close();
        return id;
    }
}
