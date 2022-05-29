package br.com.livraria;
/* @author Renata.ferreira
*
*@version 1.0
 */

public class Livraria {

    public static void main ( String args[]){

        System.out.println("********Bem-vindo a Livraria********");


        Livro livro  = new Livro();
        livro.livrocad();
        livro.cadastrarLivro();
        System.out.println("\t\t\tLivros : \t" + livro.getTitulo() +"\t"+ livro.getGenero()+"\t"+livro.getPreco());
        System.out.println("\t\t\tLivros Disponiveis");
        livro.imprimirLivros();

        String fim = livro.finalizando();
           System.out.println(fim);


    }
}
