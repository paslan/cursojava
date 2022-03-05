package site.cursojava.javacore.Bintroducaometodos.test;

import site.cursojava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Jose da Silva";
        funcionario1.idade = 56;
        funcionario1.salario = new double[]{1500.12,2750.98,3748.56};

        funcionario1.imprimeDados();



    }
}
