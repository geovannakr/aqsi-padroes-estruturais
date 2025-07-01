package exercicio3;

public class Main {
    public static void main(String[] args) {
        Pasta principalPasta = new Pasta("Documentos");

        Arquivo arquivo1 = new Arquivo("CV.pdf");
        Arquivo arquivo2 = new Arquivo("Notas.txt");

        Pasta subPasta = new Pasta("Projetos");
        subPasta.add(new Arquivo("Projeto1"));
        subPasta.add(new Arquivo("Projeto2"));

        principalPasta.add(arquivo1);
        principalPasta.add(arquivo2);
        principalPasta.add(subPasta);

        principalPasta.ver();
    }
}