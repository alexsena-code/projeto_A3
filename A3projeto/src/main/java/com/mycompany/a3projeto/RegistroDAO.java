/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a3projeto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistroDAO {
        
    public void cadastrarAbrigo(Abrigo abrigo) {
        String sql = "INSERT INTO ABRIGO (NOME, ENDERECO, CONTATO, CNPJ, CAPACIDADE_MAX, TX_DE_OCUPACAO)VALUES (?,?,?,?,?,?)";
        
        PreparedStatement ps = null;
        
        try { 
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1,abrigo.getNome());
            ps.setString(2,abrigo.getEndereco());
            ps.setString(3,abrigo.getContato());
            ps.setInt(4,abrigo.getCapacidadeMax());
            ps.setString(5,abrigo.getCNPJ());
            ps.setDouble(6,abrigo.getTx_Ocupacao());
            
            ps.execute();
            ps.close();
        } catch (SQLException e) { 
            e.printStackTrace ();
        }
    
    }
    
}
