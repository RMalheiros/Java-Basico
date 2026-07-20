package br.com.javabasico.herancaEPolimorfismo;

/**
 * A palavra-chave super é utilizada para acessar
 * atributos, métodos e construtores da superclasse.
 *
 * Ela permite reutilizar comportamentos da classe pai
 * dentro da subclasse.
 *
 * Exemplos:
 *
 * super.metodo();
 * super.atributo;
 * super();
 */

class Animais {
    public void somDoAnimal(){
        System.out.println("Qual o som esse animal faz? \n");
    }
}

class Dog extends Animais {
    public void somDoAnimal(){
        System.out.println("Cachorro ");
        System.out.println("Au, Au, Au, Au \n");
    }
}

class Porco extends Animais {
    public void somDoAnimal(){ // * Ela permite reutilizar comportamentos da classe pai dentro da subclasse.
        super.somDoAnimal();
        System.out.println("Porco ");
        System.out.println("Roinc, Roinc, Roinc, Roinc ");
    }
}


public class PalavraSuper {
    public static void main(String[] args) {
        Animais Geral = new Animais();
        Geral.somDoAnimal();

        Dog Dog = new Dog();
        Dog.somDoAnimal();

        Porco Porco = new Porco();
        Porco.somDoAnimal();
    }
}
