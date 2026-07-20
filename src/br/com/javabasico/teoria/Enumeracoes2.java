package br.com.javabasico.teoria;

public enum Enumeracoes2 {
    A("Opção 1"),
    B("Opção 2"),
    C("Opção 3");

    private String descricao; // Variável Privada

    // CRIAÇÃO DO Construtor
    Enumeracoes2(String descricao) {
        this.descricao = descricao;
    }

    // Obter o Descrição
    public String getDescricao() {
        return descricao;
    }

    public static void main(String[] args) {
        for (Enumeracoes2 item:Enumeracoes2.values()){
            System.out.println(item.getDescricao());
        }
    }
}
