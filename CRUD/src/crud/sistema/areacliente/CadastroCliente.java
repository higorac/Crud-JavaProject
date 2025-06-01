package crud.sistema.areacliente;
import java.util.Scanner;

public class CadastroCliente {
    private Scanner sc = new Scanner(System.in);
    private Scanner str = new Scanner(System.in);

    public Cliente cadastroCliente() {

        System.out.println("\n--- Cadastro de Cliente ---");
        System.out.print("Nome: ");
        String cliente_nome = str.nextLine();

        System.out.print("CPF: ");
        String cpf = str.nextLine();

        System.out.print("Sexo: ");
        String sexo = str.nextLine();

        System.out.print("Data de Nascimento: ");
        String data_nascimento = str.nextLine();

        System.out.print("ID: ");
        int id = sc.nextInt();

        System.out.print("Saldo bancário: ");
        double saldo_bancario = sc.nextDouble();

        return new Cliente(cliente_nome, cpf, sexo, data_nascimento, id, saldo_bancario);
    }
}
