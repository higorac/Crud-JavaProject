package crud;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Primeiro projeto CRUD - Seminário 31/03");
		
		Scanner str = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
		Banco BRADESCO = new Banco(sc, str);
		int op = -1;
		
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
            		BRADESCO.cadastroBancario();
            		break;
            	case 2:
            		BRADESCO.listarClientes();
            		break;
            	case 3:
            		BRADESCO.procurarClientes();
            		break;
            	case 4:
            		BRADESCO.removerClinte();
            		break;
            	case 0:
            		System.out.println("Encerrando programa..");
            		break;
            	default:
            		System.out.println("Opção invalida.");
            }
			
		} while(op != 0);
		
	}
}
