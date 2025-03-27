package crud;

import java.util.Scanner;

public class Banco {
	
	Scanner sc;
	Scanner str;
	Cliente clientes[] = new Cliente[3];
	int indice = 0;
	
	public Banco(Scanner sc, Scanner str) { // Construtor recebe Scanner
        this.sc = sc;
        this.str = str;
    }

	void cadastroBancario() {
		if (indice >= clientes.length) {
			System.out.println("Sistema cheio. Não foi possivel realizar o cadastro do cliente..");
			return;
		}

		System.out.println("\n--- Cadastro de Cliente ---");
		System.out.print("Nome: ");
		String cliente_nome = str.nextLine();

		System.out.print("CPF: ");
		String cpf = str.nextLine();

		System.out.print("ID: ");
		int id = sc.nextInt();

		System.out.print("Saldo bancário: ");
		double saldo_bancario = sc.nextDouble();
		
        clientes[indice] = new Cliente(cliente_nome, cpf, id, saldo_bancario);
        System.out.println("Cadastro realizado com sucesso!\n");
        indice++;
	}

	public void listarClientes() {
		if (indice == 0) {
			System.out.println("Nenhum cliente cadastrado.");
			return;
		}

		System.out.println("\n--- Lista de Clientes ---");
		for (int i = 0; i < indice; i++) {
			Cliente c = clientes[i];
			System.out.println(
					"Nome: " + c.cliente_nome + ", CPF: " + c.cpf + ", ID: " + c.id + ", Saldo: " + c.saldo_bancario);
		}
	}
}