import java.util.Scanner;

// Sum of Even Number Using While Loop

public class Exercise_19_Sum_Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Give Any Interger Value : ");
        int n=sc.nextInt();
        int i=1,sum=0;
        while(i<=n){
            if(i%2==0)
            sum += i;
            i++;
        }
        System.out.print("Sum Of Even Number Is : "+ sum);
    }
}
