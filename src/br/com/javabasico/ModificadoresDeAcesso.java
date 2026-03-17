package br.com.javabasico;

public class ModificadoresDeAcesso {

    //Atributos
    public String Nome;
    final int Idade = 18; // Final quer dizer que o valor da variável não pode ser alterado
    private double Altura;

    //Construtor
    public ModificadoresDeAcesso(String Nome, int Idade, double Altura ) {
    this.Nome = Nome;
    }

    //Metodos
    static void Acao1(){ // Esse não precisa ser instanciado, por ser static
        int Numero1 = 10;
        System.out.println("Número 1: " + Numero1);
    }
    public void Acao2(){ // Esse precisa ser instanciado
        int Numero2 = 20;
        System.out.println("Número 2: " + Numero2);
    }

    public static void main(String[] args) {
        ModificadoresDeAcesso obj = new ModificadoresDeAcesso("Rafael Malheiros", 13, 1.83);

        System.out.println("Nome: "+ obj.Nome + " Idade: "+ obj.Idade + " Altura: "+ obj.Altura);

        Acao1();

        obj.Acao2();
    }
}
