import java.util.Scanner;

// This Program Help The Student to calculate Their CGPA for 3 Subjects only

public class CGPA_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Give Your Exam Marks : ");
        // Actual_Marks=sc.nextInt();
        System.out.print("Give Your Bengali Marks : ");
        int Ben = sc.nextInt();
        System.out.print("Give Your English Marks : ");
        int Eng = sc.nextInt();
        System.out.print("Give Your Bengali Marks : ");
        int Sans = sc.nextInt();
        float result=(Ben+Eng+Sans)*10.0f/300.0f;
        System.out.println(result);
    }
}
