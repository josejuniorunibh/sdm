package br.unibh.sdm.revisao1.entidades;

import java.util.Date;

/**
 * Esta classe herda de Pessoa, o que quer dizer que possui todos os seus atributos e métodos
 * @author jhcru
 *
 */

public class PessoaFisica extends Pessoa {

	// atributos
	private String cpf;
	private String rg;
	private Date dataNascimento;
	
	/**
	 * Construtor padrão 
	 */
	public PessoaFisica() {
		super();
	}
	

	/**
	 * Construtor com os atributos (exemplo de sobrecarga em relação ao construtor padrão) 
	 */
	public PessoaFisica(Long id, String nome, String endereco, String email, String telefone, String cpf, String rg,
			Date dataNascimento) {
		super(id, nome, endereco, email, telefone);
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}


	// Métodos Get e Set (implementam o encapsulamento dos atributos, visto que os atributos são private)
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * Método que retorna em uma String a representação do estado do objeto
	 *  (exemplo de sobreposição com relação ao método toString() da superclasse Object)
	 */
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", dataNascimento=" + dataNascimento + ", getId()=" + getId()
				+ ", getNome()=" + getNome() + ", getEndereco()=" + getEndereco() + ", getEmail()=" + getEmail()
				+ ", getTelefone()=" + getTelefone() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + "]";
	}


	/**
	 * Método que retorna em um valor inteiro a representação do estado do objeto
	 *  (exemplo de sobreposição com relação ao método hashCode() da superclasse Object)
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
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
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		return true;
	}
	
	
	
	
}
