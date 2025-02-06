import java.util.Scanner;

public class Exercise_24_Sum_Float {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give Size of Array : ");
        int n = sc.nextInt();
        float[] cal = new float[n];
        for (int i = 0; i < cal.length; i++) {
            cal[i] = sc.nextFloat();
        }
        float sum = 0;
        for (int i = 0; i < cal.length; i++) {
            sum = sum + cal[i];
        }
        System.out.print("Sum Of Floating Number Is : "+sum);
    }
}
