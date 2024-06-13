package com.castelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.castelo.conexao.Conexao;
import com.castelo.Equipamento.Equipamento;

public class EquipamentoDAO {

    public void cadastrarEquipamento(EquipamentoPojo EquipamentoPojo) {
        Conexao conexao = new Conexao ();
        String sql = "Insert into Equipamento(nome, SesetSetor, setQuantidade) values (?, ?, ?)";
        PreparedStatement ps = null;       
            try {
                ps = conexao.getConexao().prepareStatement(sql);

                
                ps.setString(1, EquipamentoPojo.getNome());
                ps.setString(2, EquipamentoPojo.getSesetSetor());
                ps.setInt(3, EquipamentoPojo.getsetQuantidade());

                ps.execute();
                ps.close();

                System.out.println("Dados inseridos com sucesso");
                
            } catch (Exception e) {                
                e.printStackTrace();
                System.out.println("Ocorreu um erro com os dados.");
            }
    }


    public void consultarEquipamento(EquipamentoPojo EquipamentoPojo) {
        Conexao conexao = new Conexao ();
        PreparedStatement ps = null;
        ResultSet resultSet = null;       
        String sql = "SELECT * FROM Equipamento WHERE id = ?";
            try {
                ps = conexao.getConexao().prepareStatement(sql);

                
                ps.setInt(1, EquipamentoPojo.getId());             

                resultSet = ps.executeQuery(sql);
            
                while (resultSet.next()) {
                   EquipamentoPojo.setId(resultSet.getInt(1));
                   EquipamentoPojo.setNome(resultSet.getString(2));
                   EquipamentoPojo.setSetor(resultSet.getString(3));
                   EquipamentoPojo.setQuantidade(resultSet.getInt(4));

                  /*Equipamento Equipamento = new Equipamento();
                    Equipamento.setId(id);
                    Equipamento.setNome(nome);
                    Equipamento.setSetor(SesetSetor);
                    Equipamento.setQuantidade(setQuantidade);*/


                    
                } 

                

                ps.close();

                System.out.println("Dados consultados com sucesso");
                
            } catch (Exception e) {                
                e.printStackTrace();
                System.out.println("Ocorreu um erro com os dados.");
            }
    }
}