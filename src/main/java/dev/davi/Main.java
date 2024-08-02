package src.main.java.dev.davi;

import src.main.java.dev.davi.accounts.ContaCorrente;
import src.main.java.dev.davi.accounts.ContaPoupanca;
import src.main.java.dev.davi.model.client.Cliente;
import src.main.java.dev.davi.model.account.Conta;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
