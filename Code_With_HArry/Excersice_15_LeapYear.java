import java.util.Scanner;

// This check the given number is leap year or not

public class Excersice_15_LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give any year for check : ");
        short year=sc.nextShort();
        if(year%4==0)
        System.out.println(year+" Is Leap Year");
        else
        System.out.println(year+" Not a Leap Year");
    }
}
