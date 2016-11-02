package arrays.multidimensional;

import java.util.Random;

/**
 * Created by Daria Serebryakova on 01.11.2016.
 */
public class Array2DimSorting {
    public static void sort2dArray() {
        int N = 10;
        int M = 7;
        Random rand = new Random();
        int[][] arrayD = new int[N][N];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                arrayD[i][j]= rand.nextInt(101);
                System.out.print(arrayD[i][j] + " ");
            }
            System.out.println();
        }
        int temp;
        for (int i = 0; i < N; i++){

            for (int j = 0; j < M; j++){
                for (int k = j+1; k < M; k++){
                    if(arrayD[i][k] < arrayD[i][j]){
                        temp = arrayD[i][j];
                        arrayD[i][j] = arrayD[i][k];
                        arrayD[i][k]=temp;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Sorted 2D array: ");
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){

                System.out.print(arrayD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
