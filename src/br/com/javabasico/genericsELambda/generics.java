package br.com.javabasico.genericsELambda;

/**
 * Generics permitem criar classes, métodos e coleções
 * que trabalham com diferentes tipos de dados de forma segura.
 *
 * Eles evitam conversões manuais e reduzem erros de tipagem.
 *
 * Exemplo:
 *
 * List<String> nomes = new ArrayList<>();
 *
 * Nesse exemplo, a lista aceita apenas valores do tipo String.
 */

// Criando a classe GENERICA
class Verificando<parametro>{ // <parametro> representa um tipo genérico que será definido quando o objeto for criado.
    // Parametro
    private parametro item;
    //Metodo
    public Verificando(parametro item){
        this.item = item;
    }
    //Metodo para obter item
    public parametro getItem(){
        return item;
    }
    // Metodo para alterar item
    public void setItem(parametro item){
        this.item = item;
    }

    //Metodo para mostrar
    public void detalhes(){
        System.out.println("Valor do Item: " + this.getItem());
        System.out.println("Tipo do Item: " + item.getClass().getName());
    }
}
public class generics {
    public static void main(String[] args) {

        Verificando<String> teste = new Verificando<String>("Testando o tipo da informação");
        teste.detalhes();

        System.out.println("--------------------");

        Verificando<Integer> teste2 = new Verificando<Integer>(new Integer(1));
        teste2.detalhes();
    }
}
