package br.com.javabasico.teoriaExercicios;

public class Exercicio14Recursividade {

    private int recursivoPar(int x){
        if (x <= 0) return 0;
        if (x % 2 == 0){
            System.out.println(x);
            return x + (x - 1);
        }
        return recursivoPar(x - 1);
    }


    public static void main(String[] args) {
        Exercicio14Recursividade imprimir = new Exercicio14Recursividade();
        System.out.println(imprimir.recursivoPar(10));
    }
}
