public class Exercise_32_Recursive_Add {
    int num(int n){
        if(n==0)
        return 0;
        else
        return (n+num(n-1));
    }
    public static void main(String[] args) {
        Exercise_32_Recursive_Add ra=new Exercise_32_Recursive_Add();
        System.out.println("The Natural Number Addition "+ra.num(10));
    }
}
