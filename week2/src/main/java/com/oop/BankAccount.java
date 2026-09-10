package com.oop;
 
public class BankAccount {
    public String accountHolder;
    public double balance; //test edit

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }
    public void withdraw(double amount){
       if(amount > this.balance){
        System.out.println("Insufficient funds");
        return;
       }
       this.balance = this.balance - amount;
    }
}
