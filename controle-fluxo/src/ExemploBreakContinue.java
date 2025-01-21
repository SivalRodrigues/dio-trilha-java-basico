public class ExemploBreakContinue {
    public static void main(String[] args) {
        // Laço "for" que inicia a variável 'numero' com 1 e executa enquanto 'numero' for menor ou igual a 5.
        // A cada iteração, o valor de 'numero' é incrementado em 1 (numero++).
        for(int numero = 1; numero <=5; numero ++){

             // Verifica se o valor de 'numero' é igual a 3.
            if(numero==3)
            
            // O "continue" faz o laço pular o restante do código da iteração atual e ir para a próxima iteração.
           continue;
            System.out.println(numero);
        }

    }
}
