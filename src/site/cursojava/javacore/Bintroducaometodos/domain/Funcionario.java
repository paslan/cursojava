package site.cursojava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimeDados() {
        if (salario == null) {
            return;
        }
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for (double temp : salario) {
            System.out.println("Salario " + temp);
        }
        mediaSalarios();
    }

    public void mediaSalarios() {
        if (salario == null) {
            return;
        }
        double total = 0;
        double media = 0;
        for (int i = 0; i < this.salario.length; i++) {
            total += this.salario[i];
        }
        media = total / this.salario.length;
        System.out.println("Media dos salários " + media);
    }
}
