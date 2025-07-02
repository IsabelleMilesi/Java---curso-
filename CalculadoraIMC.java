import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o peso (kg): ");
        double peso = input.nextDouble();

        System.out.print("Digite a altura (m): ");
        double altura = input.nextDouble();

        
        double imc = peso / (altura * altura);

        
        System.out.printf("Seu IMC é: %.2f%n", imc);

        
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal.");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso.");
        } else {
            System.out.println("Classificação: Obesidade.");
        }

        input.close();
    }
}
