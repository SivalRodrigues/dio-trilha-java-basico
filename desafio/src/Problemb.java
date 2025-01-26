import java.util.Scanner; 
public class Problemb {
    public static void main(String[] args) {
        System.out.println("SITEMA RODANDO");
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada
        String[] nomes = new String[10]; // Declara um array de Strings com 10 posições para armazenar os nomes

        // Loop para ler os 10 nomes
        for (int i = 0; i < 10; i++) {
            nomes[i] = sc.nextLine(); // Lê cada linha da entrada e armazena no array
        }

        // Imprime os nomes solicitados
        System.out.println(nomes[2]); // Terceiro nome (índice 2)
        System.out.println(nomes[6]); // Sétimo nome (índice 6)
        System.out.println(nomes[8]); // Nono nome (índice 8)

        sc.close(); // Fecha o Scanner para liberar os recursos
       
    }
}