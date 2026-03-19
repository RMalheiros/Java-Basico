package br.com.javabasico.teoria;

public class ConstrutorComParametro {
    //Atributo
    int AnoModelo;
    String NomeModelo;
    String PlacaModelo;

    //Construtor
    public ConstrutorComParametro(int Ano , String Nome, String Placa) {
        this.AnoModelo = Ano;
        this.NomeModelo = Nome;
        this.PlacaModelo = Placa;
    }

    public static void main(String[] args) {

        ConstrutorComParametro Obj = new ConstrutorComParametro(2015, "Vectra", "JKY8563");
        System.out.println("Nome do Carro = "+ Obj.NomeModelo + "\nAno = "+ Obj.AnoModelo + "\nPlaca = "+ Obj.PlacaModelo);
    }
}
