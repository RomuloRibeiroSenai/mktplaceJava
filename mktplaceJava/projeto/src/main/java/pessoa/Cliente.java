package pessoa;

import com.market.projeto.Cartao;
import com.market.projeto.Endereco;

public class Cliente extends Pessoa {
    public Cliente (String nome, String cpf, String dataNasc, Endereco endereco, String login,
     String senha, Cartao cartao) {
        super(nome, cpf, dataNasc, endereco, login, senha, cartao);
    }  
}
