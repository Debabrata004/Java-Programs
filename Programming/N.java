package Programming;

public class N {
    public static void main(String[] args) {
        int row=9;
        int mid=row/2+1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=row ; j++) {
                if(j==1 || j==row || i==j)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
