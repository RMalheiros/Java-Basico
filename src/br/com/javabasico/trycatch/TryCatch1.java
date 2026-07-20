package br.com.javabasico.trycatch;

/**
 * Try Catch
 * O bloco try-catch é utilizado para tratar exceções (erros) em tempo de execução,
 * evitando que o programa seja interrompido de forma inesperada.
 * <p>
 * Estrutura básica:
 * * try: contém o código que pode gerar exceção.
 * * catch: captura e trata a exceção ocorrida.
 * * finally (opcional): bloco que sempre será executado, ocorrendo erro ou não.
 * <p>
 * Funcionamento:
 * * O código dentro do try é executado.
 * * Se ocorrer uma exceção, a execução é desviada para o catch correspondente.
 * * Após o tratamento, o programa continua sua execução normal.
 * <p>
 * Vantagens:
 * * Evita falhas no programa.
 * * Permite tratar erros de forma controlada.
 * <p>
 * Cuidados:
 * * Tratar exceções específicas sempre que possível.
 * * Evitar capturar exceções genéricas sem necessidade.
 */

public class TryCatch1 {

    // Similar ao If e else
    public static void main(String[] args){
    try {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Indice: " + numeros[0]);
    } catch (Exception erro) {
        System.out.println("Posição fora do indice " + erro);
    }
    }
}

