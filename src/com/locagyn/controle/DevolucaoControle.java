/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Devolucao;
import com.locagyn.persistencia.DevolucaoDao;
import com.locagyn.persistencia.IDevolucaoDao;

/**
 *
 * @author pedro
 */
public class DevolucaoControle implements IDevolucaoControle{
    IDevolucaoDao modeloPersistencia = null;

    public DevolucaoControle() {
        this.modeloPersistencia = new DevolucaoDao();
    }

    @Override
    public void incluir(Devolucao objeto) throws Exception {
        modeloPersistencia.incluir(objeto);
    }
    
}
