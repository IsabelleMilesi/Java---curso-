    import java.util.Scanner;
    public class SalárioFuncionário {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário base: R$ ");
        double salarioBase = scanner.nextDouble();
        System.out.print("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();
        double percentualBonus;
        if (salarioBase >= 1000 && idade > 50) {
            percentualBonus = 0.10;
        } else if (salarioBase < 1000 && idade <= 50) {
            percentualBonus = 0.05;
        } else {
            percentualBonus = 0.0; 
        }
        double valorBonus = salarioBase * percentualBonus;
        double salarioLiquido = salarioBase + valorBonus;
        System.out.printf("Salário base: R$ %.2f%n", salarioBase);
        System.out.printf("Bônus: R$ %.2f%n", valorBonus);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);
        scanner.close();
    }
}