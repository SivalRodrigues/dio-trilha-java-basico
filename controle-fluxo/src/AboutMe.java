import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) {

        try{
        // Criando o objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // O método useLocale(Locale.US) configura o scanner para interpretar números no formato americano,
        // onde o ponto (.) é usado como separador decimal, em vez da vírgula (,).

        
        System.out.println("Digite seu nome"); 
        // Solicita ao usuário que digite o nome
        String nome = scanner.next();
        // Lê a próxima palavra digitada pelo usuário e armazena na variável 'nome'
        
        System.out.println("Digite seu sobrenome");
        // Solicita ao usuário que digite o sobrenome
        String sobrenome = scanner.next();
        // Lê a próxima palavra digitada pelo usuário e armazena na variável 'sobrenome'

        System.out.println("Digite sua idade");
        // Solicita ao usuário que digite sua idade
        int idade = scanner.nextInt();
        // Lê o próximo número inteiro digitado pelo usuário e armazena na variável 'idade'
        
        System.out.println("Digite sua altura");
        // Solicita ao usuário que digite sua altura
        double altura = scanner.nextDouble();
        // Lê o próximo número decimal digitado pelo usuário e armazena na variável 'altura'

        
        // Exibindo os dados obtidos do usuário
        // Imprime o nome e sobrenome em letras maiúsculas, concatenando-os com "Ola, me chamo"
        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
          
        // Imprime a idade do usuário
        System.out.println("Tenho " + idade + " anos ");

        // Imprime a altura do usuário
        System.out.println("Minha altura é " + altura + "cm ");

        // Fecha o objeto Scanner para liberar os recursos do sistema
        scanner.close();   
        }

        // Captura a exceção InputMismatchException, que ocorre quando o usuário digita
        // um valor incompatível com o tipo esperado (exemplo: texto no lugar de número)
        catch(InputMismatchException e){
            System.out.println("Informar os campos idade e altura precisam ser númericos");
             // Exibe uma mensagem de erro para o usuário, informando que idade e altura precisam ser números
        }
    }
}
