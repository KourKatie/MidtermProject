/**
 * Created by Katie on 7/31/2017.
 */

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class BookApp {

    public static void main(String[] args) {


        Scanner scnr = new Scanner(System.in);

        File myFile = new File("booklist.txt");

        //String fileOuput = readfile();

        ArrayList<Book> books = new ArrayList<Book>();
        //add books to ArrayList

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

        int choice = 0;
        int reset = 0;

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
                    for (i = 0; i < books.size(); i++) {
                        System.out.println(books.get(i));
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

    }
}







