public class ControleFinancas{
    public static void main(String[] args){
        double saldoInicial = 1500.00;
        double receita = 800.50;
        double despesa = 249.90;

        double saldoFinal = saldoInicial + receita - despesa;
        int totalTransacoes = 2+3;
        double valorDobrado = despesa*2;
        double valorPorPessoa = 100.00/3;


        saldoFinal += 50.00;
        saldoFinal -= 20.00;


        System.out.println("Saldo Inicial: R$ "+saldoInicial);
        System.out.println("Receita: R$ "+receita);
        System.out.println("Despesa: R$ "+despesa);
        System.out.println("Saldo Final: R$ "+saldoFinal);
        System.out.println("Valor duplicado de despesa: R$ "+valorDobrado);

    }
}