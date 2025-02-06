package Sir.Akshay;

public class MissingNumber {
    static void findMissingNumber(int []arr){
        int value=1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]+1==value)
                System.out.print(value +" ");
            value++;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,8};
        findMissingNumber(arr);
    }
}
