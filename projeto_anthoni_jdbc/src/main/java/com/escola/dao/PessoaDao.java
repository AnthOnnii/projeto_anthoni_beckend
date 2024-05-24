package com.escola.dao;

import com.escola.modelo.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDao {
    private Connection connection;

    public PessoaDao() {
    }

    public PessoaDao(Connection connection) {
        this.connection = connection;
    }

    public void cadastrarPessoa(PessoaPojo pessoaPojo) {
        String sql = "INSERT INTO pessoas (nome, endereco, idade) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pessoaPojo.getNome());
            stmt.setString(1, pessoaPojo.getEndereco());
            stmt.setInt(2, pessoaPojo.getIdade());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Pessoa> listarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        String sql = "SELECT * FROM pessoas";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setEndereco(rs.getString("endereço"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setIdade(rs.getInt("idade"));
                pessoas.add(pessoa);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pessoas;
    }

    public void atualizarPessoa(PessoaPojo pessoaPojo) {
        String sql = "UPDATE pessoas SET nome = ?, idade = ? WHERE id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pessoaPojo.getNome());
            stmt.setInt(2, pessoaPojo.getIdade());
            stmt.setString(3, pessoaPojo.getEndereco());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirPessoa(int id) {
        String sql = "DELETE FROM pessoas WHERE id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}