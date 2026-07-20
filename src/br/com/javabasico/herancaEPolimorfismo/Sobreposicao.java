package br.com.javabasico.herancaEPolimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 * A sobreposição de métodos (method overriding) é um conceito do Java que permite
 * que uma subclasse forneça uma implementação específica para um método já definido
 * em sua superclasse.
 *
 * <p>Para que ocorra a sobreposição, o método na subclasse deve possuir a mesma
 * assinatura do método da superclasse (mesmo nome, mesmos parâmetros e mesmo tipo
 * de retorno ou compatível).</p>
 *
 * <p>Principais características da sobreposição:</p>
 * <ul>
 *   <li>Ocorre entre classes com relação de herança (superclasse e subclasse);</li>
 *   <li>O metodo deve ter a mesma assinatura da superclasse;</li>
 *   <li>O tipo de retorno deve ser igual ou covariante;</li>
 *   <li>Não pode reduzir a visibilidade do método (ex: de public para private);</li>
 *   <li>Permite alterar o comportamento de um método herdado;</li>
 *   <li>É um exemplo de polimorfismo em tempo de execução (runtime polymorphism).</li>
 * </ul>
 *
 * <p>O uso da anotação {@code @Override} é recomendado, pois ajuda a garantir que
 * o metodo está realmente sobrescrevendo um metodo da superclasse.</p>
 *
 * <p>Exemplo de sobreposição:</p>
 *
 * <pre>
 * class Animal {
 *     void fazerSom() {
 *         System.out.println("Som genérico");
 *     }
 * }
 *
 * class Cachorro extends Animal {
 *     @Override
 *     void fazerSom() {
 *         System.out.println("Latido");
 *     }
 * }
 * </pre>
 *
 * <p>No exemplo acima, o metodo "fazerSom" da classe Cachorro sobrescreve o método
 * da classe Animal, fornecendo um comportamento específico.</p>
 *
 * @author SeuNome
 */

class informacoes {
    private String cidade;
    public String getcidade(){
        return cidade;
    }
    public void setcidade(String cidade){
        this.cidade = cidade;
    }
}

public class Sobreposicao {
    public static void main(String[] args) {
        List<informacoes> enderecos = new ArrayList<>(); // Instância da Coleção
        // ao colocar informações dentro do sinal <> você traz os atributos e métodos da classe

        informacoes dadosDoEndereco = new informacoes(); // Instância da Classe

        dadosDoEndereco = new informacoes();
        dadosDoEndereco.setcidade("Brasilia");
        enderecos.add(dadosDoEndereco);
        System.out.println("Cidade 1: " + dadosDoEndereco.getcidade());

        dadosDoEndereco = new informacoes();
        dadosDoEndereco.setcidade("São Paulo");
        enderecos.add(dadosDoEndereco);
        System.out.println("Cidade 2: " + dadosDoEndereco.getcidade());

    }
}
