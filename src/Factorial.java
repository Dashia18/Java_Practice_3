/**
 * Created by dbobkova on 26.10.2016.
 */
public class Factorial {
    public static void factorialPerform() {

        int N = 34;

        //Calculation factorial with cycle
        System.out.print("Calculation factorial with cycle \n" + N + "! = ");
        //time measurement
        long startTimeC = System.nanoTime();
            long factorialC = Factorial.factorialC(N);
        long estimatedTimeC = System.nanoTime() - startTimeC;

        System.out.println(factorialC);
        System.out.print("estimatedTimeC: ");
        System.out.println(estimatedTimeC);
        System.out.println();

        //Calculation factorial with recursion
        System.out.print("Calculation factorial with recursion  \n" + N + "! = ");
        //time measurement
        long startTimeR = System.nanoTime();
            long factorialR = Factorial.factorialR(N);
        long estimatedTimeR = System.nanoTime() - startTimeR;

        System.out.println(factorialR);
        System.out.print("estimatedTimeR: ");
        System.out.println(estimatedTimeR);
        System.out.println();
    }

    public static long factorialC(int n) {
        long result = 1;
        if(n == 0 || n == 1)
        {
            result = 1;
        }
        else {
            for (int i = 2; i<= n; i++){
                result = result * i;
            }
        }
        return  result;
    }
    public static long factorialR(int n){
        if(n == 1){
            return 1;
        }
        return n * factorialR(n-1);
    }


}
