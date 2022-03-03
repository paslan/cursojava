package site.cursojava.introducao;

public class A07ArraysMultiDimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5,6,7,8,9,10,11,12 Meses
        //31,28,31,30... dias
        int[][] dias = new int[12][1];
        dias[0][0] = 31;
        dias[1][0] = 28;
        dias[2][0] = 31;
        dias[3][0] = 30;
        dias[4][0] = 31;
        dias[5][0] = 30;
        dias[6][0] = 31;
        dias[7][0] = 31;
        dias[8][0] = 30;
        dias[9][0] = 31;
        dias[10][0] = 30;
        dias[11][0] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("Mês "+(i+1)+" tem "+dias[i][j]+" dias");
            }
        }
        for (int[] arrBase:dias) {
            for (int num:arrBase) {
                System.out.println(num);
            }
            
        }
    }
}
