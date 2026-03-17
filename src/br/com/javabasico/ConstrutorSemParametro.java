package br.com.javabasico;

public class ConstrutorSemParametro {
    // Atributos
    String Nome;
    // Construtores
    public ConstrutorSemParametro(){
        Nome = "Rafael Malheiros";
    }
    // Métodos
    public static void main(String[] args) {

    // Instanciar // Objetos
        ConstrutorSemParametro Obj = new ConstrutorSemParametro();
        System.out.println(Obj.Nome);


    }
}
