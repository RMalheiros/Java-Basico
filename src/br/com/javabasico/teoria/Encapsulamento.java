package br.com.javabasico.teoria;

import javax.swing.*;

public class Encapsulamento {
    //Atributos
    private String nome;

    // Puxando as informações de Name
    public String getNome() {
        return nome; // retorno do metodo
    }

    // Carregar/Altera as Informações
    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public void Carregar(String Nome){
        Exibir();
    }

    public void Exibir(){
        System.out.println("Nome: " + nome);

    }

    public static void main(String[] args) {
        Encapsulamento Obj = new Encapsulamento(); // Instância
        //Carregando o Objeto
        Obj.setNome(JOptionPane.showInputDialog("Digite o Nome: ")); // Utilizando o setNome, você preserva o encapsulamento e não acessa a variável diretamente
        Obj.Carregar(Obj.nome); //Passagem de parêmetro
    }
}
