/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.ferramentas.GeradorIdentificador;
import com.locagyn.modelos.Endereco;
import com.locagyn.modelos.Motorista;
import com.locagyn.modelos.Telefone;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;

/**
 *
 * @author pedro
 */
public class MotoristaDao implements IMotoristaDao {

    private String nomeDoArquivoNoDisco;

    SimpleDateFormat dF = new SimpleDateFormat("dd/MM/yyyy");
    

    public MotoristaDao() {
        nomeDoArquivoNoDisco = "./src/com/locagyn/arquivosdedados/Motorista.txt";
    }

    @Override
    public void incluir(Motorista objeto) throws Exception {
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

    @Override
    public void alterar(Motorista objeto) throws Exception {
        try {
            Motorista objetoMotorista = new Motorista();
            Iterator<Motorista> lista = listagem().iterator();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            while (lista.hasNext()) {
                Motorista aux = lista.next();
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
    public ArrayList<Motorista> listagem() throws Exception {
        try {
            ArrayList<Motorista> listaDeMarcas = new ArrayList<Motorista>();
            File arquivo = new File("./src/com/locagyn/arquivosdedados/Motorista.txt");
            if (!arquivo.exists()) {
                arquivo.createNewFile();
                nomeDoArquivoNoDisco = "./src/com/locagyn/arquivosdedados/Motorista.txt";
            }
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Motorista objetoMotorista = new Motorista();
                String vetorString[] = linha.split(";");
                objetoMotorista.setId(Integer.parseInt(vetorString[0]));
                objetoMotorista.setNome(vetorString[1]);
                objetoMotorista.setUrl(vetorString[2]);
                objetoMotorista.setNumeroRegistro(Integer.parseInt(vetorString[3]));
                objetoMotorista.setCategoriaCNH(vetorString[4]);
                objetoMotorista.setValidade(vetorString[5]);

                long ddi = Long.parseLong(vetorString[6]);
                long ddd = Long.parseLong(vetorString[7]);
                long numero = Long.parseLong(vetorString[8]);

                Telefone telefone = new Telefone(ddi, ddd, numero);
                objetoMotorista.setTelefone(telefone);

                String logradouro = vetorString[9];
                String complemento = vetorString[10];
                String bairro = vetorString[11];
                String cidade = vetorString[12];
                String estado = vetorString[13];
                long cep = Long.parseLong(vetorString[14]);

                Endereco endereco = new Endereco(logradouro, complemento, cidade, estado, bairro, cep);
                objetoMotorista.setEndereco(endereco);

                listaDeMarcas.add(objetoMotorista);
            }
            br.close();
            return listaDeMarcas;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public Motorista buscar(int id) throws Exception {
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {
            Motorista objetoMotorista = new Motorista();
                String vetorString[] = linha.split(";");
                objetoMotorista.setId(Integer.parseInt(vetorString[0]));
                objetoMotorista.setNome(vetorString[1]);
                objetoMotorista.setUrl(vetorString[2]);
                objetoMotorista.setNumeroRegistro(Integer.parseInt(vetorString[3]));
                objetoMotorista.setCategoriaCNH(vetorString[4]);
                objetoMotorista.setValidade(vetorString[5]);

//                long ddi = Long.parseLong(vetorString[6]);
//                long ddd = Long.parseLong(vetorString[7]);
//                long numero = Long.parseLong(vetorString[8]);
//
//                Telefone telefone = new Telefone(ddi, ddd, numero);
//                objetoMotorista.setTelefone(telefone);
//
//                String logradouro = vetorString[9];
//                String complemento = vetorString[10];
//                String bairro = vetorString[11];
//                String cidade = vetorString[12];
//                String estado = vetorString[13];
//                long cep = Long.parseLong(vetorString[14]);
//
//                Endereco endereco = new Endereco(logradouro, complemento, cidade, estado, bairro, cep);
//                objetoMotorista.setEndereco(endereco);
            if (objetoMotorista.getId() == id) {
                br.close();
                return new Motorista(Integer.parseInt(vetorString[0]), vetorString[1], vetorString[2], Integer.parseInt(vetorString[3]), vetorString[4], vetorString[5]);
            }
        }
        return null;
    }
    
    

}
