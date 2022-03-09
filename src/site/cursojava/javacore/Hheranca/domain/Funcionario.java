package site.cursojava.javacore.Hheranca.domain;

public class Funcionario  extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático Funcionario");
    }
    {
        System.out.println("Bloco de inicialização não estatico Funcionario 1");
    }
    {
        System.out.println("Bloco de inicialização não estatico Funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construturo de Funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void Relatoriopagamento(){
        System.out.println("Eu "+this.nome+" recebi o valor de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
