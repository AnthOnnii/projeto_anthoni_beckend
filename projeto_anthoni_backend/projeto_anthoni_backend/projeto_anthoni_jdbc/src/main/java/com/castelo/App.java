package com.castelo;

import com.castelo.dao.equipamentoDAO;
import com.castelo.dao.equipamentoPojo;
import com.castelo.equipamento.equipamento;

public class App {
    public static void main( String[] args )
    {
        /*
        
        equipamento equipamento = new equipamento();

        equipamento.setNome("Ar_condicionado");
        equipamento.setSetor("Biblioteca");
        equipamento.setQuantidade(20);

        equipamentoPojo equipamentoPojo = new equipamentoPojo();
        equipamentoPojo.setNome(equipamento.getNome());
        equipamentoPojo.setSetor(equipamento.getSetor());
        equipamentoPojo.setQuantidade(equipamento.getQuantidade());

        equipamentoDAO equipamentoDAO = new equipamentoDAO();
        equipamentoDAO.cadastrarequipamento(equipamentoPojo);
        */
    
    

        equipamento equipamento = new equipamento();
        equipamento.setId(3);

        equipamentoPojo equipamentoPojo = new equipamentoPojo();
        equipamentoPojo.setId(equipamento.getId());       

        equipamentoDAO equipamentoDAO = new equipamentoDAO();
        equipamentoDAO.consultarequipamento(equipamentoPojo);
    
    
        
    
    
    
    
    }






}

