package br.com.javabasico.herancaEPolimorfismo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @Target É uma annotation utilizada para definir onde uma annotation
 * personalizada pode ser aplicada.
 *
 * Ela trabalha em conjunto com o enum ElementType, que especifica
 * os tipos de elementos permitidos.
 *
 * Exemplo:
 *
 * @Target(ElementType.METHOD)
 *
 * Nesse caso, a annotation só poderá ser utilizada em métodos.
 *
 * Principais tipos do ElementType:
 *
 * - ElementType.TYPE
 *   Permite uso em classes, interfaces e enums.
 *
 * - ElementType.METHOD
 *   Permite uso em métodos.
 *
 * - ElementType.FIELD
 *   Permite uso em atributos/variáveis de instância.
 *
 * - ElementType.CONSTRUCTOR
 *   Permite uso em construtores.
 *
 * - ElementType.PARAMETER
 *   Permite uso em parâmetros de métodos.
 *
 * - ElementType.LOCAL_VARIABLE
 *   Permite uso em variáveis locais.
 *
 * - ElementType.ANNOTATION_TYPE
 *   Permite uso em outras annotations.
 *
 * - ElementType.PACKAGE
 *   Permite uso em pacotes.
 *
 * Exemplo completo:
 *
 * @Target(ElementType.FIELD)
 * public @interface MinhaAnnotation {
 * }
 *
 * Nesse exemplo, a annotation poderá ser utilizada apenas em atributos.
 */

@Target(ElementType.TYPE_USE)
@interface NomeDesejado{}
public class Anotacoes2 {
    public static void main(String[] args) {
        @NomeDesejado String Texto = "ABCD 1234";
        System.out.println(Texto);
        variavel();
    }

    static @NomeDesejado int variavel(){
        System.out.println("Tipo Utilizado");
        return 0;
    }
}
