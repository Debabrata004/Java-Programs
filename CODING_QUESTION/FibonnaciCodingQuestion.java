package CODING_QUESTION;

public class FibonnaciCodingQuestion {
    public static void main(String[] args) {
        int n=8;
        int k=0;
        int store=0;
        int a=1,b=1,c=0;
        while(k!=n){
            k++;
            if(k==n)
                store=a;
//            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(store);
    }
}
