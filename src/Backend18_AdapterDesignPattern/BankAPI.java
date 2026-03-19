package Backend18_AdapterDesignPattern;

public abstract class BankAPI {
    abstract void sendMoney(String from, String to, int amount);

    abstract void registerAccount(String accountNumber);

    abstract long getBalance(String accountNumber);
}
