package br.unibh.sdm.revisao1;

import java.math.BigDecimal;
import java.util.HashSet;

import br.unibh.sdm.revisao1.entidades.Categoria;
import br.unibh.sdm.revisao1.entidades.Compra;
import br.unibh.sdm.revisao1.entidades.ItemCompra;
import br.unibh.sdm.revisao1.entidades.PessoaFisica;
import br.unibh.sdm.revisao1.entidades.PessoaJuridica;
import br.unibh.sdm.revisao1.entidades.Produto;
import br.unibh.sdm.revisao1.negocio.CaixaImpl;

/**
 * Programa principal Java
 * @author jhcru
 */

public class Main {

	/**
	 * Método de execução principal
	 */
	public static void main(String args[]) {
		
		// um comentário simples
		System.out.println("Olá Mundo!");
		
		/*
		 * Um comentário com 
		 * mais de uma linha
		 * 
		 * No código abaixo estamos instanciando vários objetos:
		 */
		
		// um objeto chamado cliente do tipo PessoaFisica
		PessoaFisica cliente = new PessoaFisica(1L, "João da Silva", "Rua A", "joao@mail", "3334444", "2312312312", "2342342", null);
		// Depois chamamos o seu método toString()
		System.out.println(cliente);
		
		// Agora um objeto PessoaJuridica
		PessoaJuridica loja = new PessoaJuridica(1L, "Dell", "Rua X", "dell@mail", "23423423", "34234234", "421244532342", null);
		System.out.println(loja);
		
		// Depois dias categorias e dois produtos		
		Categoria cat1 = new Categoria(1L, "Notebooks");  
		Produto p1 = new Produto(1L, "Notebook XYZ", null, BigDecimal.valueOf(5000), cat1, loja);
		Categoria cat2 = new Categoria(2L, "Impressoras");
		Produto p2 = new Produto(1L, "EcoTank", null, BigDecimal.valueOf(1200), cat2, loja);
		System.out.println(p1);
		System.out.println(p2);
		
		// Aqui estamos utilizando o método equals() para comparar dois produtos
		System.out.println("Iguais = "+p1.equals(p2));
		
		
		// Criamos uma lista para armazenar os objetos ItemCompra
		HashSet<ItemCompra> itens = new HashSet<ItemCompra>();
		itens.add(new ItemCompra(p1, 5));
		itens.add(new ItemCompra(p2, 1));
		
		// Vamos instanciar um objeto Caixa para poder chamar suas operações/métodos
		CaixaImpl caixa = new CaixaImpl();
		Compra compra = caixa.registar(itens, cliente, loja, new BigDecimal(100));
		System.out.println(compra);
		
	}

}

