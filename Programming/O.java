package Programming;

public class O {
    public static void main(String[] args) {
        int row=7;
        int mid=row/2+1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=row ; j++) {
                if((i==1 && j!=1 && j!=row) || j==1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
