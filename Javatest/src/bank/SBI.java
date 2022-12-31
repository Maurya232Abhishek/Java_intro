package bank;

public class SBI {

    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("ram",23,"ayodhya",23,1000);
        System.out.println(account);
        account.deposit(100);
        System.out.println(account);
        account.withdraw(500);
        System.out.println(account);
    }

}
