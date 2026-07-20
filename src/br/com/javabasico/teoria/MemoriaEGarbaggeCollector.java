package br.com.javabasico.teoria;
import java.util.Date;

public class MemoriaEGarbaggeCollector {

    String nomeNovo;
    public static void main(String[] args) {
        // Gerenciamento de Espaco

        String nome; // Reservando espaco em memoria
        int Idade;
        double salario;

        MemoriaEGarbaggeCollector alocacao = new MemoriaEGarbaggeCollector(); // Reservando espaco em memoria

        // Reservando espaco e preenchendo em memoria
        StringBuffer alocacao2 = new StringBuffer("Informação"); // String são imutáveis, StringBuffer é para manipular Strings Mutáveis

        alocacao2 = null; // Pode ser REALIZADO O GARBAGE COLLECTOR

        Runtime Objeto = Runtime.getRuntime(); // Runtime - tempo de execução da JVM (obtem informações da JVM(memórias, processador, etc))

        System.out.println("Memória TOTAL: " + Objeto.totalMemory());
        System.out.println("Memória Antes da instÂncia: " + Objeto.freeMemory());

        Date teste = null;

        for(int i = 0; i <= 1000; i++) {
            teste = new Date();
            teste = null;
        }

        System.out.println("Depois da instância"+ Objeto.freeMemory());
        Objeto.gc(); //GC - Garbagge Collector
        System.out.println("Coleta de LIxo: " + Objeto.freeMemory());
    }
}
