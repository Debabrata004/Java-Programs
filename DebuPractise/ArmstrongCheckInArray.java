package DebuPractise;
public class ArmstrongCheckInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 7, 9 };

        for (int j = 0; j < arr.length; j++) {
            int k = arr[j], n = k, r = k, count = 0, sum = 1, total = 0;

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
}
