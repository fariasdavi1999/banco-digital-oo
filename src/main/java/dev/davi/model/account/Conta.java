package src.main.java.dev.davi.model.account;

import src.main.java.dev.davi.model.client.Cliente;
import src.main.java.dev.davi.service.impl.IConta;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int sequencial = 1;

	protected Cliente cliente;
	protected TipoConta tipoConta;
	protected int agencia;
	protected int numero;
	protected double saldo;

	protected Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero  = sequencial++;
		this.cliente = cliente;
	}

	protected void imprimirInfosComuns() {
		System.out.println("Titular: " + this.cliente.getNome());
		System.out.println("Conta: " + this.tipoConta.getDescricao());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	@Override
	public void sacar(double valor, IConta contaOrigem) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Novo Saldo: " + this.saldo);
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	@Override
	public void depositar(double valor, IConta contaDestino) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if (this.saldo >= valor) {
			this.sacar(valor, this);
			contaDestino.depositar(valor, this);
		} else {
			System.out.println("Saldo insuficiente para tranferir.");
		}

	}
}
