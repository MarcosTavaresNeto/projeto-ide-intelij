package br.com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        float a, b;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        a = scan.nextFloat();
        System.out.println("Digite o segundo valor");
        b = scan.nextFloat();
        float soma = soma(a, b);
        float sub = sub(a, b);
        float mult = mult(a, b);
        float div = div(a, b);
        System.out.println("soma ->" + soma);
        System.out.println("Subtrair ->" + sub);
        System.out.println("Multiplicar->" + mult);
        System.out.println("Dividir ->" + div);


    }

    public static float soma(float a, float b) {
        return a + b;
    }

    public static float sub(float a, float b) {
        return a - b;
    }

    public static float mult(float a, float b) {
        return a * b;
    }

    public static float div(float a, float b) {
        return a / b;
    }
}
