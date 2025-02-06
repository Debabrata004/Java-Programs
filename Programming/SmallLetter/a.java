package Programming.SmallLetter;

public class a {
    public static void main(String[] args) {
        int row=7;
        int mid=row/2+1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if((j==1 && i<mid && i>1) || (i==1 && j!=row) || (j==row && i!=1) || (i==mid && j!=1) || (i>mid && j==2 ) || (j>=2 && i==row))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
