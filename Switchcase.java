public class Switchcase{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o número de pernas");
        int pernas = scanner.nextInt();

        String tipo;
        
        switch (pernas){
        case 1:
            tipo = "saci";
            break;
        case 2:
            tipo = "Bípede";
            break; 
        case 4: 
            tipo "Quadrúpede";
            break;
        case 6:
        case 8:
            tipo "Aracnídeo";
            break;
        default:
            tipo = "ET";
        }
        System.out.println("O tipo que você selecionou é"+tipo);
        scanner.close
    }
}