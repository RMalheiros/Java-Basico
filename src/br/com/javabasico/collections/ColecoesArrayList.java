package br.com.javabasico.collections;
import java.util.ArrayList;
// ArrayList - Sintaxe -> ArrayList <tipo> nome = new ArrayList <tipo(este é opcional)> (Executa construtor ou passa parametros)
/**
 *
 * ----------
 * Implementação da interface List.
 * Estrutura dinâmica (tamanho variável).
 * Permite elementos duplicados.
 * Mantém a ordem de inserção.
 *
 * Principais métodos:
 * - add(E e): adiciona elemento
 * - get(index): acessa elemento na posição do array
 * - set(index, novo valor): altera o valor do item na posição do array
 * - remove(int index ou Object): remove elemento
 * - size(): retorna tamanho
 * - contains(Object o): verifica se contém
 *
 * Exemplo:
 * ArrayList<String> lista = new ArrayList<>();
 * lista.add("A");
 * lista.get(0);
 */

public class ColecoesArrayList {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");

        System.out.println(array);
        System.out.println("Mostrar o 2 item: " + array.get(1)); //Pegar o item na posição 2(começa do 0)
        array.set(1, "Z");
        System.out.println("Alterado o 2 item: " + array.get(1)); //Pegar o item na posição 2(começa do 0)
        boolean contemDantes = array.contains("D");
        array.remove("D");
        boolean contemDdepois = array.contains("D");

        System.out.println(array);
        System.out.println(contemDantes);
        System.out.println(contemDdepois);
    }
}
