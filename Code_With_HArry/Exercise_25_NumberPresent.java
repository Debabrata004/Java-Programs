import java.util.Scanner;

public class Exercise_25_NumberPresent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Give Any Integer : ");
        int key=sc.nextInt();
        int [] value={10,20,30,40,50,60,70,80,99};
        int k=0;
        for(int i=0;i<value.length;i++){
            if(key==value[i]){
            System.out.println("Value Found "+key+" in index of "+ (i+1));
            k=1;
            break;
            }
        }
        if(k==0)
        System.out.println("Value Not Found");

    }
}
