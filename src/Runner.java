import java.lang.reflect.Array;

/**
 * Created by dbobkova on 26.10.2016.
 */

import java.util.*;

public class Runner {



    public static void main(String[] args) {

        int[] arr = new int[]{3,9,2,6,1,7,8,4,5};
        System.out.println("Initial array:");
        Sorting.showArr(arr);
        System.out.println();




        //BubbleSort
        int[] bubbleSortedArrray = new int[arr.length];
        System.arraycopy(arr,0,bubbleSortedArrray,0,arr.length);

        long startTimeBubble = System.nanoTime();
        bubbleSortedArrray = Sorting.bubbleSort(bubbleSortedArrray);
        long estimatedTimeBubble = System.nanoTime() - startTimeBubble;

        System.out.println("Sorted array:");
        Sorting.showArr(bubbleSortedArrray);
        System.out.println("startTimeBubble:" + startTimeBubble);
        System.out.println("estimatedTimeBubble:" + estimatedTimeBubble);
        System.out.println();

        //InsertionSort
        int[] insertionSortedArrray = new int[arr.length];
        System.arraycopy(arr,0,insertionSortedArrray,0,arr.length);

        long startTimeInsertion = System.nanoTime();
        insertionSortedArrray = Sorting.insertionSort(insertionSortedArrray);
        long estimatedTimeInsertion = System.nanoTime() - startTimeInsertion;

        System.out.println("Sorted array:");
        Sorting.showArr(insertionSortedArrray);
        System.out.println("startTimeInsertion:" + startTimeInsertion);
        System.out.println("estimatedTimeInsertion:" + estimatedTimeInsertion);
        System.out.println();


        //Arrays.sort()
        int[] sortedArrray = new int[arr.length];
        System.arraycopy(arr,0,sortedArrray,0,arr.length);

        long startTimeSort = System.nanoTime();
        Arrays.sort(sortedArrray);
        long estimatedTimeSort = System.nanoTime() - startTimeSort;

        System.out.println("Sorted array:");
        Sorting.showArr(sortedArrray);
        System.out.println("startTimeSort:" + startTimeSort);
        System.out.println("estimatedTimeSort:" + estimatedTimeSort);
        System.out.println();
//




    }








}
