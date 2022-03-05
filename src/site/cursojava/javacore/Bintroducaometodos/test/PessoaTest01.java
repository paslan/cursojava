package site.cursojava.javacore.Bintroducaometodos.test;

import site.cursojava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();

        pessoa01.setNome("Zé das Couves");
        pessoa01.setIdade(-1);

        pessoa01.imprime();

        System.out.println("-------------------");

        System.out.println(pessoa01.getNome());
        System.out.println(pessoa01.getIdade());

    }
}
