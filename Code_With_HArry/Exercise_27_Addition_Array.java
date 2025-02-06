import java.util.Scanner;

public class Exercise_27_Addition_Array {

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give The Row Size of the Array : ");
        n = sc.nextInt();
        System.out.println("Give The Column Size of the Array : ");
        m = sc.nextInt();
        int[][] firstArr = new int[n][m];
        int[][] thirdArr = new int[n][m];
        int[][] secondArr = new int[n][m];
        System.out.println("Give The First Array Value : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                firstArr[i][j] = sc.nextInt();
        }
        System.out.println("Give Second Array Value : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                secondArr[i][j] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                thirdArr[i][j] = firstArr[i][j] + secondArr[i][j];
            }
        }
        System.out.println("Addition Of Two Matrix : ");
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < m; j++) {
                System.out.print(thirdArr[k][j] + " ");
            }
            System.out.println();

        }
    }
}