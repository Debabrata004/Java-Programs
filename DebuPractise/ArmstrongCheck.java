package DebuPractise;

import java.util.Scanner;

public class ArmstrongCheck {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Give The Number For Check The Number : ");
            int arr=sc.nextInt();

            int k = arr, n = k, r = k, count = 0, sum = 1, total = 0;

            while (r != 0) {
                count++;
                r /= 10;
            }
            total = 0;
            while (n != 0) {
                r = n % 10;
                sum = 1;
                for (int i = 0; i < count; i++) {
                    sum *= r;
                }
                total += sum;
                n /= 10;
            }

            if (total == k) {
                System.out.println("Armstrong Number ");
            } else
                System.out.println("Not a Armstrong Number");

        }
    }

