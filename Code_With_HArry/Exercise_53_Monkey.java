class Monkey {
    void jump() {
    }

    void bite() {
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("Eating Always");
    }

    public void sleep() {
        System.out.println("After eat Sleep Whole day");
    }

    @Override
    void jump() {
        System.out.println("Jump Very Little ");
    }
}

public class Exercise_53_Monkey {
    public static void main(String[] args) {
        Human be = new Human();
        be.jump();
        be.eat();
        be.sleep();
    }
}
