package br.com.javabasico.teoria;

public class RecursividadeSem {

    private void Mostrar(int n) {
        int soma = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                System.out.println(i);
                soma += i;
            }
        }
        System.out.println("Soma: " + soma);
    }
    public static void main(String[] args) {
        System.out.println("Começo do programa");

        RecursividadeSem imprimir = new RecursividadeSem();
        imprimir.Mostrar(10);

        System.out.println();
    }

}

