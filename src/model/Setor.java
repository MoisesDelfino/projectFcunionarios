package model;

public class Setor {
    private String nome;

    public Setor() {
        this.setNome("SEM NOME");
    }

    public Setor(String nome) {
        this.setNome(nome);
    }

    public Setor(String text, boolean add) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty()?"SEM NOME":nome.toUpperCase();
    }


    @Override
    public String toString() {
        return "Setor: " + this.nome;
    }

    
    
    
}
