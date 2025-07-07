 import java.util.Scanner;
public class DescontoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();
        double percentualDesconto = (valorCompra >= 500.00) ? 0.20 : 0.15;
        double valorDesconto = valorCompra * percentualDesconto;
        double valorFinal = valorCompra - valorDesconto;
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor total com desconto: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}