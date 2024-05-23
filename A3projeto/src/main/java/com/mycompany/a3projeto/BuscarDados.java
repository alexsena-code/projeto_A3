/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a3projeto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarDados {

    public static void consultaCNPJ(String CNPJ) {
        // String para armazenar a consulta SQL

        String sql = "SELECT * FROM abrigos WHERE CNPJ = ?";

        Conexao conn = null;
        PreparedStatement ps = null;

        ResultSet rset = null;

        try {
            // Obter conexao com  o banco de dados
            ps = Conexao.getConexao().prepareStatement(sql);
            // substituir o ? no preparedStatement pelo CNPJ informado
            ps.setString(1, CNPJ);
            rset = ps.executeQuery();
            //Verificar se encontrou algum registoro
            while (rset.next()) {
                //Extrair os dados do resultado da consulta o while vai rodar até não ter mais resultados
                String nome = rset.getString("nome");
                CNPJ = rset.getString("CNPJ");
                String contato = rset.getString("contato");
                String endereco = rset.getString("endereco");
                int codAbrigo = rset.getInt("codAbrigo");
                
                // Exibir os dados do abrigo consultado
                System.out.println("Nome: " + nome);
                System.out.println("CNPJ: " + CNPJ);
                System.out.println("Contato: " + contato);
                System.out.println("Endereco" + endereco);
                System.out.println("Codigo do  Abrigo: " + codAbrigo);
            }
            
            //Fechar o ReultSet
            rset.close();
            ps.close();
            
        } catch (SQLException e) {
            // Exibir mensagem de erro caso ocorra uma execção de SQL
            e.printStackTrace();
        } finally {
            // Fechar os recursos de conexão com o banco de dados
            try {
                if (rset != null) {
                    rset.close();
                }
                if (ps != null) {
                    ps.close();
                }
            // Exibir mensagem de erro caso ocorra uma exceção de SQL ao fechar os recursos
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
