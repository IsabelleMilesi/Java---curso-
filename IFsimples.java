import java.util.Scanner;

public class IFsimples{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        double n1, n2,media;

        System.out.println("Digite a primeira nota");
        n1 = scanner.nextDouble ();

        System.out.println("Digite a segunda nota");
        n2 = scanner.nextDouble();

        media = (n1+n2)/2;
        System.out.println("Sua média é" +media);
        if (media  >= 9) {
            System.out.println("Parabéns");
        }       
        scanner.close();
    }
}