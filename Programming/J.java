package Programming;

public class J {
    public static void main(String[] args) {
        int row=7;
        for (int i=1;i<=row;i++){
            for (int j=1;j<= row; j++){
                if(i==1 || (j==row/2+1 && i!=row) || (i==row && j<=row/2 && j!=1) || (i==row-1 && j==1))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
