package br.com.javabasico.collections;

import java.util.Iterator;

/**
 * Vetor (Array)
 * --------------
 * Estrutura de dados que armazena múltiplos elementos do mesmo tipo.
 * Possui tamanho fixo definido na criação.
 * Arrays não implementam Collection e não aceita iteratores
 *
 * Sintaxe:
 * Tipo[] nome = new Tipo[tamanho];
 *
 * Exemplo:
 * int[] numeros = new int[5];
 *
 * Acesso a elementos:
 * numeros[0] = 10;      // atribuição
 * int valor = numeros[0]; // leitura
 *
 * Características:
 * - Índice inicia em 0
 * - Tamanho fixo (não cresce)
 * - Acesso rápido por índice
 *
 * Propriedade:
 * - length: retorna o tamanho do vetor
 *
 * Limitações:
 * - Não permite alterar o tamanho
 * - Inserção/remoção menos flexível que coleções
 */

public class Array {
    public static void main(String[] args) {
        int [] numeros1 = new int [10]; // Sintaxe - Tipo[] nome = new Tipo[tamanho];
        numeros1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; // 1ª Forma de declarar - 1º o tamanho e depois os valores

        int[] numeros2 = {12,23,53,43,57,62,7,38,98,10}; // 2ª Forma de declarar - os valores diretamente nas chaves
        // numeros [] - colchetes acessa uma posição ou
        // new int [10] - definit tamanho

        for (int i : numeros1 ) {
            System.out.println(i);
        }

        for (int j : numeros2 ) {
            System.out.println(j);
        }
    }
}
