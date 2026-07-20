package br.com.javabasico.teoriaExercicios;

import javax.swing.*;

public class Exercicio10ModificadoresDeAcesso {
    public static class Pessoa {
        private String nome = "";
        private int idade = 0;
        private double altura = 0.0;
        private char sexo;

        // CONSTRUTOR
        public Pessoa(String nome, int idade, double altura, char sexo) {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
            this.sexo = sexo;

        }

        // GETTERS
        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public double getAltura() {
            return altura;
        }

        public char getSexo() {
            return sexo;
        }

        public String getSexoDescricao() {
            if (sexo == 'M' || sexo == 'm') {
                return "Sexo Masculino";
            } else if (sexo == 'F' || sexo == 'f') {
                return "Sexo Feminino";
            } else {
                return "Sexo Inválido";
            }

            //            //Setters
//            public void setNome(String nomeHerdado){
//                this.nome = nomeHerdado;
//            }

        }

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        char sexo = JOptionPane.showInputDialog("Digite o Sexo: (M) ou (F) ").charAt(0);

        Pessoa pessoa1 = new Pessoa(nome, idade, altura, sexo);
        System.out.println("Nome: " + pessoa1.getNome() + "\nIdade: " + pessoa1.getIdade() + "\nPeso: " + pessoa1.getAltura() + pessoa1.getSexoDescricao());

        }
    }
}


