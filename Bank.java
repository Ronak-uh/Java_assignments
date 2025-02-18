// BankAccount.java
abstract class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) { // Setter method to modify balance
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract void withdraw(double amount);
}

// SavingsAccount.java
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

// Main.java
class Bank { // Fixed class name
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        System.out.println("Initial balance: " + savingsAccount.getBalance());

        savingsAccount.deposit(500);
        System.out.println("Balance after deposit: " + savingsAccount.getBalance());

        savingsAccount.withdraw(200);
        System.out.println("Balance after withdrawal: " + savingsAccount.getBalance());
    }
}