package Programming;

// Swastik Symbol

public class Pattern_12 {
    static void symbol(int row) throws InterruptedException{
        int mid=row/2+1;
        for (int i = 1; i <= row; i++) {
            for (int j=1;j <= row; j++){
                if ((i==row && j<=mid) || i==mid || (i==1 && j>=mid) || (j==row && i>=mid) || j==mid || (j==1 && i<=mid)){
                    Thread.sleep(1000);
                    System.out.print(" * ");
                }
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        symbol(11);
    }
}
