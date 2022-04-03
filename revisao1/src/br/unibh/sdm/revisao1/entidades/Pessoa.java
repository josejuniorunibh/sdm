package br.unibh.sdm.revisao1.entidades;

/**
 * Esta classe abstrata pode possuir implementa��es de m�todos, mas n�o pode ser instanciada diretamente
 * Isso quer dizer que n�o podemos instanciar objetos do tipo Pessoa. Mas podemos instanciar PessoaFisica e PessoaJuridica 
 * @author jhcru
 *
 */
public abstract class Pessoa {

	// atributos
	private Long id;
	private String nome;
	private String endereco;
	private String email;
	private String telefone;
	
	/**
	 * Construtor padr�o 
	 */
	public Pessoa() {
		super();
	}
	

	/**
	 * Construtor com os atributos (exemplo de sobrecarga em rela��o ao construtor padr�o) 
	 */
	public Pessoa(Long id, String nome, String endereco, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}


	// M�todos Get e Set (implementam o encapsulamento dos atributos, visto que os atributos s�o private)
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * M�todo que retorna em uma String a representa��o do estado do objeto
	 *  (exemplo de sobreposi��o com rela��o ao m�todo toString() da superclasse Object)
	 */
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", telefone="
				+ telefone + "]";
	}

	/**
	 * M�todo que retorna em um valor inteiro a representa��o do estado do objeto
	 *  (exemplo de sobreposi��o com rela��o ao m�todo hashCode() da superclasse Object)
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
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
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}
	
	
	
}
