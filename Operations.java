import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Operations {
    public String date;
    public double amount;
    public String type;

    public Operations(double amount, String type) {
        this.amount = amount;
        this.type = type;
        this.date = setDate();
    }

    private String setDate() {
        SimpleDateFormat formater = null;
        Date aujourdhui = new Date();

        formater = new SimpleDateFormat("'le' dd MMMM yyyy 'à' hh:mm:ss");
        return (formater.format(aujourdhui));
    }
}
