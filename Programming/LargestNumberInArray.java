package Programming;

public class LargestNumberInArray {
   static int findLargest(int arr[]){
        int max=Integer.MIN_VALUE;
        int maxSecond=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
       for (int i = 0; i < arr.length; i++) {
           if(arr[i]>maxSecond && arr[i]<max)
               maxSecond=arr[i];

       }
        return maxSecond;
    }
    public static void main(String[] args) {
        int arr[]={7,9,6,4,5,6,10};
        System.out.println(findLargest(arr));
    }
}
