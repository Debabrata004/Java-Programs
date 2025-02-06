class Cylinder3 {
    float radius, height;

    void getArea() {
        double area = ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius));
        System.out.println("Area Of Cylinder is " + area);
    }
    void getVolumn(){
        
    }
}

class Circle2 extends Cylinder3 {
    Circle2(float radius, float height) {
        this.height = height;
        this.radius = radius;
    }

    void getArea() {
        double area = 3.17 * (radius * radius);
        System.out.println("Area Of Circle is " + area);
    }
}

public class Exercise_51_CircleCylinder {
    public static void main(String[] args) {
        Cylinder3 c3 = new Circle2(10, 5); //Up-Casting
        Circle2 c=(Circle2)c3; // Down-Casting
        c.getArea();
    }
}