import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TODO:Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        // Solicitação dos dados do usuário

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        scanner.nextLine(); // Consumir a quebra de linha pendente
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

      
    }
}
