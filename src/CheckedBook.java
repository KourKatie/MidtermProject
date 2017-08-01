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

    // Method to get due date 14 days (2 weeks) from current date.
    public static void dueDateMethod() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_WEEK, 14);
        System.out.println((cal.getTime()));
    }

    @Override
    public String toString() {
        return super.toString() + status + dueDate;
    }

}
