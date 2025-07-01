package exemplosorvetedecorator;

public class CoberturaMorango implements Sorvete{
        private Sorvete sorvete;

    public CoberturaMorango(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    @Override
    public String servir() {
        return sorvete.servir() + " com cobertura de chocolate.";
    }
}
