package OneDimensionalArrays;

import java.util.Random;

/**
 * Created by Daria Serebryakova on 31.10.2016.
 */
public class ChangeOddIndOnZero {
    public static void changeOddOnZero() {
        Random rand = new Random();
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            array[i]= 1 + rand.nextInt(99);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int el: array) {
            if(el%2 != 0){
                el = 0;
            }
            System.out.print(el + " ");
        }
        System.out.println("\n");
    }
}
