package br.com.javabasico.herancaEPolimorfismo;

//INTERFACE
interface EmpresaInterface {
    public void funcaoInterface();
    public void salarioInterface();
}

class funcionarioInterface implements EmpresaInterface {
    public void funcaoInterface() {
        System.out.println("Gerente(Interface) ");
    }
    public void salarioInterface() {
        System.out.println("R$ 3.000,00(Interface)\n");
    }
}

class EmpresaHeranca{
    public void funcaoHeranca() {
        System.out.println("Supervisor(Herança)");
    }
    public void salarioHeranca() {
        System.out.println("R$ 2.500 (Heranca)\n");
    }
}

public class HerancaVersusInterface extends EmpresaHeranca {
    public static void main(String[] args) {
        funcionarioInterface gerente = new funcionarioInterface();
        EmpresaHeranca supervisor = new EmpresaHeranca();

        gerente.funcaoInterface();
        gerente.salarioInterface();

        supervisor.funcaoHeranca();
        supervisor.salarioHeranca();
    }
}
