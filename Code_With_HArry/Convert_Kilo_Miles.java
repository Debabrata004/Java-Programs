import java.util.Scanner;

// this program convert in kilometers into meters

public class Convert_Kilo_Miles {
    public static void main(String[] args) {
        float Miles=0.62137119f,kilo_Meter=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Give KiloMeter For Convert Miles : ");
        kilo_Meter=sc.nextFloat();
        kilo_Meter*=Miles;
        System.out.println("Miles Is : "+kilo_Meter);
    }
}
