package Programming;

public class M {
    public static void main(String[] args) {
        int row=7;
        int mid =row/2+1;
        if(row%2==0)
            row++;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if(j==1 || j==row || (i<=mid && i==j) || (i<=mid && i+j==row+1))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
