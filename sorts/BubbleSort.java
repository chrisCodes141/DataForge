package sorts;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        if(arr.length < 1) return;
        boolean swapCalled;

        do{
            swapCalled = false;
            for(int i = 0; i < arr.length - 1; i++) {
//                System.out.println("i = " + i + " || arr = " + Arrays.toString(arr));
                if (arr[i] > arr[i+1]) {
//                    System.out.println("SWAPPING: " + arr[i] + " with " + arr[i+1]);
                    dataOperations.Swapping.swapIntWTemp(arr, i, i+1);
                    swapCalled = true;
                }
                else if (arr[i] < arr[i+1]) continue;
            }
        }while(swapCalled);
    }

}
