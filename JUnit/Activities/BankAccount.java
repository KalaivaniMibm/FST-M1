package Activities;

public class BankAccount {
    int balance;
    public BankAccount(Integer initialBalance) {
        balance = initialBalance;
    }
    public Integer withdraw(Integer amount) {
        if (balance < amount) {
            throw new NotEnoughFundsException(amount, balance);
        }
        balance -= amount;
        return balance;
    }
}

