package br.com.javabasico.teoriaExercicios;

import java.util.Scanner;

public class Exercicio13Scanner {
    public static void main(String[] args) {
        Scanner exercicio = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String exercicioNome = exercicio.nextLine();
        System.out.println("Seu nome é: " + exercicioNome);
        System.out.println("\n___________________\n");

        System.out.println("Digite um idade: ");
        int exercicioIdade = exercicio.nextInt();
        System.out.println("Sua idade: " + exercicioIdade);

        System.out.println("\n___________________\n");
        exercicio.nextLine(); // limpa o buffer depois de nextInt ou NextDouble
        System.out.println("Digite sua altura: ");
        double exercicioSuaAltura = Double.parseDouble(exercicio.nextLine());
        System.out.println("Sua altura: " + exercicioSuaAltura);
        System.out.println("\n___________________\n");

        System.out.println("Digite um sexo: ");
        char exercicioSexo = exercicio.next().charAt(0);
        switch (exercicioSexo) {
            case 'm':
                System.out.println("Seu sexo é Masculino");
                break;
            case 'f':
                System.out.println("Seu sexo é Feminino");
                break;
            default:
                System.out.println("Este sexo não é válido");
        }

        System.out.println("\n___________________\n");
        System.out.println("Você gosta de programar: ");
        boolean exercicioProgramar = exercicio.nextBoolean();
        if (exercicioProgramar) {
            System.out.println("Gosta de Programar ");
        } else {
            System.out.println("Não gosta de programar ");
        }

        exercicio.close();

    }
}
