import java.util.Scanner;

/*
                     " Design a Game " 
    1 ---> Rock
    2 ---> Paper
    3 ---> Scissor

 */
public class Exercise_17_ROCK_PAPER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give Number Between 1 to 3 : ");
        int user = sc.nextInt();
        int randomNum = (int)(Math.random() * 4) + 1;

        String Game[] = { "Rock", "Paper", "Scissor" };
        System.out.println("User Choice is " + Game[user - 1]);
        System.out.println("Computer Choice is " + Game[randomNum - 1]);

        if (user == 1 && randomNum == 3 ||
                user == 2 && randomNum == 1 ||
                user == 3 && randomNum == 2)
            System.out.println("Developer Winner !");
        else if (user == randomNum)
            System.out.println("It is Tie !");
        else
            System.out.println("Computer Winner ! ");

    }
}
