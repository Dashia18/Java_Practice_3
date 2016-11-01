package OneDimensionalArrays;

/**
 * Created by dbobkova on 31.10.2016.
 */
public class ArraysMain {
    public static void main(String[] args) {

        //Create Odd Array (a)
        System.out.println("Odd Array/Task 4.a");
        OddElArray.oddArrayCreator();

        //Create Random Array of 20 - [1,10] (b)
        System.out.println("Randon values/Task 4.b");
        FirstRandomArray.randElArrayCreator();

        //Create random array of 10 - [1,100], odd indexes of array = 0 (c)
        System.out.println("Create random array of 10 - [1,100], odd indexes of array = 0/Task 4.c");
        ChangeOddIndOnZero.changeOddOnZero();


        //Create random array of 15 - [-50,50], find max and min (d)
        System.out.println("Create random array of 15 - [-50,50], find max and min/Task 4.d");
        MaxMinElArray.maxMinSearch();

        //Create random array of 10 - [0,10], find average of they element (e)
        System.out.println("Create random array of 10 - [0,10], find average of they element/Task 4.e");
        AverageOfElArrays.averageSearch();

        //Create random array of 20 - [-1,1], frequency of element (f)
        System.out.println("Create random array of 20 - [-1,1], frequency of element/Task 4.f");
        ElementFrequency.frequencySearch();
    }
}
