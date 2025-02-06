class Circle{
    int side;
    double Area(){
        return (3.17*(side*side));
    }
    double Perimiter(){
        return 2*3.14*side;
    }
}
public class Exercise_46_Circle {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.side=4;
        System.out.println(c.Area());
        System.out.println(c.Perimiter());
    }
}
