/**
 * Created by dbobkova on 26.10.2016.
 */
public class Factorial {
    public static void factorialPerform() {

        int N = 34;

        //Calculation factorial with cycle
        System.out.println("factorialC");
        //time measurement
        long startTimeC = System.nanoTime();
            long factorialC = Factorial.factorialC(N);
        long estimatedTimeC = System.nanoTime() - startTimeC;

        System.out.println(factorialC);
        System.out.println("estimatedTimeC");
        System.out.println(estimatedTimeC);

        //Calculation factorial with recursion
        System.out.println("factorialR");
        //time measurement
        long startTimeR = System.nanoTime();
            long factorialR = Factorial.factorialR(N);
        long estimatedTimeR = System.nanoTime() - startTimeR;

        System.out.println(factorialR);
        System.out.println("estimatedTimeR");
        System.out.println(estimatedTimeR);

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
