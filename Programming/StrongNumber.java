package Programming;

import java.util.Scanner;


public class StrongNumber {

static long strongNumber(int input){
   int res=1;
    for (int i = 1; i <= input; i++) {
        res*=i;
    }
    return res;
}


public static void main(String[] args) {
        int number=50000;
    for (int i = 1; i <= number; i++) {
        int k=i,res=0;
        while (k!=0){
            int rem=k%10;
            res+=strongNumber(rem);
            k/=10;
        }
        if (res==i)
            System.out.print(i+" ");

    }
    }

}
