package br.com.javabasico.trycatch;

public class Throw {
    /** throw é utilizada para lançar uma exceção personaliza por regras de negócio em Java.
     * Uso:
     * * Permite que o desenvolvedor gere uma exceção manualmente.
     * Exemplo:
     * if (idade < 18) {
     * ```
     throw new IllegalArgumentException("Idade inválida");
     ```
     * }
     * Funcionamento:
     * * Quando o throw é executado, o fluxo do programa é interrompido.
     * * A exceção é enviada para quem chamou o metodo (caller).
     * * Deve ser tratada com try-catch ou declarada com throws.
     * Cuidados:
     * * Usar para validar regras de negócio.
     * * Sempre fornecer mensagens claras na exceção.
     * Diferença:
     * * throw: lança uma exceção.
     * * throws: declara que o metodo pode lançar exceções.
     */

    /**
     * Tipos comuns de exceções utilizadas com "throw":
     * <p>
     * 1. IllegalArgumentException:
     * * Usada quando um método recebe um argumento inválido.
     * Ex: throw new IllegalArgumentException("Valor inválido");
     * <p>
     * 2. NullPointerException:
     * * Lançada quando um objeto esperado está nulo.
     * Ex: throw new NullPointerException("Objeto não pode ser nulo");
     * <p>
     * 3. ArithmeticException:
     * * Representa erros matemáticos (ex: divisão por zero).
     * Ex: throw new ArithmeticException("Divisão inválida");
     * <p>
     * 4. IllegalStateException:
     * * Indica que o estado do objeto não permite a operação.
     * Ex: throw new IllegalStateException("Estado inválido");
     * <p>
     * 5. IndexOutOfBoundsException:
     * * Acesso a índice inválido (array, lista, string).
     * Ex: throw new IndexOutOfBoundsException("Índice inválido");
     * <p>
     * 6. NumberFormatException:
     * * Conversão inválida de String para número.
     * Ex: throw new NumberFormatException("Formato inválido");
     * <p>
     * 7. UnsupportedOperationException:
     * * Operação não suportada.
     * Ex: throw new UnsupportedOperationException("Operação não permitida");
     * <p>
     * Observações:
     * * A maioria dessas exceções são do tipo RuntimeException (não obrigatórias).
     * * São muito usadas para validações e regras de negócio.
     * * Evite lançar exceções genéricas quando houver uma mais específica.
     */


    static void idadeValidacao(int idade) {
        if (idade < 18) {
            throw new ArithmeticException("Acesso negado - Idade deve ser maior que 18");
        } else {
            System.out.println("Acesso Permitido. ");
        }
    }


    public static void main(String[] args) {

        idadeValidacao(16);
    }
}
