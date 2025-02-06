import java.util.Scanner;

// This program check Which Kind Of Website This is 

public class Excersice_16_URL_Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Give The URL : ");
        String URL=sc.nextLine();
        if(URL.endsWith(".com"))
            System.out.println("It is \"Commertial Website\"");
        else if(URL.endsWith(".org"))
        System.out.println("It is \"Organigation Website\"");
    else if(URL.endsWith(".in"))
    System.out.println("It is \"Indian Website\"");
}
}
