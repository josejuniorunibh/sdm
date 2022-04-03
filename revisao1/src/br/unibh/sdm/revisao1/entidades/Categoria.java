package br.unibh.sdm.revisao1.entidades;

/**
 * Classe de Categoria
 * @author jhcru
 *
 */
public class Categoria {

	// atributos
	private Long id;
	private String nome;
	
	/**
	 * Construtor padrão 
	 */
	public Categoria() {
		super();
	}
	
	
	/**
	 * Construtor com os atributos (exemplo de sobrecarga em relação ao construtor padrão) 
	 */
	public Categoria(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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
	
	/**
	 * Método que retorna em uma String a representação do estado do objeto
	 *  (exemplo de sobreposição com relação ao método toString() da superclasse Object)
	 */
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nome=" + nome + "]";
	}

	/**
	 * Método que retorna em um valor inteiro a representação do estado do objeto
	 *  (exemplo de sobreposição com relação ao método hashCode() da superclasse Object)
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Categoria other = (Categoria) obj;
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
		return true;
	}	
	
	
	
	
}
