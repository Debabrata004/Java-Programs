package Sir.Akshay;

import java.util.Scanner;

abstract class BankAccount{
    double amount;
    BankAccount(double amount){
        this.amount=amount;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    double getBalance(){
        return amount;
    }
}

class SavingsAccount extends BankAccount{
    SavingsAccount(double amount){
        super(amount);
    }

    @Override
    void deposit(double amount) {
        super.amount+=amount;
        System.out.println("Deposit Successfully!");
    }

    @Override
    void withdraw(double amount) {
        if(super.amount==0)
            System.out.println("Not Possible to Withdraw");
        else {
            super.amount -= amount;
            System.out.println("Withdrawal Successfull!");
        }
    }
}

class CurrentAccount extends BankAccount{
    CurrentAccount(double amount){
        super(amount);
    }

    @Override
    void withdraw(double amount) {
        if(super.amount==0)
            System.out.println("Not Possible to Withdraw");
            else {
            super.amount -= amount;
            System.out.println("Withdrawal Successfull!");
        }
    }

    @Override
    void deposit(double amount) {
        super.amount+=amount;
        System.out.println("Deposit Successfully!");
    }
}

public class Banking_Process {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount;
        while(true){
            System.out.println("--- :: Which Bank Accounts is your :: --- \nFor Saving Account Press 1 \nFor Current Account Press 2\nPress 3 For Exit");
            int choose=sc.nextInt();
            switch(choose){
                case 1->{
                    BankAccount sav=new SavingsAccount(1000000);
                    while (true){
                        System.out.println("Choose What You Do :: --- \nWant To Withdraw Press 1\nWant to Deposit Press 2\nWant To see Balance Press 3\nWant to Exit And Choose Another Account Press 3");
                        choose=sc.nextInt();
                        switch (choose){
                            case 1->{
                                System.out.println("Please Give How Much Money You Want----------");
                                amount=sc.nextInt();
                                if(amount>0) {
                                    if(amount>500)
                                    sav.withdraw(amount);
                                    else
                                        System.out.println("Please give upper 500");
                                }
                                else {
                                    System.out.println("Please Enter Valid Number");
                                }
                            }
                            case 2->{
                                System.out.println("Please Give How Much Money You Deposit+++++++++");
                                amount=sc.nextInt();
                                if(amount>0) {
                                   sav.deposit(amount);
                                }
                                else{
                                    System.out.println("Please Enter Valid Number");
                                }
                            }
                            case 3-> System.out.println("Your Balance Is : "+sav.getBalance());

                            case 4->
                                System.exit(0);

                            default -> System.out.println("Please Enter Valid Process");
                        }
                    }
                }
                case 2->{
                    System.out.println("Choose What You Do :: --- \nWant To Withdraw Press 1\nWant to Deposit Press 2\nWnat to see your Balance Press 3\nWant to Exit And Choose Another Account Press 3");
                    choose=sc.nextInt();
                    CurrentAccount ca=new CurrentAccount(4500000);
                    switch (choose){
                        case 1->{
                            System.out.println("Please Give How Much Money You Want----------");
                            amount=sc.nextInt();
                            if(amount>0) {
                                if(amount>500)
                                    ca.withdraw(amount);
                                else
                                    System.out.println("Please give upper 500 RS");
                            }
                            else {
                                System.out.println("Choose Valid Operation");
                            }
                        }
                        case 2->{
                            System.out.println("Please Give How Much Money You Deposit+++++++++");
                            amount=sc.nextInt();
                            if(amount>0) {
                                ca.deposit(amount);
                            }
                            else {
                                System.out.println("Give Valid Amount");
                            }
                        }
                        case 3-> System.out.println(ca.getBalance());

                        case 4->
                                System.exit(0);

                        default -> System.out.println("Choose Valid Operation");
                    }
                }
                case 3->System.exit(0);

                default -> System.out.println("Choose Valid Account");
            }
                }
            }
        }