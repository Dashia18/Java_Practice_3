package arrays.multidimensional;


/**
 * Created by Daria Serebryakova on 01.11.2016.
 */
public class Main2DArray {
    public static void main(String[] args) {

    //Task 5a.
        //Two-dimensional array 8*8, sum & mult diagonals
        System.out.println("Two-dimensional array 8*8, sum & mult diagonals/Task 5a\n");
        DiagonalSumMult2DArray.diagonalSumMultPerform();

    //Task 5b
        //Two-dimensional array 8*5,max element search
        System.out.println("Two-dimensional array 8*5, max element search/Task 5b\n");
        Max2DArrayElement.maxElSearch();

     //Task 5c
        //Two-dimensional array 8*5, search max mult row of array
           System.out.println("Two-dimensional array 8*5, search max mult row of array /Task 5c\n");
           MaxRowMult2DArray.getMaxRowMult();

     //Task 5d
        //Two-dimensional array 10*7
           System.out.println("Two-dimensional array 10*7 /Task 5d\n");
           Array2DimSorting.sort2dArray();




    }
}
