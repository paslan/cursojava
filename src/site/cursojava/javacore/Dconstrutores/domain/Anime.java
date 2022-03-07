package site.cursojava.javacore.Dconstrutores.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int epdisodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int epdisodios, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.epdisodios = epdisodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int epdisodios, String genero, String estudio){
        this(nome, tipo, epdisodios, genero);
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem parametros");
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epdisodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpdisodios(int epdisodios){
        this.epdisodios = epdisodios;
    }

    public int getEpdisodios(){
        return this.epdisodios;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
