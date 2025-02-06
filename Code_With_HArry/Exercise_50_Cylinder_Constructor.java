class Cylinder2 {
    float radius, height;

    Cylinder2(float radius, float height) {
        this.height = height;
        this.radius = radius;
    }

    double getArea() {
        return (((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius)));
    }

    double getVolumn() {
        return (Math.PI * radius * radius * height);
    }
}

public class Exercise_50_Cylinder_Constructor {
    public static void main(String[] args) {
        Cylinder2 c = new Cylinder2(10, 5);
        System.out.println(c.getArea());
        System.out.println(c.getVolumn());
    }
}
