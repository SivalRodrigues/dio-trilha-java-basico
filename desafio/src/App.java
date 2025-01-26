import java.util.Scanner;
// Importa a classe Scanner do pacote java.util, necessária para capturar entradas do usuário.

 // Declaração da classe pública chamada Problem. O nome da classe deve coincidir com o nome do arquivo .java.
public class App {
        public static void main(String[] args) throws Exception {// Declaração do método principal, ponto de entrada do programa.
        System.out.println("Hello, World!");

        Scanner leitor = new Scanner(System.in); // Criação de um objeto Scanner chamado "leitor" para capturar entradas do teclado (System.in).
        int N = leitor.nextInt(); // Lê um número inteiro da entrada e o armazena na variável "N". Representa o número de casos de teste.
        String jogador1, jogador2; // Declaração de duas variáveis do tipo String que armazenarão as escolhas dos dois jogadores.

        for (int i = 0; i < N; i++) { // Inicia um laço "for" que será executado "N" vezes, uma vez para cada caso de teste.
            jogador1 = leitor.next(); // Lê a escolha do jogador 1 (uma palavra) da entrada e a armazena na variável "jogador1".
            jogador2 = leitor.next(); // Lê a escolha do jogador 2 (uma palavra) da entrada e a armazena na variável "jogador2".

            if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque"))
                System.out.println("Aniquilacao mutua");
                // Verifica se ambos os jogadores escolheram "ataque".
                // Se verdadeiro, imprime "Aniquilacao mutua" (todos perdem).
            
            else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel"))
                System.out.println("Ambos venceram");
                // Verifica se ambos os jogadores escolheram "papel".
                // Se verdadeiro, imprime "Ambos venceram" (ambos ganham).

            else if (jogador1.equalsIgnoreCase("ataque"))
                System.out.println("Jogador 1 venceu");
                // Verifica se apenas o jogador 1 escolheu "ataque".
                // Se verdadeiro, imprime "Jogador 1 venceu".

            else if (jogador2.equalsIgnoreCase("ataque"))
                System.out.println("Jogador 2 venceu");
                // Verifica se apenas o jogador 2 escolheu "ataque".
                // Se verdadeiro, imprime "Jogador 2 venceu".

            else if (jogador2.equalsIgnoreCase("papel"))
                System.out.println("Jogador 1 venceu");
                // Verifica se apenas o jogador 2 escolheu "papel".
                // Se verdadeiro, o jogador 1 ganha e imprime "Jogador 1 venceu".

            else if (jogador1.equalsIgnoreCase("papel"))
                System.out.println("Jogador 2 venceu");
                // Verifica se apenas o jogador 1 escolheu "papel".
                // Se verdadeiro, o jogador 2 ganha e imprime "Jogador 2 venceu".

            else
                System.out.println("Sem ganhador");
                // Caso nenhuma das condições acima seja satisfeita, significa que ambos escolheram "pedra".
                // Nesse caso, imprime "Sem ganhador".
        }

        leitor.close(); // Fecha o objeto Scanner, liberando o recurso associado à entrada do teclado.
    }
}