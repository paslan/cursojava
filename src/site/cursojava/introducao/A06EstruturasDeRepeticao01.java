package site.cursojava.introducao;

public class A06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10){
            System.out.println("While " + count);
            count++;
        }
        count = 0;
        do {
            System.out.println("Do While " + count);
            count++;
        } while (count < 10);
        for (int i=0;i<10;i++){
            System.out.println("For " + i);
        }
    }
}
