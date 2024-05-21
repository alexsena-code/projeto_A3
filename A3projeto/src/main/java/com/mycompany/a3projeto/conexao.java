package com.mycompany.a3projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
        // Criação de Variáveis usadas para conexão do Banco de Dados // 
    private static final String url = "jdbc:mysql://localhost:3306/a3db";
    private static final String user = "admin";
    private static final String password = "1234";
        
        private static Connection conn;
        // Método usando para conexão do banco de dados 
        public static  Connection getConexao(){
            try { 
                if(conn == null){ 
                   conn = DriverManager.getConnection(url,user,password);
                    return conn;
                } else {
                    return conn;
                }
            } catch(SQLException e ) { 
                e.printStackTrace();
                return null;
            }
        }
}
    