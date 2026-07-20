package br.com.javabasico.herancaEPolimorfismo;

interface areaRetangulo {
    void getArea(int Largura, int Altura);
}

class retangulo implements areaRetangulo {
    public void getArea(int Largura, int Altura) {
        int resultado = Largura * Altura;
        System.out.println("A área do retângulo é: " + resultado);
    }
}
public class InterfaceGrandeUtilidade {
    public static void main(String[] args) {
        retangulo calculo1 = new retangulo();
        calculo1.getArea(4, 5);
    }
}
