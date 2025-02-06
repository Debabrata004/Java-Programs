public class Exercise_8_Replacce {

    public static void main(String[] args) {
        String letter="Dear <|name|>, Thanks a lot!";
        System.out.println(letter.replace("<|name|>", "Debu"));
    }
}