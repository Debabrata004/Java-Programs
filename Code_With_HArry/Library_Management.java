import java.util.Scanner;

class Library {
    String book[] = new String[100];
    int n = 0;

    Scanner sc = new Scanner(System.in);

    void addBook() {
        String bookName = sc.nextLine();
        book[n] = bookName;
        System.out.println("Your Book Is Added : " + book[n]);
        n++;
    }

    public void issueBook() {

        String name = sc.nextLine();
        for (int i = 0; i < book.length; i++) {
           if(book[i]==name){
                System.out.println("Book Successfully Issued");
                book[i]=null;
                return;
            }
        }
        System.out.println(name+" Not Avaliable");

    }

    public void returnBook() {

    }

    public void showAvailableBook() {
        for (String string : book) {
            if(string==null)
            break;
            System.out.println(string);
        }
    }
}

public class Library_Management {
    public static void main(String[] args) {
        Library ex = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1 for Adding Books");
            System.out.println("Press 2 for Issue Books");
            System.out.println("Press 3 for Return Books");
            System.out.println("Press 4 for Show Avaliable Books");
            int a = sc.nextInt();

            switch (a) {
                case 1:
                    ex.addBook();
                    break;
                case 2:
                    ex.issueBook();
                    break;
                case 3:
                    ex.returnBook();
                    break;
                case 4:
                    ex.showAvailableBook();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("You Press Wrong Number Try Again");
                    System.out.println(ex.n);
            }
        }
    }
}
