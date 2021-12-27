package com.moura.junior;

/**
 * Programa que calcula a área de quadriláteros
 */

public class Quadrilatero {

    public static void area(double lado){

        System.out.println("A área do quadrado é: " + lado*lado);
    }

    public static void area(double lado1, double lado2){

        System.out.println("A área do retângulo é: " + lado1*lado2);
    }

    public static void area(double ladoMaior, double ladoMenor, double altura){

        System.out.println("A área do trapézio é: " + (ladoMaior*ladoMenor)/2);
    }

    public static void area(float diagonal1, float diagonal2){

        System.out.println("A área do losango é: " + (diagonal1*diagonal2)/2);
    }
}
