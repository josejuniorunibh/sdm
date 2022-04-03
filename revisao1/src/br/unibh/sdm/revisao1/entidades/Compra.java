package br.unibh.sdm.revisao1.entidades;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * Classe de Compra
 * @author jhcru
 *
 */
public class Compra {

	// atributos
	private Long id;
	private Date data;
	private Set<ItemCompra> itens;
	private PessoaFisica cliente;
	private PessoaJuridica loja;
	private BigDecimal valorTotal;
	private BigDecimal desconto;
	private BigDecimal valorFrete;
	private BigDecimal valorFinal;
		
	/**
	 * Construtor padrão 
	 */
	public Compra() {
		super();
	}

	
	// Métodos Get e Set (implementam o encapsulamento dos atributos, visto que os atributos são private)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Set<ItemCompra> getItens() {
		return itens;
	}

	public void setItens(Set<ItemCompra> itens) {
		this.itens = itens;
	}

	public PessoaFisica getCliente() {
		return cliente;
	}

	public void setCliente(PessoaFisica cliente) {
		this.cliente = cliente;
	}

	public PessoaJuridica getLoja() {
		return loja;
	}

	public void setLoja(PessoaJuridica loja) {
		this.loja = loja;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public BigDecimal getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(BigDecimal valorFrete) {
		this.valorFrete = valorFrete;
	}

	public BigDecimal getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(BigDecimal valorFinal) {
		this.valorFinal = valorFinal;
	}

	/**
	 * Método que retorna em uma String a representação do estado do objeto
	 *  (exemplo de sobreposição com relação ao método toString() da superclasse Object)
	 */
	@Override
	public String toString() {
		return "Compra [id=" + id + ", \ndata=" + data + ", \nitens=" + itens + ", \ncliente=" + cliente + ", \nloja=" + loja
				+ ", \nvalorTotal=" + valorTotal + ", \ndesconto=" + desconto + ", \nvalorFrete=" + valorFrete
				+ ", \nvalorFinal=" + valorFinal + "]";
	}

	/**
	 * Método que retorna em um valor inteiro a representação do estado do objeto
	 *  (exemplo de sobreposição com relação ao método hashCode() da superclasse Object)
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((desconto == null) ? 0 : desconto.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((itens == null) ? 0 : itens.hashCode());
		result = prime * result + ((loja == null) ? 0 : loja.hashCode());
		result = prime * result + ((valorFinal == null) ? 0 : valorFinal.hashCode());
		result = prime * result + ((valorFrete == null) ? 0 : valorFrete.hashCode());
		result = prime * result + ((valorTotal == null) ? 0 : valorTotal.hashCode());
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
		Compra other = (Compra) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (desconto == null) {
			if (other.desconto != null)
				return false;
		} else if (!desconto.equals(other.desconto))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itens == null) {
			if (other.itens != null)
				return false;
		} else if (!itens.equals(other.itens))
			return false;
		if (loja == null) {
			if (other.loja != null)
				return false;
		} else if (!loja.equals(other.loja))
			return false;
		if (valorFinal == null) {
			if (other.valorFinal != null)
				return false;
		} else if (!valorFinal.equals(other.valorFinal))
			return false;
		if (valorFrete == null) {
			if (other.valorFrete != null)
				return false;
		} else if (!valorFrete.equals(other.valorFrete))
			return false;
		if (valorTotal == null) {
			if (other.valorTotal != null)
				return false;
		} else if (!valorTotal.equals(other.valorTotal))
			return false;
		return true;
	}
	
	
	
}
