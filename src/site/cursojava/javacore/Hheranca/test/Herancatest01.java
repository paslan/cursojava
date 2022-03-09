package site.cursojava.javacore.Hheranca.test;

import site.cursojava.javacore.Hheranca.domain.Endereco;
import site.cursojava.javacore.Hheranca.domain.Funcionario;
import site.cursojava.javacore.Hheranca.domain.Pessoa;

public class Herancatest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Bartolomeu Quadros");
        endereco.setCep("03714-000");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Paulo Aslan");
        pessoa.setCpf("086.984.978-61");
        pessoa.setEndereco(endereco);

        System.out.println("--- Pessoa ---");
        pessoa.imprime();


        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Bernardete de Fatima Pinheiro Aslan");
        funcionario.setCpf("047.123.228-96");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(8000);

        System.out.println("--- Funcioanrio ---");
        funcionario.imprime();

    }
}
