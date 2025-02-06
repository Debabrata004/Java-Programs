package Sir.Akshay;


 abstract class Features{

     final int x;
     Features(){
         x=20;
     }
    abstract void notifications();
    abstract void alarm();
}

class WhatsApp extends Features{
     @Override
    void notifications(){
         System.out.println("I Have A Notifications for you");
     }

    @Override
    void alarm() {
        System.out.println("Otho OTho Gunjone Vomorer Paharai");
    }
}

 abstract class Instagram extends Features{
    @Override
    void notifications() {
        System.out.println("Instagram Notification");
    }
}
class InstaFetures extends Instagram{
    @Override
    void alarm() {
        System.out.println("Alarm From Insta");
    }
}

public class AbstractMain {
    public static void main(String[] args) {
        Features f1=new InstaFetures();
        f1.alarm();
        f1.notifications();
        System.out.println(f1.x);
    }
}
