import java.lang.reflect.Array;

/**
 * Created by dbobkova on 26.10.2016.
 */
public class Runner {



    public static void main(String[] args) {

        int[] arr = new int[]{3,4,2,6,1,7,9,0,5};
        System.out.println("Initial array:");
        Sorting.showArr(arr);

        //BubbleSort
        int[] sortedArrray = new int[arr.length];
        System.arraycopy(arr,0,sortedArrray,0,arr.length);

        long startTimeBubble = System.nanoTime();
        sortedArrray = Sorting.bubbleSort(sortedArrray);
        long estimatedTimeBubble = System.nanoTime() - startTimeBubble;

        System.out.println("Sorted array:");
        Sorting.showArr(sortedArrray);
        System.out.println("estimatedTimeBubble:" + estimatedTimeBubble);




    }








}
