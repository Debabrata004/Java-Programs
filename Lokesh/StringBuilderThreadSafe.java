package Sir.Lokesh;

public class StringBuilderThreadSafe implements Runnable{
    public void run() {
        for(int i=0;i<=10;i++){
            try {
                System.out.println("HI");
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        StringBuilderThreadSafe st=new StringBuilderThreadSafe();
        Thread t1=new Thread(st);
        Thread t2=new Thread(st);
        t1.start();
        t2.start();
    }
}
