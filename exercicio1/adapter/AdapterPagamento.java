package exercicio1.adapter;

import exercicio1.interfaces.PagamentoAntigo;
import exercicio1.interfaces.PagamentoAtual;
import exercicio1.services.SistemaPagamentoAntigo;

public class AdapterPagamento implements PagamentoAtual {

    private SistemaPagamentoAntigo sistemaAntigo;
    private double valorPagamento;

    public AdapterPagamento() {
        this.sistemaAntigo = new SistemaPagamentoAntigo();
    }

    @Override
    public void configurarPagamento(double valor) {
        this.valorPagamento = valor;
    }

    @Override
    public String pagar() {
        sistemaAntigo.realizarPagamento(valorPagamento);
        return "Pagamento realizado via Adapter usando sistema antigo.";
    }
}
