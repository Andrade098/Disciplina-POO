import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente rodrigo = new Cliente("Rodrigo Mendes", "Barra da Tijuca, rua 45");
        Cliente marina = new Cliente("Marina Mendes", "Barra da Tijuca, rua 45");

        Conta conta_rodrigo = new Conta(1, 1000.0f, 200.0f, rodrigo);
        Conta conta_marina = new Conta(2, 800.0f, 200.0f, marina);

        System.out.println("Saldo do Rodrigo (Antes do Saque): " + conta_rodrigo.getSaldo());
        System.out.println("Saldo da Marina (Antes do Saque): " + conta_marina.getSaldo());
        System.out.println();
        
        // Será determinado o valor que Rodrigo irá sacar da sua conta, o exemplo abaixo foi 300.
        conta_rodrigo.sacar(300);
        System.out.println("Saldo do Rodrigo (Depois do Saque): " + conta_rodrigo.getSaldo());
        System.out.println("=====================");

        System.out.println("Deseja fazer algum depósito para a sua conta?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        
        int escolha = scanner.nextInt();
        System.out.println("=====================");
        if (escolha == 1) {
            System.out.print("Digite o valor do depósito: ");
            float valorDeposito = scanner.nextFloat();
            Deposito deposito = new Deposito(valorDeposito);
            conta_rodrigo.realizarDeposito(deposito);
            System.out.println("Saldo do Rodrigo (Depois do Depósito): " + conta_rodrigo.getSaldo());
        } else if (escolha == 2) {
            System.out.println("Compilação encerrada.");
        } else {
            System.out.println("Escolha inválida. Compilação encerrada.");
        }
        
        scanner.close();
    }
}
