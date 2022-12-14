/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;
import com.locagyn.modelos.Categoria;
import com.locagyn.persistencia.CategoriaDao;
import com.locagyn.persistencia.ICategoriaDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author emilly
 */
public class CategoriaControle implements ICategoriaControle{
     ICategoriaDao categoriaPersistencia = null;

    public CategoriaControle() {
        this.categoriaPersistencia = new CategoriaDao();
    }

    private boolean buscarCategoria(String descricao) throws Exception {
      try {
            ArrayList<Categoria> listagem = categoriaPersistencia.listagem();
            Iterator<Categoria> lista = listagem.iterator();
            while (lista.hasNext()) {
                Categoria aux = lista.next();
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
    public void incluir(Categoria objeto) throws Exception {
        if (buscarCategoria(objeto.getDescricao())) {
            throw new Exception("Categoria já foi cadastrada");
        }

        if ("".equals(objeto.getDescricao().replace(" ", ""))) {
            throw new Exception("Digite a Descrição");
        }
         if (objeto.getValorDaLocacao()==0) {
           throw new Exception("Digite o Valor da Locação");
        }

        categoriaPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Categoria objeto) throws Exception {
        if (buscarCategoria(objeto.getDescricao())) {
            throw new Exception("Categoria já foi cadastrada");
        }
        if ("".equals(objeto.getDescricao().replace(" ", ""))) {
            throw new Exception("Digite a Descrição");
        }
         if (objeto.getValorDaLocacao()==0) {
           throw new Exception("Digite o Valor da Locação");
        }

      
        categoriaPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Categoria> listagem() throws Exception {
        return categoriaPersistencia.listagem(); // Generated from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void buscar(String marca) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Categoria buscar(int id) throws Exception {
        return categoriaPersistencia.buscar(id);
    }
    
    
}
