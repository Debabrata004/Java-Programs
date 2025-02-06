package DebuPractise;
class Parent_Child_1{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

                                /* This is the Child 1 For Parent_Child_1 class */

class Parent_Child_2 extends Parent_Child_1{
   private char section;
    public void setSection(char section, String name){
        super.setName(name);
        this.section=section;
    }
    public char getSection(){
        return section;
    }
}

                                /* This is Child 1 For Parent_Child_2 Class */
class Child_2 extends Parent_Child_2{
    private String address;
    void setInformation(String address, char section, String name)
    {
        super.setSection(section, name);
        this.address=address;
    }
    String getInformation(){
        return "Name Of The Student Is : "+super.getName()+"\nSection Is : "+super.getSection()+"\nAddress Is : "+address;
    }
}

public class Multi_Level_Inherritance {
    public static void main(String[] args) {
        Child_2 ch=new Child_2();
        ch.setInformation("Baruipur, Totanala, Patashpur,East Medinipur",'A',"Debabrata Kar");
        System.out.println(ch.getInformation());
    }
}
