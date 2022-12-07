/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.modelos.Acessorios;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public interface IAcessoriosDao {
    void incluir(Acessorios objeto) throws Exception;

    void alterar(Acessorios objeto) throws Exception;

    ArrayList<Acessorios> listagem() throws Exception;

    Acessorios buscar(int id) throws Exception;
    
}
