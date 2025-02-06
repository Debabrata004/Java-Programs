import java.util.Scanner;

// Check how much tax pay the gov acoording there income

public class Execise_12_Payable_Tax {
    public static void main(String[] args) {
        float income,tax=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("What's Your Income : ");
        income=sc.nextFloat();
        if(income<2.5)
            tax=0;
            else if(income>=2.5 &&income<5.0)
            {
                tax+=(income-2.5)*0.05;
            }
            else if(income>=5.0 &&income<10.0)
            {
                tax+=(5.0f-2.5f)*0.05f;
                tax+=0.2*(income-5.0f);
            }
            else
            {
                tax+=(5.0f-2.5f)*0.05f;
                tax+=0.2*(10.0f-5.0f);
                tax+=0.3*(income-10.0f);
            }
            System.out.println("Payable Amount is "+tax);
    }
}
