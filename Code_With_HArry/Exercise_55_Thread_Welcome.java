class Wel extends Thread {
    @Override
    public void run() {
        int i=5;
        while (i>0) {
            i--;
            try {
                sleep(200);
                System.out.println("Welcome");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Mor extends Thread {
    int i=5;
    public void run(){
        while(i>0){
            i--;
            System.out.println("Good Morning");
        }
    }
   
}


public class Exercise_55_Thread_Welcome {
    public static void main(String[] args) {
        Wel t1 = new Wel();
        Mor t2 = new Mor();
        t2.start();
        t1.start();
    }
}
