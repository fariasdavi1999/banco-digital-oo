package src.main.java.dev.davi.service.impl;

public interface IConta {

	void sacar(double valor, IConta contaOrigem);

	void depositar(double valor, IConta contaDestino);

	void transferir(double valor, IConta contaDestino);

	void imprimirExtrato();
}
