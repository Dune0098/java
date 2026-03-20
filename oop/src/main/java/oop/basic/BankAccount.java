package oop.basic;

import lombok.Getter;

@Getter
public class BankAccount {
    private double balance;

    public BankAccount(){
        this.balance = 0;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }
}
