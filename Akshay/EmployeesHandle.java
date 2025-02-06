package Sir.Akshay;

import java.util.Stack;

interface Person{
    int getAge();
    String getName();
}

interface Payable{
    double calculateSalary();
    String processPayment();
}

class Employee implements Person,Payable{
    private String name;
    private int age;
    private double perHrAmount;
    private int noOfHrWorked;
    Employee(String name,int age,double perHrAmount,int noOfHrWorked){
        this.name=name;
        this.age=age;
        this.noOfHrWorked=noOfHrWorked;
        this.perHrAmount=perHrAmount;
    }

    @Override
    public double calculateSalary() {
        return perHrAmount*noOfHrWorked;
    }

    @Override
    public String processPayment() {
        return "Employee Name : "+ name +"\nEmployee Age : "+age+"\nEmployee Salary : "+calculateSalary();
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class EmployeesHandle {
    public static void main(String[] args) {
       Employee em=new Employee("Arijit",26,9000,8);
        System.out.println(em.processPayment());
    }
}
