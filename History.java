import java.util.*;

public class History {
    public ArrayList<Operations> history;

    public History() {
        history = new ArrayList<>();
    }

    public void addTransaction(Operations transaction) {
        history.add(transaction);
    }

    public ArrayList<Operations> getHistory() {
        return history;
    }
}