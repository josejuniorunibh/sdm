package br.unibh.teste1;

import br.unibh.teste1.entidades.Criptomoeda;
import br.unibh.teste1.entidades.TipoCripto;

public class Main {

	public static void main(String[] args) {
		
		/*System.out.println("Olá Mundo!");
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(i + " Olá Mundo!");
			
		}*/
		
		Criptomoeda c1 = 
				new Criptomoeda(1L, "Ethereum", 
				"Criptomoeda criada em...", TipoCripto.DeFi);
		
		System.out.println(c1);

		Criptomoeda c2 = 
				new Criptomoeda(1L, "Ethereum", 
				"Criptomoeda criada em...", TipoCripto.DeFi);
		
		if (c1.equals(c2)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		System.out.println(c1.getDescricao());
		c1.setDescricao("Descrição alterada");
		System.out.println(c1);
	}

}
