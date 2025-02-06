import java.util.Scanner;

public class Exercise_38_Celcius_Farenhite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float celcius=sc.nextFloat();
        celcius=celcius*(9.0f/5.0f)+32.0f;
        System.out.println(celcius);
    }
}
