package br.com.javabasico.teoriaExercicios;

public enum Exercicio11Enumeracao {
    A("Mercedes"),
    B("Ferrari"),
    C("BMW");

    private String carros;

    private Exercicio11Enumeracao(String carros) {
        this.carros = carros;
    }

    public String getCarros() {
        return carros;
    }


    public static void main(String[] args) {
        for (Exercicio11Enumeracao carro:Exercicio11Enumeracao.values()) {
            System.out.println(carro.getCarros());
        }
    }
}
