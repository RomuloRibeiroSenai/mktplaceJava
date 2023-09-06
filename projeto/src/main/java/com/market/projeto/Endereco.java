package com.market.projeto;

import java.util.ArrayList;

import enums.UnidadeFederal;
import interfaces.Cadastro;

public class Endereco implements Cadastro {
    protected String rua;
    protected String bairro;
    protected int num;
    protected String cidade;
    protected String pais;
    protected String complemento;
    UnidadeFederal uf;

    public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public UnidadeFederal getUf() {
		return uf;
	}

	public void setUf(UnidadeFederal uf) {
		this.uf = uf;
	}

	public Endereco(String rua, String bairro, int num, String cidade, String pais, String complemento, UnidadeFederal uf){
        this.rua = rua;
        this.bairro = bairro;
        this.num = num;
        this.cidade = cidade;
        this.pais = pais;
        this.complemento = complemento;
        this.uf = uf;
    }
    static {
        Endereco enderecoCadastrado = new Endereco("Rua Uniao Industria","Itaipava", 420,"Petropolis","Brasil", "bl 2",UnidadeFederal.RJ);
		Endereco enderecoCadastrado2 = new Endereco("Rua Espirito Sando","Quitandinha", 240,"Petropolis","Brasil", "bl 42",UnidadeFederal.RJ);
			
				
		// Endereco.getLista_EnderecoCadastrado().add();
		// Endereco.getLista_EnderecoCadastrado().add();
		

    }
    // public static ArrayList<Endereco> getLista_Endereco() {
    //     return Lista_Endereco;       
    // }
    //ver a logica para criar lista de endereco
    @Override
    public void create() {
        
    }

    @Override
    public void get(String nome) {
        
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
