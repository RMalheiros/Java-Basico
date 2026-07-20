package br.com.javabasico.teoria;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EntradaESaida {

    public static void main(String[] args) {

        // Instanciando e Utilizando a passagem para entrada(System.in)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        // Carregando a informação Digitada
        String nome = entrada.nextLine();
        // Exibindo a informação
        System.out.println("Nome Digitado: " + nome);
        System.out.println();

        // nextFloat - NextInt - nextDouble - nextByte - nextBoolean - nextLong
        System.out.println("Digite a Idade: ");
        int idade = entrada.nextInt();
        //int idade = Integer.parseInt(entrada.nextLine());  FormaConvertida
        System.out.println("Idade: " + idade);
        System.out.println();

        System.out.println("Digite sua Altura: ");
        double altura = entrada.nextDouble(); //Assim tem que colocar virgula(,) ao invés do ponto(.).
        //double altura = Double.parseDouble(entrada.nextLine()); // Convertendo assim pode ser com ponto(.)
        System.out.println("Altura: " + altura);
        System.out.println();

        System.out.println("VocÊ é forte? ");
        boolean serForte = entrada.nextBoolean();
        if (serForte) {
            System.out.println("Forte");
        }else{
            System.out.println("Fraco");
        }

        entrada.close();// Solicitando a entrada que vai para uma variável




}
}

