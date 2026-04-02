package br.com.javabasico.teoria;

public enum Enumeracoes2 {
    A("Opção 1"),
    B("Opção 2"),
    C("Opção 3");

    private String descricao; // Variável Privada

    Enumeracoes2(String descricao) { // Construtor
        this.descricao = descricao;
    }

    // Obter o Descrição
    public String getDescricao() {
        return descricao;
    }


    public static void main(String[] args) {
        for (Enumeracoes2 DESCRICAO:Enumeracoes2.values()){
            System.out.println(DESCRICAO.getDescricao());
        }
    }
}
