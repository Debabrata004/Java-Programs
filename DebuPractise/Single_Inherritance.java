package DebuPractise;
class Parent{
    private int a;
    public void setA(int a){
        this.a=a;
    }
    public int getA(){
       return a;
    }
}
class Child extends Parent{
    private String name;
    public void setName(String name, int a){
        super.setA(a);
        this.name=name;
    }
    public String getName(){
        return "Name Is : "+name+"\nValue Is : "+super.getA();
    }
}
public class Single_Inherritance {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.setName("Debu",420);
        System.out.println(c1.getName());
    }
}
