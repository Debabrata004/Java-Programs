import java.util.Scanner;

public class Exercise_22_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Give ANy Number : ");
        int n=sc.nextInt();
        long result=1;
        for(int i=1;i<=n;i++)
         result *= i;
         System.out.println(result);
    }
}
