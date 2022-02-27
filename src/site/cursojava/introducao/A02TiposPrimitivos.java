package site.cursojava.introducao;

public class A02TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean
        int ageStudent;                     // 4 bytes
        long numeroGrande = 100000;         // 8 bytes
        double salarioDouble = 2000;        // 8 bytes
        float salarioFloat = 2500.0F;       // 4 bytes
        byte idadeByte = 10;                // 1 byte
        short idadeShort = 10;              // 2 bytes
        boolean verdadeiro = true;          // 1 byte
        boolean falso = false;              // 1 byte
        char character = 'M';               // 2 bytes
        char characterasc = 65;             // 2 bytes  letra B
        char characterunicode = '\u0041';   // 2 bytes  letra A
        String nome = "Aceita grandes textos";

        ageStudent = 20;
        System.out.println("The student has " + ageStudent + " years old.");
    }
}


