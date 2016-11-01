package OneDimensionalArrays;

import java.util.Random;

/**
 * Created by Daria Serebryakova on 31.10.2016.
 */
public class AverageOfElArrays {
    public static void averageSearch() {

        Random rand = new Random();
        int N = 10;
        int[] array1 = new int[N];
        for (int i = 0; i < N; i++){
            array1[i] = rand.nextInt(N);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        int[] array2 = new int[N];
        for (int i = 0; i < N; i++){
            array2[i] = rand.nextInt(N);
            System.out.print(array2[i] + " ");
        }
        System.out.println();

    }
}
