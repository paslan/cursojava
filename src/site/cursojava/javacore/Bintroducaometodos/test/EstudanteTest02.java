package site.cursojava.javacore.Bintroducaometodos.test;

import site.cursojava.javacore.Bintroducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "João Paulo Pinheiro Aslan";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Juliana Pinheiro";
        estudante02.idade = 23;
        estudante02.sexo = 'F';

        estudante01.imprime();
        System.out.println("-------------------");
        estudante02.imprime();

    }

}
