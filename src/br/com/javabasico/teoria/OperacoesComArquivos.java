package br.com.javabasico.teoria;
import java.io.File; // Biblioteca de importar arquivos
import java.io.IOException; // Biblioteca de Tratamento de exceções

public class OperacoesComArquivos {

    /**
     * Classe File (java.io.File)
     * ---------------------------
     * Utilizada para representar e manipular arquivos e diretórios no sistema.
     *
     * Permite criar, verificar e acessar informações de arquivos.
     *
     * Criação de arquivo:
     * - createNewFile(): cria um novo arquivo físico (retorna boolean)
     *
     * Exemplo:
     * File arquivo = new File("caminho/arquivo.txt");
     * arquivo.createNewFile();
     *
     * Principais métodos:
     * - exists(): verifica se o arquivo existe
     * - delete(): remove o arquivo
     * - mkdir(): cria um diretório
     * - mkdirs(): cria diretórios (incluindo pais)
     * - getName(): retorna o nome do arquivo
     * - getPath(): retorna o caminho
     *
     * Observações:
     * - Não escreve conteúdo no arquivo (apenas cria/manipula)
     * - Pode lançar IOException ao criar arquivos
     */
    public static void main(String[] args) {

        // Instanciando - Usa-se duas contrabarras(\\) porque a barra invertida \ é um caractere especial em Java
        File arquivo = new File("C:\\Users\\c070324\\Documents\\Cursos\\Java\\JavaArquivo.txt"); // Path do arquivo

        if (arquivo.delete()){
            System.out.println("Arquivo deletado com sucesso!");
        } else {
            System.out.println("Falha ao deletar arquivo: " + arquivo.getName());
        }

        //Criar
        try { // Tentando criar
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso! " + arquivo.getName());
            } else {
                System.out.println("Arquivo já existe!");
            }
        } catch (IOException erroNaCriacao) {
            System.out.println("Erro ao criar arquivo: " + erroNaCriacao);
        }


    }
}
