package dataOperations;

public class Swapping {

    public static void swapIntWTemp(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void swapIntW2Vars(int[] twoNums){
        int a = twoNums[0];
        int b = twoNums[1];

        a = b+a;
        b = a-b;
        a = a-b;

        twoNums[0] = a;
        twoNums[1] = b;
    }
}
