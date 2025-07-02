import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite o salário base do funcionário: R$ ");
        double salarioBase = input.nextDouble();

        System.out.print("Digite a idade do funcionário: ");
        int idade = input.nextInt();

        double bonus;

        // Regra de negócio para cálculo do bônus
        if (salarioBase >= 1000 && idade > 50) {
            bonus = salarioBase * 0.10;
        } else if (salarioBase < 1000 && idade <= 50) {
            bonus = salarioBase * 0.05;
        } else {
            bonus = 0.0;
        }

        double salarioLiquido = salarioBase + bonus;

        // Exibição dos resultados
        System.out.println("\n--- Resultado ---");
        System.out.printf("Salário base: R$ %.2f%n", salarioBase);
        System.out.printf("Bônus: R$ %.2f%n", bonus);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        input.close();
    }
}
