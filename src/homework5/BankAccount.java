package homework5;

public class BankAccount {
    int id;
    String name;
    double balance;

    void increaseBalance(int amount) {
        balance += amount;
    }

    void decreaseBalance(int amount) {
        balance -= amount;
    }
}
