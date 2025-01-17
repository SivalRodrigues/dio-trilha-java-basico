public class ResultadoEsocolar {
    public static void main(String[] args) {
        int nota = 4; // Declara uma variável do tipo inteiro chamada 'nota' e atribui o valor 4 a ela.

        if(nota >=7) // Verifica se o valor de 'nota' é maior ou igual a 7.
        System.out.println("Aprovado"); // Se a condição acima for verdadeira, imprime "Aprovado".

        else if (nota >= 5 && nota <7) // Caso a primeira condição seja falsa, verifica se 'nota' está entre 5 (inclusivo) e 7 (exclusivo).

        System.out.println("Prova Recuperação"); // Se essa condição for verdadeira, imprime "Prova Recuperação".

        else // Caso nenhuma das condições anteriores seja verdadeira (ou seja, 'nota' é menor que 5),
        System.out.println("Reprovado"); // Imprime "Reprovado".
    }
}
