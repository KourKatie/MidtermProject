import java.util.Date;
import java.util.Calendar;
public class CheckedBook extends Book {
    private String status;
    private Date dueDate;

    public CheckedBook(String status, Date dueDate) {
        this.status = status;
        this.dueDate = dueDate;
    }

    public CheckedBook(String title, String author, String status, Date dueDate) {
        super(title, author);
        this.status = status;
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return super.toString() + status + dueDate;
    }
}
