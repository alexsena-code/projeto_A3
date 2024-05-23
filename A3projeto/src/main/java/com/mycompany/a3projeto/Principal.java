package com.mycompany.a3projeto;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Criar Objeto Scanner para ler entrada de dados do usúario//
        Scanner entrada = new Scanner(System.in);
        int opcao;
        //Usando o metódo gerarAbrigo da classe GeradorDeAbrigos para geração de objetos de exemplos

        GeradorDeAbrigos.gerarAbrigo();

        // Loop Principal do Menu
        do {
            // Exibir Menu na Tela
            System.out.println("------------------------Bem Vindo ao Sistema de Gerenciamento de Abrigos------------------------");
            System.out.println("|------------------------|");
            System.out.println("| Opcao 1 - Cadastrar");
            System.out.println("| Opcao 2 - Procurar");
            System.out.println("| Opcao 3 - Listar");
            System.out.println("| Opcao 4 - Sair");
            System.out.println("|------------------------|");
            System.out.print("Digite uma opcao: ");

            opcao = entrada.nextInt();

            entrada.nextLine(); //Consumir a quebra de Linhaa

            //Usando Switch para tomada de decisão no Menu
            switch (opcao) {
                case 1:
                    // Chamar Método para cadastrar um novo Abrigo
                    Menu.cadastrarAbrigo(entrada);

                    break;

            case 2:
                //Buscar abrigo por CNPJ
                String CNPJ;
                String rCNPJ = "";
                int rConfirma = 0;
                // Loop para fazer o pedido do CNPJ e fazer a Confirmação
                do {
                    System.out.println("Digite o CNPJ do Abrigo que você deseja Procurar: ");
                    rCNPJ = entrada.nextLine();
                    System.out.println("CNPJ  : " + rCNPJ);
                    System.out.println("| Opcao 1 - Confirmar");
                    System.out.println("| Opcao 2 - Alterar ");
                    rConfirma = entrada.nextInt();
                    if (rConfirma == 1) {
                        CNPJ = rCNPJ;

                    } else if (rConfirma == 2) {
                        System.out.println("Digite o nome do Abrigo: ");
                        entrada.next();
                        CNPJ = entrada.nextLine();
                    }

                    if (rConfirma != 1 && rConfirma != 2) {
                        System.out.println("Opcao invalida. Digite 1 para confirmar ou 2 para alterar.");
                    }
                } while (rConfirma < 1 || rConfirma > 2);
                //Uso do método consultaCNPJ na classe BuscarDados para fazer a consulta do objeto usando o  Atributo CNPJ
                BuscarDados.consultaCNPJ(rCNPJ);
                break;

            case 3:
                //Uso do método exibirTabeladeAbrigos na classe geradorDeAbrigos, Listar os objetos numa table usando Jtable
                GeradorDeAbrigos.exibirTabelaDeAbrigos();
                break;

            case 4:
                //Mensagem de Despedida
                System.out.println("Obrigado por usar o Sistema de Gerenciamento de Abrigos. Ate a proxima!");
                break;

            default:
                //Mensagem de Erro para opção Inválida
                System.out.println("Valor Inserido invalido");
        }
        } while (opcao != 4);
        System.out.println("Encerrando o Programa...");
        System.out.println("------------------------------------------------------------------------");
        entrada.close();

    }
}
