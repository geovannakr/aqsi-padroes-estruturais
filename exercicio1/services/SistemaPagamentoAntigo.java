package exercicio1.services;

import exercicio1.interfaces.PagamentoAntigo;

public class SistemaPagamentoAntigo implements PagamentoAntigo {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado pelo sistema antigo: R$ " + valor);
    }
}