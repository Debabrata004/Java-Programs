package Programming;

public class PrimeCheckInArray {
    static boolean isPrime(int number){
        int count=0;
        for(int i=2;i<=number;i++){
            if(number%i==0)
                count++;
        }
        return (count==1);
    }
    public static void main(String[] args) {
        int arr[]={2,5,4,8,9,6,7,11};
        for (int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i]))
                System.out.print(arr[i]+" ");
        }
    }
}
