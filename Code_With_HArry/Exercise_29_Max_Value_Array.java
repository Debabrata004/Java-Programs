import java.util.Scanner;

public class Exercise_29_Max_Value_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Give The Size Of Array : ");
        int n=sc.nextInt();
        int []arr=new int[n];

        for (int i = 0; i < arr.length; i++) 
            arr[i]=sc.nextInt();

            int max=0;
        
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println("Max Value Is "+max);
    }
}
