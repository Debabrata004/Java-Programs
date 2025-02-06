import java.util.Scanner;

class Exercise_39_Guess_The_Number {
    Scanner sc=new Scanner(System.in);
    int randomNum,numberUser;
    int noOfGuesses;
    Exercise_39_Guess_The_Number(){
        randomNum = (int)(Math.random() * 101) + 1;
        // System.out.println(randomNum);
    }

    void takeUSerInput(){
        System.out.print("Give The Number : ");
        numberUser=sc.nextInt();
        isCorrectNumber();
    }

    void isCorrectNumber(){
        noOfGuesses+=1;
        while(true){
            if(randomNum==numberUser){
                break;
            }
            else if(randomNum<numberUser){
                System.out.println("Give Small Number");
                takeUSerInput();
            }
            else{
                System.out.println("Give Larger number");
                takeUSerInput();
            }
        }
    }
    
    public static void main(String[] args) {
        Exercise_39_Guess_The_Number gn=new Exercise_39_Guess_The_Number();
        gn.takeUSerInput();
        System.out.print("\nGood Your Score is "+ gn.noOfGuesses);
    }
}
