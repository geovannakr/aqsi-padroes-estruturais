package exercicio2;

public class decoradorassinatura implements relatorio {
    private relatorio relatorio;

    public decoradorassinatura(relatorio relatorio) {
        this.relatorio = relatorio;
    }

    public String gerar() {
        return relatorio.gerar() + "\nAssinado por Geovanna K.";
    }
}