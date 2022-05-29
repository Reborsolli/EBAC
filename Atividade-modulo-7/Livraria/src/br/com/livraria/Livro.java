package br.com.livraria;

public class Livro {


    private int cod;
    private String titulo;
    private String genero;
    private double preco;
    private int quant;

    //get e setter
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    /**
     * @deprecated
     *
     * @see cadastrarLivro()
     */

    public void livrocad(){
        this.cod=789124;
        this.titulo = " Os segredos das Mentes Milironaria";
        this.genero= "auto-ajuda";
        this.preco= 45.00;

    }

    /**
     * metodo cadastro de livro
     */
    public void cadastrarLivro(){
        this.cod=789123;
        this.titulo = "Mais esperto que o diabo";
        this.genero= "auto-ajuda";
        this.preco= 40.00;

    }

    /**
     * Imprimir o estoque
     */
    public void imprimirLivros(){
        this.quant= 10;
        System.out.println("\t"+ this.getCod()+"\t"+this.titulo+"\t"+this.quant);
    }
    // frase final
    public String finalizando(){
      return  "\t\t\tLeia livros...";
    }
}
