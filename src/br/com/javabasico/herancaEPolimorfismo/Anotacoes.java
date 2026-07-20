package br.com.javabasico.herancaEPolimorfismo;

/**
 * Annotations são marcações especiais utilizadas no Java para fornecer
 * metadados ao compilador, à JVM ou ao próprio código da aplicação.
 *
 * Elas não alteram diretamente a lógica do programa, mas ajudam em
 * validações, configurações e processamento automático.
 *
 * Exemplo:
 *
 * @Override
 *
 * A annotation @Override indica que um metodo está sobrescrevendo
 * um metodo da superclasse.
 *
 * Benefícios do @Override:
 * - Evita erros de digitação em metodos sobrescritos;
 * - Garante que o metodo realmente exista na classe pai;
 * - Melhora a legibilidade e manutenção do código.
 */

public class Anotacoes {

    public void mostrar() {
        System.out.println("Texto do método 1");
    }
}


class Modelo extends Anotacoes {
    @Override // Sobreposição do metodo mostrar, deve ter a mesma quantidade de parametros e argumentos da classe pai.
    public void mostrar() {
        System.out.println("Texto do método 2");
    }

    public static void main(String[] args) {
        Anotacoes metodoOriginal = new Anotacoes();
        metodoOriginal.mostrar();
        Modelo sobrepostoPorOverride = new Modelo();
        sobrepostoPorOverride.mostrar();
    }
}
