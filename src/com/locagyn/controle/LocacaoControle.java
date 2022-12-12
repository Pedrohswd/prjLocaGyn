/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Locacao;
import com.locagyn.persistencia.ILocacaoDao;
import com.locagyn.persistencia.LocacaoDao;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class LocacaoControle implements ILocacaoControle{
    
    ILocacaoDao locacaoPersistencia = new LocacaoDao();

    @Override
    public void locar(Locacao objeto) throws Exception {
        locacaoPersistencia.locar(objeto);
    }

    @Override
    public void devolver(Locacao objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Locacao> listagem() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
