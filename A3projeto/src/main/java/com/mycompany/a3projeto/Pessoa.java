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
    private int codigo;
    private String nome;
    private String CPF;
    private int idade;
    private String telefone;
    private String genero; 
    private String necessidadesEspeciais;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
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

  
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNecessidadesEspeciais() {
        return necessidadesEspeciais;
    }

    public void setNecessidadesEspeciais(String necessidadesEspeciais) {
        this.necessidadesEspeciais = necessidadesEspeciais;
    }
   } 
     /*   
    public Pessoa(String nome, int idade, int cpf, String telefone, String endereçoantigo) {
        this.nome = nome;
        this.CPF = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.endereçoantigo = endereçoantigo;
    }
    */
    // metodo do objeto pessoa: nome, cpf, idade, telefone e endereco antigo
    