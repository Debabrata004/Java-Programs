package DebuPractise;

public class ConvertToString {
    public static void main(String[] args) {
        int a=1234;
//        String str=""+a; // Concate the string and Number means convert at string

//        String str=Integer.toString(a);

        String str=String.valueOf(a);

        System.out.println(str);
    }
}
