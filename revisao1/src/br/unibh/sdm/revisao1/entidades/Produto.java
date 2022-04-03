package br.unibh.sdm.revisao1.entidades;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Classe de produto
 * @author jhcru
 *
 */
public class Produto {

	// atributos
	private Long id;
	private String nome;
	private Date dtCadastro;
	private BigDecimal preco;
	private Categoria categoria;
	private PessoaJuridica fornecedor;
	
	/**
	 * Construtor padrão 
	 */
	public Produto() {
		super();
	}
	

	/**
	 * Construtor com os atributos (exemplo de sobrecarga em relação ao construtor padrão) 
	 */
	public Produto(Long id, String nome, Date dtCadastro, BigDecimal preco, Categoria categoria,
			PessoaJuridica fornecedor) {
		super();
		this.id = id;
		this.nome = nome;
		this.dtCadastro = dtCadastro;
		this.preco = preco;
		this.categoria = categoria;
		this.fornecedor = fornecedor;
	}


	// Métodos Get e Set (implementam o encapsulamento dos atributos, visto que os atributos são private)
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

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public PessoaJuridica getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(PessoaJuridica fornecedor) {
		this.fornecedor = fornecedor;
	}

	/**
	 * Método que retorna em uma String a representação do estado do objeto
	 *  (exemplo de sobreposição com relação ao método toString() da superclasse Object)
	 */
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", dtCadastro=" + dtCadastro + ", preco=" + preco
				+ ", categoria=" + categoria + ", fornecedor=" + fornecedor + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	/**
	 * Método que retorna em um valor inteiro a representação do estado do objeto
	 *  (exemplo de sobreposição com relação ao método hashCode() da superclasse Object)
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((dtCadastro == null) ? 0 : dtCadastro.hashCode());
		result = prime * result + ((fornecedor == null) ? 0 : fornecedor.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		return result;
	}

	/**
	 * Método que compara dois objetos do mesmo tipo
	 *  (exemplo de sobreposição com relação ao método equals() da superclasse Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (dtCadastro == null) {
			if (other.dtCadastro != null)
				return false;
		} else if (!dtCadastro.equals(other.dtCadastro))
			return false;
		if (fornecedor == null) {
			if (other.fornecedor != null)
				return false;
		} else if (!fornecedor.equals(other.fornecedor))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		return true;
	}

	
	
}
