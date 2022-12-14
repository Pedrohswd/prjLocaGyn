/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.enumeracao.TipoDeCliente;
import com.locagyn.modelos.Cliente;
import com.locagyn.modelos.Devolucao;

/**
 *
 * @author pedro
 */
public interface IDevolucaoDao {
    
    void incluir(Devolucao objeto) throws Exception;
    
}
