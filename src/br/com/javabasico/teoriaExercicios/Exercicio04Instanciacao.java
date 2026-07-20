package br.com.javabasico.teoriaExercicios;

import javax.swing.*;

public class Exercicio04Instanciacao {

    String Raca = "";
    int Idade = 0;
    double Peso = 0;
    boolean Status;

    public void imprimir() {
        System.out.println("Raca: " + Raca);
        System.out.println("Idade: " + Idade);
        System.out.println("Peso: " + Peso);
        System.out.println("Status: " + Status);
    }
    public static void main(String[] args) {
        Exercicio04Instanciacao instanciacao = new Exercicio04Instanciacao();
        instanciacao.Raca = JOptionPane.showInputDialog("Digite a raca");
        instanciacao.Idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        instanciacao.Peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
        String ImputStatus = JOptionPane.showInputDialog("Digite o status:\n (A) - Ativo\n (I) - Inativo");

        instanciacao.Status = ImputStatus.equalsIgnoreCase("A");
        instanciacao.imprimir();
    }


}
