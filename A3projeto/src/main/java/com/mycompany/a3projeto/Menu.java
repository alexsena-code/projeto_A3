/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a3projeto;

import com.mycompany.a3projeto.RegistroDAO.MensagemDeErroCustomizada;
import java.util.Scanner;


public class Menu {
    public static void cadastrarAbrigo (Scanner entrada) {
       // Variável para Armazenar o nome do Abrigo 
        String rNome;
       
        //Variável para usar como confirmação de input
        int rConfirma = 0;
       
        // Criar Objeto registroDAO para acesso do banco de dados
        RegistroDAO registroDAO = new RegistroDAO();
       
        // Criar Objeto Abrigo para armazenar os dados do abrigo
        Abrigo abrigo = new Abrigo();
        
        // Loop para obter e validar o nome do abrigo
            do {
                System.out.println("Digite o nome do Abrigo: ");
                rNome = entrada.nextLine();
                System.out.println("Nome do Abrigo : " + rNome );
                System.out.println("| Opcao 1 - Confirmar");
                System.out.println("| Opcao 2 - Alterar "); 
                rConfirma = entrada.nextInt();
                if (rConfirma == 1) {
                    abrigo.setNome(rNome);
                
                }
                else if (rConfirma == 2){
                    System.out.println("Digite o nome do Abrigo: ");
                    entrada.next();
                    rNome = entrada.nextLine();
                }

                if (rConfirma != 1 && rConfirma != 2) {
                    System.out.println("Opcao invalida. Digite 1 para confirmar ou 2 para alterar.");
                }
            } while (rConfirma < 1 || rConfirma > 2);
            
         // Loop para obter e validar o Endereço do Abrigo
            do {
                System.out.println("Digite o Endereco do Abrigo: ");
                entrada.nextLine();
                String rEndereco = entrada.nextLine();
                System.out.println("Endereco : " + rEndereco );
                System.out.println("| Opcao 1 - Confirmar");
                System.out.println("| Opcao 2 - Alterar "); 
                rConfirma = entrada.nextInt();
                if (rConfirma == 1) {
                    abrigo.setEndereco(rEndereco);
                }
                else if (rConfirma == 2){
                    System.out.println("Digite o Endereco do Abrigo: ");
                    entrada.next();
                    rEndereco = entrada.nextLine();
                }
                if (rConfirma != 1 && rConfirma != 2) {
                    System.out.println("Opcao invalida. Digite 1 para confirmar ou 2 para alterar.");
                }
            } while (rConfirma < 1 || rConfirma > 2);
        // Loop para obter e validar o Contato do abrigo
            do {
                System.out.println("Digite o Contato: ");
                entrada.nextLine();
                String rContato = entrada.nextLine();
                System.out.println("Contato : " + rContato );
                System.out.println("| Opcao 1 - Confirmar");
                System.out.println("| Opcao 2 - Alterar "); 
                rConfirma = entrada.nextInt();
                if (rConfirma == 1) {
                    abrigo.setContato(rContato);
                }
                else if (rConfirma == 2){
                    System.out.println("Digite o Contato: ");
                    entrada.next();
                    rContato = entrada.nextLine();
                }
                if (rConfirma != 1 && rConfirma != 2) {
                    System.out.println("Opcao invalida. Digite 1 para confirmar ou 2 para alterar.");
                }
            } while (rConfirma < 1 || rConfirma > 2);
        // Loop para obter e validar o CNPJ
            do {
                System.out.println("Digite o CNPJ: ");
                entrada.nextLine();
                String rCNPJ = entrada.nextLine();
                System.out.println("Contato : " + rCNPJ );
                System.out.println("| Opcao 1 - Confirmar");
                System.out.println("| Opcao 2 - Alterar "); 
                rConfirma = entrada.nextInt();
                if (rConfirma == 1) {
                    abrigo.setCNPJ(rCNPJ);
                }
                else if (rConfirma == 2){
                    System.out.println("Digite o CNPJ: ");
                    entrada.next();
                    rCNPJ = entrada.nextLine();
                }
                if (rConfirma != 1 && rConfirma != 2) {
                    System.out.println("Opcao invalida. Digite 1 para confirmar ou 2 para alterar.");
                }
            } while (rConfirma < 1 || rConfirma > 2);
            // Aqui nós tentamos Cadastrar o Abrigo, mostrando uma mensagem de abrigo cadastrado com sucesso concatenando com o nome inserido pelo Usuário
            try {
            registroDAO.cadastrarAbrigo(abrigo);
            System.out.println("Abrigo cadastrado com sucesso: " + rNome);
            // Caso dê erro nós mostramos uma mensagem customizada ( Criei esse método pq coloquei Unique no atributo CNPJ no banco de dados) 
        } catch (MensagemDeErroCustomizada e) {
            System.out.println(e.getMessage());
            
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
} 
}
