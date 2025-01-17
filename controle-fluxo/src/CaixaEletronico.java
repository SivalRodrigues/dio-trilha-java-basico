public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0; // Inicializa a variável 'saldo' com o valor 25.0.
        double valorSolicitado = 17.0; // Inicializa a variável 'valorSolicitado' com o valor 17.0.


        if(valorSolicitado < saldo) // Verifica se 'valorSolicitado' é menor que 'saldo'.
        saldo = saldo - valorSolicitado; // Se a condição for verdadeira, subtrai 'valorSolicitado' do 'saldo'.

        System.out.println(saldo);
        
    }
}
