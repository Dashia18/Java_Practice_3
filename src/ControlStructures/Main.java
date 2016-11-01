package ControlStructures;

import java.util.Random;

/**
 * Created by dbobkova on 01.11.2016.
 */
public class Main {


    public static void main(String[] args) {

        //Enum time measurement
        System.out.println("Enum time measurement/ Task 6");
        Animals dog = Animals.Dog;
        getAnimalSoundIF(dog);
        getAnimalSoundCASE(dog);

        Random rand = new Random();
        int[] array = new int[50];
        for (int i = 0; i  < 50; i++)
        {
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + " ");
        }



    }

    public enum Animals{
        Cat, Dog, Horse, Mouse, Bird
    }
    public static void getAnimalSoundIF(Animals a){
        long startTimeIF = System.nanoTime();
        if(a == Animals.Cat){
            System.out.println("Cat say mayu");
        }
        else if(a == Animals.Dog){
            System.out.println("Dog say gaf");
        }
        else if(a == Animals.Horse){
            System.out.println("Horse say igogogo");
        }
        else if(a == Animals.Mouse){
            System.out.println("Mouse say pipi-pipi");
        }
        else if(a == Animals.Bird){
            System.out.println("Bird say kuku-kuku");
        }
        else {
            System.out.println("This animal is mute");
        }
        long estimatedTimeIF = System.nanoTime() - startTimeIF;
        System.out.println("estimatedTimeIF:" + estimatedTimeIF);
        System.out.println();
    }
    public static void getAnimalSoundCASE(Animals a){
        long startTimeCASE = System.nanoTime();
        switch (a){
            case Cat:{System.out.println("Cat say mayu"); break;}
            case Dog:{System.out.println("Dog say gaf"); break;}
            case Horse:{System.out.println("Horse say igogogo"); break;}
            case Mouse:{System.out.println("Mouse say pipi-pipi"); break;}
            case Bird:{System.out.println("Bird say kuku-kuku"); break;}
            default:{System.out.println("This animal is mute"); break;}
        }
        long estimatedTimeCASE = System.nanoTime() - startTimeCASE;
        System.out.println("estimatedCASE:" + estimatedTimeCASE);
        System.out.println();
    }




}
