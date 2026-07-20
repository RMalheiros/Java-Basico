package br.com.javabasico.teoria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PalavraThis {
    //Atributo
    String Nome;

    //Metodo
    public void setNome(String Nome) { //parâmetro
        this.Nome = Nome;
    }

    public static void main(String[] args) {

        PalavraThis Obj = new PalavraThis();
        Obj.Nome = "Rafael";
        System.out.println("Nome: "+ Obj.Nome);
    }
}
