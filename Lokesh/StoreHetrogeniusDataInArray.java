package Sir.Lokesh;

import java.util.Arrays;

public class StoreHetrogeniusDataInArray {
    static void hetrgeniusData(){
        // WAP to store hetrogenius type of data in an array
        Object arr[]=new Object[3];
        arr[0]=10;
        arr[1]='D';
        arr[2]="Hello";
        System.out.println(Arrays.toString(arr)); // toString is a static method
        for (Object O:arr){
            System.out.print(O+" ");
        }
    }

    public static void main(String[] args) {
        hetrgeniusData();
    }

}
