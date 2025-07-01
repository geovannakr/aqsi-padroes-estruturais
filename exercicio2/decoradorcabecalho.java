package exercicio2;

public class decoradorcabecalho implements relatorio {
    private relatorio relatorio;

    public decoradorcabecalho(relatorio relatorio) {
        this.relatorio = relatorio;
    }

    public String gerar() {
        return "Cabeçalho - Relatório\n" + relatorio.gerar();
    }
}
