package arrays.onedimensional;

import java.util.Random;
import java.util.*;


/**
 * Created by Daria Serebryakova on 31.10.2016.
 */
public class MaxMinElArray {
    public static void maxMinSearch() {
        Random random = new Random();
        int N = 15;
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100) -50;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int[] arrayCopy = new int[array.length];
        System.arraycopy(array,0,arrayCopy,0,array.length);
        Arrays.sort(arrayCopy);
        for (int i = 0; i < arrayCopy.length; i++){
            System.out.print(arrayCopy[i] + " ");
        }
        int max = arrayCopy[N-1];
        int min = arrayCopy[0];
        System.out.print("\nMax element: " + max + "\nMin element: " + min);

        int maxInd = 0;
        boolean flagMax = false;
        int minInd = 0;
        boolean flagMin = false;
        for (int i = array.length - 1; i >=0; i--){

            if(flagMax == false && array[i]==max){
                maxInd = i;
                flagMax = true;
            }
            if(flagMin == false && array[i]==min){
                minInd = i;
                flagMin= true;
            }
            if (flagMax == true && flagMin == true){
                break;
            }
        }
        System.out.println("\nMax element index: " + maxInd + "\nMin element index: " + minInd);
        System.out.println();

    }
}
