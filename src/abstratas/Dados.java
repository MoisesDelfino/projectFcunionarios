package abstratas;

import java.util.LinkedList;
import model.Cargo;
import model.Funcionario;
import model.Setor;

abstract public class Dados {
    private static LinkedList<Setor> listaSetor = new LinkedList<>();
    private static LinkedList<Cargo> listaCargo = new LinkedList<>();
    private static LinkedList<Funcionario> listaFuncionario = new LinkedList<>();
    
    public static LinkedList<Setor> getListaSetor() {
        return listaSetor;
    }
    public static LinkedList<Cargo> getListaCargo() {
        return listaCargo;
    }
    public static LinkedList<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }
}
