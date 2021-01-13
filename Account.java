public class Account {
    public double balance;
    public History history;

    public Account() {
        balance = 0;
        history = new History();
    }

    public double getBalance() {
        return balance;
    }

    public double withdrawal(double amount) {
        Operations operation = new Operations(amount, "Retrait");
        balance -= amount;
        history.addTransaction(operation);
        return balance;
    }

    public double deposit(double amount) {
        Operations operation = new Operations(amount, "Depot");
        balance += amount;
        history.addTransaction(operation);
        return balance;
    }

}