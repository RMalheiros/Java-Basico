package br.com.javabasico;

public class ClassesEMetodos {
    //Classes
    //Atributos

    //Metodos Static
    static void MeuMetodo() {
        System.out.println("Resultado do Método! ");
        Somar();
    }

    static void Somar() {
        int num1 = 10, num2 = 15;
        int Resultado = num1 + num2;
        System.out.println("Resultado do Somar " + Resultado);
    }

    //public
    public void Metodo() {
        System.out.println("Testando método public");
    }

    public static void main(String[] args) {
        //Objetos

        //Chamar o metodo static
        MeuMetodo();

        //Chamar o metodo public, precisa instanciar
        ClassesEMetodos Obj = new ClassesEMetodos();
        Obj.Metodo();
    }
}
