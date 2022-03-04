package site.cursojava.javacore.Aintroducaoclasses.test;

import site.cursojava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Julio Botelho";
        professor.idade = 56;
        professor.sexo = 'M';
        System.out.println("Nome: "+professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
