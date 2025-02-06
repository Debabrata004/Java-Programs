class Squre{
    int side;
    int area(){
        return side*side;
    }
    int perimeter(){
        return 4*side;
    }
}
public class Exercise_45_Squre {
    public static void main(String[] args) {
        Squre sq=new Squre();
        sq.side=3;
        System.out.println("Squre of Area is "+sq.area());
        System.out.println("Squre of Perimiter "+sq.perimeter());
    }
}
