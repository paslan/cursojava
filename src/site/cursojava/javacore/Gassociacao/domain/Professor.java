package site.cursojava.javacore.Gassociacao.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        if (seminarios == null) return;
        for (Seminario seminario : seminarios) {
            System.out.print(seminario.getTitulo()+" ");
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getEstudantes()== null || seminario.getEstudantes().length == 0) continue;
            System.out.println("*** Alunos ***");
            for (Estudante estudante : seminario.getEstudantes()) {
                System.out.println("Estudante: "+estudante.getNome()+" Idade: "+estudante.getIdade());
            }

        }
        System.out.println();

    }
}
