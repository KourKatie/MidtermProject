/**
 * Created by Katie on 7/31/2017.
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BookApp {

    public static void main(String[] args) {

        ArrayList<Book> bookList = readFile("./booklist.txt");
        if (bookList == null) {
            System.out.println("Issue with file... closing");
            return;
        }

        int choice = 0;
        int reset = 1;
        int selections = 0;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to Stanton Island's Public Library!");

        do {
            reset = 0;

            System.out.println("Main Menu");
            System.out.println("1 - Library Directory");
            System.out.println("2 - Search");
            System.out.println("3 - Return Book");
            System.out.print("Enter menu number: ");
            choice = scnr.nextInt();
            scnr.nextLine();

            //int i;
            switch (choice) {
                case 1:
                    int i = 0;
                    System.out.println("Library Directory");

                    System.out.printf("%-8s%-45s%-25s%-8s%-25s%-20s%-20s", "Book ID", "Title", "Author",
                            "Number Of Pages", "Publication Date", "Status", "Due Date" + "\n");
                    for (i = 0; i < bookList.size(); i++) {
                        System.out.printf("%-8d%-45s%-25s%-8d%-25s%-20s%-20s", bookList.get(i).getBookID(),
                                bookList.get(i).getTitle(), bookList.get(i).getAuthor(),
                                bookList.get(i).getNumberOfPages(), bookList.get(i).getPublicationDate(),
                                bookList.get(i).getStatus(), bookList.get(i).getDueDate() + "\n");
                    }

                    System.out.println("\nPlease enter the book ID for the book you would like to checkout: ");
                    int selection = scnr.nextInt();
                    selection = selection - 101;

                    System.out.println("Congratulations you just checked out " + "'" + bookList.get(selection).getTitle()
                            + "'" + "," + " it is due " + Book.dueDateMethod() + ".");

                    for (i = 0; i < bookList.size(); i++) {
                        String dueDate = Book.dueDateMethod();
                        bookList.set(selection, bookList.get(selection)).setDueDate(dueDate);
                        bookList.get(selection).setStatus("Checked Out");
                    }

                    System.out.println("1 - Main Menu");
                    System.out.println("2 - Exit");
                    reset = scnr.nextInt();
                    scnr.nextLine();
                    if (reset == 1) {
                        break;
                    } else {
                        break;
                    }
                case 2:
                    //System.out.println("Search ");
                    //Scanner scan = new Scanner(System.in);

                    System.out.println("Will you be searching by Author or Title Keyword?");
                    String userS = scnr.nextLine();

                    if (userS.contains("Author")) {
                        System.out.println("Enter an Author");

                        String selAuthor = scnr.nextLine();
                        //System.out.println(selAuthor);
//                        for (i = 0; i < bookList.size(); i++) {
//
//                            if (bookList.get(i).getAuthor().contains(selAuthor)) {
//                                System.out.println(bookList.get(i));
//                            }
//                        }

                        for (i = 0; i < bookList.size(); i++) {

                            if (bookList.get(i).getAuthor().contains(selAuthor)) {
                                System.out.println(bookList.get(i));
                            }
                        }

                        System.out.println("\nPlease enter the book ID if you would like to check it out ");
                        selections = scnr.nextInt();
                        selections = selections - 101;

                        System.out.println("Congratulations you just checked out " + "'" + bookList.get(selections).getTitle()
                                + "'" + "," + " it is due " + Book.dueDateMethod() + ".");

                        for (i = 0; i < bookList.size(); i++) {
                            String dueDate = Book.dueDateMethod();
                            bookList.set(selections, bookList.get(selections)).setDueDate(dueDate);
                            bookList.get(selections).setStatus("Checked Out");
                        }
//                        for (i = 0; i < bookList.size(); i++) {
//                            System.out.println(bookList.get(i));
//                        }

            } else{
                System.out.println("Enter a keyword in the of the desired Title");

                String selKeyword = scnr.nextLine();

                for (i = 0; i < bookList.size(); i++) {

                    if (bookList.get(i).getAuthor().contains(selKeyword)) {
                        System.out.println(bookList.get(i));
                    }
                }
                    System.out.println("\nPlease enter the book Id if you would like to check it out ");
                    selections = scnr.nextInt();
                    selections = selections - 101;

                    System.out.println("Congratulations you just checked out " + "'" + bookList.get(selections).getTitle()
                            + "'" + "," + " it is due " + Book.dueDateMethod() + ".");

                    for (i = 0; i < bookList.size(); i++) {
                        String dueDate = Book.dueDateMethod();
                        bookList.set(selections, bookList.get(selections)).setDueDate(dueDate);
                        bookList.get(selections).setStatus("Checked Out");
                    }
                    for (i = 0; i < bookList.size(); i++) {
                        System.out.println(bookList.get(i));
                    }
            }

            System.out.println("1 - Main Menu");
            System.out.println("2 - Exit");
            reset = scnr.nextInt();
            scnr.nextLine();
            if (reset == 1) {
                break;
            } else {
                break;
            }

            case 3:
                for (i = 0; i < bookList.size(); i++) {
                    //System.out.println(bookList.get(i));

                    for (i = 0; i < bookList.size(); i++) {
                        System.out.printf("%-8d%-45s%-25s%-8d%-25s%-20s%-20s", bookList.get(i).getBookID(),
                                bookList.get(i).getTitle(), bookList.get(i).getAuthor(),
                                bookList.get(i).getNumberOfPages(), bookList.get(i).getPublicationDate(),
                                bookList.get(i).getStatus(), bookList.get(i).getDueDate() + "\n");

                    }

                    System.out.println("\n");
                    System.out.print("Select book to return by ID: ");
                    int returnID = scnr.nextInt();
                    returnID = returnID - 101;

                    //Change status of book to Checked In, Change due date back to 0
                    for (i = 0; i < bookList.size(); i++) {
                        //String dueDate = Book.dueDateMethod();
                        bookList.get(returnID).setDueDate("");//bookList.set(returnID, bookList.get(returnID)).setDueDate(dueDate);
                        bookList.get(returnID).setStatus("On-shelf");
                    }
                    System.out.println("Your book has been returned. Thank you!\n");

                    System.out.println("1 - Main Menu");
                    System.out.println("2 - Exit");
                    reset = scnr.nextInt();
                    scnr.nextLine();
                    if (reset == 1) {
                        break;
                    } else {
                        break;
                    }
                }
        }
            } while (reset == 1) ;


    }

    public static ArrayList<Book> readFile(String filename) {

        ArrayList<Book> books = new ArrayList<Book>();
        //add books to ArrayList

        try {
            Path booksPath = Paths.get(filename);
            File booksFile = booksPath.toFile();
            FileReader fileRdr = new FileReader(booksFile);
            BufferedReader in = new BufferedReader(fileRdr);

            //read in the first line
            String line = in.readLine();

            //as long as there's another line
            while (line != null) {
                //break the line apart based on tabs
                String[] details = line.split("\t");

//                if (details.length > 13) {
//                    System.out.println("Bad line format--halting read");
//                    break;
//                }

                //take the first item, turn it into an int, put it into the books's ID
                int bookID = Integer.parseInt(details[0]);
                //take the second item and put into book's title
                String title = details[1];
                //take the third item and put into book's author
                String author = details[2];
                //take the fourth item, turn it to int, put into book's numberOfPages
                int numberOfPages = Integer.parseInt(details[3]);
                //take the fifth item and put into book's publicationDate
                String publicationDate = details[4];
                //take the sixth item and put into book's status
                String status = details[5];
                //take the seventh item, turn it into an int, put into book's dueDate
                int dueDate = Integer.parseInt(details[6]);

                //construct a new Car object from this data
                Book b = new Book(bookID, title, author, numberOfPages, publicationDate, status, dueDate);

                //add the new Car into ArrayList
                books.add(b);

                //read in the next line for the next iteration
                line = in.readLine();
                //in.close();
            }

        } catch (IOException e) {
            System.out.println(e);
           // return null;
        }

        //in.close();

        return books;
    }
}










