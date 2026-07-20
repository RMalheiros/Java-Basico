package br.com.javabasico.collections;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * For-each (Enhanced for)
 * ------------------------
 * Estrutura utilizada para percorrer coleções (List, Set, etc.)
 * e arrays de forma simples e legível.
 *
 * Sintaxe:
 * for (Tipo nomeDaVariavel : colecao) {
 *     // uso da variável
 * }
 *
 * Exemplo:
 * for (String nome : lista) {
 *     System.out.println(nome);
 * }
 *
 * Vantagens:
 * - Código mais simples e legível
 * - Não precisa usar índice ou Iterator explicitamente
 *
 * Limitações:
 * - Não permite modificar/remover elementos diretamente
 * - Não possui acesso a índice
 */

public class ForEach {
    public static void main(String[] args) {
        // Declaração da Coleção
        ArrayList<String> forEach = new ArrayList<>();
        forEach.add("A");
        forEach.add("B");
        forEach.add("C");
        forEach.add("D");

        forEach.remove("C"); // removeu o "C" - index 2
        forEach.set(2, "Z"); // alterou o index 2 - Agora o "D"

        for(String mostrarItem : forEach) { // Sintaxe: for (Tipo nomeDaVariavel : colecao)
            System.out.println(mostrarItem);

        }
        System.out.println();
        Iterator<String> mostrarItensPorIterator = forEach.iterator();
        while(mostrarItensPorIterator.hasNext()) { // hasNext() - retorna true se houver próximo elemento
            System.out.println(mostrarItensPorIterator.next()); // next() - retorna o próximo elemento da lista percorrer
        }
    }
}
