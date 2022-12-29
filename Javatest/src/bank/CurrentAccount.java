package bank;

public class CurrentAccount extends Account {

    private int balance;

    CurrentAccount(int x) {
        balance = x;
    }

    @Override
    public void deposit(int amount) {
        if (5 <= balance) {
            balance = balance + amount - 5;
            transactions.add(new Transactions(TransactionType.Deposit, balance - amount + 5, balance));
        }
    }

    public void withdraw(int amount) {
        if (amount + 5 <= balance) {
            balance = balance - amount - 5;
            transactions.add(new Transactions(TransactionType.Withdraw, balance - amount + 5, balance));
        }

    }

    @Override
    public String toString() {
        return super.toString() +  ",CurrentAccount{" + "balance=" + balance + '}';
    }

    

    

}
