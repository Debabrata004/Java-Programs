class Employee {
    int salary;
    String name;

    void setName(String name, int salary) {
        this.name = name;
        this.salary=salary;
    }

    int getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }

}

public class Exercise_43_Employee {
    public static void main(String[] args) {
        Employee em=new Employee();
        em.setName("Debu", 100000);
        System.out.println("Mr."+ em.getName()+" Your Salary Is "+em.getSalary());
    }
}
