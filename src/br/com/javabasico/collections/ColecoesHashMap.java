package br.com.javabasico.collections;
import java.util.HashMap;

// HashMap - Sintaxe ->  HashMap <(tipo da chave,tipo do valor)> nome = new HashMap <tipo(este é opcional)>
/**
 * HashMap - Sintaxe ->  HashMap <(tipo da chave,tipo do valor)> nome = new HashMap <tipo(este é opcional)>
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

public class ColecoesHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");

        System.out.println("Todos os itens: "+ map);

        System.out.println("Buscando no indice 1 o valor: " + map.get(1));
        map.put(1, "Z");
        System.out.println("Vendo no indice 1, o valor alterado: " + map.get(1));
        map.put(8, "O");
        System.out.println("Quantidade de itens: "+ map.size());
        System.out.println("Todos os itens: "+ map);

        // Verificar se tem uma chave(containsKey()) e verificar se tem um valor containsValue()
        System.out.println("Tem o Item 2: " + map.containsKey(1) + "\nTem o Value B: " + map.containsValue("B"));
        map.clear();
        System.out.println(map+ " Valor limpado pelo clear");


    }
}
