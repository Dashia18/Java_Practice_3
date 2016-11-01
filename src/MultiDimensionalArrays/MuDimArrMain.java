package MultiDimensionalArrays;

import java.util.Random;

/**
 * Created by Daria Serebryakova on 01.11.2016.
 */
public class MuDimArrMain {
    public static void main(String[] args) {

        //Two-dimensional array 8*8
        Random rand = new Random();
        int[][] arrayA = new int[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                arrayA[i][j]= rand.nextInt(98)+1;
            }
        }
    }
}
