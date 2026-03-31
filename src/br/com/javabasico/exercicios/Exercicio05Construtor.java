package br.com.javabasico.exercicios;

public class Exercicio05Construtor {
    // ATRIBUTOS
    int Ano;
    String Nome;
    String Placa;

    //CONSTRUTOR
    public Exercicio05Construtor(int AnoCarro, String NomeCarro, String PlacaCarro){
        this.Ano = AnoCarro;
        this.Nome = NomeCarro;
        this.Placa = PlacaCarro;
}
    public static void main(String[] args) {
        Exercicio05Construtor Carro = new Exercicio05Construtor(123,"Virtus", "JIK7823"  );
    System.out.println("Ano: " + Carro.Ano + "\nNome: " + Carro.Nome + "\nPlaca: " + Carro.Placa);
    }
}
