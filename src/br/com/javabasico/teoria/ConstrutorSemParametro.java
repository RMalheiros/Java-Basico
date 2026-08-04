package br.com.javabasico.teoria;

public class ConstrutorSemParametro {
    // Atributos
    String Nome;
    // Construtores
    public ConstrutorSemParametro(){
        String Nome;
    }
    // Métodos
    public static void main(String[] args) {

    // Instanciar // Objetos
        ConstrutorSemParametro Obj = new ConstrutorSemParametro();
        Obj.Nome = "Rafael";
        System.out.println(Obj.Nome);


    }
}
