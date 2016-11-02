package arrays.multidimensional;

import java.util.Random;

/**
 * Created by Daria Serebryakova on 01.11.2016.
 */
public class Max2DArrayElement {
    public static void maxElSearch() {
        int N = 8;
        int M = 5;
        Random rand = new Random();
        int[][] arrayB = new int[N][N];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                arrayB[i][j]= rand.nextInt(199)- 99;
                System.out.print(arrayB[i][j] + " ");
            }
            System.out.println();
        }

        int maxEl = -100;
        int maxI = 0;
        int maxJ = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arrayB[i][j] > maxEl){
                    maxEl = arrayB[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println("\nMax element = " + maxEl+ "  indexes (" + maxI + ", "+maxJ+");");
        System.out.println();
    }
}
