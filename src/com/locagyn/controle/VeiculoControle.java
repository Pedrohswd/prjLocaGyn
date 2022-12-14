/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Veiculo;
import com.locagyn.persistencia.IVeiculoDao;
import com.locagyn.persistencia.VeiculoDao;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class VeiculoControle implements IVeiculoControle {

    IVeiculoDao veiculoPersistencia = null;

    public VeiculoControle() {
        this.veiculoPersistencia = new VeiculoDao();
    }

    @Override
    public void incluir(Veiculo objeto) throws Exception {
          if ("".equals(objeto.getPlaca().replace(" ", ""))) {
            throw new Exception("Digite a Placa");
        }
           if (objeto.getRenavam()==0) {
            throw new Exception("Digite o Renavam");
        }
            if (objeto.getAnoFabricacao()==0) {
            throw new Exception("Digite o Ano de Fabricação");
        }
             if (objeto.getAnoModelo()==0) {
            throw new Exception("Digite o Ano de Modelo");
        }
              if (objeto.getPrecoDeCompra()==0) {
            throw new Exception("Digite o Preço de Compra");
        }
               if (objeto.getPrecoDeVenda()==0) {
            throw new Exception("Digite o Preço de Venda");
        }
        veiculoPersistencia.incluir(objeto);
        
    }

    @Override
    public void alterar(Veiculo objeto) throws Exception {
         if ("".equals(objeto.getPlaca().replace(" ", ""))) {
            throw new Exception("Digite a Placa");
        }
           if (objeto.getRenavam()==0) {
            throw new Exception("Digite o Renavam");
        }
            if (objeto.getAnoFabricacao()==0) {
            throw new Exception("Digite o Ano de Fabricação");
        }
             if (objeto.getAnoModelo()==0) {
            throw new Exception("Digite o Ano de Modelo");
        }
              if (objeto.getPrecoDeCompra()==0) {
            throw new Exception("Digite o Preço de Compra");
        }
               if (objeto.getPrecoDeVenda()==0) {
            throw new Exception("Digite o Preço de Venda");
        }
        veiculoPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Veiculo> listagem() throws Exception {
        return veiculoPersistencia.listagem();
    }

    @Override
    public Veiculo buscar(int id) throws Exception {
        return veiculoPersistencia.buscar(id);
    }

}
