package br.com.javabasico.trycatch;

/** Principais tipos de Exception

 * Principais exceções em Java:
 *
 * * Exception: * Capturar qualquer exceção que não foi tratada especificamente.
 *
 * * NullPointerException:  * Ocorre ao tentar acessar um objeto que está nulo.
 *
 * * ArithmeticException:  * Erro em operações matemáticas inválidas (ex: divisão por zero).
 *
 * * NumberFormatException: * Ocorre ao converter uma String inválida para número.
 *
 * * ArrayIndexOutOfBoundsException:  * Acesso a índice inexistente de um array.
 *
 * * StringIndexOutOfBoundsException:  * Acesso a índice inválido em uma String.
 *
 * * ClassCastException:  * Tentativa de conversão entre tipos incompatíveis.
 *
 * * IllegalArgumentException:  * Metodo recebe argumento inválido.
 *
 * * IOException: * Erros de entrada/saída (arquivos, streams).
 *
 * * FileNotFoundException: * Arquivo não encontrado ao tentar abrir.
 *
 * * SQLException: * Erros relacionados a banco de dados.
 *
 * Observação:
 * * Exceções podem ser verificadas (checked) ou não verificadas (runtime).
 * * RuntimeException não exige tratamento obrigatório.
 */

public class TryCatch2 {
    public static void main(String[] args) {
        String teste = null;
        String novoTeste = null;
        novoTeste = teste.toLowerCase();

        try {
            novoTeste = teste.toLowerCase();
            System.out.println("Resultado "+ novoTeste);
        } catch (NullPointerException erro) { // NullPointerException - Tratamento de variáveis nulas
            System.out.println("Erro de valor nulo: "+ erro);
        }
    }
}
