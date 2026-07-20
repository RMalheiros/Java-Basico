package br.com.javabasico.teoriaExercicios;

import javax.swing.*;

public class Exercicio06ConstrutorSemParametros {
    // ATRIBUTOS
    String nome;

    public Exercicio06ConstrutorSemParametros() {
        nome = JOptionPane.showInputDialog("Digite seu nome");
    }
    public static void main(String[] args) {
        Exercicio06ConstrutorSemParametros exibirNome = new Exercicio06ConstrutorSemParametros();
        System.out.println(exibirNome.nome);
    }
}
