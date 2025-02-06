package Sir.Akshay;

import java.util.Arrays;
import java.util.Scanner;

public class RightShiftingInArray {
    static void shifting(String []arr, String choose){
       int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(choose)){
                index = i;
                break;
            }
        }

        System.out.println(index);

        for (int i = index; i >= 1; i--) {
            String temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String []arr={"windows0","windows1","windows2","windows3"};
        System.out.print("Which Windows You Want To Choose : ");
        String choose=sc.nextLine();
        shifting(arr,choose);
        System.out.println(Arrays.toString(arr));
    }
}
