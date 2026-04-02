package br.com.javabasico.teoria;
enum Altura{
    ALTO,
    MEDIO,
    BAIXO
}
public class Enumeracoes { // Enumerações são constantes, ou seja, são imutáveis
    public static void main(String[] args) {
        Altura objAltura = Altura.MEDIO; // instância com atribuição de Valor

        // estrutura case para verificar
        switch(objAltura){
            case BAIXO:
                System.out.println("Altura BAIXO");
                break;
            case MEDIO:
                System.out.println("Altura MEDIO");
                break;
            case ALTO:
                System.out.println("Altura ALTO");
                break;
        }
    }
}
