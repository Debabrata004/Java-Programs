package Programming;

import java.util.Scanner;
import java.util.Stack;

public class PrimeNumberRange { /*
    void check(int n){
        int j=1,i=2,incre=0;
        for(i=2;;i++){
            int count=0;
            for(j=2;j<i;j++){
                if(i%j==0) {
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
                incre++;
            }
            if(incre==n)
                break;
        }*/

    boolean check(int n){
        int ch=0;
        for(int i=2;i<n;i++){
            if(n%i==0) {
                ch++;
                break;
            }
        }
        return (ch==0);
    }

    public static void main(String[] args) {
        PrimeNumberRange pr=new PrimeNumberRange();
        Scanner sc=new Scanner(System.in);
        System.out.printf("How Many Prime Number U need Give that number : ");
        int n=sc.nextInt();
        int k=0;
        for (int i = 2; k!=n; i++) {
           if(pr.check(i)){
               k++;
               System.out.printf(i+" ");
           }
        }
    }
}
