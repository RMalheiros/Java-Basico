
package br.com.javabasico.herancaEPolimorfismo;

/**
 * Herança (Inheritance)
 * ----------------------
 * Mecanismo da Programação Orientada a Objetos que permite uma classe
 * herdar atributos e métodos de outra classe.
 *
 * Utiliza a palavra-chave "extends".
 *
 * Sintaxe:
 * class Filho extends Pai { }
 *
 * Exemplo:
 * class Animal {
 *     void emitirSom() { }
 * }
 *
 * class Cachorro extends Animal {
 *     void latir() { }
 * }
 *
 * Vantagens:
 * - Reutilização de código
 * - Organização e hierarquia entre classes
 *
 * Conceitos importantes:
 * - Superclasse (Pai): classe que é herdada
 * - Subclasse (Filho): classe que herda
 *
 * Métodos úteis:
 * - super(): acessa construtor ou métodos da superclasse
 * - @Override: sobrescreve métodos da classe pai
 *
 * Observações:
 * - Java não suporta herança múltipla de classes
 * - Uma classe pode herdar apenas de uma classe
 */

//    Classe Pai - Detentor primários dos atributos e métodos
class animal{
    public void somDoAnimal(){
        System.out.println("Qual o som do animal? ");
    }
}

//    Classe Filha - Recebendo a Herança
class cachorro extends animal{
    public void somDoAnimal(){
        System.out.println("Au, Au, Au, Au");
    }

}
public class Heranca {
    public static void main(String[] args) {
        // Criação dos objetos, e instancia  da classe pai e da filha
        // animal animal = new animal(); // Instanca da classe genérica animal
        animal cao = new cachorro(); // Instanca da classe específica cachorro
        // animal.somDoAnimal(); // Chamando o metodo generico da class animal
        cao.somDoAnimal();

    }
}
