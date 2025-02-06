package Programming;

public class Pattern_7 {
    void printPattern(int row){
        if(row%2==0)
            row++;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if(i==j || i+j==row+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter the Value : ");
        int row=sc.nextInt();
       new Pattern_7().printPattern(row);
    }
}
