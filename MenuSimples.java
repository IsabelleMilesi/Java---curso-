import java.util.Scanner;

public class MenuSimples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Calcular soma de dois números");
            System.out.println("2. Verificar se um número é par ou ímpar");
            System.out.println("3. Calcular fatorial de um número");
            System.out.println("4. Dizer olá");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    int num1 = input.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int num2 = input.nextInt();
                    System.out.println("Soma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Digite um número: ");
                    int numero = input.nextInt();
                    if (numero % 2 == 0) {
                        System.out.println("O número é par.");
                    } else {
                        System.out.println("O número é ímpar.");
                    }
                    break;
                case 3:
                    System.out.print("Digite um número para calcular o fatorial: ");
                    int n = input.nextInt();
                    long fatorial = 1;
                    for (int i = 1; i <= n; i++) {
                        fatorial *= i;
                    }
                    System.out.println("Fatorial de " + n + " é " + fatorial);
                    break;
                case 4:
                    System.out.println("Olá, usuário!");
                    break;
                case 5:
                    System.out.println("Saindo do programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        input.close();
    }
}
