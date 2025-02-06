package Sir.Lokesh;

import java.util.Arrays;

class AutoAndUnBoxing{
   static void dataForWrapping(){
        int a=10;
        Integer i1=Integer.valueOf(a); //  Auto Boxing Way 2
        Integer i=a; // AutoBoxing Way 3
        System.out.println(a);

        int b=i; // UnBoxing



   }
}
public class Wrapper_Class {
    public static void main(String[] args) {
        AutoAndUnBoxing.dataForWrapping();
    }
}
