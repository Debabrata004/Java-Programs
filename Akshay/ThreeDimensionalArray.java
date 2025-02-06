package Sir.Akshay;

public class ThreeDimensionalArray {
    static void print2D(int [][][]arr){
        for(int[][] i:arr){
            for(int ar[]:i){
                for(int a:ar){
                    System.out.print(a+" ");
                }
                System.out.println(",");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][][]= {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
        print2D(arr);

    }
}