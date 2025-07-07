import java.util.Scanner;

public class MediadeIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int somaIdades = 0;
        int idade;

        System.out.println("Digite as idades (0 para encerrar):");

        while (true) {
            System.out.print("Idade da pessoa: ");
            idade = scanner.nextInt();

            if (idade == 0) {
                break; 
            }

            somaIdades += idade;
            contador++;
        }

        if (contador > 0) {
            double media = (double) somaIdades / contador;
            System.out.println("Número de pessoas: " + contador);
            System.out.printf("Idade média do grupo: %.2f%n", media);
        } else {
            System.out.println("Nenhuma idade válida foi informada.");
        }

        scanner.close();
    }
}
