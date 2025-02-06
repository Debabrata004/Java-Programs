public class Exercise_57_Thread_Priority {
    public static void main(String[] args) {
        SetPri sp = new SetPri();
        sp.start();
        Priority pr=new Priority();
        Thread t1=new Thread(pr);
        sp.setPriority(10);
        t1.setPriority(1);
        t1.start();
    }
}

class SetPri extends Thread {
    @Override
    public void run() {
        try{
        for (int i = 1; ; i++) {
            sleep(1000);
            System.out.println("Low Priority");
            System.out.println(getPriority());
        }
    }
    catch(Exception e){
        System.out.println(getName());
    }
    }
}

class Priority implements Runnable {
    @Override
    public void run() {
        try{
            for (int i = 1; ; i++) {
                Thread.sleep(1000);
                System.out.println("High Priority");
            }
        }
        catch(Exception e){
            System.out.println("Sorry");
        }
    }
}
