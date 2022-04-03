package br.unibh.sdm.revisao1.entidades;

import java.util.Date;

/**
 * Esta classe herda de Pessoa, o que quer dizer que possui todos os seus atributos e m�todos
 * @author jhcru
 *
 */

public class PessoaJuridica extends Pessoa {

	// atributos
	private String inscricaoEstadual;
	private String cnpj;
	private Date dataConstituicao;
	
	/**
	 * Construtor padr�o 
	 */
	public PessoaJuridica() {
		super();
	}
	

	/**
	 * Construtor com os atributos (exemplo de sobrecarga em rela��o ao construtor padr�o) 
	 */
	public PessoaJuridica(Long id, String nome, String endereco, String email, String telefone,
			String inscricaoEstadual, String cnpj, Date dataConstituicao) {
		super(id, nome, endereco, email, telefone);
		this.inscricaoEstadual = inscricaoEstadual;
		this.cnpj = cnpj;
		this.dataConstituicao = dataConstituicao;
	}


	// M�todos Get e Set (implementam o encapsulamento dos atributos, visto que os atributos s�o private)
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Date getDataConstituicao() {
		return dataConstituicao;
	}

	public void setDataConstituicao(Date dataConstituicao) {
		this.dataConstituicao = dataConstituicao;
	}

	/**
	 * M�todo que retorna em uma String a representa��o do estado do objeto
	 *  (exemplo de sobreposi��o com rela��o ao m�todo toString() da superclasse Object)
	 */
	@Override
	public String toString() {
		return "PessoaJuridica [inscricaoEstadual=" + inscricaoEstadual + ", cnpj=" + cnpj + ", dataConstituicao="
				+ dataConstituicao + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getEndereco()="
				+ getEndereco() + ", getEmail()=" + getEmail() + ", getTelefone()=" + getTelefone() + ", toString()="
				+ super.toString() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + "]";
	}

	/**
	 * M�todo que retorna em um valor inteiro a representa��o do estado do objeto
	 *  (exemplo de sobreposi��o com rela��o ao m�todo hashCode() da superclasse Object)
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((dataConstituicao == null) ? 0 : dataConstituicao.hashCode());
		result = prime * result + ((inscricaoEstadual == null) ? 0 : inscricaoEstadual.hashCode());
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
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaJuridica other = (PessoaJuridica) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (dataConstituicao == null) {
			if (other.dataConstituicao != null)
				return false;
		} else if (!dataConstituicao.equals(other.dataConstituicao))
			return false;
		if (inscricaoEstadual == null) {
			if (other.inscricaoEstadual != null)
				return false;
		} else if (!inscricaoEstadual.equals(other.inscricaoEstadual))
			return false;
		return true;
	}
	
	
	
}
