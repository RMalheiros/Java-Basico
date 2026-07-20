package br.com.javabasico.teoria;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OperacoesComDatas {

    public static void main(String[] args) {

        LocalDateTime dataEHora = LocalDateTime.now();
        System.out.println("Data e Hora: "+ dataEHora);

        DateTimeFormatter Formatando = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String Formatado = dataEHora.format(Formatando);
        System.out.println("Data e Hora Formatado: "+ Formatado);

    }
}
