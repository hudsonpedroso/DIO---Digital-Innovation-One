package br.com.dio;
import br.com.dio.model.Gato;
import br.com.dio.model.Livro;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a=5, b=6;
        System.out.println("Hello World! " + (a+b));*/

        Gato gato = new Gato("Miau", "Branco", 20);
        System.out.println(gato);
        Livro livro = new Livro("O problema dos 3 corpos", 300);

    }
}
