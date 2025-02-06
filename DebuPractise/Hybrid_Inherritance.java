package DebuPractise;

class OneChild{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}

class TwoChild extends OneChild{
    private String girl;

    public String getGirl(){
        return girl;
    }

    public void setGirl(String name, String girl)
    {
        super.setName(name);
        this.girl = girl;
    }
}

/* This Is First Child Of TwoChild Class  */

class FirstChildOfTwoChild extends TwoChild{
    String firstchildname;

    public String getFirstchildname() {
        return "Father Name IS : "+super.getName()+"\nWife Name Is : "+super.getGirl()+"\nLittle Brother Is : "+firstchildname;
    }

    public void setFirstchildname(String name, String girl, String firstchildname)
    {
        super.setGirl(name,girl);
        this.firstchildname=firstchildname;
    }

}

/* This is Second Child Of TwoChild Class */

class SecondChildOfTwoChild extends TwoChild{
        String secondchildname;

    public void setSecondchildname(String name, String girl, String secondchildname) {
        super.setGirl(name,girl);
        this.secondchildname = secondchildname;
    }

    public String getSecondchildname() {
        return "Father Name IS : "+super.getName()+"\nWife Name Is : "+super.getGirl()+"\nLittle Brother Is : "+secondchildname;
    }
}

public class Hybrid_Inherritance {

    public static void main(String[] args) {
        FirstChildOfTwoChild fc=new FirstChildOfTwoChild();
        fc.setFirstchildname("Debu","Shilpa","Shrimi");
        SecondChildOfTwoChild sc=new SecondChildOfTwoChild();
        sc.setSecondchildname("Debu","Shilpa","Shridhi");
        System.out.println(fc.getFirstchildname());
        System.out.println("----------------------------------");
        System.out.println(sc.getSecondchildname());
    }
}
