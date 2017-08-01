/**
 * Created by Katie on 7/31/2017.
 */

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class BookApp {

    public static void main(String[] args) {


        Scanner scnr = new Scanner(System.in);

        File myFile = new File("booklist.txt");

        //String fileOuput = readfile();

        ArrayList<Book> books = new ArrayList<Book>();

        //add books to ArrayList
        books.add(new Book(1,"The Alchemist", "Paulo Coelho", 208,
                "November 23, 2010", "On-Shelf", 0));
        books.add(new Book (2, "Richest Man in Babylon", "George Samuel Clayson", 144,
                "January 1, 2002", "On-Shelf", 0));
        books.add(new Book (3, "48 Laws of Power", "Robert Greene", 452,
                "September 1, 2000","On-Shelf", 0));
        books.add(new Book(4, "The Art of War", "Sun Tsu", 452,
                "November 7, 2007", "On-Shelf", 0));
        books.add(new Book(5, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 309,
                "September 1998", "On-Shelf", 0));
        books.add(new Book(6, "Hunger Games", "Suzanne Collins", 384,
                "July 3, 2010", "On-Shelf", 0));
        books.add(new Book(7, "Awakening Your Inner Genius", "Sean Patrick", 214,
                "February 12, 2013", "On-Shelf", 0));
        books.add(new Book(8, "Of Mice of Men", "John Steinbeck", 112,
                "September 1, 1993", "On-Shelf", 0));
        books.add(new Book(9, "The Great Gatsby", "F. Scott Fitzgerald", 180,
                "September 30, 2004", "On-Shelf", 0));
        books.add(new Book(10, "A Clockwork Orange", "Anthony Burgess", 213,
                "April 7, 1995", "On-Shelf", 0));
        books.add(new Book(11, "Invisible Man", "Ralph Ellison", 581,
                "March 14, 1995", "On-Shelf", 0));
        books.add(new Book(12, "Frankenstein", "Mary Shelley", 166,
                "1994", "On-Shelf", 0));
        books.add(new Book(13, "The AutoBiography of Malcolm X", "Alvin Hailey", 460,
                "November 1992", "On-Shelf", 0));

        // Method call to get due date 14 days (2 weeks) from current date.
        Book.dueDateMethod();

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

    private static String readFile() {
        File myFile = new File("booklist.txt");
        String output = "";

        try {
            FileReader reader = new FileReader(myFile);
            BufferedReader bufferRead = new BufferedReader(reader);
            String line = bufferRead.readLine();
            while (line != null) {
                output = output + line + "\n";
                line = bufferRead.readLine();

            }
            bufferRead.close();
        } catch (Exception e) {
            System.out.println("Sorry, that file was not found.");
        }

        return FIXME;
    }
}







