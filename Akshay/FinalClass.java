package Sir.Akshay;

class FinalVariable{
    static final int a; // We can't be initialized the variable inside the constructor and non-static block if we make it as static final variabe
     static { // We can initialize the static final variable inside the static block
         a=110;
     }
}
class FinalMethod{
     final String method(){ // We can't be overridden the fnal method
        return "I am a final Method Inside the FinalMEthod Class ";
    }
}

final class FinalClasses{
    int a=10;
    String finalClassMethod(){
        return "Final Class No Final Method";
    }
}

public class FinalClass {

    public static void main(String[] args) {
        System.out.println(new FinalVariable().a);
        System.out.println(new FinalMethod().method());
        System.out.println(new FinalClasses().finalClassMethod());
    }
}
