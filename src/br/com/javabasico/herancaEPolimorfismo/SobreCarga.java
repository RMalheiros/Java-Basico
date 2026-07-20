package br.com.javabasico.herancaEPolimorfismo;

/**
 * A sobrecarga de métodos (method overloading) é um conceito do Java que permite
 * definir múltiplos métodos com o mesmo nome dentro da mesma classe, desde que
 * possuam assinaturas diferentes.
 *
 * <p>A assinatura de um metodo e composta pelo nome do método e pela lista de
 * parâmetros (tipo, quantidade ou ordem). O tipo de retorno sozinho não é suficiente
 * para diferenciar métodos sobrecarregados.</p>
 *
 * <p>Principais características da sobrecarga:</p>
 * <ul>
 *   <li>Os metodos devem ter o mesmo nome;</li>
 *   <li>Devem possuir parâmetros diferentes (tipo, quantidade ou ordem);</li>
 *   <li>Pode haver diferentes tipos de retorno, mas isso não diferencia métodos sozinho;</li>
 *   <li>É uma forma de polimorfismo em tempo de compilação (compile-time polymorphism).</li>
 * </ul>
 *
 * <p>Exemplo de sobrecarga:</p>
 *
 * <pre>
 * public class Calculadora {
 *
 *     int somar(int a, int b) {
 *         return a + b;
 *     }
 *
 *     double somar(double a, double b) {
 *         return a + b;
 *     }
 *
 *     int somar(int a, int b, int c) {
 *         return a + b + c;
 *     }
 * }
 * </pre>
 *
 * <p>No exemplo acima, o metodo "somar" foi sobrecarregado com diferentes tipos
 * e quantidades de parâmetros.</p>
 *
 * @author SeuNome
 */

public class SobreCarga {

    static int metodo(int a, int b){
        return a + b; // Todo metodo com passagem de parametro precisa ter um retorno
    }

    static double metodo (double a, double b){
        return a + b; // Todo metodo com passagem de parametro precisa ter um retorno

    }
    public static void main(String[] args) {
        int num1 = metodo(8,5);
        double num2 = metodo(4.5, 8.6);

        System.out.println("Valor do método INTEIRO: " + num1);
        System.out.println("Valor do método REAL: " + num2);
    }
}
