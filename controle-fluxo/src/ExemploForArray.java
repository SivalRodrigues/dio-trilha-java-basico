public class ExemploForArray {
    public static void main(String[] args) {
    
       //em arrays o indice inicia em ZERO

       // Declaração de um array chamado "alunos" que contém uma lista de 4 nomes (strings)

       String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS" };

    // Laço "for" que irá percorrer cada posição (índice) do array "alunos"
    // O "x" começa em 0 e vai até o último índice do array "alunos" (alunos.length - 1)
    // Em cada iteração, imprimimos o índice atual (x) e o valor correspondente em "alunos[x]"    

       for (int x=0; x < alunos.length; x++){
           System.out.println("O aluno no indice x= " + x + " é " + alunos [x]);
       }
   
       String alunoz [] = {"SIVAL", "DIEGO", "EVERTON", "GUSTAVO" };
   
       for (String aluno : alunoz){
           System.out.println("Nome do aluno é: " + aluno);
       }
   


        
    }
    
}
