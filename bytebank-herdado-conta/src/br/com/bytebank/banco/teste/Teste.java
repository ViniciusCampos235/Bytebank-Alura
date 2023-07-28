package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class Teste {

	public static void main(String[] args) {

		GuardadorDeContas guardador = new GuardadorDeContas();

		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);

		Conta cc2 = new ContaCorrente(22, 11);
		guardador.adiciona(cc2);

		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println("tamanho: " + tamanho);

		Conta ref = (Conta) guardador.getReferencia(0);
		System.out.println(ref.getNumero());

	}
}
