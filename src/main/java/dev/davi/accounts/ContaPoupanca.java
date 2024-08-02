package src.main.java.dev.davi.accounts;

import src.main.java.dev.davi.model.client.Cliente;
import src.main.java.dev.davi.model.account.Conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato src.main.java.dev.davi.model.conta.Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
