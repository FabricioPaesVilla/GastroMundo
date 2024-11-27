/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.sp.GastroMundo.dao;

import br.senac.sp.GastroMundo.modelo.ModeloCarrinho;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Casa
 */
public interface InterfaceDao<T> {
    public void inserir(ModeloCarrinho cadastro) throws SQLException;
    public List<ModeloCarrinho> listar() throws SQLException;
    
}
