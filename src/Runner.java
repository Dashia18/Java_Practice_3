import java.lang.reflect.Array;

/**
 * Created by dbobkova on 26.10.2016.
 */



public class Runner {
    public static void main(String[] args) {

     //Sorting (3 types) array and time measurement
        System.out.println("Sorting (3 types) array and time measurement  \n" );
        Sorting.sortingPerform();

     //Factorial (2 way) and time measurement
        System.out.println("\n\nFactorial (2 ways) and time measurement  \n" );
        Factorial.factorialPerform();

      //Figure plot #
        System.out.println("\n\nFigure ploter: \n");
        FigurePlotter.figurePlotterPerform();


    }








}
