package DebuPractise;

import Programming.B;

public class PrintingNameStarPattern {
    static int row;

    static void space() {
        for (int i = 1; i <= 3; i++)
            System.out.println();
    }

    static void A(int i) {
        int mid = row / 2 + 1;
        for (int j = 1; j <= row; j++) {
            if ((i == 1 && j != 1 && j < mid) || (j == 1 && i != 1) || (j == mid && i != 1) || (i == mid && j <= mid))
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }

    static void starPattern(int i) {
        int mid = row / 2 + 1;
        if (row % 2 == 0)
            row++;
        for (int j = 1; j <= row; j++) {
                if (j == 1 || (i < mid && j == mid && i != 1) || (i == mid && j < mid) || (i == 1 && j < mid) || (i == row && j < mid) || (i > mid && j == mid && i != row))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
        }

        public static void main (String[]args){
            row = 4;
            for (int i = 1; i <= row; i++) {
                A(i);
                space();
                starPattern(i);
                space();
            }
        }
    }