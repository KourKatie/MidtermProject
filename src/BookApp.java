/**
 * Created by Katie on 7/31/2017.
 */

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;;

public class BookApp {

    public static void main(String[] args) {





        ArrayList<Book> bookList = readFile("./booklist.txt");
        if (bookList == null) {
            System.out.println("Issue with file... closing");
            return;
        }

<<<<<<< HEAD
        //now I have a filled ArrayList of Cars
        //  at least in theory...

        //now do the rest of your program using this list

        //output this list
        //enhanced for (foreach) to go through list
        for (Book b: bookList) {
            //toString does the formatting
            System.out.println(b);
        }

=======
        books.add(new Book(101, "The Alchemist", "Paulo Coelho", 208,
                "November 23, 2010", "On-Shelf", 0));
        books.add(new Book(102, "Richest Man in Babylon", "George Samuel Clayson", 144,
                "January 1, 2002", "On-Shelf", 0));
        books.add(new Book(103, "48 Laws of Power", "Robert Greene", 452,
                "September 1, 2000", "On-Shelf", 0));
        books.add(new Book(104, "The Art of War", "Sun Tsu", 452,
                "November 7, 2007", "On-Shelf", 0));
        books.add(new Book(105, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 309,
                "September 1998", "On-Shelf", 0));
        books.add(new Book(106, "Hunger Games", "Suzanne Collins", 384,
                "July 3, 2010", "On-Shelf", 0));
        books.add(new Book(107, "Awakening Your Inner Genius", "Sean Patrick", 214,
                "February 12, 2013", "On-Shelf", 0));
        books.add(new Book(108, "Of Mice of Men", "John Steinbeck", 112,
                "September 1, 1993", "On-Shelf", 0));
        books.add(new Book(109, "The Great Gatsby", "F. Scott Fitzgerald", 180,
                "September 30, 2004", "On-Shelf", 0));
        books.add(new Book(110, "A Clockwork Orange", "Anthony Burgess", 213,
                "April 7, 1995", "On-Shelf", 0));
        books.add(new Book(111, "Invisible Man", "Ralph Ellison", 581,
                "March 14, 1995", "On-Shelf", 0));
        books.add(new Book(112, "Frankenstein", "Mary Shelley", 166,
                "1994", "On-Shelf", 0));
        books.add(new Book(113, "The AutoBiography of Malcolm X", "Alvin Hailey", 460,
                "November 1992", "On-Shelf", 0));
>>>>>>> 2ea541c7f720ea796d00809edf9a8d5e38d3c779

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
                    for (i = 0; i < books.size(); i++) {
                        System.out.println(books.get(i));
                    }
                    System.out.println("\nPlease enter the book ID for the book you would like to checkout: ");
                    int selection = scnr.nextInt();
                    selection = selection - 101;

                    System.out.println("Congratulations you just checked out " +  "'" + books.get(selection).getTitle()
                            + "'" + "," + " it is due " + Book.dueDateMethod() + ".");

                    // Updates status and adds a due date to selected book ID
                    for (i = 0; i < books.size(); i++){
                        Date dueDate = Book.dueDateMethod();
                        books.set(selection, books.get(selection)).setDueDate(dueDate);
                        books.get(selection).setStatus("Checked Out");
                    }

                    // for (i = 0; i == selection; i++){
                    // String status = "Checked Out";
                    // books.set(selection, books.get(selection).setStatus(status));
                    //}

                    for (i = 0; i < books.size(); i++) {
                        System.out.println(books.get(i));
                    }

                    break;
                case 2:
                    System.out.println("Search");
                    break;
                case 3:
<<<<<<< HEAD
                    for (int i = 0; i < bookList.size(); i++) {
                        System.out.println(bookList.get(i));
=======
                    for (i = 0; i < books.size(); i++) {
                        System.out.println(books.get(i));
>>>>>>> 2ea541c7f720ea796d00809edf9a8d5e38d3c779
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
        } while (reset == 1);

<<<<<<< HEAD
        // Method call to get due date 14 days (2 weeks) from current date.
        Book.dueDateMethod();

=======
//    private static void BookListing() {
//        File myFile = new File("booklist.txt");
//    }

//    private static void writeToFile(File myFile) {
//        try {
//            PrintWriter bookData = new PrintWriter(new FileOutputStream(myFile, true));
//
//            bookData.println(FIXME);
//            bookData.close();
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Sorry, that file was not found.");
//        }
//
//    }

//    private static String readFile() {
//        File myFile = new File("booklist.txt");
//        String output = "";
//
//        try {
//            FileReader reader = new FileReader(myFile);
//            BufferedReader bufferRead = new BufferedReader(reader);
//            String line = bufferRead.readLine();
//            while (line != null) {
//                output = output + line + "\n";
//                line = bufferRead.readLine();
//
//            }
//            bufferRead.close();
//        } catch (Exception e) {
//            System.out.println("Sorry, that file was not found.");
//        }
//
//        return FIXME;
>>>>>>> 2ea541c7f720ea796d00809edf9a8d5e38d3c779


    }

    public static ArrayList<Book> readFile (String filename) {

        ArrayList<Book> books = new ArrayList<Book>();
        //add books to ArrayList


        try {
            Path booksPath = Paths.get("./booklist.txt");
            File booksFile = booksPath.toFile();
            FileReader fileRdr = new FileReader(booksFile);
            BufferedReader in = new BufferedReader(fileRdr);

            //read in the first line
            String line = in.readLine();

            //as long as there's another line
            while (line != null) {
                //break the line apart based on tabs
                String[] details = line.split("\t");

                if (details.length < 13) {
                    System.out.println("Bad line format--halting read");
                    break;
                }

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
            }

        } catch (IOException e) {
            System.out.println(e);
            return null;
        }

        return books;
    }
}







