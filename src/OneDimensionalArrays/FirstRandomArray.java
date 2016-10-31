package OneDimensionalArrays;

import java.util.Random;

/**
 * Created by dbobkova on 31.10.2016.
 */
public class FirstRandomArray {
    public static void randElArrayCreator() {
        Random rand = new Random();

        int[] array = new int[20];
        for (int i = 0; i < 20; i++){
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int evenCounter = 0;
        int oddCounter = 0;
        for (int el: array) {
            if (el%2 == 0){
                evenCounter++;

            }
            else {
                oddCounter++;
            }
        }
        System.out.println("even values: " + evenCounter + "\nodd values: " + oddCounter + "\n");

    }
}
