package br.com.javabasico.trycatch;

public class throw2 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        if(numeros.length > 6) {
            throw new ArrayIndexOutOfBoundsException("Posição não encontrada");
        } else {
            System.out.println(numeros[2]);
        }
    }
}

