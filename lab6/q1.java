class Account {
     String customerName;
     String accNo;
    String accType;
   double balance;

    public Account(String customerName, String accNo, String accType) {
        this.customerName = customerName;
        this.accNo = accNo;
        this.accType = accType;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void displayBalance() {
        System.out.println("Account No: " + accNo + ", Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        }
    }
}

class CurrentAccount extends Account {
    private static final double MIN_BALANCE = 1000;
    private static final double PENALTY = 50;

    public CurrentAccount(String customerName, String accNo) {
        super(customerName, accNo, "Current Account");
    }

    public void checkMinBalance() {
        if (balance < MIN_BALANCE) {
            balance -= PENALTY;
            System.out.println("Penalty applied. New balance: " + balance);
        }
    }
}

class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.04; // 4% annual interest
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(String customerName, String accNo) {
        super(customerName, accNo, "Savings Account");
    }

    public void depositInterest() {
        double interest = balance * INTEREST_RATE;
        deposit(interest);
        System.out.println("Interest deposited: " + interest + ". New balance: " + balance);
    }

    public void checkMinBalance() {
        if (balance < MIN_BALANCE) {
            balance -= 50; // Apply penalty for low balance
            System.out.println("Penalty applied. New balance: " + balance);
        }
    }
}

// Example usage
public class BankApp {
    public static void main(String[] args) {
        CurrentAccount currentAcc = new CurrentAccount("John Doe", "C123");
        currentAcc.deposit(1500);
        currentAcc.withdraw(300);
        currentAcc.checkMinBalance();
        currentAcc.displayBalance();

        SavingsAccount savingsAcc = new SavingsAccount("Jane Smith", "S456");
        savingsAcc.deposit(700);
        savingsAcc.depositInterest();
        savingsAcc.withdraw(200);
        savingsAcc.checkMinBalance();
        savingsAcc.displayBalance();
    }
}
