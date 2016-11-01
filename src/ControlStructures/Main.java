package ControlStructures;

import java.util.Random;

/**
 * Created by Daria Serebryakova on 01.11.2016.
 */
public class Main {


    public static void main(String[] args) {

        //Enum time measurement
        System.out.println("Enum time measurement/ Task 6");
        Animals dog = Animals.Dog;
        getAnimalSoundIF(dog);
        getAnimalSoundSWITCH(dog);

        Random rand = new Random();
        int N = 50;
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = rand.nextInt(11);
            System.out.print(array[i] + " ");
        }
        System.out.println();


        //Array time measurement
        System.out.println("IF  - ARRAY");
        int[] countIf = new int[11];
        //time measurement
        long startTimeNumberIF = System.nanoTime();
        for (int i = 0; i < N; i++) {
            getNumberIF(array[i], countIf);
        }
        long estimatedTimeNumberIF = System.nanoTime() - startTimeNumberIF;

        System.out.println("SWITCH - ARRAY");
        int[] countSwitch = new int[11];
        //time measurement
        long startTimeNumberSWITCH = System.nanoTime();
        for (int i = 0; i < N; i++) {
            getNumberSWITCH(array[i], countSwitch);
        }
        long estimatedTimeNumberSWITCH = System.nanoTime() - startTimeNumberSWITCH;


        System.out.println("Count for each values [0,10] SWITCH");
        for (int i = 0; i < 11; i++) {
            System.out.print(countSwitch[i] + " ");
        }
        System.out.println();
        System.out.println("Count for each values [0,10] IF");
        for (int i = 0; i < 11; i++) {
            System.out.print(countIf[i] + " ");
        }


        //Comparison
        System.out.println();
        System.out.println("estimatedTimeIF (1 operation):" + estimatedTimeNumberIF / N);
        System.out.println("estimatedTimeSWITCH (1 operation):" + estimatedTimeNumberSWITCH / N);
        System.out.println();


    }

    public enum Animals {
        Cat, Dog, Horse, Mouse, Bird
    }

    public static void getAnimalSoundIF(Animals a) {
        long startTimeIF = System.nanoTime();
        if (a == Animals.Cat) {
            System.out.println("Cat say mayu");
        } else if (a == Animals.Dog) {
            System.out.println("Dog say gaf");
        } else if (a == Animals.Horse) {
            System.out.println("Horse say igogogo");
        } else if (a == Animals.Mouse) {
            System.out.println("Mouse say pipi-pipi");
        } else if (a == Animals.Bird) {
            System.out.println("Bird say kuku-kuku");
        } else {
            System.out.println("This animal is mute");
        }
        long estimatedTimeIF = System.nanoTime() - startTimeIF;
        System.out.println("estimatedTimeIF:" + estimatedTimeIF);
        System.out.println();
    }

    public static void getAnimalSoundSWITCH(Animals a) {
        long startTimeSWITCH = System.nanoTime();
        switch (a) {
            case Cat: {
                System.out.println("Cat say mayu");
                break;
            }
            case Dog: {
                System.out.println("Dog say gaf");
                break;
            }
            case Horse: {
                System.out.println("Horse say igogogo");
                break;
            }
            case Mouse: {
                System.out.println("Mouse say pipi-pipi");
                break;
            }
            case Bird: {
                System.out.println("Bird say kuku-kuku");
                break;
            }
            default: {
                System.out.println("This animal is mute");
                break;
            }
        }
        long estimatedTimeSWITCH = System.nanoTime() - startTimeSWITCH;
        System.out.println("estimatedSWITCH:" + estimatedTimeSWITCH);
        System.out.println();
    }


    public static void getNumberIF(int n, int[] countIf) {

        if (n == 0) {
            System.out.println("this is 0");
            countIf[0]++;
        } else if (n == 1) {
            System.out.println("this is 1");
            countIf[1]++;
        } else if (n == 2) {
            System.out.println("this is 2");
            countIf[2]++;
        } else if (n == 3) {
            System.out.println("this is 3");
            countIf[3]++;
        } else if (n == 4) {
            System.out.println("this is 4");
            countIf[4]++;
        } else if (n == 5) {
            System.out.println("this is 5");
            countIf[5]++;
        } else if (n == 6) {
            System.out.println("this is 6");
            countIf[6]++;
        } else if (n == 7) {
            System.out.println("this is 7");
            countIf[7]++;
        } else if (n == 8) {
            System.out.println("this is 8");
            countIf[8]++;
        } else if (n == 9) {
            System.out.println("this is 9");
            countIf[9]++;
        } else if (n == 10) {
            System.out.println("this is 10");
            countIf[10]++;
        }


    }

    public static void getNumberSWITCH(int n, int[] countSwitch) {

        switch (n) {
            case 0: {
                System.out.println("this is 0");
                countSwitch[0]++;
                break;
            }
            case 1: {
                System.out.println("this is 1");
                countSwitch[1]++;
                break;
            }
            case 2: {
                System.out.println("this is 2");
                countSwitch[2]++;
                break;
            }
            case 3: {
                System.out.println("this is 3");
                countSwitch[3]++;
                break;
            }
            case 4: {
                System.out.println("this is 4");
                countSwitch[4]++;
                break;
            }
            case 5: {
                System.out.println("this is 5");
                countSwitch[5]++;
                break;
            }
            case 6: {
                System.out.println("this is 6");
                countSwitch[6]++;
                break;
            }
            case 7: {
                System.out.println("this is 7");
                countSwitch[7]++;
                break;
            }
            case 8: {
                System.out.println("this is 8");
                countSwitch[8]++;
                break;
            }
            case 9: {
                System.out.println("this is 9");
                countSwitch[9]++;
                break;
            }
            case 10: {
                System.out.println("this is 10");
                countSwitch[10]++;
                break;
            }
        }

    }
}
