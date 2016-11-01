package OneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.*;

/**
 * Created by dbobkova on 01.11.2016.
 */
public class ElementFrequency {
    public static void frequencySearch() {
        Random rand = new Random();
        int[] array = new int[21];
        for(int i = 0; i < 20; i++){
            array[i] = rand.nextInt(3) - 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        for(int i = 0; i < 20; i++){
             System.out.print(array[i] + " ");
        }
        int count_1 = 0;
        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < 20; i++){
            if(array[i] == -1){
                count_1++;
            }
            else if(array[i] == 0){
                count0++;
            }
            else{
                count1++;
            }
        }
        System.out.println();
        System.out.println(count_1+" "+count0+" "+count1);
        if (count_1 > count0 && count_1>count1){
            System.out.println("max frequency had value -1");
        }
        else if(count1 > count0 && count1>count_1){
            System.out.println("max frequency had value 1");
        }
        else if(count0 > count1 && count0>count_1){
            System.out.println("max frequency had value 0");
        }
        else if(count1 == count0 ){
            System.out.println("max frequency had values 0 and 1");
        }
        else if(count_1 == count0 ){
            System.out.println("max frequency had values - 1 and 0");
        }
        else if(count1 == count_1 ){
            System.out.println("max frequency had values -1 and 1");
        }
        else {
            System.out.println("same frequency had values -1, 0 and 1");
        }
    }
}
