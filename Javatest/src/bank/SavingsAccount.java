package bank;

public class SavingsAccount extends Account {

    private int balance;

    SavingsAccount(int x) {
        balance = x;
    }

    @Override
    public void deposit(int amount) {

        balance = balance + amount;
        transactions.add(new Transactions(TransactionType.Deposit, balance - amount, balance));
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            transactions.add(new Transactions(TransactionType.Withdraw, balance + amount, balance));
        }
    }

    @Override
    public String toString() {
        return super.toString() +  ",saving_account{" + "balance=" + balance + '}';
    }

}
