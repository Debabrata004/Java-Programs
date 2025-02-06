public class Exercise_36_Fibonacci_Recursion {
    int fib(int n){
        if(n==1 || n==2)
        return n-1;
        else{
            return (fib(n-1)+fib(n-2));
        }
    }
    public static void main(String[] args) {
        Exercise_36_Fibonacci_Recursion fr=new Exercise_36_Fibonacci_Recursion();
        System.out.println("The Result : "+fr.fib(5));
    }
}
