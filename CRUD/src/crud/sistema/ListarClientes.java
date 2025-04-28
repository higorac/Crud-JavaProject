package crud.sistema;

public class ListarClientes {
    protected void listarClientes(Cliente[] clientes, int quantidadeClientes) {
        if (quantidadeClientes == 0) {
            System.out.println("Nenhum cliente cadastrado");
            return;
        } else {
            System.out.println("\n--- Lista de Clientes ---");
            for (int i = 0; i < quantidadeClientes; i++) {
                Cliente c = clientes[i];
                System.out.println(
                        "Nome: " + c.cliente_nome + ", CPF: " + c.cpf + ", ID: " + c.id + ", Saldo: " + c.saldo_bancario);
            }
        }
    }
}
