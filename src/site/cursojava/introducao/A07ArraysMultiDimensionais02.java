package site.cursojava.introducao;

public class A07ArraysMultiDimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = new int[]{6,5,4,3,2,1};
        for (int[] arraybase: arrayInt) {
            System.out.println("\n-----");
            for (int num: arraybase) {
                System.out.print(num);
            }
        }
        int [][] arrayInt2 = {{1,2}, {4,3,2}, {7,6,5,4,3,2,1}};
        for (int[] arraybase: arrayInt2) {
            System.out.println("\n********");
            for (int num: arraybase) {
                System.out.print(num);
            }
        }
    }
}
