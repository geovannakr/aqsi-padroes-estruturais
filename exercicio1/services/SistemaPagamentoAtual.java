package exercicio1.services;

import exercicio1.interfaces.PagamentoAtual;

public class SistemaPagamentoAtual implements PagamentoAtual {

    private double valorPagamento;

    @Override
    public void configurarPagamento(double valor) {
        this.valorPagamento = valor;
    }

    @Override
    public String pagar() {
        return "Pagamento realizado pelo sistema novo: R$ " + valorPagamento;
    }
}
