package DebuPractise;

import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String args[]) {
        Random random=new Random();
        System.out.println(random.nextInt(4)+1);  // if we can't add one it will give the 0 for that we add 1
        // and what we pass inside nextInt it will generate till n-1 random number
    }
}
