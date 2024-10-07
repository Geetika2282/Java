//this class is to manage balance, set initial balance, check balance, withdraw amount
package BankAccount;

public class Account {
    private double balance; // Will store account balance

    public Account(double balance){ // Account Constructor
        super();
        this.balance = balance;
    }
    public double getBalance(){
        return balance; // will return current balance
    }
    public void withdraw(int amount){
        balance = balance - amount; // will subtract amount from balance
    }
}
