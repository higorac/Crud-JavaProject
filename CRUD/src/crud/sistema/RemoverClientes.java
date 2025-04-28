package crud.sistema;

import java.util.Scanner;

public class RemoverClientes {
    private Scanner sc = new Scanner(System.in);
    private Scanner str = new Scanner(System.in);

    protected int removerCliente(Cliente[] clientes, int indice) {
        if (indice == 0) {
            System.out.println("Não há clientes cadastrados.");
            return indice;
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
                removido = removerPorNome(nomeBusca, clientes, indice);
                if (removido) {
                    return indice - 1;
                } else {
                    System.out.println("Cliente não encontrado, não foi possível realizar a remoção.");
                }
                break;
            case 2:
                System.out.print("Digite o CPF do Cliente: ");
                String CPFBusca = str.nextLine();
                removido = removerPorCPF(CPFBusca, clientes, indice);
                if (removido) {
                    return indice - 1;
                } else {
                    System.out.println("Cliente não encontrado, não foi possível realizar a remoção.");
                }
                break;
            case 3:
                System.out.print("Digite o ID do Cliente: ");
                int idBusca = sc.nextInt();
                removido = removerPorID(idBusca, clientes, indice);
                if (removido) {
                    return indice - 1;
                } else {
                    System.out.println("Cliente não encontrado, não foi possível realizar a remoção.");
                }
                break;
            default:
                System.out.println("Opção Inválida.");
        }
        return indice;
    }

    private boolean removerPorNome(String nome, Cliente[] clientes, int indice) {
        for (int i = 0; i < indice; i++) {
            if (clientes[i].cliente_nome.equalsIgnoreCase(nome)) {
                removerClienteNaPosicao(i, clientes, indice);
                System.out.println("Remoção bem sucedida.");
                return true;
            }
        }
        return false;
    }

    private boolean removerPorID(int id, Cliente[] clientes, int indice) {
        for (int i = 0; i < indice; i++) {
            if (clientes[i].id == id) {
                removerClienteNaPosicao(i, clientes, indice);
                System.out.println("Remoção bem sucedida.");
                return true;
            }
        }
        return false;
    }

    private boolean removerPorCPF(String cpf, Cliente[] clientes, int indice) {
        for (int i = 0; i < indice; i++) {
            if (clientes[i].cpf.equalsIgnoreCase(cpf)) {
                removerClienteNaPosicao(i, clientes, indice);
                System.out.println("Remoção bem sucedida.");
                return true;
            }
        }
        return false;
    }

    private void removerClienteNaPosicao(int posicao, Cliente[] clientes, int indice) {
        for (int i = posicao; i < indice - 1; i++) {
            clientes[i] = clientes[i + 1];
        }
        clientes[indice - 1] = null;
    }
}
