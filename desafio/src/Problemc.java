import java.util.Scanner;

public class Problemc {
    public static void main(String[] args){
        System.out.println("Rodando");
        Scanner leitor = new Scanner(System.in);

        // Lendo o número de casos de teste
        int C = leitor.nextInt();
        String nome;
        int N;

        // Processando cada caso de teste
        for (int i = 0; i < C; i++) {
            nome = leitor.next(); // Nome de quem está tentando levantar o martelo
            N = leitor.nextInt(); // Força aplicada

            // Verificando se a pessoa conseguiu levantar o martelo
            if (nome.equals("Thor"))
                System.out.println("Y"); // Thor sempre consegue levantar o martelo
            else
                System.out.println("N"); // Outras pessoas não conseguem
        }

        leitor.close();
    }
}