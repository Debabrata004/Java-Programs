package Sir.Akshay;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingArray {
    static int[] sort(int []a){
        int temp=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    a[i]=a[j]-a[i]+(a[j]=a[i]);
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={7,2,1,6,3};
        System.out.println(Arrays.toString(sort(a)));

    }
}
