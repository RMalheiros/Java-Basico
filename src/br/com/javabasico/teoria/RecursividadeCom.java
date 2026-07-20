package br.com.javabasico.teoria;

/** Recursividade
 * Recursividade é uma técnica onde um método chama a si próprio
 * para resolver um problema menor até atingir uma condição de parada.

 * Estrutura básica:
 * 1. Caso base: condição que encerra a recursão.
 * 2. Chamada recursiva: o método chama a si mesmo com um valor menor.

 * Funcionamento:
 * * As chamadas vão sendo empilhadas (stack) até chegar no caso base.
 * * Depois os resultados são retornados de baixo para cima.

 * Vantagens:
 * * Código mais simples e elegante para certos problemas (ex: árvore, fatorial).

 * Cuidados:
 * * Sempre definir um caso base para evitar loop infinito.
 * * Pode consumir mais memória por causa da pilha de chamadas.
 */

public class RecursividadeCom {

    private int somarPares(int n) {
        if(n <= 0){
            return 0;
        }
        if (n % 2 == 0) {
            System.out.println(n);
            return n + somarPares(n -1);
        }
        return somarPares(n - 1 );
    }
    public static void main(String[] args) {
        System.out.println("Começando o programa");

        RecursividadeCom imprimir = new RecursividadeCom();
        System.out.println(imprimir.somarPares(10));
    }
}
