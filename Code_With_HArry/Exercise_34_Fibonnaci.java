import java.util.Scanner;

public class Exercise_34_Fibonnaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Give The Number : ");
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a+=b;
            b=c;
            c=a;
        }
    }
}
