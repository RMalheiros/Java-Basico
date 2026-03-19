package br.com.javabasico;

public class Exercicio01ClassesAninhadas {
    public void ClasseUm() {
        System.out.println("Minha Classe Um");
    }

    public class ClasseDois {
        public void ExibirClasseDois() {
            System.out.println("Minha Classe Dois");
        }

        public void MetodoExibirTodos() {
            Exercicio01ClassesAninhadas.this.ClasseUm();
            this.ExibirClasseDois();
        }

    }


    public static void main(String[] args) {
        Exercicio01ClassesAninhadas Exe01 = new Exercicio01ClassesAninhadas(); // Instância da Classe Geral
        Exercicio01ClassesAninhadas.ClasseDois Exibir = Exe01.new ClasseDois(); // Instância da Subclasse
        Exibir.MetodoExibirTodos();

    }
}
