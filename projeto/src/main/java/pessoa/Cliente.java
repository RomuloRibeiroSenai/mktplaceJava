package pessoa;

import java.util.ArrayList;
import java.util.Scanner;

import com.market.projeto.Cartao;
import com.market.projeto.Endereco;

import abstrato.Pessoa;
import interfaces.Cadastro;

public class Cliente extends Pessoa implements Cadastro {
    private static ArrayList <Cliente> lista_cliente = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    static{
        Cliente pessoa = new Cliente("Lucas", "45454", "12/2/87", endereco, "Riba", "Batman", cartao);
		Cliente pessoa1 = new Cliente("Silvia", "12457896", "25/12/2000", endereco, "admin", "admin", cartao);

		
		Cliente.getLista_cliente().add(pessoa);
		Cliente.getLista_cliente().add(pessoa1);		
    }
    public static ArrayList<Cliente> getLista_cliente() {
        return lista_cliente;
    }
    public Cliente (String nome, String cpf, String dataNasc, Endereco endereco, String login,
    String senha, Cartao cartao) {
        super(nome, cpf, dataNasc, endereco, login, senha, cartao);
    }  
    @Override
    public void create () {
       String nome, cpf, dataNasc, login,senha;
       Endereco endereco; 
       Cartao cartao;
       
        System.out.println("Nome do cliente: ");
        nome = sc.nextLine();
        System.out.println("CPF: ");
        cpf = sc.nextLine();
        System.out.println("data de Nascimento:");
        dataNasc = sc.nextLine();
        System.out.println("Digite um nome de usuário");
        login = sc.nextLine();
        System.out.println("Digite uma senha");
        senha = sc.nextLine();
        

        //endereço
        //cartão


        // Produto novo_produto = new Produto(nome, descricao, valor);
        // lista_produto.add(novo_produto);
    }

    @Override
    public void get(String nome) {
           for (int i = 0; i < Cliente.getLista_cliente().size(); i++){
            if(nome.equals(Cliente.getLista_cliente().get(i).getNome())){
                System.out.println(Cliente.getLista_cliente().get(i).getNome());
                System.out.println(Cliente.getLista_cliente().get(i).getCpf());
                System.out.println(Cliente.getLista_cliente().get(i).getDataNasc());
                System.out.println(Cliente.getLista_cliente().get(i).getLogin());
                System.out.println(Cliente.getLista_cliente().get(i).getEndereco());
                System.out.println(Cliente.getLista_cliente().get(i).getCartao());
            }
       }
        
    }

    @Override
    public void getAll() {
       
    }

    @Override
    public void update(String produto) {
        
    }

    @Override
    public void delete() {
       
    }
    
}
