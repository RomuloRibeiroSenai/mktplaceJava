package com.market.projeto;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pessoa.Cliente;
import pessoa.Funcionario;
import site.Menu;


import com.market.projeto.enums.Lista_Produtos;

@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
		boolean terminou = false;
		int escolha; // coloquei pra saber qual indice do menu
		String cliente_logado = "0"; // mudei para string para identificar qual cliente logou pelo cpf
		Endereco endereco = new Endereco("Rua Uniao Industria","Itaipava", 420,"Petropolis","Brasil", "bl 2");
		Cartao cartao = new Cartao("a","s","12",455, "454");

		ArrayList <Cliente> lista_cliente = new ArrayList<>();
		Cliente pessoa = new Cliente("Lucas", "45454", "12/2/87", endereco, "Riba", "Batman", cartao);
		Cliente pessoa1 = new Cliente("Silvia", "12457896", "25/12/2000", endereco, "admin", "admin", cartao);

		
		lista_cliente.add(pessoa);
		lista_cliente.add(pessoa1);
		
		
	
		ArrayList <Lista_Produtos> produtos = new ArrayList<>();
		ArrayList <Funcionario> lista_Funcionarios = new ArrayList<>();
		
		
		/*
		System.out.println("Bem vindo" + "\n" + "Login" );
		login = sc.nextLine();
		System.out.println("Senha: ");
		senha = sc.nextLine();
		Retirei essas linhas pq o metodo ja escreve elas 
		*/
		// Guardei o retorno da função em uma variavel, então se der true no metodo ele sai do looping
		while(cliente_logado.equals("0")){
			cliente_logado = logar(lista_cliente);
		}
		Menu menu = new Menu();
		while (!terminou){
			escolha = menu.opcoes();

			switch(escolha){
				case 1:
					for (Lista_Produtos produto : Lista_Produtos.values()) {
						
						System.out.println("Lista de produtos " + produto.name() + "\nDescrição: " + produto.getDescricao() + " " + produto.getValor());
						};
						break;
				case 2:
					menu.verCartoes(lista_cliente, cliente_logado);
					break;
				case 3:
					menu.add_cliente(lista_cliente);
					break;
				case 4:
				menu.add_produto(lista_produto);
					break;
				case 5:
					menu.add_Funcionarios(lista_Funcionarios);
					break;
				case 0:
					terminou = true;
					break;
				default :
					escolha = menu.opcoes();
				}
		}

		}
		public static String logar(ArrayList<Cliente> lista_cliente){
			Scanner sc2 = new Scanner(System.in);
			String nome, senha;
			System.out.println("Bem vindo" + "\n" + "Login" );
			nome = sc2.nextLine();
			System.out.println("Senha: ");
			senha = sc2.nextLine();
			
			for (int i = 0; i < lista_cliente.size(); i++){
				if (nome.equals(lista_cliente.get(i).getLogin())
				 & senha.equals(lista_cliente.get(i).getSenha())){					
						System.out.println("\nVocê está sendo direcionado\n");								
						return lista_cliente.get(i).getCpf(); // retorna o cpf pra gente saber qual cliente esta logado
				} 
			}
			System.out.println("\nLogin ou Senha incorretos\n");			
			return "0";
		}
	}
		


