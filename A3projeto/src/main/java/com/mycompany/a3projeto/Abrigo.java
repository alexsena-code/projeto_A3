
package com.mycompany.a3projeto;

/* Metodo construtor do objeto Abrigo, reccbendo como atributos nome, endereço, contato, CNPJ, CapcidadeMax,taxaDeoOcupação !*/
public class Abrigo {
        private int codAbrigo;
        private String nome;
        private String endereco;
        private String contato;
        private String CNPJ;
        private int capacidadeMax;
        private Double tx_Ocupacao;

        
        //Geters e Setters//


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public Double getTx_Ocupacao() {
        return tx_Ocupacao;
    }

    public void setTx_Ocupacao(Double tx_Ocupacao) {
        this.tx_Ocupacao = tx_Ocupacao;
    }

    public int getCodAbrigo() {
        return codAbrigo;
    }

    public void setCodAbrigo(int codAbrigo) {
        this.codAbrigo = codAbrigo;
    }
 
    }
