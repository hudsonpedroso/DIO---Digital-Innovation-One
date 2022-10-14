package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o valor: ");
        a = sc.nextInt();
        System.out.println("Digite o valor: ");
        b = sc.nextInt();

        int somar = somar(a, b);
        int sub = subtrair(a, b);
        int multiplicar = multiplicar(a,b);
        int dividir = dividir(a, b);

        System.out.println("Somar: " + somar);
        System.out.println("Sub: " + sub);
        System.out.println("Mult: " + multiplicar);
        System.out.println("Dividir: " + dividir);


    }

    public static final int somar(int a, int b){
        return a+b;
    }

    public static final int subtrair(int a, int b){
        return a-b;
    }

    public static final int multiplicar(int a, int b){
        return a*b;
    }

    public static final int dividir(int a, int b){
        return a/b;
    }

}
