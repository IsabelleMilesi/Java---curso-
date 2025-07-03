import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
    int numero;
    int soma = 0;

    System.out.println("Digite uma lista de número para somar. Digite 0 para sair");

    while ((numero=scanner.nextInt)){
        soma+=numero;
    }
    System.out.println("A soma dos números digitados é"+soma);

    scanner.close();
    }
}
