public class Encadeadanotas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite sua nota");
        double nota = scanner.nextDouble();

        if (nota >=7){
          System.out.println("Aprovado");
        }
       else if (nota >=5){
        System.out.println("Recuperação");
       }
       else {
         System.out.println("Reprovado");
       }
        scanner.close();
    }
}