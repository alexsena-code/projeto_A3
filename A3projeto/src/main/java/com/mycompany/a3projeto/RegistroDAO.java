package com.mycompany.a3projeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class RegistroDAO {

    public void cadastrarAbrigo(Abrigo abrigo) throws MensagemDeErroCustomizada {
        //String para armazenar comando SQL que vai tá dando INSERT(Inserindo) nos atributos da tabela no banco de dados mysql
        String sql = "INSERT INTO ABRIGOS (CODABRIGO, NOME, ENDERECO, CONTATO, CNPJ) VALUES (?,?,?,?,?)";
        PreparedStatement ps = null;

        try {
            // Criação do prepareStatement, para executar uma query
            Connection conn = Conexao.getConexao();
            ps = conn.prepareStatement(sql);
            // Adicionar os valores que são esperados pela query
            ps.setInt(1, abrigo.getCodAbrigo());
            ps.setString(2, abrigo.getNome());
            ps.setString(3, abrigo.getEndereco());
            ps.setString(4, abrigo.getContato());
            ps.setString(5, abrigo.getCNPJ());
            // Executar a query
            ps.execute();
        } catch (SQLException e) {
            //Tratar a mensagem de erro caso o CNPJ já esteja cadastrado, já q o banco de dados só está aceitando um CNPJ por table, coloquei como valor UNIQUE
            if (e instanceof java.sql.SQLIntegrityConstraintViolationException) {
                throw new MensagemDeErroCustomizada("Erro - O CNPJ: " + abrigo.getCNPJ() + " ja esta cadastrado no sistema.");
            } else {
                throw new MensagemDeErroCustomizada("Erro ao cadastrar o abrigo: " + e.getMessage());
            }
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    
    }
    public List<Abrigo> getAbrigos (){
        // String para armzenar comando SQL que vai selecionar a table ABRIGOS para
        String sql = "SELECT * FROM abrigos";
        
        List<Abrigo> abrigos = new ArrayList<>();
        
        Conexao conn = null;
        PreparedStatement ps = null;
        //Classe que puxa os dados do banco.
        ResultSet rset = null;
            
            try{
               
                ps = Conexao.getConexao().prepareStatement(sql);
                //result set
                rset = ps.executeQuery();
                
                while (rset.next()) {                    
                    Abrigo abrigo = new Abrigo();
                    
                    //Recuperar o id
                abrigo.setCodAbrigo(rset.getInt("codAbrigo"));
                    //Recuperar o Nome
                abrigo.setNome(rset.getString("nome"));
                    //Recuperar o Endereço
                abrigo.setEndereco(rset.getString("endereco"));
               
                    //recuperar o Contato
                abrigo.setContato(rset.getString("contato"));
                
                    //Recuperar o CNPJ
                abrigo.setCNPJ(rset.getString("CNPJ"));
                    
                    // adicionar os valores recuperados em abrigo
                abrigos.add(abrigo);
                }

                //Tratamento de erro
            }catch (Exception e) {
                e.printStackTrace();
            }finally {
                try {
                    if(rset!=null) {
                        rset.close();
                    }
                    if(ps!=null) {
                        ps.close();
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
                return abrigos;
                           }
    
}
        public void cadastrarPessoa(Pessoa pessoa) {
        String sql = "INSERT INTO PESSOAS (NOME, IDADE, TELEFONE, CPF, GENERO, NECESSIDADESESPECIAIS)VALUES (?,?,?,?,?,?)";
        
        PreparedStatement ps = null;
        
        try { 
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1,pessoa.getNome());
            ps.setInt(2,pessoa.getIdade());
            ps.setString(3,pessoa.getTelefone());
            ps.setString(4,pessoa.getCPF());
            ps.setString(5,pessoa.getGenero());
            ps.setString(6,pessoa.getNecessidadesEspeciais());
            
            
            ps.execute();
            ps.close();
        } catch (SQLException e) { 
            e.printStackTrace ();
        }
    
    }
        public class MensagemDeErroCustomizada extends Exception {
            public MensagemDeErroCustomizada(String mensagemDeErro) {
        super(mensagemDeErro);
    }
}
    
}
