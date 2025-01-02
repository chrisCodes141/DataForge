package sorts;

import java.util.Arrays;

public enum SortAlgorithm {
    BUBBLE_SORT {
        @Override
        public void sort(int[] array) {
            bubbleSort(array);
        }
    },
    QUICK_SORT {
        @Override
        public void sort(int[] array) {
            quickSort(array, 0, array.length - 1);
        }
    },
    MERGE_SORT {
        @Override
        public void sort(int[] array) {
            mergeSort(array);
        }
    };

    public abstract void sort(int[] array);

    // Static methods for the sorting algorithms
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    private static void mergeSort(int[] inputArr){
        int inputLength = inputArr.length;

        //dealing w/ 1 element array or 0, base case
        if (inputLength < 2) return;

        //cut array @ midpoint
        int midPoint = inputLength/2;

        int[] leftArr = new int[midPoint];
        int[] rightArr = new int[inputLength - midPoint];


        //fill left half
        for(int i = 0; i < midPoint; i++){
            leftArr[i] = inputArr[i];
        }
        //fill right half
        for(int i = midPoint; i < inputLength; i++){
            rightArr[i - midPoint] = inputArr[i];
        }


        //creates all the sub arrays till 1 element exists in each
        mergeSort(leftArr);
        mergeSort(rightArr);

        //merge
        merge(inputArr, leftArr, rightArr);
    }


    private static void merge(int[] inputArr, int[] leftHalf, int[] rightHalf){
        System.out.println("======MERGE START=========\nArray: "+ Arrays.toString(inputArr));
        int leftSize = leftHalf.length, rightSize = rightHalf.length;
        System.out.println("left & right size  = " + leftSize + " & " + rightSize);

        int ptrLeft = 0, ptrRight = 0, ptrMerged = 0;

        while(ptrLeft < leftSize && ptrRight < rightSize){
            //if left half # is < right half #, make it next # in merged and increase leftPtr
            if(leftHalf[ptrLeft] < rightHalf[ptrRight]){
                System.out.println("if ( leftHalf[ptrLeft] < rightHalf[ptrRight] = " + leftHalf[ptrLeft] +  " & " + rightHalf[ptrRight]);
                inputArr[ptrMerged] = leftHalf[ptrLeft];
                ptrLeft++;
            }
            //otherwise right half # is < left half #, make it next # in merged and increase rightPtr
            else {
                System.out.println("else {  rightHalf[ptrRight] < leftHalf[ptrLeft] = " + rightHalf[ptrRight] +  " & " + leftHalf[ptrLeft]);
                inputArr[ptrMerged] = rightHalf[ptrRight];
                ptrRight++;
            }
            //moving onto next spot in merged
            ptrMerged++;
        }
        //if left array has left over, fill rest
        while(ptrLeft < leftSize){
            System.out.println("while(ptrLeft < leftSize){");
            inputArr[ptrMerged] = leftHalf[ptrLeft];
            ptrLeft++;
            ptrMerged++;
        }
        //if right array has left over, fill rest
        while(ptrRight < rightSize){
            System.out.println("while(ptrRight < rightSize){");
            inputArr[ptrMerged] = rightHalf[ptrRight];
            ptrRight++;
            ptrMerged++;
        }
        System.out.println("========MERGE END========\n");
    }

}

