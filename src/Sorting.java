/**
 * Created by dbobkova on 26.10.2016.
 */
public class Sorting {
    public static int[] bubbleSort(int[] array)
    {
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

    public static void showArr(int[] array){
        for (int el:array) {

            System.out.print(el + " ");
        }
        System.out.println();
    }

}
