package arrays.multidimensional;

import java.util.Random;

/**
 * Created by Daria Serebryakova on 01.11.2016.
 */
public class MaxRowMult2DArray {
    public static void getMaxRowMult() {
        int N = 8;
        int M = 5;
        Random rand = new Random();
        int[][] arrayC = new int[N][N];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                arrayC[i][j]= rand.nextInt(21)- 10;
                System.out.print(arrayC[i][j] + " ");
            }
            System.out.println();
        }

        int[] rowMult = new int[N];
        for (int i = 0; i < N; i++){
            int temp = 1;
            for (int j = 0; j < M; j++){
                temp = temp*arrayC[i][j];
            }
            rowMult[i] =temp;
        }

        System.out.println();
        System.out.print("Row mult: ");
        int maxRowMult = -1;
        int maxId = 0;
        for (int i = 0; i<N; i++ ) {
            if(Math.abs(rowMult[i]) > maxRowMult){
                maxRowMult = Math.abs(rowMult[i]);
                maxId = i;
            }
            System.out.print(rowMult[i] + " ");
        }
        System.out.println("\nMax abs = "+maxRowMult+"  index = " + maxId);
        System.out.println();

    }
}
