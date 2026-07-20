package br.com.javabasico.teoriaExercicios;

public class Exercicio02CriandoInstancia {
    int Idade = 15;
    public void exibirInstancia() {
        System.out.println("Idade: " + Idade);
    }

    public static void main(String[] args) {
        Exercicio02CriandoInstancia Objeto02 = new Exercicio02CriandoInstancia();
        Exercicio02CriandoInstancia AltIdade = new Exercicio02CriandoInstancia();
        AltIdade.Idade = 20;
        Objeto02.exibirInstancia();
        AltIdade.exibirInstancia();

    }
}
