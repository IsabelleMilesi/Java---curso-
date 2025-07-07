    import java.util.Scanner;

    public class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();
        double desconto;
        if (valorCompra >= 500.00) {
            desconto = 0.20; 
        } else {
            desconto = 0.15; 
        }
        double valorFinal = valorCompra - (valorCompra * desconto);
        System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
        System.out.printf("Valor a pagar após o desconto: R$ %.2f%n", valorFinal);
        scanner.close();
    }
}