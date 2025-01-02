package sorts;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] inputArr){
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
