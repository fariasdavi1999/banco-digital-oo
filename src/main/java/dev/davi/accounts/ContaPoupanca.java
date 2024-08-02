package src.main.java.dev.davi.accounts;

import src.main.java.dev.davi.model.account.Conta;
import src.main.java.dev.davi.model.account.TipoConta;
import src.main.java.dev.davi.model.client.Cliente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		setTipoConta(TipoConta.CONTA_POUPANCA);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato " + tipoConta.getDescricao() + " ===");
		super.imprimirInfosComuns();
	}
}
