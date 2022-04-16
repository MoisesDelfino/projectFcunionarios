package enums;

import model.Setor;

public enum Setores {
    A("Administração"),
    F("Frente de Caixa"),
    L("Loja");

    public static void add(Setor setor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //
    private String descricao;
    //
    private Setores(String descricao) {
        this.descricao = descricao;
    }
    //
    @Override
    public String toString() {
        return descricao;
    }
}
