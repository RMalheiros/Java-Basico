package br.com.javabasico;

import javax.swing.*;

public class Encapsulamento {
    private String Nome;

    // Puxando as informações de Name
    public String getNome() {
        return Nome; // retorno do metodo
    }

    // Carregar as Informações
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void Carregar(String Nome){
        Exibir();
    }

    public void Exibir(){
        System.out.println("Nome: " + Nome);

    }

    public static void main(String[] args) {
        Encapsulamento Obj = new Encapsulamento(); // Instância
        //Carregando o Objeto
        Obj.Nome = JOptionPane.showInputDialog("Digite o Nome: ");
        Obj.Carregar(Obj.Nome); //Passagem de parêmetro
    }
}
