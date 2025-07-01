package exercicio2;

public class Main {

    public static void main(String[] args) {
        relatorio base = new relatoriobasico();

        relatorio completo = new decoradorcabecalho(
                new decoradorassinatura(
                        new decoradorrodape(base)));

        System.out.println(completo.gerar());
    }
}
