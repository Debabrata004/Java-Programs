package Programming;

// B

public class B {
    static void starPattern(int row){
        int mid =row/2+1;
        if(row%2==0)
            row++;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if(j==1 || (i<mid && j==mid && i!=1) || (i==mid && j<mid) || (i==1 && j<mid) || (i==row && j<mid) || (i>mid && j==mid && i!=row))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starPattern(9);
    }
}
