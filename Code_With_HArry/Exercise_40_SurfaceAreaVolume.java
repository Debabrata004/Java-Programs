public class Exercise_40_SurfaceAreaVolume {
    public static void main(String[] args) {
        Cylendar cy=new Cylendar();
        cy.set(9,12);
        System.out.println(cy.SurfaceArea());
        System.out.println(cy.Volume());
        
    }
}

class Cylendar{
    
    private double radius, height;

    void set(float radius,float height){
        this.radius=radius;
        this.height=height;

    }


   public double SurfaceArea(){
    return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius); 
   }


   public double Volume(){
    return  Math.PI*radius*radius*height;
   }
}
