/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a3projeto;

/**
 *
 * @author simone.alves
 */

import java.util.Date;

public class AlimentoNaoPerecivel {
    

    private String nome;
    private Date dataValidade;
    private String embalagem;
    private double quantidade;
    private String responsavelEstoque;
    private String registrodeSaide;
    private String alimentosEmFalta;
    

    public AlimentoNaoPerecivel(String nome, Date dataValidade, String embalagm, double quantidade,String responsavelestoque, 
           String registrodeSaide, String alimentosEmFalta) {
        
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.embalagem = embalagem;
        this.quantidade = quantidade;
        this.responsavelEstoque = responsavelEstoque;
        this.registrodeSaide = registrodeSaide;
        this.alimentosEmFalta = alimentosEmFalta;
    }

    // Usando o metodos get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
    public String getEmgalagem() {
        return embalagem;
    }
    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }
    public double getQuantidade() {
        return quantidade;
    }
    public void setquantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    public String getresponsavelEstoque() {
        return responsavelEstoque;
}
    public void setresponsavelEstoque(String responsavelEstoque) {
        this.responsavelEstoque = responsavelEstoque;
    }
    public String getregistrodeSaide() {
        return registrodeSaide;
    }
    public void setregistrodeSaide(String registrodeSaide) {
        this.registrodeSaide = registrodeSaide;
    }
    public String getalimentosEmFalta() {
        return alimentosEmFalta;
    }
    public void setalimentosEmFalta(String alimentosEmFalta) {
        this.alimentosEmFalta = alimentosEmFalta;
    }

}



