package Programming;

/*

* * * *
* * *
* *
*

*/

public class Pattern_3 {
    static void starPattern(int row){
//        for (int i = 1; i <=row; i++) {
//            for (int j = i; j <= row; j++) {
//                System.out.printf("* ");
//            }
//            System.out.println();
//        }
        for (int i = row; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        starPattern(5);
    }
}
