/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Motorista;
import com.locagyn.persistencia.MotoristaDao;
import com.locagyn.persistencia.IMotoristaDao;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class MotoristaControle implements IMotoristaControle {

    IMotoristaDao motoristaPersistencia = null;

    public MotoristaControle() {
        this.motoristaPersistencia = new MotoristaDao();
    }

    @Override
    public void incluir(Motorista objeto) throws Exception {
          if ("".equals(objeto.getNome().replace(" ", ""))) {
            throw new Exception("Digite o Nome");
        }
            if ("".equals(objeto.getUrl().replace(" ", ""))) {
            throw new Exception("Selecione uma Imagem");
        }
              if (objeto.getNumeroRegistro() == 0){
            throw new Exception("Digite o Número de Registro");
        }
                if ("".equals(objeto.getValidade().replace(" ", ""))) {
            throw new Exception("preencha a Validade");
        }
               if ("".equals(objeto.getEndereco().getBairro().replace(" ", ""))){
            throw new Exception("Digite o Bairro");
        }
               if (objeto.getEndereco().getCep() == 0){
            throw new Exception("Digite o CEP");
        }
               if ("".equals(objeto.getEndereco().getCidade().replace(" ", ""))){
            throw new Exception("Digite a Cidade");
        }
               if ("".equals(objeto.getEndereco().getComplemento().replace(" ", ""))){
            throw new Exception("Digite o Complemento");
        }
               if ("".equals(objeto.getEndereco().getLongradouro().replace(" ", ""))){
            throw new Exception("Digite o Logradouro");
        }
               if (objeto.getTelefone().getDdd() !=0) {
            throw new Exception("Digite o DDD");
        }
               if (objeto.getTelefone().getDdi()!=0) {
            throw new Exception("Digite o DDI");
        }
               if (objeto.getTelefone().getNumero()!=0) {
            throw new Exception("Digite o Número");
        }
        motoristaPersistencia.incluir(objeto);
        
    }

    @Override
    public void alterar(Motorista objeto) throws Exception {
        motoristaPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Motorista> listagem() throws Exception {
        return motoristaPersistencia.listagem();
    }

    @Override
    public Motorista buscar(int id) throws Exception {
        return motoristaPersistencia.buscar(id);
    }

}
