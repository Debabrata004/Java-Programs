public class Exercise_3_Encrypte {

    public static void main(String[] args) {
        char grade='B';
        grade=(char)(grade+8);
        System.out.println("Encrypted Grade Is : "+grade);

        grade=(char)(grade-8);
        System.out.println("Decrypted Grade Is : "+grade);
    }
}