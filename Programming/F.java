package Programming;

public class F {
    static void starPattern(int row){
        int mid=row/2+1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if(j==1 || (i==1 && j<=mid) || (i==mid && j<=mid))
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
