package exercicio2;

// não entendi direito essa questão. Era sem criar várias classes, então coloquei tudo na main,
// porque daí não criaria várias classes para cada combinação. 

public class Main {

    interface Relatorio {
    String gerar();
}

class RelatorioSimples implements Relatorio {
    public String gerar() {
        return "Relatório normal";
    }
}

class DecoradorComRodape implements Relatorio {
    private Relatorio relatorio;
    public DecoradorComRodape(Relatorio r) {
        this.relatorio = r;
    }
    public String gerar() {
        return relatorio.gerar() + "Rodapé ABNT";
    }
}

class DecoradorComAssinatura implements Relatorio {
    private Relatorio relatorio;
    public DecoradorComAssinatura(Relatorio r) {
        this.relatorio = r;
    }
    public String gerar() {
        return relatorio.gerar() + "Assinado pela GEOVANNA K";
    }
}

}
