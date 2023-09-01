package pessoa;

import java.util.ArrayList;

import com.market.projeto.Cartao;
import com.market.projeto.Endereco;

public class Funcionario extends Pessoa {
    private String ctps;
    private String matricula;

    private static ArrayList <Funcionario> lista_Funcionarios = new ArrayList<>();
    

public static ArrayList<Funcionario> getLista_Funcionarios() {
        return lista_Funcionarios;
    }


public Funcionario(String nome, String cpf, String dataNasc, Endereco endereco, String login, String senha, String ctps, String matricula, Cartao cartao) {
    super(nome, cpf, dataNasc, endereco, login, senha, cartao);

    this.ctps = ctps;
    this.matricula = matricula;
}
}
