package site.cursojava.javacore.Bintroducaometodos.test;

import site.cursojava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
