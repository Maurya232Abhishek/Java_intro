package bank;

import java.util.ArrayList;

abstract class Account {
    abstract void deposit(int amount);
    abstract void withdraw(int amount);
    protected ArrayList<Transactions> transactions=new  ArrayList<>();

    @Override
    public String toString() {
        return "Account{" + "transactions=" + transactions + '}';
    }
    
}
