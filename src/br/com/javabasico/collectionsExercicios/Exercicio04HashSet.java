package br.com.javabasico.collectionsExercicios;
import java.util.HashSet;

public class Exercicio04HashSet {
    public static void main(String[] args) {
        HashSet<String> animais = new HashSet<>();
        animais.add("Leão");
        animais.add("Rã");
        animais.add("Girafa");
        System.out.println(animais);
        animais.remove("Girafa");
        System.out.println(animais);
        System.out.println(animais.contains("Rã"));
    }
}
