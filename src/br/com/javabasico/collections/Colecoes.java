package br.com.javabasico.collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;

public class Colecoes {
    public static void main(String[] args) {
        // Iniciando a utilização das colecoes

        // HashSet - Sintaxe - HashSet <String> nome = new HashSet <tipo(opcional)>


        /** HashSet
          ----------
          Implementação da interface Set.
          Não permite elementos duplicados.
          Não garante ordem dos elementos.

          Ideal para:
          - Garantir unicidade de dados

          Principais métodos:
          - add(E e): adiciona elemento
          - remove(Object o): remove elemento
          - contains(Object o): verifica existência
          - size(): retorna quantidade

          Exemplo:
          HashSet<String> conjunto = new HashSet<>();
          conjunto.add("A");
          conjunto.add("A"); // ignorado (duplicado)
         */
        HashSet <String> colecoesSet = new HashSet <String>(); // Sintaxe do HashSet

        // ArrayList - Sintaxe -> ArrayList <tipo> nome = new ArrayList <tipo(este é opcional)> (Executa construtor ou passa parametros)
        /** ArrayList
         *
         * ----------
         * Implementação da interface List.
         * Estrutura dinâmica (tamanho variável).
         * Permite elementos duplicados.
         * Mantém a ordem de inserção.
         *
         * Principais métodos:
         * - add(E e): adiciona elemento
         * - get(int index): acessa elemento
         * - remove(int index ou Object): remove elemento
         * - size(): retorna tamanho
         * - contains(Object o): verifica se contém
         *
         * Exemplo:
         * ArrayList<String> lista = new ArrayList<>();
         * lista.add("A");
         * lista.get(0);
         */

        ArrayList <String> colecoesList = new ArrayList <String> (); // Sintaxe do ArrayList

        // HashMap - Sintaxe ->  HashMap <(tipo da chave,tipo do valor)> nome = new HashMap <tipo(este é opcional)>
        /** HashMap
         *
         * ----------
         * Implementação da interface Map.
         * Armazena dados no formato chave-valor (key-value).
         * Não permite chaves duplicadas.
         * Permite valores duplicados.
         * Não garante ordem.
         *
         * Principais métodos:
         * - put(K key, V value): adiciona/atualiza
         * - get(K key): obtém valor
         * - remove(K key): remove elemento
         * - containsKey(K key): verifica chave
         * - containsValue(V value): verifica valor
         * - size(): retorna tamanho
         *
         * Exemplo:
         * HashMap<String, Integer> mapa = new HashMap<>();
         * mapa.put("idade", 30);
         * mapa.get("idade");
         */
        HashMap <String, String> colecoesHashMap = new HashMap <> (); //Precisa de Chave e valor entre <>

    }
}
