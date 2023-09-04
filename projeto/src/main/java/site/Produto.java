package site;

import java.util.ArrayList;
import java.util.Scanner;

import interfaces.Cadastro;


public class Produto implements Cadastro{
    protected String nome;
    protected String descricao;
    protected double valor;
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    private static ArrayList <Produto> lista_produto = new ArrayList<> ();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto(String nome, String descricao, double valor){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    static {
        Produto bola = new Produto("Bola", "Bola redonda cheia", 120.00);
		Produto apito = new Produto("Apito", "Apito de índio ", 20.00);
		Produto ps5 = new Produto("Playstation 5", "Novo com controle", 3000.00);
		Produto xbox = new Produto("Xbox One", "Novo com controle", 2500.00);
		Produto pcGamer = new Produto("Pc Gamer", "Intel I9, 48gb de Ram, SSd 1Tb, Placa de Vídeo RTX 4080TI", 15000.00);
		Produto nSwitch = new Produto("Switch", "Usado", 50.00);
	
				
		Produto.getLista_Produto().add(bola);
		Produto.getLista_Produto().add(apito);
		Produto.getLista_Produto().add(ps5);
		Produto.getLista_Produto().add(xbox);
		Produto.getLista_Produto().add(pcGamer);
		Produto.getLista_Produto().add(nSwitch);

    }
    public static ArrayList<Produto> getLista_Produto() {
        return lista_produto;       
    }

    @Override
    public void create () {
        
        String nome, descricao;
        double valor;
        System.out.println("Nome do produto: ");
        nome = sc.nextLine();
        System.out.println("Descrição: ");
        descricao = sc.nextLine();
        System.out.println("Valor: ");
        valor = sc.nextDouble();
        Produto novo_produto = new Produto(nome, descricao, valor);
        lista_produto.add(novo_produto);
    }

    @Override
    public void get(String nome) {
           for (int i = 0; i < Produto.getLista_Produto().size(); i++){
            if(nome.equals(Produto.getLista_Produto().get(i).getNome())){
                System.out.println(Produto.getLista_Produto().get(i).getNome());
                System.out.println(Produto.getLista_Produto().get(i).getDescricao());
                System.out.println(Produto.getLista_Produto().get(i).getValor());
            }
       }
    
    }

    @Override
    public void getAll() {
        for (int i = 0; i < Produto.getLista_Produto().size(); i++){
            System.out.println(Produto.getLista_Produto().get(i).getNome());
            System.out.println(Produto.getLista_Produto().get(i).getDescricao());
            System.out.println(Produto.getLista_Produto().get(i).getValor()+ "\n");
        }
    }

    @Override
    public void update(String produto) {
        int escolha;
        System.out.println("1.Para mudar o valor, 2.Para nome, 3.Descrição");
        escolha = sc2.nextInt();
        while (escolha > 3){
            System.out.println("1.Para mudar o valor, 2.Para nome, 3.Descrição");
            escolha = sc2.nextInt();
        }
        if (escolha == 1){
            double valor;
            System.out.println("Insira o valor novo do produto");
            valor = sc.nextDouble();
            for (int a = 0; a < Produto.getLista_Produto().size(); a++){
                if (produto.equals(Produto.getLista_Produto().get(a).getNome())){
                    Produto.getLista_Produto().get(a).setValor(valor);
                }
            }
        }else if (escolha == 2){
            String nome;
            System.out.println("Digite o novo nome: ");
            nome = sc.nextLine();
            for (int a = 0; a < Produto.getLista_Produto().size(); a++){
                if (produto.equals(Produto.getLista_Produto().get(a).getNome())){
                    Produto.getLista_Produto().get(a).setNome(nome);
                }
            }
        }else {
            String descricao;
            System.out.println("Digite a nova descrição: ");
            descricao = sc.nextLine();
            for (int a = 0; a < Produto.getLista_Produto().size(); a++){
                if (produto.equals(Produto.getLista_Produto().get(a).getNome())){
                    Produto.getLista_Produto().get(a).setDescricao(descricao);
                }
            }
        }
    }

    @Override
    public void delete() {
       
    }
    }

    
