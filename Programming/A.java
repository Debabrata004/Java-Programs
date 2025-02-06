package Programming;

// A

public class A {
    public static void main(String[] args) {
        starPattern(7);
    }
    static void starPattern(int row){
        int mid=row/2+1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if((i==1 && j!=1 && j<mid) || (j==1 && i!=1) || (j==mid && i!=1 ) || (i==mid && j<=mid))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
