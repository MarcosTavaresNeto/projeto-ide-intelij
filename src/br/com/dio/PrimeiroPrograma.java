package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a=5;
        int b=3;
        System.out.println("Soma = "+ (a+b));*/
        Gato cat = new Gato("Meaw", "Branco", 10);
        System.out.println(cat);

    }
}
