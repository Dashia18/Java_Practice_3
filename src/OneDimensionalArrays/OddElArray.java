package OneDimensionalArrays;

/**
 * Created by Daria Serebryakova on 31.10.2016.
 */
public class OddElArray {
    public static void oddArrayCreator() {
        int N = 100/2; //numbers of odd values
        int[] array = new int[N];
        array[0] = 1;
        for (int i = 1; i < N; i++){
            array[i] = array[i-1] + 2;
        }
        for (int el:array ) {
            System.out.print(el + " ");
        }
        System.out.println();
        for (int i = N-1; i>= 0; i-- ){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }


}
