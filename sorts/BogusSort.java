package sorts;

import java.util.ArrayList;
import java.util.Collections;

import static validator.SortCheck.isSorted;


public class BogusSort {

    //worst sorting algorithm possible, n^2
    public static void bogusSort(ArrayList<Number> numsList){
        int i = 0;
        while(!isSorted(numsList)){
            Collections.shuffle(numsList);
            System.out.println(numsList);
            i++;
        }
        System.out.println("BOGUS While loop happened : " + i + " times");
    }
}


