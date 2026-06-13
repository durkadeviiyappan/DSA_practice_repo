package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort_Recursion {
    static void bubbleSort(int[] arr , int no_unsortedElements , int index){
        //base case
        if(no_unsortedElements == 1){
            return;
        }
        if(index < no_unsortedElements) {
            if (arr[index] < arr[index - 1]) {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
            }
            bubbleSort(arr, no_unsortedElements, index + 1);
        }
            else{
                bubbleSort(arr,no_unsortedElements-1,1);
            }

    }
    public static void main(String[] args){
        int[] arr = {10,89,45,6,99};
        bubbleSort(arr,arr.length,1);
        System.out.println(Arrays.toString(arr));
    }
}
