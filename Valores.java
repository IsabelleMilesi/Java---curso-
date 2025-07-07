import java.util.Scanner;
public class Valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        if (valor1 == valor2) {
            System.out.println("Os valores são iguais.");
        } else {
            double maior = (valor1 > valor2) ? valor1 : valor2;
            System.out.println("Os valores são diferentes.");
            System.out.println("O maior valor é: " + maior);
        }

        scanner.close();
    }
}