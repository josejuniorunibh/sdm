package br.unibh.sdm.revisao1.negocio;

import java.math.BigDecimal;
import java.util.Set;

import br.unibh.sdm.revisao1.entidades.Compra;
import br.unibh.sdm.revisao1.entidades.ItemCompra;
import br.unibh.sdm.revisao1.entidades.PessoaFisica;
import br.unibh.sdm.revisao1.entidades.PessoaJuridica;

/**
 * Esta é uma Interface, ou contrato de implementação
 * As classes que implementarem essa interface deverão ter implementados os métodos por ela especificados
 * @author jhcru
 *
 */

public interface Caixa {

	// Veja que os métodos não possuem implementação, mas somente a assinatura	
	public Compra registar(Set<ItemCompra> itens, PessoaFisica cliente, PessoaJuridica loja, BigDecimal frete);
	public Compra cancelar(Compra compra);
	
}
