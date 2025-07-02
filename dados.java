import java.util.Scanner;

public class dados {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        float nota; 

        System.out.println("Digite o nome do aluno");
        String nomeAluno = leia.nextLine();
        
        System.out.println("Digite a nota do aluno");
        nota = leia.nextFloat();

        System.out.println("A nota do aluno (a)"+nomeAluno+"é:"+ nota);
        leia.close ();

    }    
}
