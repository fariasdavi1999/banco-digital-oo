package src.main.java.dev.davi.model.account;

public enum TipoConta {
	CONTA_CORRENTE("Conta Corrente"),
	CONTA_POUPANCA("Conta Poupança");

	private final String descricao;

	TipoConta(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
