package br.unibh.teste1.entidades;

import java.util.Objects;

/**
 * Esta classse define uma Criptomoeda, produto principal da aplicacao
 * @author jhcru
 * @version 1.0
 */
public class Criptomoeda {
	
	// Propriedades
	private Long id;
	private String nome;
	private String descricao;
	private TipoCripto tipo;
	
	// Construtores
	public Criptomoeda(Long id, String nome, String descricao, TipoCripto tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.tipo = tipo;
	}

	public Criptomoeda() {
		super();
	}

	@Override
	public String toString() {
		return "Criptomoeda [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", tipo=" + tipo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, id, nome, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Criptomoeda other = (Criptomoeda) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && tipo == other.tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public TipoCripto getTipo() {
		return tipo;
	}

	public void setTipo(TipoCripto tipo) {
		this.tipo = tipo;
	}
	
	
	
}
