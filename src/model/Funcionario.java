package model;

import enums.Sexos;
import enums.Cargos;
import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate nascimento;
    private Sexos sexo;
    private Cargos cargo;
    private double salario;

    public Funcionario() {
        this.setNome("SEM NOME");
        this.setNascimento(LocalDate.now());
        this.setSexo(Sexos.O);
        this.setCargo(Cargos.O);
        this.setSalario(1212.00);
    }

    public Funcionario(String nome, LocalDate nascimento, Sexos sexo, Cargos cargo, double salario) {
        this.setNome(nome);
        this.setNascimento(nascimento);
        this.setSexo(sexo);
        this.setCargo(cargo);
        this.setSalario(salario);
    }

    public String getNome() {
        return this.nome;
    }

    public LocalDate getNascimento() {
        return this.nascimento;
    }

    public Sexos getSexo() {
        return this.sexo;
    }

    public Cargos getCargo() {
        return this.cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty()?"SEM NOME":nome.toUpperCase();
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento == null ? LocalDate.now() : nascimento;
    }

    public void setSexo(Sexos sexo) {
        this.sexo = sexo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = (salario <= 1212.00) ? 1212.00 : salario;
    }
    
    
    
    
    
}
