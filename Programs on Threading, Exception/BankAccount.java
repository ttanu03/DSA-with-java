// Custom Exception Class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method that throws an exception
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Error: Insufficient funds! Available: $" + balance + ", Requested: $" + amount
            );
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        try {
            System.out.println("Current balance: $" + account.balance);
            account.withdraw(500);  // Valid withdrawal
            account.withdraw(700);  // Throws InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }
    }
}