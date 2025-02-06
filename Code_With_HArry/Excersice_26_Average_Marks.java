import java.util.Scanner;

public class Excersice_26_Average_Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Give Size Of Array : ");
        int n=sc.nextInt();
        int []marks=new int[n];
        for (int i = 0; i < marks.length; i++) {
            marks[i]=sc.nextInt();
        }
        float avg=0.0f;
        for (int i : marks) {
            avg=i/n;
        }
        System.out.println("AVERAGE Marks For All Student In Physics : "+avg);
    }
}
