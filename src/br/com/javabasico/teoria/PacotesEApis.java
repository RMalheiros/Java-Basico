package br.com.javabasico.teoria;

// PACKAGE ou PACOTES - são organizadores de código e servem para agrupar classes relacionadas
import br.com.javabasico.teoria.Depuracao; // Importando uma classe especícica do pacote teoria
import br.com.javabasico.teoria.*; // Importando os itens de todas as classes do pacote teoria

//APIs - conjunto de funcionalidades prontas já estabelecidos pelo java, fornecedor de recursos prontos
import javax.swing.*;
import java.util.function.*; //Importando toda a biblioteca da API function
import java.time.LocalDate; //Importando biblioteca de Data
import java.time.format.DateTimeFormatter; // Importando biblioteca de Formatação de datas
import java.util.random.*; // Importando biblioteca de Numeros aleatorios


public class PacotesEApis {
    public static void main(String[] args) {
        // Algumas funções já importa a biblioteca automaticamente - Ex:. import javax.swing.*;
        JOptionPane.showMessageDialog(null, "Hello World");

        String texto = "Ola";
        int qtdCaracteres = texto.length(); // length é uma api da classe String
        System.out.println(qtdCaracteres);
    }
}
