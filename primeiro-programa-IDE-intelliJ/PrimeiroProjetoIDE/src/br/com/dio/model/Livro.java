package br.com.dio.model;

public class Livro {
    private String nome;
    private int numPages;

    public Livro() {
    }

    public Livro(String nome, int numPages) {
        this.nome = nome;
        this.numPages = numPages;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}
