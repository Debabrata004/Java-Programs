import java.util.Scanner;

public class Execise_31_Sort_Array {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Give The Size Of Array : ");
        int n=sc.nextInt();
        int []arr=new int[n];

        for (int i = 0; i < arr.length; i++) 
            arr[i]=sc.nextInt();

                int c=0;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i]>arr[i+1]){
                    c++;
                    break;
                }
            }
            if(c==0)
            System.out.println("Array is Sorted");
            else
            System.out.println("Not Sorted");
    }
}
