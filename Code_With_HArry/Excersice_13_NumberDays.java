import java.util.Scanner;

/*  this program give the day acccording to your ouput 

            Like : 1--->  Monday
                   2---> Tuesday
*/

public class Excersice_13_NumberDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Any Number For a Day : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please Give Valid Number");
                break;
        }
    }
}
