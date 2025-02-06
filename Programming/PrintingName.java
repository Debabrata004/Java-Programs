package Programming;

public class PrintingName
{
    static int row;
    static int delay;
    public static void space()
    {
        for(int i=1;i<=3;i++)
        {

            System.err.print(" ");
        }
    }
    public static void A(int i) throws InterruptedException
    {
        int mid = row/2+1;
        for(int j=1;j<=row;j++)
        {
            if((i==1 && j!=1 && j<mid) || (j==1 && i!=1) || (j==mid && i!=1 ) || (i==mid && j<=mid))
            {
                Thread.sleep(delay);
                System.out.print("*");
            }
            else
                System.out.print(" ");
        }
    }

    static void B(int i){
        int mid =row/2+1;
            for (int j = 1; j <= row; j++) {
                if(j==1 || (i<mid && j==mid && i!=1) || (i==mid && j<mid) || (i==1 && j<mid) || (i==row && j<mid) || (i>mid && j==mid && i!=row))
                    System.out.print("*");
                else
                    System.out.print(" ");
        }
    }

    public static void C(int i) throws InterruptedException {
        int mid = row / 2 + 1;
        if (row % 2 == 0)
            row++;
        for (int j = 1; j <= row / 2 + 1; j++) {
            if ((j == 1 && i != 1 && i != row) || (i == 1 && j <= mid && j != 1) || (i == row && j <= mid && j != 1)) {

                System.out.print("*");
            } else
                System.out.print(" ");
        }
    }

    static void D(int i){
        int mid=row/2+1;
            for (int j = 1; j <= row; j++) {
                if(j==1 || (i==1 && j<mid) || (i==row && j<mid) ||(j==mid && i!=1 && i!=row ))
                    System.out.print("*");
                else
                    System.out.print(" ");
        }
    }

    static void E(int i){
        int mid=row/2+1;
            for (int j = 1; j <= row; j++) {
                if(j==1 || (i==1 && j<=mid) || (i==mid && j<=mid) || (i==row && j<=mid))
                    System.out.print("*");
                else
                    System.out.print(" ");
        }
    }

    static void F(int i){
        int mid=row/2+1;
            for (int j = 1; j <= row; j++) {
                if(j==1 || (i==1 && j<=mid) || (i==mid && j<=mid))
                    System.out.print("*");
                else
                    System.out.print(" ");
        }
    }

    static void G(int i){
        int mid=row/2+1;
            for (int j = 1; j <= row; j++) {
                if((j==1 && i!=1 && i!=row) || (i==1 && j!=1) || (i==row && j!=1 && j!=row) || (i==mid && j>3 && j!=row) || (j==row && i>mid && i!=row))
                    System.out.print("*");
                else
                    System.out.print(" ");
        }
    }

    static void I(int i){
        int mid=row/2+1;
            for (int j = 1; j <= row; j++) {
                if(i==1 || j==mid || i==row)
                    System.out.print("*");
                else
                    System.out.print(" ");
        }
    }
static void J(int i){
    int row=7;
        for (int j=1;j<= row; j++){
            if(i==1 || (j==row/2+1 && i!=row) || (i==row && j<=row/2 && j!=1) || (i==row-1 && j==1))
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }

    public static void K(int i) throws InterruptedException
    {
        int mid = row/2+1;
        for(int j=1;j<=mid;j++)
        {
            if(j==1 || i+j==mid+1 || i-j==mid-1)
            {
                Thread.sleep(delay);
                System.err.print("*");
            }
            else
            {
                System.err.print(" ");
            }
        }
    }

    public static void S(int i) throws InterruptedException
    {
        int mid = row/2+1;
        for(int j=1;j<=row;j++)
        {
            if(i==1 || i==mid || (j==1&&i<=mid) || (j==row&&i>=mid) ||i==row)
            {
                Thread.sleep(delay);
                System.err.print("*");
            }
            else
            {
                System.err.print(" ");
            }
        }
    }

    public static void Y(int i) throws InterruptedException
    {
        int mid = row/2+1;
        for(int j=1;j<=row;j++)
        {
            if((i+j==row+1 && i<=mid) || (i==j&&i<=mid) || (j==mid&&i>=mid) )
            {
                Thread.sleep(delay);
                System.err.print("*");
            }
            else
            {
                System.err.print(" ");
            }
        }
    }
    public static void H(int i) throws InterruptedException
    {
        int mid = row/2+1;
        for(int j=1;j<=row;j++)
        {
            if(j==1 || i==mid || j==row)
            {
                Thread.sleep(delay);
                System.err.print("*");
            }
            else
                System.err.print(" ");
        }
    }

    public static void main(String[] args)throws InterruptedException
    {
        row = 11;
        if(row%2==0)
            row+=1;

        delay = 20;

        for(int i=1;i<=row;i++)
        {
            A(i);
            space();
            B(i);
            space();
            C(i);
            space();
            D(i);
            space();
            E(i);
            space();
            F(i);
            System.err.println();

        }

    }
}