/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a3projeto;

/**
 *
 * @auth@author simone.alves
 */
import java.util.ArrayList;
import java.util.Date;

    public class DoacaoEmAbrigo {
    
    
    private String nome;
    private String descricao;
    private Date dataValidade;
    private int quantidade;
    private String responsavelEstoque;
    private String registrodeSaide;
    private boolean emFalta;
    
    // Metodo construtor
    public DoacaoEmAbrigo (String nome, String descricao, Date dataValidade, int quantidade,String responsavelEstoque, 
            String registrodeSaide, boolean EmFalta) {
        
        this.nome = nome;
        this.descricao = descricao;
        this.dataValidade = dataValidade;
        this.quantidade = quantidade;
        this.responsavelEstoque = responsavelEstoque;
        this.registrodeSaide = registrodeSaide;
        this.emFalta = false;
    }

    // Usando o metodo get e set
    public String getNome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
public Date getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
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
    public boolean getEmFalta() {
        return emFalta;
    }
    public void setemFalta(String EmFalta) {
        this.emFalta = emFalta;
    }
    
     // Armazenamento das doações Utilizando o ArrayList
    public static void main(String[] args) {
       
        ArrayList<DoacaoEmAbrigo> doacoes = new ArrayList<>();

        // Doações
        
    
        DoacaoEmAbrigo doacao1 = new DoacaoEmAbrigo("Comida", "Pacote de feijao", new Date(), 100, "Maria", "Saída 456", true);

        DoacaoEmAbrigo doacao2 = new DoacaoEmAbrigo("Medicacao", "Caixa dipirona", new Date(), 50, "Marcos", "Saída 10", false);
        
        DoacaoEmAbrigo doacao3 = new DoacaoEmAbrigo("Agua", "Galao de agua", new Date(), 100, "Joao", "Saída 00", true);
        
        DoacaoEmAbrigo doacao4 = new DoacaoEmAbrigo("Roupa", "Roupa de inverno", new Date(), 50, "Joao", "Saída 123", false);
        
        // As doações à lista
        doacoes.add(doacao1);
        doacoes.add(doacao2);

      
        for (DoacaoEmAbrigo doacao : doacoes) {
            System.out.println("Nome: " + doacao.getNome());
            System.out.println("Descrição: " + doacao.getDescricao());
            System.out.println("Data de validade: " + doacao.getDataValidade());
            System.out.println("Quantidade: " + doacao.getQuantidade());
            System.out.println("Responsável pelo estoque: " + doacao.getresponsavelEstoque());
            System.out.println("Registro de saída: " + doacao.getregistrodeSaide());
            System.out.println("Em falta: " + doacao.getEmFalta());
            System.out.println();
            
        }
    }

 
    
}

 