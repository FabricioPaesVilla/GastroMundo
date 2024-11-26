/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.sp.GastroMundo.dao;

import br.senac.sp.GastroMundo.modelo.ModeloCadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Casa
 */
public class LoginDAO {

    private Connection conexao;
    private String sql;
    private PreparedStatement stmt;

    public LoginDAO(Connection conexao) {
        
        this.conexao = conexao;
    }

    public void inserir(ModeloCadastro cadastro) throws SQLException {
        sql = "insert into login(nome, senha, cpf) values (?, ?, ?)";
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, cadastro.getNome());
        stmt.setString(2, cadastro.getSenha());
        stmt.setString(3, cadastro.getCpf());
        stmt.execute();
        stmt.close();
    }

    public Boolean buscar(String cpf, String senha) throws SQLException {
        
        sql = "SELECT * FROM login WHERE cpf = ? AND senha = ?";
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, cpf);
        stmt.setString(2,senha);
        ResultSet rs = stmt.executeQuery();
        boolean a = rs.next();
        stmt.close();
        return a;
        
        /*
        ModeloCadastro cadastro = new ModeloCadastro();
        cadastro.setCpf(rs.getString("cpf"));
        cadastro.setSenha(rs.getString("senha"));
        rs.close();
        Boolean x; 
        if (cadastro.getCpf() == cpf && cadastro.getSenha() == senha) {
        x = true;
        }
        return ;
         */
    }

}
