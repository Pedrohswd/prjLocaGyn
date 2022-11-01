/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Marca;
import com.locagyn.modelos.Modelo;
import com.locagyn.persistencia.IMarcaDao;
import com.locagyn.persistencia.MarcaDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pedro
 */
public class MarcaControle implements IMarcaControle {

    IMarcaDao marcaPersistencia = null;

    public MarcaControle() {
        this.marcaPersistencia = new MarcaDao();
    }

    private boolean buscarMarca(String descricao) throws Exception {
      try {
            ArrayList<Marca> listagem = marcaPersistencia.listagem();
            Iterator<Marca> lista = listagem.iterator();
            while (lista.hasNext()) {
                Marca aux = lista.next();
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
    public void incluir(Marca objeto) throws Exception {
        if (buscarMarca(objeto.getDescricao())) {
            throw new Exception("Marca já foi cadastrada");
        }

        if ("".equals(objeto.getDescricao().replace(" ", ""))) {
            throw new Exception("Digite a Descrição");
        }

        if ("".equals(objeto.getUrl().replace(" ", ""))) {
            throw new Exception("Selecione Uma Imagem");
        }

        marcaPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Marca objeto) throws Exception {
        if (buscarMarca(objeto.getDescricao())) {
            throw new Exception("Marca já foi cadastrada");
        }
        if ("".equals(objeto.getDescricao().replace(" ", ""))) {
            throw new Exception("Digite a Descrição");
        }

        if ("".equals(objeto.getUrl().replace(" ", ""))) {
            throw new Exception("Selecione Uma Imagem");
        }
        marcaPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Marca> listagem() throws Exception {
        return marcaPersistencia.listagem(); // Generated from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void buscar(String marca) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Marca buscar(int id) throws Exception {
        return marcaPersistencia.buscar(id);
    }

}
