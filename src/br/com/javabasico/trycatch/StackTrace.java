package br.com.javabasico.trycatch;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StackTrace {

    /**
     * Stack Trace (printStackTrace)
     * ------------------------------
     * Representa o rastreamento da pilha de execução no momento em que uma exceção ocorre.
     *
     * O metodo printStackTrace() exibe no console a sequência de chamadas de métodos
     * que levaram ao erro, facilitando a identificação da causa.
     *
     * Exemplo:
     * try {
     *     int x = 10 / 0;
     * } catch (Exception e) {
     *     e.printStackTrace();
     * }
     *
     * Saída:
     * - Tipo da exceção
     * - Mensagem de erro
     * - Linha e classe onde ocorreu
     * - Sequência de chamadas (stack)
     *
     * Métodos relacionados:
     * - getMessage(): retorna a mensagem da exceção
     * - getStackTrace(): retorna o stack trace como array
     *
     * Observações:
     * - Muito usado para debug
     * - Não recomendado para uso direto em produção (usar logs)
     */

    /**
     * StringWriter
     * --------------
     * Classe utilizada para escrever dados em memória (String) como se fosse um arquivo.
     *
     * Pertence ao pacote java.io e é muito usada para capturar textos gerados
     * por outros métodos, como o stack trace de exceções.
     *
     * Exemplo:
     * StringWriter sw = new StringWriter();
     * PrintWriter pw = new PrintWriter(sw);
     * e.printStackTrace(pw);
     *
     * String resultado = sw.toString();
     *
     * Principais métodos:
     * - write(): escreve dados na String
     * - toString(): retorna o conteúdo acumulado
     * - append(): adiciona conteúdo
     *
     * Observações:
     * - Não cria arquivos físicos (usa memória)
     * - Muito útil para logs e tratamento de erros
     */

    public static void main(String[] args) {

        try{
            String teste = "123s";
            Double.parseDouble(teste);
            System.out.println("Convertido: "+ teste);
        } catch (Exception erro) {
            //System.out.println("Erro ao converter "+ erro);

            StringWriter dadosMemoria = new StringWriter(); //  escrever dados em memória (String) como se fosse um arquivo
            PrintWriter imprimir = new PrintWriter(dadosMemoria); // Imprime os dados escritos no StringWriter
            erro.printStackTrace(imprimir); //  printStackTrace() exibe no console a sequência detalhada de chamadas de metodo
            System.out.println(dadosMemoria.toString());

        }

    }
}
