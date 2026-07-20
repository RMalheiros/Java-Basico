package br.com.javabasico.teoriaExercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercicio12OperacoesComDatas {


        public static void main(String[] args) {

            //Metodo de Dia
            LocalDate DiaAtual = LocalDate.now();
            System.out.println("Data Atual: " + DiaAtual);

            //Metodo de Hora
            LocalTime HoraAtual = LocalTime.now();
            System.out.println("Hora Atual: " + HoraAtual);

            //Metodo de dia e Hora
            LocalDateTime DiaEHora = LocalDateTime.now();
            System.out.println("Data Hora: " + DiaEHora);

            //Metodo Formatado - Coloca o . e o metodo em seguida que ele irá utilizar(ofPattern)
            DateTimeFormatter DiaEHoraFormatando = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //Instanciação e criação do molde de formatação
            String Formatado = DiaEHora.format(DiaEHoraFormatando); // A formatação é feita aqui (criação do objeto = Objeto recebido.format(Modelo do novo formato))
            System.out.println("Data Hora: " + Formatado);


        }
    }

