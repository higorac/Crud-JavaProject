package crud.sistema;
import java.util.Scanner;

public class Cadastro {
    private Scanner sc = new Scanner(System.in);
    private Scanner str = new Scanner(System.in);

    protected Cliente cadastroBancario() {

        System.out.println("\n--- Cadastro de Cliente ---");
        System.out.print("Nome: ");
        String cliente_nome = str.nextLine();

        System.out.print("CPF: ");
        String cpf = str.nextLine();

        System.out.print("ID: ");
        int id = sc.nextInt();

        System.out.print("Saldo bancário: ");
        double saldo_bancario = sc.nextDouble();

        System.out.println("Cadastro realizado com sucesso!\n");
        return new Cliente(cliente_nome, cpf, id, saldo_bancario);
    }
}
