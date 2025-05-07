import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    public void setDetails(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Balance after deposit: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Bannk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();
        int accountNumber = sc.nextInt();
        sc.nextLine();
        String holderName = sc.nextLine();
        double balance = sc.nextDouble();
        
        account.setDetails(accountNumber, holderName, balance);

        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayAccountDetails();

        sc.close();
    }
}
