package crud;

public class Cliente {
	String cliente_nome = null;
	int id;
	double saldo_bancario;
	String cpf;

	public Cliente(String cliente_nome, String cpf, int id, double saldo_bancario) {
		this.cliente_nome = cliente_nome;
		this.cpf = cpf;
		this.id = id;
		this.saldo_bancario = saldo_bancario;
	}

}
