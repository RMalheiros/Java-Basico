package br.com.javabasico.trycatch;

public class Finally {
    static String teste = null;
    static String novoTeste = null;

    public static void main(String[] args) {

        try {
            int[] numeros = {1, 2, 3, 4, 5, 6, 7};
            System.out.println(numeros[9]);
        } catch (Exception erro) {
            System.out.println("Algum Errado aconteceu: " + erro);
        } finally {
            System.out.println("Comando executado sempre");
        }

        try {
            novoTeste = teste.toLowerCase();
        } catch (NullPointerException erroNull) {
            System.out.println("Erro de null aconteceu 2: " + erroNull);
        } finally {
            System.out.println("Comando executado sempre 2");
        }
    }
}
