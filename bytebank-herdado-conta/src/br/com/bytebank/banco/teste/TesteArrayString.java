package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Conta;

public class TesteArrayString {

	public static void main(String[] args) {

		System.out.println("Funcionou!!");

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	}
}
