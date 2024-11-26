package br.senac.sp.GastroMundo.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static Connection conexao;

    public static Connection getConexao() {
        if (conexao == null) {
            try {
                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/GastroMundo", "root", "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conexao;
    }
}
