import java.util.Scanner;
public class VerificaSinalNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos valores você deseja informar? ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o valor " + i + ": ");
            double valor = scanner.nextDouble();

            if (valor > 0) {
                System.out.println("O valor é positivo.");
            } else if (valor < 0) {
                System.out.println("O valor é negativo.");
            } else {
                System.out.println("O valor é zero.");
            }
        }
        scanner.close();
    }
}

