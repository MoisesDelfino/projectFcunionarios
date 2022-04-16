package model;

import enums.Setores;

public class Cargo {
    private String nome;
    private String descricao;
    private Setores setor;

    public Cargo() {
        this.setNome("SEM NOME");
        this.setDescricao("SEM DESCRIÇÃO");
        this.setSetor(Setores.A);
    }

    public Cargo(String nome, String descricao, Setor setor) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setSetor(Setores.A);
    }

    

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }
    public Setores getSetor() {
        return this.setor;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty()?"SEM NOME":nome.toUpperCase();
    }

    public void setDescricao(String descricao) {
       this.descricao = descricao.trim().isEmpty()?"SEM DESCRIÇÃO":descricao.toUpperCase();
    }
    public void setSetor(Setores setor) {
        this.setor = setor;
    }    
    
}
