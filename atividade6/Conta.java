public class Conta {
    // O saldo será declarado como privado, abaixo do código sera feito um metedo para deixalo "publico"
    int numero;
    private float saldo;
    float limite;
    Cliente cliente;

    public Conta(int numero, float saldo, float limite, Cliente cliete) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    void sacar(float valor) {
        if(valor <= this.saldo){
            this.saldo = this.saldo - valor;
        }else {
            System.out.println("===================");
            System.out.println("Saldo Insuficiente");
            System.out.println("===================");
        }
    }

    void depositar(float valor) {
        this.saldo = this.saldo + valor;
    }

    // Método getter do  atributo saldo, para torna-lo "publico" para ser acessado pelo usuario da conta
    public float getSaldo(){
        return this.saldo + this.limite;
    }


}
