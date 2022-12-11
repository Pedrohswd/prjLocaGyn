/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

import java.util.Date;

/*
         *
         * @author pedro
 */

public class Motorista {

    private int id;
    private String nome;
    private String url;
    private int numeroRegistro;
    private String categoriaCNH;
    private String validade;
    private Telefone telefone;
    private Endereco endereco;

    public Motorista() {
    }

    public Motorista(int id, String nome, String url, int numeroRegistro, String categoriaCNH, String validade, Telefone telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.url = url;
        this.numeroRegistro = numeroRegistro;
        this.categoriaCNH = categoriaCNH;
        this.validade = validade;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public Motorista(int id, String nome, String url, int numeroRegistro, String categoriaCNH, String validade) {
        this.id = id;
        this.nome = nome;
        this.url = url;
        this.numeroRegistro = numeroRegistro;
        this.categoriaCNH = categoriaCNH;
        this.validade = validade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getCategoriaCNH() {
        return categoriaCNH;
    }

    public void setCategoriaCNH(String categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + url + ";" + numeroRegistro + ";" + categoriaCNH + ";"
                + validade + ";" + telefone.toString() + ";" + endereco.toString();
    }
}
