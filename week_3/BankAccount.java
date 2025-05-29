package week_3;
import java.util.Scanner;

public class BankAccount {
    private int account_Id = 0;
    private static int nextAccountId = 1;
    private int balance;

    public BankAccount(){
        account_Id = nextAccountId++;
        balance = 0;
    }

    public BankAccount(int balance){
        this.balance = balance;
    }

    public int getAccountId(){
        return account_Id;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public void Withdraw(int value){
        while (balance < value){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insufficient funds enter another value: ");
            value = scanner.nextInt();
        }

        balance -= value;
    }

    public void deposit(int value){
        Scanner scanner = new Scanner(System.in);
        while(value <= 0){
            System.out.print("Please Enter Positive Value: ");
            value = scanner.nextInt();
        }
        balance += value;
    }
}
