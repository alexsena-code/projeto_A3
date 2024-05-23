
package com.mycompany.a3projeto;

import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
           
        do {
        System.out.println("------------------------Bem Vindo ao Sistema de Gerenciamento de Abrigos------------------------");
        System.out.println("|------------------------|");
        System.out.println("| Opcao 1 - Cadastrar");
        System.out.println("| Opcao 2 - Procurar");
        System.out.println("| Opcao 3 - Listar");
        System.out.println("| Opcao 4 - Sair");
        System.out.println("|------------------------|");
        System.out.print("Digite uma opcao: ");
        opcao = entrada.nextInt();
        
        switch (opcao) {
        case 1:
            RegistroDAO registroDAO = new RegistroDAO();

                Abrigo abrigo = new Abrigo();
                abrigo.setNome("Luz Esperança");
                abrigo.setCNPJ("465214330001932");
                abrigo.setContato("51982448720");
                abrigo.setEndereco("Avenida Major Carlos Pinto, 40");
            registroDAO.cadastrarAbrigo(abrigo);
              
        break;
        
        case 2:
            
        break;
        
        case 3:
            GeradorDeAbrigos.exibirTabelaDeAbrigos();
          
        default:
                System.out.println("Valor Inserido inválido");
        }
        } while (opcao !=4);
        System.out.println("Encerrando o Programa...");
        System.out.println("------------------------------------------------------------------------");
        entrada.close();
        
        
    }
}
