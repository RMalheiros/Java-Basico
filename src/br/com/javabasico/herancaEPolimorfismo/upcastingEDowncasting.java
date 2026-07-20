package br.com.javabasico.herancaEPolimorfismo;

/**
 * Upcasting e Downcasting
 * ------------------------
 * Conversões entre tipos de uma hierarquia de classes (herança).
 *
 * Upcasting:
 * - Conversão de uma subclasse para superclasse
 * - Implícito (automático)
 * - Mais seguro
 *
 * Exemplo:
 * Animal a = new Cachorro();
 *
 * Downcasting:
 * - Conversão de superclasse para subclasse
 * - Explícito (necessita cast)
 * - Pode gerar ClassCastException
 *
 * Exemplo:
 * Cachorro c = (Cachorro) a;
 *
 * Observações:
 * - Downcasting só é seguro se o objeto for realmente da subclasse
 * - Pode-se usar "instanceof" para verificação antes do cast
 *
 * Exemplo seguro:
 * if (a instanceof Cachorro) {
 *     Cachorro c = (Cachorro) a;
 * }
 */

// Classe Pai
    class Pai{
    String nomePai;
    void mostrarPai(){
        System.out.print("Exibindo Pai: ");
    }
}

//Classe Filho
    class Filho extends Pai{
        String nomeFilho    ;
        void mostrarFilho(){
            System.out.print("Exibindo Filho: ");
        }
}

public class upcastingEDowncasting {

    public static void main(String[] args) {
        // Upcasting - Quando faz a passagem do filho para o pai
        Pai filhoParaPai = new Filho();
        filhoParaPai.nomePai = "Emerson";

        Filho paiParaFilho = (Filho) filhoParaPai; // Utilizando o Objeto da classe Pai
        // Downcasting - Quando a passagem é do pai para o filho
        paiParaFilho.nomeFilho  = "Rafael";
        paiParaFilho.mostrarFilho(); System.out.println(paiParaFilho.nomeFilho); //  Downcasting
        System.out.println();
        filhoParaPai.mostrarPai(); System.out.println(((Filho) filhoParaPai).nomePai); //Upcasting
        System.out.println();
        System.out.println(paiParaFilho.nomeFilho);
        System.out.println(filhoParaPai.nomePai);
        System.out.println(((Filho) filhoParaPai).nomeFilho);
        System.out.println(((Filho) filhoParaPai).nomePai);

    }

}
