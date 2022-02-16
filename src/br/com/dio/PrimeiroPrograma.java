package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a=5;
        int b=3;
        System.out.println("Soma = "+ (a+b));*/
        Gato cat = new Gato("Meaw", "Branco", 10);
        System.out.println(cat);
        Livro book = new Livro("A volta dos que não foram", 123);
        System.out.println(book);

    }
}

class Livro {
    private String nome;
    private int numPag;

    public Livro(String nome, int numPag) {
        this.nome = nome;
        this.numPag = numPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPag=" + numPag +
                '}';
    }
}

