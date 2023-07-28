package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;
import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
import java.lang.*;


public class TestaContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		ContaEspecial ce = new ContaEspecial(123, 555);

		Conta outra = new ContaCorrente(888, 265);
		outra.deposita(200.0);

		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		cc.transfere(10.0, cp);

		System.out.println("Saldo conta corrente: " + cc.getSaldo());
		System.out.println("Saldo conta po: " + cp.getSaldo());
	}

}
