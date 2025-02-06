package Programming;

public class L {
    public static void main(String[] args) {
        int row=7;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if(j==1 || (i==row && j<=row/2+1))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
