import java.util.*;

public class History {
    public ArrayList<Operations> history;

    public History() {
        history = new ArrayList<>();
    }

    public void addTransaction(Operations transaction) {
        history.add(transaction);
    }

    public void displayHistory() {
        String solde = new String();
        for (int i = 0; i < history.size(); i++) {
            solde += history.get(i).format() + "\n";
        }
        System.out.println(solde);
    }
}