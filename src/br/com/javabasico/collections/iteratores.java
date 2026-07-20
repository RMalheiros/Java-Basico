package br.com.javabasico.collections;

import java.util.ArrayList;
import java.util.Iterator; // API de iterador

// Iteradores - Sintaxe -> Iterator<tipo> nome = nomeDalista.iterator();
/**
 * Iterador (Iterator)
 * --------------------
 * Interface utilizada para percorrer coleções (List, Set, map, etc.)
 * de forma sequencial, sem expor sua estrutura interna.
 *
 * Permite iterar sobre os elementos e removê-los com segurança
 * durante a iteração.
 *
 * Principais métodos:
 * - hasNext(): retorna true se houver próximo elemento
 * - next(): retorna o próximo elemento
 * - add(): adiciona um elemento
 * - remove(): remove o elemento atual (opcional)
 *
 * Exemplo de uso:
 * Iterator<String> it = lista.iterator();
 * while (it.hasNext()) {
 *     String elemento = it.next();
 * }
 *
 * Vantagens:
 * - Evita erros ao remover elementos durante o loop
 * - Funciona com diferentes tipos de coleções
 *
 * Observação:
 * - Não possui acesso por índice (diferente de List)
 */

public class iteratores {
    public static void main(String[] args) {
        //  Criação da coleção
        ArrayList<Integer> iteradores = new ArrayList<>();

        iteradores.add(9);
        iteradores.add(7);
        iteradores.add(27);
        iteradores.add(9);
        iteradores.add(35);
        iteradores.add(34);

        // criação do Iterador
        Iterator <Integer> percorrer = iteradores.iterator();

        while (percorrer.hasNext()) { // hasNext() - retorna true se houver próximo elemento
            System.out.println(percorrer.next());
            Integer i = percorrer.next(); // next() - retorna o próximo elemento da lista percorrer
                if (i < 10) {
                    percorrer.remove();
                }
        }
        System.out.println();
        System.out.println(iteradores.size());
        System.out.println(iteradores);
    }
}
