package com.escola;

import com.escola.conexao.Conexao;

public class App
{
    public static void main( String[] args ){

        Conexao conexao = new Conexao();
        conexao.getConexao();

    }

}