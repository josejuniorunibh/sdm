package br.unibh.sdm.revisao1.negocio;

import java.math.BigDecimal;

import br.unibh.sdm.revisao1.entidades.PessoaJuridica;

public class Desconto {

	// exemplo de atributo estático de classe
	public static BigDecimal TAXA_PADRAO = BigDecimal.valueOf(0.05);
	public static BigDecimal TAXA_PROMOCIONAL = BigDecimal.valueOf(0.1);

	public static BigDecimal getTaxa(PessoaJuridica loja) {
		if (loja.getCnpj().equals("421244532342")) {
			return TAXA_PROMOCIONAL;
		}
		return TAXA_PADRAO;
	}
	
	
}
