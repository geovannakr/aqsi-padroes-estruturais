package exemplosorvetedecorator;

public class CoberturaChocolate implements Sorvete{
        private Sorvete sorvete;

    public CoberturaChocolate(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    @Override
    public String servir() {
        return sorvete.servir() + " com cobertura de chocolate.";
    }
}
