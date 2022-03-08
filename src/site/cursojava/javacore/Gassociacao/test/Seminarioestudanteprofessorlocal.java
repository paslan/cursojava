package site.cursojava.javacore.Gassociacao.test;

import site.cursojava.javacore.Gassociacao.domain.Estudante;
import site.cursojava.javacore.Gassociacao.domain.Local;
import site.cursojava.javacore.Gassociacao.domain.Professor;
import site.cursojava.javacore.Gassociacao.domain.Seminario;

public class Seminarioestudanteprofessorlocal {
    public static void main(String[] args) {
        Local local = new Local("São Paulo");
        Estudante estudante1 = new Estudante("João Paulo Pinheiro Aslan", 16);
        Seminario seminario1 = new Seminario("Curso Java",local);
        Seminario seminario2 = new Seminario("Curso Python",local);
        Professor professor = new Professor("Celso Freitas", "Java Expert");
        Estudante[] estudantes = {estudante1};
        Seminario[] seminarios = {seminario1, seminario2};

        seminario1.setEstudantes(estudantes);
        professor.setSeminarios(seminarios);
        estudante1.setSeminario(seminario1);


        System.out.println("--- Estudante 1");
        estudante1.imprime();
        System.out.println("--- Professor ---");
        professor.imprime();

    }
}
