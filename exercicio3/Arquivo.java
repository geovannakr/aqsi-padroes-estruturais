package exercicio3;

public class Arquivo implements Componentes{
    private String name;

    public Arquivo(String name){
        this.name = name;
    }

    public void ver(){
        System.out.println("Arquivo: " + name);
    }
}