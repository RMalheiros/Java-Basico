package br.com.javabasico.teoriaExercicios;

import javax.swing.*;

public class Exercicio03SomarEReceberVariaveis {
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
        Exercicio03SomarEReceberVariaveis Objeto03 = new Exercicio03SomarEReceberVariaveis();
        Objeto03.setNum1(Integer.parseInt(JOptionPane.showInputDialog("Digite um número: ")));
        Objeto03.setNum2(Integer.parseInt(JOptionPane.showInputDialog("Digite um número: ")));
        System.out.println(Objeto03.Soma(Objeto03.getNum1(), Objeto03.getNum2()));

    }
}
