package br.com.javabasico.herancaEPolimorfismo;

    class classePai{
        String nome = "padrão";
        int idade;
        void mostrarInformacoes() {
            System.out.println("Pai: \nnome: " + nome + "\nidade: " + idade + "\n");
        }
    }

    class classeFilho extends classePai{
//         String nome;  A criação desses atributos são opcionais, visto que ele herda da classe Pai
//         int idade; // A criação desses atributos são opcionais, visto que ele herda da classe Pai
//        void mostrarFilho() {
//            System.out.println("Filho: \nnome:" + nome + "\nidade:" + idade + "\n");
//        }
    }

    public class upcastingEDowncasting2 {
    public static void main(String[] args) {
        classePai pai = new classeFilho();
        //pai.nome = "Rafael";
        pai.idade = 32;
        pai.mostrarInformacoes();

        classeFilho filho = (classeFilho) pai;
        filho.nome = "Isaque";
        filho.idade = 2;
        filho.mostrarInformacoes();


    }
}




