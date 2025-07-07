public class NumerosPares {
    public static void main(String[] args) {
        int numero = 101;

        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero <= 300);
    }
}
