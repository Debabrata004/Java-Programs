package Programming;

public class Pattern_8 {
    void starPattern(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if(j==(row/2)+1 || i==(row/2)+1)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter The Value Of Row : ");
        int row=sc.nextInt();
       new Pattern_8().starPattern(row);
    }
}
