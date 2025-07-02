import java.util.Scanner;

public class Condicaocomposta {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner (System.in);
        System.out.println("Digite o seu nascimento");
        int nasc = scanner.nextInt ();
        double idade = 2025 - nasc; 
         
        if (idade >=18) {
        System.out.println("maior");
        }
        else {
            System.out.println("menor");
        }
        scanner.close ();
    }
}
