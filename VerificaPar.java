import java.util.Scanner;

public class VerificaPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero");
        int numero = scanner.nextInt ();

        if (numero %2 == 0){
            System.out.println("O numero"+numero+"é par");
         
        }
        else {
            System.out.println("O numero"+numero+"é ímpar");
        }
      }
}
