/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a3projeto;

/**
 *
 * @author simone.alves
 */
    public class Pessoa {
    
    
    private String nome;
    private int CPF;
    private int idade;
    private String telefone;
    private String endereçoantigo;
        
    public Pessoa(String nome, int idade, int cpf, String telefone, String endereçoantigo) {
        this.nome = nome;
        this.CPF = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.endereçoantigo = endereçoantigo;
    }
    // metodo do objeto pessoa: nome, cpf, idade, telefone e endereco antigo
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCPF() {
        return CPF;
    }
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    public int getidade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereçoAntigo() {
        return endereçoantigo;
    }
    public void setEmail(String enderecoantigo) {
        this.endereçoantigo = enderecoantigo;
    }
}


