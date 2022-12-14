/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

/**
 *
 * @author pedro
 */
public class Devolucao {
    
    private int id;
    private Locacao locacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }
    private String urlUm;
    private String urlDois;
    private String urlTres;
    private String urlQuatro;
    private float valorTotal;
    private float valoresDeMulta;
    private float valorLocado;

    public float getValorLocado() {
        return valorLocado;
    }

    public void setValorLocado(float valorLocado) {
        this.valorLocado = valorLocado;
    }

    public Devolucao() {
    }

    public Devolucao(int id,Locacao locacao ,String urlUm, String urlDois, String urlTres, String urlQuatro, float ValorTotal, float ValoresDeMulta, float valorLocado) {
        
        this.id = id;
        this.locacao = locacao;
        this.urlUm = urlUm;
        this.urlDois = urlDois;
        this.urlTres = urlTres;
        this.urlQuatro = urlQuatro;
        this.valorTotal = ValorTotal;
        this.valoresDeMulta = ValoresDeMulta;
        this.valorLocado = valorLocado;
    }

    public String getUrlUm() {
        return urlUm;
    }

    public void setUrlUm(String urlUm) {
        this.urlUm = urlUm;
    }

    public String getUrlDois() {
        return urlDois;
    }

    public void setUrlDois(String urlDois) {
        this.urlDois = urlDois;
    }

    public String getUrlTres() {
        return urlTres;
    }

    public void setUrlTres(String urlTres) {
        this.urlTres = urlTres;
    }

    public String getUrlQuatro() {
        return urlQuatro;
    }

    public void setUrlQuatro(String urlQuatro) {
        this.urlQuatro = urlQuatro;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float ValorTotal) {
        this.valorTotal = ValorTotal;
    }

    public float getValoresDeMulta() {
        return valoresDeMulta;
    }

    public void setValoresDeMulta(float ValoresDeMulta) {
        this.valoresDeMulta = ValoresDeMulta;
    }

    @Override
    public String toString() {
        return urlUm + ";" + urlDois + ";" + urlTres + ";" + urlQuatro + ";" + Float.toString(valorTotal) + ";" + Float.toString(valoresDeMulta)+ ";" + Float.toString(valorLocado);
    }
    
    
    
    
}
