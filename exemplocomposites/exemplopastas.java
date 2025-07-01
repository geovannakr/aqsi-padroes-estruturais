
import java.util.ArrayList;
import java.util.List;

 interface Documento{
    void abrir();
}

class Arquivo implements Documento{

    String nome = "<nome vazio>";

    public Arquivo(String nomeDocumento){
        this.nome = nomeDocumento;
    }

    public void abrir() {
        System.out.println("Arquivo");
    }
}

class Pasta implements Documento{
    private String nome = "<nome vazio>";
    private List<Documento> documentos = new ArrayList<>();

    public Pasta(String nomeDocumento){
        this.nome = nomeDocumento;
    }

    public void add(Documento documento){
        documentos.add(documento);
    }

    public void abrir() {
        System.out.println("Pasta: " + this.nome);
        for(Documento documento : documentos){
            documento.abrir();
        }
    }
    
}

public class exemplopastas{
    public static void main(String[] args) {
        Pasta pastaRaiz = new Pasta(    "raiz");
        Arquivo readme = new Arquivo(   "readme.md");
        Pasta java = new Pasta( "java");
        pastaRaiz.add(readme);
        pastaRaiz.add(java);

        java.add(new Arquivo("Main.java"));
        java.add(new Arquivo("ExemploPastas.java"));

        pastaRaiz.abrir();
    }
}