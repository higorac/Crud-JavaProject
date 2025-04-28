package crud.sistema;

import java.util.Scanner;

public class Banco {

	Scanner str = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);

	private Cadastro cadastro = new Cadastro();
	private ListarClientes lista = new ListarClientes();
	private ProcurarClientes procurarClientes = new ProcurarClientes();
	private RemoverClientes removerCliente = new RemoverClientes();

	private Cliente clientes[] = new Cliente[3];
	private int indice = 0;
	private int op = 0;

	public void sistema() {
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
				if (indice < clientes.length) {
					Cliente novoCliente = cadastro.cadastroBancario();
					clientes[indice] = novoCliente;
					indice++;
				} else {
					System.out.println("Limite de clientes atingido! Não é possível cadastrar novos clientes.");
				}
				break;
			case 2:
				lista.listarClientes(clientes, indice);
				break;
			case 3:
				procurarClientes.procurarClientes(clientes, indice);
				break;
			case 4:
				indice = removerCliente.removerCliente(clientes, indice);
				break;
			case 0:
				System.out.println("Encerrando programa..");
				break;
			default:
				System.out.println("Opção invalida.");
			}

		} while (op != 0);
	}

}