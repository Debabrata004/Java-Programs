package Sir.Lokesh;

import java.util.Arrays;

class Student {
    String name;
    int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    // To compare numeric type data
//    public int compareTo(Student o){
//        if(this.age > o.age)
//            return 101;
//        else if (this.age < o.age)
//            return -11;
//        else
//            return 0;
//    }

    @Override
    public String toString() {
        return "name = "+name+ " age = "+age;
    }
            // This procees is small so that's we need
    //    public int compareTo(Student o){
//        return this.age-o.age;
//    }


    // To Compare the String
    public int compareTo(Student o){
        return this.name.compareTo(o.name);
    }

}
public class CompareToObjectCompareableInterface{
    public static void main(String[] args) {
        Student str[]={new Student("Debu",21),new Student("Piu",23),new Student("Soumi",26)};
        Arrays.sort(str);
        System.out.println(str);
    }
}