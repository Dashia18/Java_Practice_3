package arrays.multidimensional;

import java.util.Random;

/**
 * Created by Daria Serebryakova on 01.11.2016.
 */
public class DiagonalSumMult2DArray {
    public static void diagonalSumMultPerform() {
        int N = 8;
        Random rand = new Random();
        int[][] arrayA = new int[N][N];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                arrayA[i][j]= rand.nextInt(98)+1;
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println();
        }
        //Summ and mult of Main diagonals
        int summMainDiag = 0;
        long multMainDiag = 1;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if(i == j)
                {
                    summMainDiag = summMainDiag + arrayA[i][j];
                    multMainDiag = multMainDiag * arrayA[i][j];
                }
            }
        }
        System.out.println("SummMainDiag = "+summMainDiag + " MultMainDiag = " + multMainDiag);


        //Summ and mult of second diagonals
        int summSecDiag = 0;
        long multSecDiag = 1;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if(j == N - i -1)
                {
                    summSecDiag = summSecDiag + arrayA[i][j];
                    multSecDiag = multSecDiag * arrayA[i][j];
                }
            }
        }
        System.out.println("SummSecDiag = "+summSecDiag + " MultSecDiag = " + multSecDiag);
        System.out.println();
    }
}
