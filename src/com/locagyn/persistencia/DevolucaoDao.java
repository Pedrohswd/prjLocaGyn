/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.enumeracao.TipoDeCliente;
import com.locagyn.ferramentas.GeradorIdentificador;
import com.locagyn.modelos.Cliente;
import com.locagyn.modelos.Devolucao;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author pedro
 */
public class DevolucaoDao implements IDevolucaoDao{
    
     private String nomeDoArquivoNoDisco;

    public DevolucaoDao() {
        nomeDoArquivoNoDisco = "./src/com/locagyn/arquivosdedados/Devolucao.txt";
    }

    @Override
    public void incluir(Devolucao objeto) throws Exception {
     try {
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setId(GeradorIdentificador.getID());
            //Escreve no arquivo
            bw.write(objeto.toString() + "\n");
            //fecha o arquivo
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }    
    }
    
}
