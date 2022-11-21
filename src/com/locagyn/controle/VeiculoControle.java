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
public class VeiculoControle implements IVeiculoControle{
    
    IVeiculoDao veiculoPersistencia = null;

    public VeiculoControle() {
        this.veiculoPersistencia = new VeiculoDao();
    }

    @Override
    public void incluir(Veiculo objeto) throws Exception {
        veiculoPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Veiculo objeto) throws Exception {
        veiculoPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Veiculo> listagem() throws Exception {
        return veiculoPersistencia.listagem();
    }

    @Override
    public String selecionarVeiculos(int id) throws Exception {
        return veiculoPersistencia.selecionarVeiculos(id);
    }
    
}
