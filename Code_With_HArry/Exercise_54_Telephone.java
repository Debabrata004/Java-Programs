abstract class TelePhone {
    abstract void ring();

    abstract void light();

    abstract void disConnect();

}

class SmartPhone extends TelePhone {
    public void ring() {
        System.out.println("Mobile Ringing");
    }

    public void light() {
        System.out.println("Light Function Activate");
    }

    public void disConnect() {
        System.out.println("Disconnect From other Device");
    }

}

public class Exercise_54_Telephone {
    public static void main(String[] args) {

    }
}
