public class Encadeado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o ano de nascimento");
        int nascimento = scanner.nextInt();
        int idade = 2025 - nascimento;
        
        System.out.println("Você tem"+idade+"anos");

        if (idade < 16 ){
           System.out.println("Não vota");
        }
          else if ((idade > = 16 && idade <18)) || ((idade > 80)) {
            System.out.println("Voto é opcional");
        }
        else 
        {
            System.out.println("O voto é obrigatório");
        }


       scanner.close();
    }
}