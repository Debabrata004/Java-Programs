import java.util.Scanner;

// Using While Loop

public class Exercise_23_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Give Any Number : ");
        int n=sc.nextInt();
        int i=1,result=1;
        while(i<=n){
            result *= i;
            i++;
        }
        System.out.println("Result Is : "+result);
    }
}
