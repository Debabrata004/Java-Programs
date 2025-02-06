// Print Multiplication Table In reverse Order

public class Exercise_21_Multiplication_Table {
    public static void main(String[] args) {
        int n=10;
        for (int i=n;i>=1;i--){
            System.out.printf("%d * %d = %d\n", n,i,(i*n) );
        }
    }    
}
