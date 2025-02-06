public class Exercise_28_Reverse_Array {
    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 4 }; 
        int k = 0;
        for (int i = 0; i <ar.length; i++) {
            for (int j = 0; j < ar.length-i-1; j++) {
                k=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=k;
            }
        }


        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }
    }
}
