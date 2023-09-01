package site;

public class Produto {
    protected String nome;
    protected String descricao;
    protected double valor;
    
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

    public Produto( String nome, String descricao, double valor){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
    
}
