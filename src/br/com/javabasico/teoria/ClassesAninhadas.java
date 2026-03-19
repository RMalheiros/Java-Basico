package br.com.javabasico.teoria;

public class ClassesAninhadas {

    public void ExibirClasseUm() {
        System.out.println("Minha Classe Um");
    }

    public class ClasseDois {
        public void ExibirClasseDois() {
            System.out.println("Minha Classe Dois");
        }

        public void MetodoExibir() {
            this.ExibirClasseDois();
            ClassesAninhadas.this.ExibirClasseUm();
        }
    }

    public static void main(String[] args) {
        ClassesAninhadas Obj1 = new ClassesAninhadas();
        ClassesAninhadas.ClasseDois Obj2 = Obj1.new ClasseDois();
        Obj2.MetodoExibir();

    }
}
