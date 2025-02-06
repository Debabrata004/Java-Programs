package Programming;

public class Pattern_9 {
    public static void main(String[] args) {
        int row=11;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if(i==1 || i==row || i%2==1 || j==1 || j==row)
                    System.out.print(" * ");
                else
                    System.out.print("   "); // 3 Space is here
            }
            System.out.println();
        }
    }
}
