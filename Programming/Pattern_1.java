package Programming;

public class Pattern_1 {
    static void starPattern(int row){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        starPattern(4);
    }
}
