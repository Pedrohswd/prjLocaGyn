/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

/**
 *
 * @author pedro
 */
public class Modelo {

    private int id = 0;
    private String descricao = "";
    private String url = "";
    private String idMarca = "";
    private Marca marca;

    public Modelo() {
    }

    public Modelo(int id, String descricao, String url, Marca marca) {
        this.id = id;
        this.descricao = descricao;
        this.url = url;
        this.marca = marca;
    }

    public Modelo(int id, String descricao, String url) {
        this.id = id;
        this.descricao = descricao;
        this.url = url;    
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(String idMarca) {
        this.idMarca = idMarca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return id + ";" + descricao + ";" + url  + ";" + marca.getId();
    }

}
