package com.market.projeto;

public class Endereco {
    protected String rua;
    protected String bairro;
    protected int num;
    protected String cidade;
    protected String pais;
    protected String complemento;

    public Endereco(String rua, String bairro, int num, String cidade, String pais, String complemento){
        this.rua = rua;
        this.bairro = bairro;
        this.num = num;
        this.cidade = cidade;
        this.pais = pais;
        this.complemento = complemento;
    }
    
}
