package sortingAlgorithms;

import java.util.Arrays;

import static java.util.Collections.swap;

public class SelectionSort {
    static void selectionSort(int[] arr){
        for(int i=0 ; i< arr.length ; i++){
                int last = arr.length-i-1 ;
                int maxIndex = getMax(arr,0,last);
                swap(arr,maxIndex,last);
        }

    }
    static int getMax(int[] arr, int start , int end){
       int max = start;
       for(int i=start ; i<=end ; i++){
           if(arr[i] > arr[max]){
               max = i ;
           }
       }
       return max;
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args){
        int[] arr = {10,5,44,5,90,234};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
