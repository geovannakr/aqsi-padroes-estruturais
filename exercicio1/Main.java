package exercicio1;

import exercicio1.adapter.AdapterPagamento;
import exercicio1.interfaces.PagamentoAtual;

public class Main {
    public static void main(String[] args) {
        PagamentoAtual pagamento = new AdapterPagamento();

        pagamento.configurarPagamento(1000.0);
        String resultado = pagamento.pagar();

        System.out.println(resultado);
    }
}
