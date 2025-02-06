package Programming;

public class C {
    static void starPattern(int row){
        int mid =row/2+1;
        if(row%2==0)
            row++;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row/2+1; j++) {
                if((j == 1 && i!=1 && i!=row) || (i == 1 && j <= mid && j!=1) || (i == row && j <= mid && j!=1))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        starPattern(11);
    }
}
