package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 4587);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadoraDeImposto calc = new CalculadoraDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}
	
}
