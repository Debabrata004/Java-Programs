class Employees{
    int sal;
    Employees(){
        System.out.println("No Paramiterized Constructor");
    }
    Employees(int sal){
        this();
        this.sal=sal;
        System.out.println("Salary Is "+this.sal);
    }
}
public class Exercise_47_OverConstructor {
       public static void main(String[] args) {
        Employees em=new Employees(10000);
    }
}