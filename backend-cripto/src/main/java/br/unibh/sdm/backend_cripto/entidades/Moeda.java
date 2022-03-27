package br.unibh.sdm.backend_cripto.entidades;

public enum Moeda {

	BRL("Real"), 
	USD("Dólar");

	private String descricao;

	Moeda(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
