package Programming;

public class Pattern_5 {
   static void starPattern(int row){
       for (int i = 1; i <= row; i++) {
           for (int j = 1; j <= row; j++) {
               if(j<=row-i)
                   System.out.printf(" ");
               else
                   System.out.printf("* ");
           }
           System.out.println();
       }
    }
    static void starPatternTwo(int row){
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= row; j++) {
                if(j<=(row-i)){
                    System.out.printf(" ");
                }
                else
                    System.out.printf("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row=5;
        starPattern(row);
        System.out.println("----------------------------------------------");
        starPatternTwo(row);

//        for (int i = 1; i <=row ; i++) {
//            for (int j = i; j < row; j++) {
//                System.out.printf(" ");
//            }
//            for (int k = 1; k <=i ; k++) {
//                System.out.printf("*");
//            }
//            System.out.println();
//        }

    }
}
