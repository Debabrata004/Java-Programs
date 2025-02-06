/*
Print The Pattern
 * * * *
 * * *
 * *
 * 

 */

import java.util.Scanner;

public class Exercise_33_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("GIve The Number : ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
 }