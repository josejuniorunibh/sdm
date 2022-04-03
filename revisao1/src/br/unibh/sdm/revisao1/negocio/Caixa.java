package br.unibh.sdm.revisao1.negocio;

import java.math.BigDecimal;
import java.util.Set;

import br.unibh.sdm.revisao1.entidades.Compra;
import br.unibh.sdm.revisao1.entidades.ItemCompra;
import br.unibh.sdm.revisao1.entidades.PessoaFisica;
import br.unibh.sdm.revisao1.entidades.PessoaJuridica;

/**
 * Esta � uma Interface, ou contrato de implementa��o
 * As classes que implementarem essa interface dever�o ter implementados os m�todos por ela especificados
 * @author jhcru
 *
 */

public interface Caixa {

	// Veja que os m�todos n�o possuem implementa��o, mas somente a assinatura	
	public Compra registar(Set<ItemCompra> itens, PessoaFisica cliente, PessoaJuridica loja, BigDecimal frete);
	public Compra cancelar(Compra compra);
	
}
