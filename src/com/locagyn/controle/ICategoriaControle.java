/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Categoria;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public interface ICategoriaControle {
    void incluir(Categoria objeto) throws Exception;

    void alterar(Categoria objeto) throws Exception;

    ArrayList<Categoria> listagem() throws Exception;

    Categoria buscar(int id) throws Exception;
 
    
}
