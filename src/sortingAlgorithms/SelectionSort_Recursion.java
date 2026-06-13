package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort_Recursion {
    static void selectionSort(int[] arr, int no_unsortedElements,int index,int max){
        //base case
        if(no_unsortedElements == 1){
            return;
        }
        if(index < no_unsortedElements){
            if(arr[index] > arr[max]){
                selectionSort(arr,no_unsortedElements,index+1,index);
            }
            else{
                selectionSort(arr,no_unsortedElements,index+1,max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[no_unsortedElements-1];
            arr[no_unsortedElements-1] = temp;
            selectionSort(arr,no_unsortedElements-1,0,0);
        }
    }
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        selectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
