package LESSON12.prob2;

public class CustomerAccount {

    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if( amount <= 0){
            throw new IllegalArgumentException("Deposit amount must be positive ");
        }
        balance += amount;
        System.out.println("Deposited amount: $" + amount);
    }

    public void withdraw(double amount) {
        if(amount > balance){
            throw new AccountException("Insufficient funds! Withdrawal amount exceeds balance.");
        }
        if(balance - amount < 100){
            throw new AccountException("Low balance warning! Balance can't go below $100");
        }
        balance-= amount;
        System.out.println("Withdraw: $" + amount + "  New balance: $" + balance);

    }
    public double getBalance() {
        return balance;
    }
}
