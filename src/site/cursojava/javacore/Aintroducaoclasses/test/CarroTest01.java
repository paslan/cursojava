package site.cursojava.javacore.Aintroducaoclasses.test;

import site.cursojava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.nome = "Corsa";
        carro1.modelo = "Classic";
        carro1.ano = 2012;

        carro2.nome = "Fiat";
        carro2.modelo = "Palio";
        carro2.ano = 2020;


        carro1 = carro2;
        
        System.out.println("Carro1-> "+carro1.nome+" modelo: "+carro1.modelo+" ano: "+carro1.ano);
        System.out.println("Carro2-> "+carro2.nome+" modelo: "+carro2.modelo+" ano: "+carro2.ano);
    }
}
