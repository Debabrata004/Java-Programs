package Sir.Akshay;

public class SumOfSecondary_PrimaryDiagonal {
    static int sumOfPrimaryDiagonal(int [][]arr){
        int sumOfPri=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j)
                    sumOfPri+=arr[i][j];
            }
        }
        return sumOfPri;
    }
    static int sumOfSecondaryDoagonal(int [][]arr){
        int sumOfSec=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i+j==arr.length-1)
                    sumOfSec+=arr[i][j];
            }
        }
        return sumOfSec;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,7},{8,9,6}};
        System.out.println("Sum Of Primary Diagonal "+sumOfPrimaryDiagonal(arr));
        System.out.println("Sum Of Secondary Diagonal "+sumOfSecondaryDoagonal(arr));
    }
}
