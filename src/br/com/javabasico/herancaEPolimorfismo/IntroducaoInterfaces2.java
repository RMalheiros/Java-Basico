package br.com.javabasico.herancaEPolimorfismo;


interface Empresa2 { // Atributos e métodos da interface
    public void funcao();
    public void salario();
}

interface novoEmprego{
    public void funcaoNova();
    public void SalarioNovo();
    public void diaDeFolga();
}

class Gerente2 implements Empresa2 { // Esta linha estamos implementando a interface
    public void funcao(){
        System.out.println("Gerente");
    }
    public void salario(){
                System.out.println("R$ 3.000,00" );
    }
    public void diaDeFolga(){
        System.out.println("Domingo");
    }
}
public class IntroducaoInterfaces2 { // Declaração da interface

    public static void main(String[] args) {
        Gerente2 nomeGerente = new Gerente2();
        nomeGerente.funcao();
        nomeGerente.salario();
        nomeGerente.diaDeFolga();
    }
}
