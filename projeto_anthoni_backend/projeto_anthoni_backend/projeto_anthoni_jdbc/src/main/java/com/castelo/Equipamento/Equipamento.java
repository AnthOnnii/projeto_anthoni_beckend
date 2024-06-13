package com.castelo.Equipamento;

public class Equipamento {

    private int id;
    private String nome;
    private String setor;
    private int quantidade;
    
    public Equipamento() {
    }

    public Equipamento(int id, String nome, String setor, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.quantidade = quantidade;
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

    public int getquantidade() {
        return quantidade;
    }

    public void setquantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Equipamento [nome=" + nome + ", setor=" + setor + ", quantidade=" + quantidade + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((setor == null) ? 0 : setor.hashCode());
        result = prime * result + quantidade;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Equipamento other = (Equipamento) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (setor == null) {
            if (other.setor != null)
                return false;
        } else if (!setor.equals(other.setor))
            return false;
        if (quantidade != other.quantidade)
            return false;
        return true;
    }

    
}