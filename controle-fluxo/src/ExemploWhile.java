
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    
    public static void main(String[] args) {
        // Declaração e inicialização da variável 'mesada' com o valor inicial de 50.0 (representando o valor total que Joãozinho tem).
        double mesada = 50.0;

        // Início de um laço 'while', que continuará executando enquanto 'mesada' for maior que 0.
        while(mesada>0) {

            // Chama o método 'valorAleatorio()' que retorna um valor aleatório entre 2.0 e 8.0, representando o preço de um doce.
            Double valorDoce = valorAleatorio();

         // Verifica se o valor do doce excede o valor restante da mesada.
            if(valorDoce > mesada)

            // Caso o valor do doce seja maior do que o valor restante da mesada, ajusta o preço do doce para o valor exato da mesada restante.
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");

            // Subtrai o valor do doce do saldo restante da mesada.
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        
   }
   private static double valorAleatorio() {

    // Usa a classe 'ThreadLocalRandom' para gerar um número aleatório do tipo double entre 2.0 e 8.0.
	return ThreadLocalRandom.current().nextDouble(2, 8);
   }
}