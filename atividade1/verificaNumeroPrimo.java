package verificaNumeroPrimo.java;
public class Exemplo1 {

		public static void main(String[] args) {


		int numero = 17; // Altere o número aqui para verificar se é primo ou não
			        
		if (verificaNumeroPrimo(numero) == 1) {
			            System.out.println(numero + " é um número primo.");
	
		} else {
	    System.out.println(numero + " não é um número primo.");
	}
}

	     public static int verificaNumeroPrimo(int n) {
			        if (n <= 1) {
			            return 0; // Números menores ou iguais a 1 não são primos
			        }
			        
			        for (int i = 2; i <= Math.sqrt(n); i++) {
			            if (n % i == 0) {
			                return 0; // Encontrou um divisor, não é primo
			            }
			        }
			        
			        return 1; // Número é primo
			    }
			}


