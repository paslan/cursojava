package site.cursojava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double;
    private double;

    public void imprimeDados() {
        if (salario == null) {
            return;
        }
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for (double temp : this.salario) {
            System.out.println("Salario " + temp);
        }
        mediaSalarios();
    }

    public void mediaSalarios() {
        if (salario == null) {
            return;
        }
        for (int i = 0; i < this.salario.length; i++) {
            total += this.salario[i];
        }
        media = total / this.salario.length;
        System.out.println("Media dos salários " + media);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getTotal() {
        return total;
    }

    public double getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
