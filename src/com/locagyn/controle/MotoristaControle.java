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
