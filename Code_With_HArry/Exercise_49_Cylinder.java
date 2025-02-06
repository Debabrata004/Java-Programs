class Cylinder {
    int height;
    float radius;

    void setValue(float radius, int height) {
        this.height = height;
        this.radius = radius;
    }

    double getArea() {
        double area = (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
        return area;
    }
    double getVolumn(){
        double surface=(Math.PI*radius*radius*height);
        return surface;
    }
}

public class Exercise_49_Cylinder {
    public static void main(String[] args) {
Cylinder cy=new Cylinder();
cy.setValue(10, 5);
System.out.println(cy.getArea());
System.out.println(cy.getVolumn());
    }
}