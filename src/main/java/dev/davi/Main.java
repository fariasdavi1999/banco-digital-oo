package src.main.java.dev.davi;

import src.main.java.dev.davi.accounts.ContaCorrente;
import src.main.java.dev.davi.accounts.ContaPoupanca;
import src.main.java.dev.davi.model.client.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente clienteUm = new Cliente();
		clienteUm.setNome("Davi");

		ContaCorrente contaCorrente = new ContaCorrente(clienteUm);
		ContaPoupanca contaPoupanca = new ContaPoupanca(clienteUm);

		contaCorrente.depositar(100, contaCorrente);
		contaCorrente.imprimirExtrato();
		contaCorrente.transferir(101, contaPoupanca);
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	}

}
