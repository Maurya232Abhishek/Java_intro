package bank;

import java.util.Date;

public class Transactions {

    @Override
    public String toString() {
        return "Transactions{" + "transactionType=" + transactionType + ", balancebefore=" + balancebefore + ", balanceafter=" + balanceafter + ", transactiondate=" + transactiondate + '}';
    }

    private TransactionType transactionType;
    private int balancebefore, balanceafter;
    private Date transactiondate;

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public int getBalancebefore() {
        return balancebefore;
    }

    public int getBalanceafter() {
        return balanceafter;
    }

    public Date getTransactiondate() {
        return transactiondate;
    }

    public Transactions(TransactionType transactionType, int balancebefore, int balanceafter) {
        this.transactionType = transactionType;
        this.balancebefore = balancebefore;
        this.balanceafter = balanceafter;
        this.transactiondate = new Date();
    }

}
