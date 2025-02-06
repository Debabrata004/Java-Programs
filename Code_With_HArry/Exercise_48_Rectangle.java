class Rectangle12 {
    float length, width;

    Rectangle12(float length, float width) {
        this.length = length;
        this.width = width;
    }

    float area() {
        return length * width;
    }

    float periMeter() {
        return 2 * (length + width);
    }
}

public class Exercise_48_Rectangle {
    public static void main(String[] args) {
        Rectangle12 rc = new Rectangle12(5, 10);
       System.out.println(rc.area()+" Is the Area");
       System.out.println(rc.periMeter()+" Is the Perimeter");
    }
}
