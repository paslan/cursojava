package site.cursojava.introducao;

public class A07Arrays02 {
    public static void main(String[] args) {
        // valores padrão para variaveis criadas fora dos métodos ou em arrays (objetos)
        // byte, short, int, long, float, double 0
        // char '\u0000' ' '
        // bollean false
        // String null
        String [] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "josé";
        nomes[2] = "Madalena";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
