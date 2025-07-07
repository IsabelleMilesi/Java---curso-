import java.util.Scanner;

public class MediaInflacaoAnual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] inflacao = new double[12];
        double soma = 0;

        System.out.println("Informe os dados de inflação de cada mês (%):");

        for (int i = 0; i < 12; i++) {
            System.out.printf("Mês %d: ", i + 1);
            inflacao[i] = scanner.nextDouble();
            soma += inflacao[i];
        }

        double media = soma / 12;

        System.out.printf("\nInflação média anual: %.2f%%%n", media);

        scanner.close();
    }
}
