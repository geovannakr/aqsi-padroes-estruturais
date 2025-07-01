package exercicio2;

public class decoradorrodape implements relatorio {
    private relatorio relatorio;

    public decoradorrodape(relatorio relatorio) {
        this.relatorio = relatorio;
    }

    public String gerar() {
        return relatorio.gerar() + "\nRodapé: ";
    }
}