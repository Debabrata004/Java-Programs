package Programming;

public class G {
    static void starPattern(int row){
        int mid=row/2+1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if((j==1 && i!=1 && i!=row) || (i==1 && j!=1) || (i==row && j!=1 && j!=row) || (i==mid && j>3 && j!=row) || (j==row && i>mid && i!=row))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row=7;
        starPattern(row);
    }
}
