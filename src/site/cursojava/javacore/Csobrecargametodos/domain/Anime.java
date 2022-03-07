package site.cursojava.javacore.Csobrecargametodos.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int epdisodios;
    private String genero;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epdisodios);
        System.out.println(this.genero);
    }

    public void init(String nome, String tipo, int epdisodios){
        this.nome = nome;
        this.tipo = tipo;
        this.epdisodios = epdisodios;
    }

    public void init(String nome, String tipo, int epdisodios, String genero){
        this.init(nome, tipo, epdisodios);
        this.genero = genero;
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
