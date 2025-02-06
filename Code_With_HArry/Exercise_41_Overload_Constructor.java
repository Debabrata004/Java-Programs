public class Exercise_41_Overload_Constructor {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(5, 4);
        System.out.println(" Value For Length " + rc.getLength());
        System.out.println(" Value For Breadth " + rc.getBreadth());
    }
}

class Rectangle {
    private int breadth, length;

    public Rectangle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }

    int getBreadth() {
        return breadth;
    }

    int getLength() {
        return length;
    }
}
