package crud.sistema.gerenciador;

import crud.sistema.areacliente.*;

import java.util.Scanner;

public class Banco {

	Scanner sc = new Scanner(System.in);

	private CadastroCliente cadastroCliente = new CadastroCliente();
	private ListarClientes lista = new ListarClientes();
	private ProcurarClientes procurarClientes = new ProcurarClientes();
	private RemoverClientes removerCliente = new RemoverClientes();
	private SistemaCliente sistemaCliente = new SistemaCliente();

	private Cliente clientes[] = new Cliente[3];
	private int indice = 0;
	private int op = 0;

	public void sistema() {
		do {
			System.out.println("\nMenu Principal:");
			System.out.println("1 - Gerente");
			System.out.println("2 - Cliente");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			op = sc.nextInt();

			switch (op) {
				case 1:
					System.out.println("\nOpções do Gerente (não implementado ainda).");
					// Implementar lógica para Gerente, se necessário.
					break;
				case 2:
					sistemaCliente.sistemaCliente();
					//Sistema de cadastro implementada
					/*if (indice < clientes.length) {
						Cliente novoCliente = cadastroCliente.cadastroCliente();
						clientes[indice] = novoCliente;
						indice++;
						System.out.println("Cliente cadastrado com sucesso!");
					} else {
						System.out.println("Limite de clientes atingido! Não é possível cadastrar novos clientes.");
					}*/
					break;
				case 0:
					System.out.println("Encerrando programa..");
					break;
				default:
					System.out.println("Opção inválida.");
			}
		} while (op != 0);
	}
}