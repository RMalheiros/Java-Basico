package br.com.javabasico.teoriaExercicios;

import javax.swing.*;

public class Exercicio07Encapsulamento {

    private String nome = "";

    public String getNome() {
        return nome;
    }
    public void setNome(String nomeHerdado) {
        this.nome = nomeHerdado;
    }

    public static void main(String[] args) {
        Exercicio07Encapsulamento nomeEncapsulado = new Exercicio07Encapsulamento();
        nomeEncapsulado.nome = JOptionPane.showInputDialog("Digite o nome do Pai: ");
        System.out.println(nomeEncapsulado.getNome());
    }
}
