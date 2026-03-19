package br.com.javabasico.exercicios;

import javax.swing.*;

public class Exercicio03SomarEReceberVariáveis {
    private int Num1;
    private int Num2;
    private int Resultado;

    public int getNum1(){
        return Num1;
    }

    public void setNum1(int Num1){
        this.Num1 = Num1;
    }

    public int getNum2(){
        return Num2;
    }

    public void setNum2(int Num2){
        this.Num2 = Num2;
    }

    public int Soma(int Num1, int Num2) {
        Resultado = Num1 + Num2;
        return Resultado;
    }

    public static void main(String[] args) {
        Exercicio03SomarEReceberVariáveis Objeto03 = new Exercicio03SomarEReceberVariáveis();
        Objeto03.setNum1(JOptionPane.showInputDialog("Digite um número: "+ int());
    }
}
