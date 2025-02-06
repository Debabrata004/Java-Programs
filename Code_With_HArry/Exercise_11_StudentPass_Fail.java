import java.util.Scanner;

public class Exercise_11_StudentPass_Fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give The Bengali Marks : ");
        int Ben=sc.nextInt();
        System.out.println("Give The English Marks : ");
        int Eng=sc.nextInt();
        System.out.println("Give The Mathematics Marks : ");
        int Math=sc.nextInt();
        float total=(Ben+Eng+Math)/3.0f;
        if(total>=40 && Ben>=33 && Eng>=33 && Math>=33)
        System.out.println("Congrats! You Pass ");
        else
        System.out.println("Try next Time");
    }
}
