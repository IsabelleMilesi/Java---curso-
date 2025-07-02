import java.util.Scanner;

public class Encadeada3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite sua idade ");
        int idade = scanner.nextInt();
        
        if (idade < 12 ){
            System.out.println("Criança");
        }
        else if (idade < 18){
            System.out.println("adolescente");
        }
        else if (idade <60){
            System.out.println("idoso");
        }
        else {
            System.out.println("velho");
        }
        scanner.close();
    }
}