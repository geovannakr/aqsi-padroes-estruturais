package exemplosorvetedecorator;

public class Main {

    public static void main(String[] args) {
        Sorvete sorvete = new SorveteSimples();
        sorvete = new CoberturaChocolate(sorvete);
        sorvete = new CoberturaMorango(sorvete);

        System.out.println("Pedido pronto: " + sorvete.servir());
    }
}
