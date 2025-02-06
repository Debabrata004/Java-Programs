/*
Using Recursion
 * * * *
 * * *
 * *
 * 
 
 */


public class Exercise_37_Pattern_Recursion_33 {
    static void recPattern(int n){
        if(n>0){
            recPattern(n-1);
            for (int i = 1; i <=n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        recPattern(5);
    }
}
