/**
 * Created by Katie on 7/31/2017.
 */
import java.io.*;
import java.util.Scanner;
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

        System.out.println("The year is 2017 GW. After global warming and 30 years of world wars, all\n" +
                "the libraries in the world have been destroyed excpet this one located in \n" +
                "Detroit, Michigan. " + "Welcome to the World's Last Library!\n");

        do {
            reset = 0;

            System.out.println("Main Menu");
            System.out.println("1 - Library Directory");
            System.out.println("2 - Search");
            System.out.println("3 - Return Book");
            System.out.print("Enter menu number: ");
            choice = scnr.nextInt();

            scnr.nextLine();

            switch (choice) {
                case 1:
                    int i = 0;
                    System.out.printf("%80s \n", "Library Directory");
                    System.out.printf("%83s \n", "======================");

                    System.out.printf("%-8s %-45s %-25s %-8s %-25s %-20s %-20s \n", "BookID", "Title", "Author",
                            "Pages", "Publication Date", "Status", "Due Date");
                    System.out.printf("%s \n", "-----------------------------------------------------" +
                            "-------------------------------------------------------------------------------------" +
                            "------------");
                    for (i = 0; i < bookList.size(); i++) {
                        System.out.printf("%-8d %-45s %-25s %-8d %-25s %-20s %-20s \n", bookList.get(i).getBookID(),
                                bookList.get(i).getTitle(), bookList.get(i).getAuthor(),
                                bookList.get(i).getNumberOfPages(), bookList.get(i).getPublicationDate(),
                                bookList.get(i).getStatus(), bookList.get(i).getDueDate());
                    }

                    System.out.println("\nPlease enter the book ID for the book you would like to checkout: ");
                    int selection = scnr.nextInt();
                    // Below sets the selection to the actual index
                    selection = selection - 101;

                    // Added if to make sure user enters correct bookID
                    if (selection < 0 || selection > 12) {
                        System.out.println("Invalid BookID selected, taking you back to the main menu.");
                    } else {
                        System.out.println("Congratulations you just checked out " + "'" + bookList.get(selection).getTitle()
                                + "'" + "," + " it is due " + Book.dueDateMethod() + ".");

                        for (i = 0; i < bookList.size(); i++) {
                            String dueDate = Book.dueDateMethod();
                            bookList.set(selection, bookList.get(selection)).setDueDate(dueDate);
                            bookList.get(selection).setStatus("Checked Out");
                        }
                    }

                    writeToFile(bookList);

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

                    System.out.println("Will you be searching by Author or Title Keyword?");
                    String userS = scnr.nextLine();


                    if (userS.contains("Author")) {
                        System.out.println("Enter an Author: ");

                        String selAuthor = scnr.nextLine();

                        for (i = 0; i < bookList.size(); i++) {

                            if (bookList.get(i).getAuthor().contains(selAuthor)) {
                                //System.out.println(bookList.get(i));
                                System.out.printf("%82s \n", "Search Result");
                                System.out.printf("%85s \n", "=====================");
                                System.out.printf("%-8s %-45s %-25s %-8s %-25s %-20s %-20s \n", "BookID", "Title", "Author",
                                        "Pages", "Publication Date", "Status", "Due Date");
                                System.out.printf("%s \n", "-----------------------------------------------------" +
                                        "-------------------------------------------------------------------------------------" +
                                        "------------");
                                System.out.printf("%-8d %-45s %-25s %-8d %-25s %-20s %-20s \n", bookList.get(i).getBookID(),
                                        bookList.get(i).getTitle(), bookList.get(i).getAuthor(),
                                        bookList.get(i).getNumberOfPages(), bookList.get(i).getPublicationDate(),
                                        bookList.get(i).getStatus(), bookList.get(i).getDueDate());

                                System.out.println("\nPlease enter the book ID if you would like to check it out: ");
                                selections = scnr.nextInt();
                                selections = selections - 101;

                                System.out.println("Congratulations you just checked out " + "'" + bookList.get(selections).getTitle()
                                        + "'" + "," + " it is due " + Book.dueDateMethod() + ".");

                                for (i = 0; i < bookList.size(); i++) {
                                    String dueDate = Book.dueDateMethod();
                                    bookList.set(selections, bookList.get(selections)).setDueDate(dueDate);
                                    bookList.get(selections).setStatus("Checked Out");
                                }
                            }
                        }

                    } else {
                        System.out.println("Enter a keyword in the title of the desired book: ");

                        String selKeyword = scnr.nextLine();

                        for (i = 0; i < bookList.size(); i++) {

                            if (bookList.get(i).getTitle().contains(selKeyword)) {
                                //System.out.println(bookList.get(i));
                                System.out.printf("%82s \n", "Search Result");
                                System.out.printf("%85s \n", "=====================");
                                System.out.printf("%-8s %-45s %-25s %-8s %-25s %-20s %-20s \n", "BookID", "Title", "Author",
                                        "Pages", "Publication Date", "Status", "Due Date");
                                System.out.printf("%s \n", "-----------------------------------------------------" +
                                        "-------------------------------------------------------------------------------------" +
                                        "------------");
                                System.out.printf("%-8d %-45s %-25s %-8d %-25s %-20s %-20s \n", bookList.get(i).getBookID(),
                                        bookList.get(i).getTitle(), bookList.get(i).getAuthor(),
                                        bookList.get(i).getNumberOfPages(), bookList.get(i).getPublicationDate(),
                                        bookList.get(i).getStatus(), bookList.get(i).getDueDate());

                                System.out.println("\nPlease enter the book Id if you would like to check it out: ");
                                selections = scnr.nextInt();
                                selections = selections - 101;

                                System.out.println("Congratulations you just checked out " + "'" + bookList.get(selections).getTitle()
                                        + "'" + "," + " it is due " + Book.dueDateMethod() + ".");


                                for (i = 0; i < bookList.size(); i++) {
                                    String dueDate = Book.dueDateMethod();
                                    bookList.set(selections, bookList.get(selections)).setDueDate(dueDate);
                                    bookList.get(selections).setStatus("Checked Out");
                                }
                            }
                        }
                    }
                    writeToFile(bookList);

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

                    System.out.printf("%-8s %-45s %-25s %-8s %-25s %-20s %-20s \n", "BookID", "Title", "Author",
                            "Pages", "Publication Date", "Status", "Due Date");
                    System.out.printf("%s \n", "-----------------------------------------------------" +
                            "-------------------------------------------------------------------------------------" +
                            "------------");
                    for (i = 0; i < bookList.size(); i++) {
//                        System.out.printf("%-8d%-45s%-25s%-8d%-25s%-20s%-20s", bookList.get(i).getBookID(),
//                                bookList.get(i).getTitle(), bookList.get(i).getAuthor(),
//                                bookList.get(i).getNumberOfPages(), bookList.get(i).getPublicationDate(),
//                                bookList.get(i).getStatus(), bookList.get(i).getDueDate() + "\n");
                        System.out.printf("%-8d %-45s %-25s %-8d %-25s %-20s %-20s \n", bookList.get(i).getBookID(),
                                bookList.get(i).getTitle(), bookList.get(i).getAuthor(),
                                bookList.get(i).getNumberOfPages(), bookList.get(i).getPublicationDate(),
                                bookList.get(i).getStatus(), bookList.get(i).getDueDate());
                    }

                    System.out.println("\n");
                    System.out.print("Select book to return by ID: ");
                    int returnID = scnr.nextInt();
                    returnID = returnID - 101;

                    for (i = 0; i < bookList.size(); i++) {
                        //String dueDate = Book.dueDateMethod();
                        bookList.get(returnID).setDueDate("");//bookList.set(returnID, bookList.get(returnID)).setDueDate(dueDate);
                        bookList.get(returnID).setStatus("On-shelf");
                    }
                    System.out.println("Your book has been returned. Thank you!\n");

                    writeToFile(bookList);

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

        } while (reset == 1);

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
                String dueDate = details[6];

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

    private static void writeToFile(ArrayList<Book> bookList) {
        File myFile = new File("booklist.txt");
        Scanner scan1 = new Scanner(System.in);
        PrintWriter p;
        try {
            //open te file for writing
            p = new PrintWriter(new FileOutputStream(myFile, false));
            //loop through the booklist
            for (Book b : bookList) {

                //build the line for the file
                if (b.getDueDate() == "") {
                    b.setDueDate("void");
                }
                String s = b.getBookID() + "\t" + b.getTitle() + "\t" + b.getAuthor() + "\t" + b.getNumberOfPages() + "\t" + b.getPublicationDate()
                        + "\t" + b.getStatus() + "\t" + b.getDueDate();
                //write that line to te file
                p.println(s);
                //    bookList.get(returnID).setStatus("Checked out");
            }
            //close the file
            p.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}










