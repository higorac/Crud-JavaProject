package crud;

import java.util.Scanner;

public class Banco {

	Scanner str = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);

	Cliente clientes[] = new Cliente[3];
	int indice = 0;
	int op = 0;

	void sistema() {
		do {

			System.out.println("\nMenu:");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Listar Clientes");
			System.out.println("3 - Procurar Cliente");
			System.out.println("4 - Remover Cliente");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			op = sc.nextInt();

			switch (op) {
			case 1:
				cadastroBancario();
				break;
			case 2:
				listarClientes();
				break;
			case 3:
				procurarClientes();
				break;
			case 4:
				removerClinte();
				break;
			case 0:
				System.out.println("Encerrando programa..");
				break;
			default:
				System.out.println("Opção invalida.");
			}

		} while (op != 0);
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

	void listarClientes() {
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

	void procurarClientes() {
		if (indice == 0) {
			System.out.println("Não há clientes cadastrados.");
			return;
		}

		System.out.println("----/ Buscar Cliente: /----");
		System.out.println("1 - Buscar por nome");
		System.out.println("2 - Buscar por ID");
		System.out.println("3 - Buscar por CPF");
		System.out.print("Escolha uma das opções: ");
		int op = sc.nextInt();

		boolean encontrado = false;

		switch (op) {
		case 1:
			System.out.println("Digite o nome do cliente: ");
			String nomeBusca = str.nextLine();
			for (int i = 0; i < indice; i++) {
				if (clientes[i].cliente_nome.equalsIgnoreCase(nomeBusca)) {
					exibirCliente(clientes[i]);
					encontrado = true;
				}
			}
			break;
		case 2:
			System.out.println("Digite o ID do cliente: ");
			int idBusca = str.nextInt();
			for (int i = 0; i < indice; i++) {
				if (clientes[i].id == idBusca) {
					exibirCliente(clientes[i]);
					encontrado = true;
				}
			}
			break;
		case 3:
			System.out.println("Digite o CPF do cliente: ");
			String cpfBusca = str.nextLine();
			for (int i = 0; i < indice; i++) {
				if (clientes[i].cpf.equalsIgnoreCase(cpfBusca)) {
					exibirCliente(clientes[i]);
					encontrado = true;
				}
			}
			break;
		default:
			System.out.println("Opção invalida.");
			return;
		}

		if (!encontrado) {
			System.out.println("Cliente não foi encontrado.");
		}
	}

	void exibirCliente(Cliente c) {
		System.out.println("\n--- Cliente Encontrado ---");
		System.out.println("Nome: " + c.cliente_nome);
		System.out.println("CPF: " + c.cpf);
		System.out.println("ID: " + c.id);
		System.out.println("Saldo: " + c.saldo_bancario);
	}

	void removerClinte() {
		if (indice == 0) {
			System.out.println("Não há clientes cadastrados.");
			return;
		}

		System.out.println("---/ Remover Cliente /---");
		System.out.println("1 - Remover por Nome");
		System.out.println("2 - Remover por CPF");
		System.out.println("3 - Remover por ID");
		System.out.print("Escolha uma opção: ");
		int opcao = sc.nextInt();

		boolean removido = false;

		switch (opcao) {
		case 1:
			System.out.print("Digite o nome do Cliente: ");
			String nomeBusca = str.nextLine();
			removido = removerPorNome(nomeBusca);
			if(!removido) {
				System.out.println("Cliente não encontrado, não foi possivel realizar a remoção.");
			}
			break;
		case 2:
			System.out.print("Digite o CPF do Cliente: ");
			String CPFBusca = str.nextLine();
			removido = removerPorCPF(CPFBusca);
			if(!removido) {
				System.out.println("Cliente não encontrado, não foi possivel realizar a remoção.");
			}
			break;
		case 3:
			System.out.print("Digite o ID do Cliente: ");
			int idBusca = sc.nextInt();
			removido = removerPorID(idBusca);
			if(!removido) {
				System.out.println("Cliente não encontrado, não foi possivel realizar a remoção.");
			}
			break;
		default:
			System.out.println("Opção Inválida.");
			return;
		}
	}

	boolean removerPorNome(String nome) {
		for (int i = 0; i < indice; i++) {
			if (clientes[i].cliente_nome.equalsIgnoreCase(nome)) {
				removerClienteNaPosicao(i);
				System.out.println("Remoção bem sucedida.");
				return true;
			}
		}
		return false;
	}

	boolean removerPorID(int id) {
		for (int i = 0; i < indice; i++) {
			if (clientes[i].id == id) {
				removerClienteNaPosicao(i);
				System.out.println("Remoção bem sucedida.");
				return true;
			}
		}
		return false;
	}

	boolean removerPorCPF(String cpf) {
		for (int i = 0; i < indice; i++) {
			if (clientes[i].cpf.equalsIgnoreCase(cpf)) {
				removerClienteNaPosicao(i);
				System.out.println("Remoção bem sucedida.");
				return true;
			}
		}
		return false;
	}

	void removerClienteNaPosicao(int posicao) {
		for (int i = posicao; i < indice - 1; i++) {
			clientes[i] = clientes[i - 1];
		}
		clientes[indice - 1] = null;
		indice--;
	}
}