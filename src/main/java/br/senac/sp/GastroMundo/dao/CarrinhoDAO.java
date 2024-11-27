/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.sp.GastroMundo.dao;

import br.senac.sp.GastroMundo.modelo.ModeloCarrinho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Casa
 */
public class CarrinhoDAO implements InterfaceDao<ModeloCarrinho> {
    private Connection conexao;
    private String sql;
    private PreparedStatement stmt;
    
    public CarrinhoDAO(Connection conexao) {
        this.conexao = conexao;
    }
    
    public void inserir(ModeloCarrinho carrinho) throws SQLException {
        sql = "insert into carrinho(id, prato, qtd, valor) values (?, ?, ?, ?)";
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, carrinho.getId());
        stmt.setString(2, carrinho.getPrato());
        stmt.setDouble(3, carrinho.getQtd());
        stmt.setDouble(4, carrinho.getValor());
        stmt.execute();
        stmt.close();
    }
    
    public List<ModeloCarrinho> listar() throws SQLException {
		List<ModeloCarrinho> lista = new ArrayList<ModeloCarrinho>();
		sql = "select * from carrinho";
		stmt = conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			ModeloCarrinho c = new ModeloCarrinho();
			c.setId(rs.getString("id"));
			c.setPrato(rs.getString("prato"));
			c.setQtd(rs.getInt("qtd"));
                        c.setValor(rs.getDouble("valor"));
			lista.add(c);
		}
		rs.close();
		stmt.close();
		return lista;
    }
    
    public Object buscar(String prato, String text) throws SQLException {
        
        sql = "SELECT * FROM login WHERE prato = ?";
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, prato);
        Object x;
        ResultSet rs = stmt.executeQuery();
        x = rs.getString(text.toString());
        stmt.close();
        return x;
    }
    
    public void excuirTabela() throws SQLException{
        sql = "DELETE FROM carrinho";
        stmt = conexao.prepareStatement(sql);
        stmt.execute();
        
        stmt.close();
    }
}
