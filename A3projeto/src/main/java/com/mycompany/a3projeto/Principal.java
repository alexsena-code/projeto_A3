/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.a3projeto;

public class Principal {

    public static void main(String[] args) {
            
            Pessoa pessoa01 = new Pessoa();
            pessoa01.setNome("Maria José");
            pessoa01.setCPF("08196654950");
            pessoa01.setGenero("Masc");
            pessoa01.setIdade(20);
            pessoa01.setNecessidadesEspeciais("Remédio de Pressão");
            pessoa01.setTelefone("71999551134");
            
            new RegistroDAO().cadastrarPessoa(pessoa01);
    }
}
