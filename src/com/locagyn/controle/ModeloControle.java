/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Modelo;
import com.locagyn.persistencia.ModeloDao;
import com.locagyn.persistencia.IModeloDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pedro
 */
public class ModeloControle implements IModeloControle {

    IModeloDao modeloPersistencia = null;
    public ModeloControle(){
        this.modeloPersistencia = new ModeloDao();
    }

    private boolean buscarModelo(String descricao) throws Exception {
        try {
            ArrayList<Modelo> listagem = modeloPersistencia.listagem();
            Iterator<Modelo> lista = listagem.iterator();
            while (lista.hasNext()) {
                Modelo aux = lista.next();
                if (aux.getDescricao().equalsIgnoreCase(descricao)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void incluir(Modelo objeto) throws Exception {
         if(buscarModelo(objeto.getDescricao())){
            throw new Exception("Modelo já foi cadastrada");
        }
        modeloPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Modelo objeto) throws Exception {
        if(buscarModelo(objeto.getDescricao()))  {
             throw new Exception("Modelo já foi cadastrada");
        }
        String descricao = objeto.getDescricao();
        if("".equals(descricao)){
            throw new Exception("Digite a Descrição");
        }
        modeloPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Modelo> listagem() throws Exception {
        return modeloPersistencia.listagem();
    }

    @Override
    public String buscar(Modelo objeto) throws Exception {
        return null;
    }

}
