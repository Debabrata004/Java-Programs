abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    void changeNib() {
        System.out.println("Change Nibble");
    }

    public void write() {
        System.out.println("This is Write Method");
    }

    public void refill() {
        System.out.println("This is Refill Method");
    }
}

public class Exercise_52_Abstract_Pen {

    public static void main(String[] args) {
        FountainPen e5 = new FountainPen();
        e5.write();
        e5.refill();
    }
}
