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

        double aveA1 = 0;
        double aveA2 = 0;
        for (int i = 0; i < N; i++){
            aveA1 = aveA1 + array1[i];
            aveA2 = aveA2 + array2[i];
        }
        aveA1 = aveA1/N;
        aveA2 = aveA2/N;
        System.out.println("ave array 1 = " + aveA1 + "\nave array 2 = " + aveA2);
            if (aveA1 == aveA2){
                System.out.println("ave array 1 = ave array 2");
            }
            else if(aveA1 > aveA2){
                System.out.println("ave array 1 > ave array 2");
            }
            else {
                System.out.println("ave array 1 < ave array 2");
            }
        System.out.println();

    }
}
