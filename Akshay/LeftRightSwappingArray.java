package Sir.Akshay;

import java.util.Arrays;

public class LeftRightSwappingArray {
    static void leftSwappingTwo(int[] arr){
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
    static void leftSwapping(int []arr){
        for(int i=1;i<arr.length;i++){
           arr[i-1]=arr[i]-arr[i-1]+(arr[i]=arr[i-1]);
        }
    }

    static void rightSwapping(int []arr){
        for (int i = arr.length-1; i >= 1; i--) {
            arr[i]=arr[i-1]-arr[i]+(arr[i-1]=arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[]={1,2,34,5,6,7,9,23};
//        System.out.println("WithOut Swapping The Variables : "+Arrays.toString(arr));
//        for (int i = 0; i < 4; i++) { // How many types we want to ratate that pass in the loop
//            leftSwapping(arr);
//        }
//        System.out.println("After Rotating the Array "+Arrays.toString(arr));
        rightSwapping(arr);
    }
}
