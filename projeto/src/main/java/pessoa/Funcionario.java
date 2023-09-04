package pessoa;

import com.market.projeto.Cartao;
import com.market.projeto.Endereco;

import interfaces.Cadastro;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
    private String ctps;
    private String matricula;
    
    private static ArrayList <Funcionario> lista_Funcionarios = new ArrayList<>(); 
    
    public Funcionario(String nome, String cpf, String dataNasc, Endereco endereco, String login, String senha, String ctps, String matricula, Cartao cartao) {
        super(nome, cpf, dataNasc, endereco, login, senha, cartao);
        
        this.ctps = ctps;
        this.matricula = matricula;
    }
    public static ArrayList<Funcionario> getListaFuncionarios(){
        return lista_Funcionarios;
    }
    public String getCtps() {
        return ctps;
    }
    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
