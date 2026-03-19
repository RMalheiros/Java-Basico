package br.com.javabasico.teoria;

public class ClassesEObjetos {
    //Objetos

    //Atributos
    int Idade = 3;
    String Raca = "Pitbull";
    double Peso = 8.5;
    boolean Status = true;

    public static void main(String[] args) {
        //Instanciar
        ClassesEObjetos MyObjeto = new ClassesEObjetos();

        //Exibindo
        System.out.println("Peso " + MyObjeto.Peso);
    }
}

