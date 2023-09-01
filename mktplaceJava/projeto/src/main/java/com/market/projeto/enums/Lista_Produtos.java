package com.market.projeto.enums;

import java.util.ArrayList;

import site.Produto;

public enum Lista_Produtos {
    BOLA("Bola de Futebol Cheia  R$",80.00), 
    APITO("Apito de Índio  R$",50.00), 
    PS5("Playstation 5 Slim novo, 1 controle 3 jogos  R$",4000.00), 
    XBOX("Xbox One novo, um controle, 3 jogos  R$",3000.00), 
    PC("Pc gamer Intel i9 10900K, Ssd 2TB, 4x 16GB Ddr5 3400Mhz, Rtx 4080TI  R$",15000.00),
    NSWITCH("Console usado, relíquia R$",30.00);

    private Lista_Produtos(String descricao, double valor) {
    this.descricao = descricao;
    this.valor = valor;
    };
    
    private String descricao;
    private double valor;


    public String getDescricao() {
        return descricao;
    }
    
    public double getValor() {
            return valor;
        }
    
}


    

    
    
    


