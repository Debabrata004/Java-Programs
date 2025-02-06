package DebuPractise;

class ParentOfTwoChild{
    private String parentname;
    public void setName(String name){
        this.parentname=name;
    }
    public String getName(){
        return parentname;
    }
}

class FirstChild extends ParentOfTwoChild{
    private String firstchildname;
    public void setFirstChildname(String firstchildname, String parentname){
        super.setName(parentname);
        this.firstchildname=firstchildname;
    }
    public String getChildname(){
        return "Parent Name Is : "+super.getName()+"\nFisrt Children Name Is : "+firstchildname+"\n";
    }
}

class SecondChild extends ParentOfTwoChild{
    String secondchildname;
    void setSecondchildname(String secondchildname){
        this.secondchildname=secondchildname;
    }
    String getSecondchildname(){
        return "Second Child Name Is : "+secondchildname;
    }
}

public class Hiearirchical_Inherritance {
    public static void main(String[] args) {
        FirstChild fc=new FirstChild();
        fc.setFirstChildname("Debabrata Kar", "Ranjan Kar");
        SecondChild sc=new SecondChild();
        sc.setSecondchildname("Piu");
        System.out.print(fc.getChildname());
        System.out.print(sc.getSecondchildname());
    }
}
