package br.com.javabasico.herancaEPolimorfismo;

/**
 * Interface é um recurso do Java utilizado para definir
 * comportamentos que uma classe deve implementar.
 *
 * Ela funciona como um contrato, obrigando as classes
 * a criarem os métodos declarados na interface.
 *
 * Uma interface não cria objetos diretamente.
 *
 * Exemplo:
 *
 * interface Animal {
 *     void emitirSom();
 * }
 *
 * class Cachorro implements Animal {
 *
 *     @Override
 *     public void emitirSom() {
 *         System.out.println("Au Au");
 *     }
 * }
 *
 * Nesse exemplo, a classe Cachorro é obrigada
 * a implementar o metodo emitirSom().
 */

interface Empresa{ // Atributos e métodos da interface
    public void funcao();
    public void salario();
}

class Gerente implements Empresa2 { // Esta linha estamos implementando a interface
    public void funcao(){
        System.out.println("Gerente");
    }
    public void salario(){
        System.out.println("R$ 3.000,00" );
    }
}
public class IntroducaoInterfaces { // Declaração da interface

    public static void main(String[] args) {
        Gerente2 gerente1 = new Gerente2();
        gerente1.funcao();
        gerente1.salario();
    }
}
