import java.util.ArrayList;

public class Bank {
    ArrayList<Account>accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public Account findaccount(int accountNumber){
        for(Account account : accounts){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }

    public void displayallAccounts(){
        for(Account account : accounts){
            account.displayAccountDetails();
            System.out.println("_________________________________________________");
        }
    }

    public void transferMoney(int fromAccountNumber , int toAccountNumber , double amount){
        Account fromAccount = findaccount(fromAccountNumber);
        Account toAccount = findaccount(toAccountNumber);

        if(fromAccount == null || toAccount == null){
            System.out.println("Account not found!");
            return;
        }

        fromAccount.withdraw(amount);
        toAccount.deposit(amount);

        System.out.println("Transefer Completed succesfully!! ");
    }
}
