package site.cursojava.javacore.Hheranca.test;

import site.cursojava.javacore.Hheranca.domain.Funcionario;

public class Herancatest02 {
    //0 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar a classe pai
    //1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
    //2 - Alocado espaço em memória para o objeto da superclasse
    //3 - Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado
    //4 - Bloco de inicialização da superclasse é executado na ordem que aparece;
    //5 - Contrutor é executado da superclasse;
    //6 - Alocado espaço em memória para o objeto da subclasse
    //7 - Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado
    //8 - Bloco de inicialização da subclasse é executado na ordem que aparece;
    //9 - Contrutor é executado da subclasse;

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Zebio da Silva");
    }
}
