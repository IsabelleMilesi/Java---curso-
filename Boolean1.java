public class Boolean1 {
    public static void main(String[] args) {
        boolean maiorIdade = true;
        boolean notaBoa = false;

        //Operador E (&&)
        boolean entrarFaculdade = maiorIdade && notaBoa;
        
        // Operador OU (||)
        boolean ganhaBolsa = maiorIdade || notaBoa;

        //Operador NÃO (!) inverte o valor 
        boolean notaBaixa = !notaBoa;
        
        System.out.println("Pode entrar na faculdade" + entrarFaculdade);
        System.out.println("Pode ganhar bolsa" + ganhaBolsa);
        System.out.println("Tem nota baixa"+  notaBaixa);

        


    }
}
