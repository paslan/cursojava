package site.cursojava.introducao;

public class A06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprimir todos o snumeros pares de 1 a 1000000
        int contador = 1;
        while(contador <= 100 ){
            if (contador % 2 == 0){
                System.out.println("Número par "+ contador);
            }
            contador++;
        }
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println("Pares por for "+i);
                i++;
            }

        }
    }
}
