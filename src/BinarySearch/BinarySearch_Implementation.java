package BinarySearch;

import java.util.*;

public class BinarySearch_Implementation {
    static int binarySearch(int[] arr , int target){
        if(arr.length <= 0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1 ;
         while(start <= end){
             int mid = start + (end - start)/2 ;

             if(arr[mid] == target){
                 return mid;
             }

             else if(arr[mid] > target){
                 end = mid-1;
             }

             else{
                 start = mid+1;
             }
         }
         return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] arr = new int[20];
//        System.out.println("Enter sorted array (within a length of 20 )  : ");
//
//        for(int i=0 ; i<arr.length ; i++){
//            arr[i] = input.nextInt();
//        }
//
//        //print array
//        for(int i : arr){
//            System.out.print(i + " ");
//        }

       int[] arr = {1,2,3,4,5,6,7,8,9,10,11,23,34,56,78,90};
       int target = 6;

        System.out.println(binarySearch(arr,target));

    }
}
