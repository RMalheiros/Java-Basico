package br.com.javabasico.genericsELambda;

/**
 * Expressões Lambda permitem escrever funções de forma
 * mais simples e reduzida no Java.
 *
 * Elas são muito utilizadas em interfaces funcionais
 * e ajudam a deixar o código mais limpo e legível.
 *
 * Sintaxe:
 *
 * (parametros) -> { ação }
 *
 * Exemplo:
 *
 * (x, y) -> x + y
 *
 * Nesse exemplo, a expressão recebe dois valores
 * e retorna a soma entre eles.
 */

import java.util.ArrayList;

public class ExpressaoLambda01 {
    public static void main(String[] args) {
        // Declarando a coleção
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(5);
        numeros.add(8);
        numeros.add(2);
        numeros.add(31);

        // SINTAXE: LAMBDA (NOME) -> {BLOCO DE CÓDIGO}
        // SINTAXE: FOR EACH  forEach(INSTRUÇÃO)
        numeros.forEach((cadaNumero) -> {System.out.println(cadaNumero);});
    }
}
