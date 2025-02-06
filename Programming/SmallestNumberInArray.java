package Programming;

public class SmallestNumberInArray {
        static int findSmallest(int arr[]){
            int min=Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]<min)
                    min=arr[i];
            }
            return min;
        }
        public static void main(String[] args) {
            int arr[]={7,9,6,4,5,6};
            System.out.println("Samllest Element In the array is : "+findSmallest(arr));
        }
    }