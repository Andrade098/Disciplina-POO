public class Conta {
    int numero;
    private float saldo;
    float limite;
    Cliente cliente;

    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    void sacar(float valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("===================");
            System.out.println("Saldo Insuficiente");
            System.out.println("===================");
        }
    }

    public void realizarDeposito(Deposito deposito) {
        this.saldo += deposito.getValor();
    }

    public float getSaldo() {
        return this.saldo + this.limite;
    }
}
