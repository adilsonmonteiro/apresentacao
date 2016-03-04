/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import ConexaoBancoDados.Conexao;
import Modelos.ModeloCidade;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Valmir
 */ 
public class ControleCidade {

    Conexao conectaCidade = new Conexao();

    public void inserirCidade(ModeloCidade mod) {
        conectaCidade.conexaoBanco();

        try {
            PreparedStatement pst = conectaCidade.con.prepareStatement(""
                    + "insert into cidade(nomeCidade,cidade_estado) values "
                    + "(?,?) ");
            pst.setString(1,mod.getNome());
            pst.setInt(2,mod.getCod_estado());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterados com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"\nErro ao Inserir");
           

        }
    }

}
