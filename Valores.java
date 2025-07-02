import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operações com dois valores");

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        double soma = valor1 + valor2;
        double subtracao = valor1 - valor2;
        double multiplicacao = valor1 * valor2;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        if (valor2 != 0) {
            double divisao = valor1 / valor2;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Divisão: impossível dividir por zero.");
        }

        scanner.close();
    }
}
