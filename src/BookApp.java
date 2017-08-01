/**
 * Created by Katie on 7/31/2017.
 */

import java.util.Date;
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
        int reset = 0;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to Stanton Island's Public Library!");

        do {
            System.out.println("Main Menu");
            System.out.println("1 - Library Directory");
            System.out.println("2 - Search");
            System.out.println("3 - Return Book");
            System.out.print("Enter menu number: ");
            choice = scnr.nextInt();
            scnr.nextLine();

            int i;
            switch (choice) {
                case 1:
                    System.out.println("Library Directory");
                    for (i = 0; i < bookList.size(); i++) {
                        System.out.println(bookList.get(i));
                    }
                    System.out.println("\nPlease enter the book ID for the book you would like to checkout: ");
                    int selection = scnr.nextInt();
                    selection = selection - 101;
                    //if (selection == (i)) {
                    //  System.out.println("You selected to check out Book ID " + books.get(selection));
                    // }
                    System.out.println("Congratulations you just checked out " + "'" + bookList.get(selection).getTitle()
                            + "'" + "," + " it is due " + Book.dueDateMethod() + ".");

                    // Updates status and adds a due date to selected book ID
                    for (i = 0; i < bookList.size(); i++) {
                        Date dueDate = Book.dueDateMethod();
                        bookList.set(selection, bookList.get(selection)).setDueDate(dueDate);
                        bookList.get(selection).setStatus("Checked Out");
                    }

                    // for (i = 0; i == selection; i++){
                    // String status = "Checked Out";
                    // books.set(selection, books.get(selection).setStatus(status));
                    //}

                    for (i = 0; i < bookList.size(); i++) {
                        System.out.println(bookList.get(i));
                    }

                    break;
                case 2:
                    System.out.println("Search");
                    break;
                case 3:
                    for (i = 0; i < bookList.size(); i++) {
                        System.out.println(bookList.get(i));
                        for (i = 0; i < bookList.size(); i++) {
                            System.out.println(bookList.get(i));
                        }
                        System.out.println("\n");
                        System.out.print("Select book to return by ID: ");
                        int returnID = scnr.nextInt();

                        //Change status of book to Checked In, Change due date back to 0

                        System.out.println("Your book has been returned. Thank you!\n");
                        System.out.println("1 - Main Menu");
                        System.out.println("2 - Exit");
                        reset = scnr.nextInt();
                        if (reset == 1) {
                        } else {
                            break;
                        }
                    }
            }
        } while (reset == 1) ;
            // Method call to get due date 14 days (2 weeks) from current date.
            Book.dueDateMethod();


        }


    public static ArrayList<Book> readFile (String filename) {

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

              //  if (details.length > 13) {
              //      System.out.println("Bad line format--halting read");
              //      break;
              //  }

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
            //    in.close();
            }

        } catch (IOException e) {
            System.out.println(e);
        //    return null;
        }

      //  in.close();

        return books;
    }
}







