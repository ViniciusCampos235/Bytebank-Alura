package br.com.bytebank.banco.modelo;

/**
 * Classe principal
 * 
 * @author Vinícius
 * @version 17LTS
 *
 */

public abstract class Conta extends Object {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	/**
	 * Construtor para inicializar o projeto
	 * 
	 * @param agencia
	 * @param numero
	 */

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("o total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("criando uma conta " + this.numero);
	}

	/* Void não devolve resposta */
	public abstract void deposita(double valor);

	/**
	 * Saca saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", valor: " + valor);
		} else {
			this.saldo -= valor;
		}
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	// consulta o saldo
	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("não pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;

		if (this.agencia != outra.agencia) {
			return false;
		}

		if (this.numero != outra.numero) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Numero: " + this.numero + " agencia: " + this.agencia;
	}

}
