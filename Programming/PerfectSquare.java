package Programming;

import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Give The Number For Check : ");
        int n=sc.nextInt();
        int result=1,total=0,i;
        for (i = 1; i <= n; i++) {
              if(result*i==n) {
                  total = 1;
                  break;
              }
              result++;
        }
        if(total==1)
            System.out.println("Perfect Number : "+i+" * "+result+" = "+n);
        else
            System.out.println("Not a Perfect Number");
    }
}
