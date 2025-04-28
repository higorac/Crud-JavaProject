package crud.sistema;

public class Cliente {
	protected String cliente_nome = null;
	protected int id;
	protected double saldo_bancario;
	protected String cpf;

	protected Cliente(String cliente_nome, String cpf, int id, double saldo_bancario) {
		this.cliente_nome = cliente_nome;
		this.cpf = cpf;
		this.id = id;
		this.saldo_bancario = saldo_bancario;
	}

}
