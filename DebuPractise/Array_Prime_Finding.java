package DebuPractise;

public class Array_Prime_Finding {
    public static void isPrime(){
        int arr[]={2,1,6},count;
        for(int i = 0; i < arr.length; i++) {
            int k=arr[i];
            count=0;
            for (int j = 1; j <= k; j++) {
                if(k%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Prime Number "+arr[i]);
            }
            else
            {
                System.out.println("Not a Prime Number "+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        isPrime();
    }
}