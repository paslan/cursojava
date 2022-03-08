package site.cursojava.javacore.Gassociacao.test;

import site.cursojava.javacore.Gassociacao.domain.Escola;
import site.cursojava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Zebio da Silva");
        Professor[] professores = {professor1};
        Escola escola = new Escola("IBTA", professores);

        escola.imprime();
    }
}
