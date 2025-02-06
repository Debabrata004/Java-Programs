import java.util.Scanner;

public class Exercise_20_Multiplication_Table {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Give The Number : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.printf("%d * %d = %d\n",n,i,(n*i));
        }
    }
}