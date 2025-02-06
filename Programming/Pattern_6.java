package Programming;

public class Pattern_6 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = row; i >=1 ; i--) {
            for (int j = 1; j <= row; j++) {
                if(j<=(row-i))
                    System.out.printf(" ");
                else
                    System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
