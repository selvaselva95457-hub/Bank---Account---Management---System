import java.security.PublicKey;
import java.util.ArrayList;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double Balance;

    private ArrayList<Transaction>transactions;

    public Account(int accountNumber , String accountHolderName , double Balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.Balance = Balance;

        transactions = new ArrayList<>();
    }

    public void deposit(double amount){
        if(amount > 0){
            Balance = Balance + amount;
            Transaction transaction = new Transaction("Deposit" , amount , "Money deposited");
            transactions.add(transaction);
            System.out.println("Deposit Succesfully");
        }else{
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && Balance >= amount){
            Balance = Balance - amount;
            Transaction transaction = new Transaction("Withdraw" , amount , "Money withdrawn");
            transactions.add(transaction);
            System.out.println("Withdrawn Succesfully!");
        }else{
            System.out.println("Insufficient Balance!");
        }
    }

    public void checkbalance(){
        System.out.println("Actual Balance: " + Balance);
    }

    public void displayAccountDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + Balance);
    }

    public void displayTransactionHistory(){
        System.out.println("Transaction History: ");
        for(Transaction transaction : transactions){
            transaction.DisplayTransaction();
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}


class main{
     public static void main(String[] args){
         Bank bank = new Bank();
         Account a1 = new Account(101 , "Santhosh N" , 50000);
         Account a2 = new Account(102 , "Kokila D" , 50000);

         bank.addAccount(a1);
         bank.addAccount(a2);

         System.out.println("ALL ACCOUNTS");
         bank.displayallAccounts();

         System.out.println("TRANSFER");
         bank.transferMoney(101 , 102 , 10000);

         System.out.println("________________________________________________________");

         bank.displayallAccounts();


    }
}
