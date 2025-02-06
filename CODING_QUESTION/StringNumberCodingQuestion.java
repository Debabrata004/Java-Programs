package CODING_QUESTION;

import java.util.Scanner;

public class StringNumberCodingQuestion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={5,3,3};
        int k=0,sum=0;
        for (int i = 0; i < arr.length; i++) {
             sum=0;
            if(i>=k){
               k--;
               sum+=arr[i];
            }
        }
        System.out.println(sum);

    }
}
