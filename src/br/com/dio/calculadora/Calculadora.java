package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o primeiro valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a,b);
        int multiplicar = multiplicar(a,b);
        float dividir = dividir(a,b);

        System.out.println("Seu Resultado da soma é: " + somar);
        System.out.println("Seu Resultado da subtração é: " + subtrair);
        System.out.println("Seu Resultado da multiplicação é: " + multiplicar);
        System.out.println("Seu Resultado da dividir é: " + dividir);

    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        return a / b;
    }
}
