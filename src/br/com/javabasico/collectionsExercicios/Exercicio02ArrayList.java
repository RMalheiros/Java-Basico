package br.com.javabasico.collectionsExercicios;

import java.util.ArrayList;

public class Exercicio02ArrayList {
    public static void main(String[] args) {
        ArrayList <String> ExercicioArrayList = new ArrayList <>();

        ExercicioArrayList.add("C");
        ExercicioArrayList.add("C++");
        ExercicioArrayList.add("Java");
        ExercicioArrayList.add("Python");

        System.out.println("Linguagens " + ExercicioArrayList);

        ExercicioArrayList.set(0, "C#");
        System.out.println("Linguagens " + ExercicioArrayList);

        ExercicioArrayList.add(4, "PHP");
        System.out.println("Linguagem na posição 4: " + ExercicioArrayList.get(4));
        ExercicioArrayList.remove(1);
        System.out.println("Linguagens " + ExercicioArrayList);

    }
}
