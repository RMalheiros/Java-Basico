package br.com.javabasico.collections;
import java.util.HashSet;

public class ColecoesHashSet {

    // HashSet - Sintaxe - HashSet <String> nome = new HashSet <tipo(opcional)>
    /**
     * HashSet
     * ----------
     * Implementação da interface Set.
     * Não permite elementos duplicados.
     * Não garante ordem dos elementos.
     *
     * Ideal para:
     * - Garantir unicidade de dados
     *
     * Principais métodos:
     * - add(E e): adiciona elemento
     * - remove(Object o): remove elemento
     * - contains(Object o): verifica existência
     * - size(): retorna quantidade
     *
     * Exemplo:
     * HashSet<String> conjunto = new HashSet<>();
     * conjunto.add("A");
     * conjunto.add("A"); // ignorado (duplicado)
     */

    public static void main(String[] args) {
        HashSet <String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        boolean contemBAntes = set.contains("B");
        set.remove("B");
        boolean contemBDepois = set.contains("B");

        System.out.println(set);
        System.out.println(contemBAntes);
        System.out.println(contemBDepois);
    }
}
