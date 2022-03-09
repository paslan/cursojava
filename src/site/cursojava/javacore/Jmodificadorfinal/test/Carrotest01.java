package site.cursojava.javacore.Jmodificadorfinal.test;

import site.cursojava.javacore.Jmodificadorfinal.dominio.Carro;
import site.cursojava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class Carrotest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro1.COMPRADOR);
        carro1.COMPRADOR.setNome("Zebio da Silva");
        System.out.println(carro1.COMPRADOR);

        Ferrari ferrari1 = new Ferrari();
        ferrari1.setNome("Dino e Enzo");
        ferrari1.imprime();
    }
}
