package br.com.javabasico.herancaEPolimorfismo;

/**
 * O metodo default permite criar metodos com implementação
 * dentro de interfaces.
 *
 * Ele é utilizado para adicionar comportamentos padrão
 * sem obrigar todas as classes a sobrescreverem o metodo.
 *
 * Exemplo:
 *
 * default void mensagem() {
 *     System.out.println("Metodo padrão");
 * }
 */

interface tela{
    // Metodo Default
    default void imprimir(){
        System.out.println("Programação Java");
    }

    //Metodo Abstract
    abstract void imprimir2(String texto); // Por padrão o metodo já é abstrato, então se deixar vazio é considerado abstract
}

//Implementando
public class MetodoDefault implements tela{

    // implementando o metodo abstrato
    public void imprimir2(String texto){
        System.out.println(texto);
    }

    public static void main(String[] args) {

        MetodoDefault mostrar = new MetodoDefault();
        // Chamando metodo
        mostrar.imprimir();
        mostrar.imprimir2("Métodos abstratos - Métodos Default");

    }
}
