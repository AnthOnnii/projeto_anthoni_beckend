package com.castelo.dao;

public class EquipamentoPojo {

    private int id;
    private String nome;
    private String setor;
    private int quantiadade;

    public EquipamentoPojo() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getsetor() {
        return setor;
    }

    public void setsetor(String setor) {
        this.setor = setor;
    }

    public int getquantiadade() {
        return quantiadade;
    }

    public void setquantiadade(int quantiadade) {
        this.quantiadade = quantiadade;
    }
}
