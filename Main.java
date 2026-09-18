import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        int customerId = 1;
        long accountNumber = 1001;

        while (true) {

            System.out.println("\n====================================");
            System.out.println("     BANK ACCOUNT MANAGEMENT");
            System.out.println("====================================");

            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Account");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Transaction History");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    if (!Utils.isValidName(name)) {
                        System.out.println("Invalid name.");
                        break;
                    }

                    if (!Utils.isValidPhone(phone)) {
                        System.out.println("Invalid phone number.");
                        break;
                    }

                    if (!Utils.isValidEmail(email)) {
                        System.out.println("Invalid email.");
                        break;
                    }

                    System.out.print("Enter account type: ");
                    String accountType = sc.nextLine();

                    System.out.print("Enter initial deposit: ");
                    double initialDeposit = sc.nextDouble();

                    if (!Utils.isValidAmount(initialDeposit)) {
                        System.out.println("Invalid amount.");
                        break;
                    }

                    Customer customer =
                        new Customer(customerId++, name, phone, email);

                    Account account =
                        new Account(
                            accountNumber++,
                            accountType,
                            initialDeposit,
                            customer
                        );

                    bank.addAccount(account);

                    break;

                case 2:

                    System.out.print("Enter account number: ");
                    long depositAccount = sc.nextLong();

                    System.out.print("Enter amount: ");
                    double depositAmount = sc.nextDouble();

                    bank.deposit(depositAccount, depositAmount);

                    break;

                case 3:

                    System.out.print("Enter account number: ");
                    long withdrawAccount = sc.nextLong();

                    System.out.print("Enter amount: ");
                    double withdrawAmount = sc.nextDouble();

                    bank.withdraw(withdrawAccount, withdrawAmount);

                    break;

                case 4:

                    System.out.print("Enter account number: ");
                    long searchAccount = sc.nextLong();

                    bank.displayAccount(searchAccount);

                    break;

                case 5:

                    bank.displayAllAccounts();

                    break;

                case 6:

                    bank.displayTransactions();

                    break;

                case 7:

                    System.out.println("Thank you for using the system.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}