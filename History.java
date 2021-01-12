import java.text.SimpleDateFormat;
import java.util.Date;

public class History {
    public Date date;
    public Operation operation;

    public Date getDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return (formatter.format(date));
    }
}
