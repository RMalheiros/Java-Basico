package br.com.javabasico.genericsELambda;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 * Consumer é uma interface funcional do Java usada para consumir/processar um valor,
 * sem retornar resultado.
 *
 * Ela recebe um parâmetro através do metodo accept().
 *
 * Muito utilizada em expressões lambda e Streams para executar ações,
 * como imprimir, salvar ou modificar dados.
 *
 * Exemplo:
 *
 * Consumer<String> mostrar = texto -> System.out.println(texto);
 * mostrar.accept("Olá");
 */

public class ExpressaoLambda02 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(5);
        numeros.add(8);
        numeros.add(2);
        numeros.add(31);

        //SINTAXE Nome<tipo> Variável = LAMBDA (NOME) -> {BLOCO DE CÓDIGO}
        Consumer<Integer> metodo = (numero) -> {System.out.println(numero);};
        numeros.forEach(metodo);

    }
}
