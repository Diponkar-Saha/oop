package bank_acount;

public abstract class Account {
    //abstact
    //account number
    private int accountNumber;
    //balance
    protected double balance;
    //default constructor
    public Account(){

    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        balance=0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

}
