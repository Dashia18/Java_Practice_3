/**
 * Created by Daria Serebryakova on 26.10.2016.
 */
import java.util.*;

public class Sorting {

    public static void sortingPerform() {
        //int[] arr = new int[]{10,3,9,2,6,1,7,8,4,5};

        int[]arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i]=arr.length - i;
        }


        System.out.println("Initial array:");
        Sorting.showArr(arr);
        System.out.println();



        //InsertionSort
        int[] insertionSortedArrray = new int[arr.length];
        System.arraycopy(arr,0,insertionSortedArrray,0,arr.length);

        //time measurement
        long startTimeInsertion = System.nanoTime();
            insertionSortedArrray = Sorting.insertionSort(insertionSortedArrray);
        long estimatedTimeInsertion = System.nanoTime() - startTimeInsertion;


        System.out.println("Sorted Insertion array:");
        Sorting.showArr(insertionSortedArrray);
        System.out.println("estimatedTimeInsertion:" + estimatedTimeInsertion);
        System.out.println();

        //BubbleSort
        int[] bubbleSortedArrray = new int[arr.length];
        System.arraycopy(arr,0,bubbleSortedArrray,0,arr.length);

        //time measurement
        long startTimeBubble = System.nanoTime();
        bubbleSortedArrray = Sorting.bubbleSort(bubbleSortedArrray);
        long estimatedTimeBubble = System.nanoTime() - startTimeBubble;

        System.out.println("Sorted Bubble array:");
        Sorting.showArr(bubbleSortedArrray);
        System.out.println("estimatedTimeBubble:" + estimatedTimeBubble);
        System.out.println();

        //Arrays.sort()
        int[] sortedArrray = new int[arr.length];
        System.arraycopy(arr,0,sortedArrray,0,arr.length);

        //time measurement
        long startTimeSort = System.nanoTime();
            Arrays.sort(sortedArrray);
        long estimatedTimeSort = System.nanoTime() - startTimeSort;


        System.out.println("Sorted Arrays.sort() array:");
        Sorting.showArr(sortedArrray);
        System.out.println("estimatedTimeSort:" + estimatedTimeSort);
        System.out.println();
    }

    public static int[] bubbleSort(int[] array){
        int temp;
        for (int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j]=temp;
                }
            }
        }

        return array;
    }

    public static int[] insertionSort(int[] array){
        int temp;
        for(int i = 1; i < array.length; i++){
            temp = array[i];
            for (int j = i-1;j>=0 ;j--){
                if(temp < array[j]){
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return  array;
    }

    public static void showArr(int[] array){
        for (int el:array) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

}
