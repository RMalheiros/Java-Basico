package br.com.javabasico.exercicios;

public class Exercicio09ForEach {
    public enum Enuns{
        Manha("Manhã"),
        Tarde("Tarde"),
        Noite("Noite");

        private String descricao;

        Enuns(String descricao) {
            this.descricao = descricao;
        }
        public String getDescricao() {
            return descricao;
        }

public static void main(String[] args) {
    for (Enuns e : Enuns.values()) {
        System.out.println(e.getDescricao());
    }
}
    }

}
