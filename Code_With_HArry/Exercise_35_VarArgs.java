public class Exercise_35_VarArgs {
    void sum(int ...a){
        int sum = 0;
        for (int i : a) {
            sum+=i;
        }
        System.out.println("Addition Is : "+ sum);
    }
    public static void main(String[] args) {
        Exercise_35_VarArgs va=new Exercise_35_VarArgs();
        va.sum(10,20,30);
    }
}
