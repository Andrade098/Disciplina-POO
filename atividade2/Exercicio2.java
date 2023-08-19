package poo;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.println("Escolha a direção da conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double temperaturaCelsius = scanner.nextDouble();
            double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
            System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double temperaturaFahrenheit = scanner.nextDouble();
            double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;
            System.out.println("A temperatura em Celsius é: " + temperaturaCelsius);
        } else {
            System.out.println("Escolha inválida.");
        }

        scanner.close();
    }
}
