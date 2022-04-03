package br.unibh.sdm.revisao1.entidades;

/**
 * Classe de ItemCompra
 * @author jhcru
 *
 */
public class ItemCompra {

	// atributos
	private Produto produto;
	private int quantidade;
	
	/**
	 * Construtor padr�o 
	 */
	public ItemCompra() {
		super();
	}
	

	/**
	 * Construtor com os atributos (exemplo de sobrecarga em rela��o ao construtor padr�o) 
	 */
	public ItemCompra(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}


	// M�todos Get e Set (implementam o encapsulamento dos atributos, visto que os atributos s�o private)
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	/**
	 * M�todo que retorna em uma String a representa��o do estado do objeto
	 *  (exemplo de sobreposi��o com rela��o ao m�todo toString() da superclasse Object)
	 */
	@Override
	public String toString() {
		return "ItemCompra [produto=" + produto + ", quantidade=" + quantidade + "]";
	}


	/**
	 * M�todo que retorna em um valor inteiro a representa��o do estado do objeto
	 *  (exemplo de sobreposi��o com rela��o ao m�todo hashCode() da superclasse Object)
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		result = prime * result + quantidade;
		return result;
	}


	/**
	 * M�todo que compara dois objetos do mesmo tipo
	 *  (exemplo de sobreposi��o com rela��o ao m�todo equals() da superclasse Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemCompra other = (ItemCompra) obj;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		if (quantidade != other.quantidade)
			return false;
		return true;
	}

	
	
	
	
	
}
