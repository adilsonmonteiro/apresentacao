/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBancoDados;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Valmir
 */
public class Conexao {

    private String sql;
    private String caminho = "jdbc:mysql://localhost:3306/emprestimo";
    private String usuario = "root";
    private String senha = "mysql";
    public Connection con;
    public Statement stm;
    public ResultSet rs;
    //public String Driver = "org.mysql.Driver";

    public void executaSQL(String sql) {
      try {
            stm =  con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro do método executaSQL");
        }
    }


   

    public void conexaoBanco() {

        try {
            //System.setProperty("jdbc.Drivers",Driver);
            con = DriverManager.getConnection(caminho, usuario, senha);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na Conexao");
            e.printStackTrace();
        }

    }

    public void desconectaConexao() {
        try {
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Desconectar");
        }
    }

}
