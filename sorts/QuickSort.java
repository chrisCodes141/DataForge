package sorts;

import java.util.Random;

public class QuickSort {
//    initially,select pivot at random and swap to last spot
//    Partitioning part: swap each val on from left (thats more than pivot) w/ val from right (that less than) (to sort)
//    finally, swap pivot (last spot) with where pointers meet to have:   #s  < pivot > #s
//    recusrively call this sorting of sub arrays till array is length 1;

    public static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int lowIndex, int highIndex) {
        //base case, when working with just 1 element, return
        if (lowIndex >= highIndex) return;

        //choose pivot at random from range
        int randPivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        //pivot value is last spot
        int pivot = array[randPivotIndex];
        //swap pivot w/ last spot
        dataOperations.Swapping.swapIntWTemp(array, randPivotIndex, highIndex);

        int leftPtr = lowIndex, rightPtr = highIndex;

        //Partitioning
        while (leftPtr < rightPtr) {
            //locate number from left thats greater than pivot
            while (array[leftPtr] <= pivot && leftPtr < rightPtr){
                leftPtr++;
            }
            //locate number from right less than pivot
            while(array[rightPtr] >= pivot && leftPtr < rightPtr) {
                rightPtr--;
            }
            //numbers found need to be swapped
            dataOperations.Swapping.swapIntWTemp(array, leftPtr, rightPtr);
        }
        //swap where ptrs met w/ pivot (last spot)
        dataOperations.Swapping.swapIntWTemp(array, leftPtr, highIndex);

        //call recursively for left AND right subarrays
        quicksort(array, lowIndex, leftPtr - 1);
        quicksort(array, leftPtr + 1, highIndex);
    }
}
