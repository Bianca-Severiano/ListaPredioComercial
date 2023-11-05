package model;

public class Loja {

	public int andar;
	public String nome;
	public String descricao;
	
	public Loja() {
		super();
	}

	public Loja(int andar, String nome, String descricao) {
		this.andar = andar;
		this.nome = nome;
		this.descricao = descricao;
		
	}


	
	@Override
	public String toString() {
		return "Andar=" + andar + ", Nome=" + nome + ", Descricao=" + descricao;
	}


	
	
	
	

}
