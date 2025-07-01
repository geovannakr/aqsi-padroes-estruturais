package exercicio3;

import java.util.ArrayList;
import java.util.List;

class Pasta implements Componentes{
    private String name;
    private List<Componentes> inumeros = new ArrayList<>();

    public Pasta(String name){
        this.name = name;
    }

    public void add(Componentes componente){
        inumeros.add(componente);
    }
    public void ver(){
        System.out.println("Pasta: " + name);
        for(Componentes componente : inumeros){
            componente.ver();
        }
    }
}