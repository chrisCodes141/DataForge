package validator;

import java.util.ArrayList;

public class SortCheck {

    public static boolean isSorted(ArrayList<Number> numbersList) {
        int listLength = numbersList.size();

        if(numbersList == null || listLength <= 1) return true;

        for(int i = 0; i < listLength - 1; i++){
            if(numbersList.get(i).doubleValue() > numbersList.get(i+1).doubleValue()) return false;
        }
        return true;
    }

    public static boolean isSorted(int[] arr){
        if(arr == null || arr.length <= 1) return true;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
}
