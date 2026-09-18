import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;
    private ArrayList<Transaction> transactions;

    public Bank() {
        accounts = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addAccount(Account account) {

        accounts.add(account);

        System.out.println("Account created successfully.");
    }

    public Account findAccount(long accountNumber) {

        for (Account account : accounts) {

            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }

        return null;
    }

    public void deposit(long accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if (account != null) {

            account.deposit(amount);

            transactions.add(
                new Transaction(accountNumber, "DEPOSIT", amount)
            );

        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(long accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if (account != null) {

            double oldBalance = account.getBalance();

            account.withdraw(amount);

            if (amount > 0 && amount <= oldBalance) {

                transactions.add(
                    new Transaction(accountNumber, "WITHDRAW", amount)
                );
            }

        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayAccount(long accountNumber) {

        Account account = findAccount(accountNumber);

        if (account != null) {
            account.displayAccount();
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayAllAccounts() {

        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }

        for (Account account : accounts) {
            account.displayAccount();
        }
    }

    public void displayTransactions() {

        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
            return;
        }

        System.out.println("\n----- Transaction History -----");

        for (Transaction transaction : transactions) {
            transaction.displayTransaction();
        }
    }
}