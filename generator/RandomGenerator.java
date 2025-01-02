package generator;

import java.util.Arrays;
import java.util.Random;

public class RandomGenerator {


    public static int[] randArrOfInts() {
        Random r = new Random();
        int[] intArr = new int[r.nextInt(10)];

        //for NEGATIVE #s
        int negOrNot;

        System.out.println("Arrays Length = " + intArr.length);
        for (int i = 0; i < intArr.length; i++) {
            negOrNot = r.nextInt(2);
            if (negOrNot == 0) negOrNot = -1;
            intArr[i] = (negOrNot) * r.nextInt(50);
        }
        System.out.println("Array: " + Arrays.toString(intArr) + " \n----------------randomArrayInts RETURNING-------------------\n\n");

        return intArr;
    }


    public static double[] randomArrayDoubles() {

        int min = 1;
        int max = 7;
        System.out.println(Math.random() * (max - min + 1) + min);

        System.out.println((int) Math.random() * (max - min + 1) + min);
        int r = (int) (Math.random() * (max - min + 1) + min);
        max = 3000;

        System.out.println("r = " + r);

        double[] doubleArr = new double[r];

        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = (int) ((Math.random() * (max - min + 1) + min) * 100) / 100d;

            System.out.println("doubleArr [" + i + "] = " + doubleArr[i]);
        }

        return doubleArr;
    }

}
