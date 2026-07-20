package br.com.javabasico.collectionsExercicios;

import java.util.HashMap;

public class Exercicio03HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> carros = new HashMap<>();

        carros.put(1, "Hyundai I30");
        carros.put(2, "Volkswagen UP");
        carros.put(3, "Volkswagen Virtus");
        carros.put(4, "FIAT Toro");

        System.out.println("Total de carros: " + carros.size());
        System.out.println("Total de carros: " + carros);
        System.out.println("Carro no indice 1: " + carros.get(1));
        carros.put(5, "Volkswagen Polo");
        System.out.println("Adicionando Carro no indice 5: " + carros.get(5));
        carros.put(2, "Ford Fiesta");
        System.out.println(("Total de carros: " + carros.values()));

     }
}
