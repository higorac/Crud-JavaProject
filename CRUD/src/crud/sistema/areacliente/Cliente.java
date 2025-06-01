package crud.sistema.areacliente;

import crud.sistema.gerenciador.Pessoa;

public class Cliente extends Pessoa {
    protected int id;
    protected double saldo_bancario;

    protected Cliente(String nome, String cpf, String sexo, String data_nascimento, int id, double saldo_bancario) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.data_nascimento = data_nascimento;
        this.id = id;
        this.saldo_bancario = saldo_bancario;
    }
}
