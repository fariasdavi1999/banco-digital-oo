package src.main.java.dev.davi.accounts;

import src.main.java.dev.davi.model.client.Cliente;
import src.main.java.dev.davi.model.account.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato src.main.java.dev.davi.model.conta.Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
