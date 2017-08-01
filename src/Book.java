import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Katie on 7/31/2017.
 */
public class Book {
    private int bookID;
    private String title;
    private String author;
    private int numberOfPages;
    private String publicationDate;
    private String status;
    private Date dueDate;

    // Default constructor
    public Book() {
        this.bookID = 0;
        this.title = "";
        this.author = "";
        this.numberOfPages = 0;
        this.publicationDate = "";
        this.status = "";
        this.dueDate = null;
    }

    // All arguments constructor


    public Book(int bookID, String title, String author, int numberOfPages,
                String publicationDate, String status, int dueDate) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publicationDate = publicationDate;
        this.status = status;
        this.dueDate = null;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
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
            return bookID + " " + " " + title + " " + author + " " + numberOfPages
                    + " " + publicationDate + " " + status + " " + dueDate;
    }
    // Method to get due date 14 days (2 weeks) from current date.
    public static Date dueDateMethod() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        // Set seconds, minutes and hours to zero so the time will be a constant
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.HOUR, 0);
        cal.add(Calendar.DAY_OF_WEEK, 14);
       // System.out.println((cal.getTime()));
        return cal.getTime();

    }
}

