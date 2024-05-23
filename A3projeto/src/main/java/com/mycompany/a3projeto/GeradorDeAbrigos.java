/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a3projeto;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexa
 */
public class GeradorDeAbrigos {

    // ... (outros imports e constantes) ...

    public static void main(String[] args) {
            RegistroDAO registroDAO = new RegistroDAO();

            String[] nomes = {"Arca de Noé", "Titanic", "Luz do Sul", "Aconchego Seguro", "Abrigo dos Anjos", "Abrigo Esperança", "Luz da Esperança"};
            String[] cnpjs = {"46521433000193", "60279252000123", "63835274000110", "65430382000139", "42016047000193", "35036296000185", "45002460000197"};
            String[] contatos = {"(51) 9999-9999", "(51) 9888-8888", "(51) 9777-7777", "(51) 9666-6666", "(51) 9555-5555", "(51) 9444-4444", "(51) 9333-3333"};
            String[] endereco = {"Rua Pele, 32", "Avenida Major Carlos Pinto, 40","Rua Eugênio Eriberto Snell, 48","Rua Maria Natalícia da Silva, 50","Rua Amália Figueiroa, 93","Rua Carlos Monserrat, 80", "Rua Julio Monserrat, 50"}; // Endereço fixo (opcional)

            for (int i = 0; i < nomes.length; i++) {
                Abrigo abrigo = new Abrigo();
                abrigo.setNome(nomes[i]);
                abrigo.setCNPJ(cnpjs[i]);
                abrigo.setContato(contatos[i]);
                abrigo.setEndereco(endereco[i]); // Endereço fixo (opcional)

                // Personalização opcional de outros atributos (opcional)
                // abrigo.setCapacidade(50); // Exemplo de personalização
                // abrigo.setTipoAnimais("Cães e Gatos"); // Exemplo de personalização

            registroDAO.cadastrarAbrigo(abrigo);
            
            
    }   
        }
    public static void exibirTabelaDeAbrigos() {
            RegistroDAO registroDAO = new RegistroDAO();
            List<Abrigo> abrigos = registroDAO.getAbrigos();

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Codigo");
            model.addColumn("Nome");
            model.addColumn("Endereço");
            model.addColumn("Contato");
            model.addColumn("CNPJ");

            for (Abrigo abrigo : abrigos) {
                model.addRow(new Object[]{abrigo.getCodAbrigo(), abrigo.getNome(), abrigo.getEndereco(), abrigo.getContato(), abrigo.getCNPJ()});
            }

            JTable table = new JTable(model);

            // Crie um painel para exibir a tabela
            JPanel panel = new JPanel();
            panel.add(new JScrollPane(table));

            // Crie um quadro para exibir o painel
            JFrame frame = new JFrame("Tabela de Abrigos");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
    }
}




    
