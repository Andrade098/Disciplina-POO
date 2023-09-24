public class Programa {
    public static void main(String[] args) {
        
        Cliente rodrigo = new Cliente("Rodrigo Mendes", "Barra da Tijuca, rua 45");
        Cliente marina = new Cliente("Marina Mendes", "Barra da Tijuca, rua 45");

        // Condições da conta do casal, envolvendo o Saldos e o limite de ambos os dois
        Conta conta_rodrigo = new Conta(1, 1000.0f, 200.0f, rodrigo);
        Conta conta_marina = new Conta(2, 800.0f, 200.0f, marina);

        System.out.println("Saldo do Rodrigo (Antes do Saque): " + conta_rodrigo.getSaldo());
        System.out.println("Saldo do Maria (Antes do Saque): " + conta_marina.getSaldo());
        System.out.println();
        // Será determinado o valor que Rodrigo irá sacar da sua conta, o exemplo a baixo foi 300.
        conta_rodrigo.sacar(300);
        System.out.println("Saldo do Rodrigo (Depois do Saque): " + conta_rodrigo.getSaldo());
   
    }
}
