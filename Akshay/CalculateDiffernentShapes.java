package Sir.Akshay;

abstract class Shape{
    String color;
    Shape(String color){
        super();
        this.color=color;
    }
    abstract void drawShape();
    abstract double calculateArea();
}

class Rectangle extends Shape{
    double length, breath;
    Rectangle(String color,double breath, double length){
        super(color);
        this.length=length;
        this.breath=breath;
        drawShape();
    }
    @Override
    void drawShape() {
        System.out.println("Drawing a Rectangle With "+ color+" Color and length  is "+length+" and breath is "+breath + " And Whose Are is "+calculateArea());
    }

    @Override
    double calculateArea() {
        return length*breath;
    }
}

class Circle extends Shape{
    double radius;
    Circle(String color, double radius){
        super(color);
        this.radius=radius;
        drawShape();
    }
    @Override
    void drawShape(){
        System.out.println("Drawing a color of Circle Which is "+color+" Radius of it "+calculateArea());
    }

    @Override
    double calculateArea() {
        return Math.sqrt(radius)*Math.PI;
    }
}

class Square extends Shape{
    int side;

    Square(String color, int side){
        super(color);
        this.side=side;
        drawShape();
    }
    @Override
    void drawShape() {
        System.out.println("Drawing a Shape Of Square Which color is "+color+" side is "+calculateArea());
    }

    @Override
    double calculateArea() {
        return Math.sqrt(side);
    }

}
public class CalculateDiffernentShapes {
    public static void main(String[] args) {
        new Circle("Black",5.6);
        new Square("White",6);
        new Rectangle("Green",10,5);
    }
}
