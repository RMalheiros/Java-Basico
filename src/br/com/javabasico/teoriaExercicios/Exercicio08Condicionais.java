package br.com.javabasico.teoriaExercicios;

import javax.swing.*;

public class Exercicio08Condicionais {
    //Atributos
    int horario = Integer.parseInt(JOptionPane.showInputDialog("Digite o horário que você está: "));
    String manha = "Você está de manhã";
    String tarde = "VocÊ está de tarde";
    String noite = "Você está a noite";


    //Métodos
    //Condicional IF - Em intervalos é melhor usar if
    public void verificarTurnoIf(){
        if (horario >= 5 && horario < 12){
            System.out.println(manha);
        } else if (horario >= 12 && horario <= 18){
            System.out.println(tarde);
        } else {
            System.out.println(noite);
        }
    }
    // Condicional Switch - Melhor em valores especificos
    public void verificarTurnoSwitch(){
        switch (horario){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println(manha+ " Switch");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println(tarde+ " Switch");
                break;
            default:
System.out.println(noite+ " Switch");
        }
    }
    public static void main(String[] args) {
        Exercicio08Condicionais analise  = new Exercicio08Condicionais();
        analise.verificarTurnoIf();
        analise.verificarTurnoSwitch();
    }

}
