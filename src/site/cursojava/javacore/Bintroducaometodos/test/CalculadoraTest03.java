package site.cursojava.javacore.Bintroducaometodos.test;

import site.cursojava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result =  calculadora.divideDoisNumeros(30, 7);
        System.out.println(result);
        System.out.println("************");
        calculadora.imprimeDivisaoDeDoisNumeros(35,0);
    }
}
