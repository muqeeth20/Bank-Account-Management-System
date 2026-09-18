import java.time.LocalDateTime;

public class Transaction {

    private long accountNumber;
    private String type;
    private double amount;
    private LocalDateTime dateTime;

    public Transaction(long accountNumber, String type, double amount) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    public void displayTransaction() {

        System.out.println(
            "Account: " + accountNumber +
            " | Type: " + type +
            " | Amount: ₹" + amount +
            " | Date: " + dateTime
        );
    }
}