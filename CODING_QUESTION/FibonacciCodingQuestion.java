package CODING_QUESTION;


public class FibonacciCodingQuestion {
   public static void m1(){
        System.out.println("I am here");
    }
    public static void main(String[] args) {
        int n=20;
        long num=1;
        for(int i=1;i<=n;i++){
            num*=i;
        }
        int number=0;
        while(num>0){
           long r=num%10;
           if(r==0){
               number++;
           } else{
               break;
           }
           num/=10;
        }
        System.out.println(number);
    }
}
