package crud.sistema;
import java.util.Scanner;

public class ProcurarClientes {
    private Scanner sc = new Scanner(System.in);
    private Scanner str = new Scanner(System.in);

    protected void procurarClientes(Cliente[] clientes, int indice) {
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

    private void exibirCliente(Cliente c) {
        System.out.println("\n--- Cliente Encontrado ---");
        System.out.println("Nome: " + c.cliente_nome);
        System.out.println("CPF: " + c.cpf);
        System.out.println("ID: " + c.id);
        System.out.println("Saldo: " + c.saldo_bancario);
    }
}
