

public class Exercise_42_Sphere_Vlolumn_Area {
    public static void main(String[] args) {
        Sphere sp=new Sphere();
        sp.SetRadiusHeight(10);
        System.out.println(sp.getSurfaceArea());
        System.out.println(sp.getSurfaceVolume());
    }
}

class Sphere{
    private double radius;

    void SetRadiusHeight(float radius){
        this.radius=radius;
    }
    double getSurfaceArea(){
        return 4*Math.PI*Math.sqrt(radius); 
    }
    double getSurfaceVolume(){
        return 4/3*Math.PI*Math.sqrt(radius)*radius;
    }
}