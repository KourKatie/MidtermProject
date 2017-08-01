/**
 * Created by Katie on 7/31/2017.
 */

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class BookApp {

    public static String main(String[] args) {


        Scanner scnr = new Scanner(System.in);

        File myFile = new File("booklist.txt");

        //String fileOuput = readfile();

        ArrayList<Book> books = new ArrayList<Book>();

        //add books to ArrayList
        books.add(new Book("The Alechemist", "Paulo Coelho"));
        books.add(new Book ("Richest Man in Babylon", "George Samuel Clayson"));
        books.add(new Book ("48 Laws of Power", "Robert Greene"));
        books.add(new Book("The Art of War", "Sun Tsu"));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"));
        books.add(new Book("Hunger Games", "Suzanne Collins"));
        books.add(new Book("Awakening Your Inner Genius", "Sean Patrick"));
        books.add(new Book("Of Mice of Men", "John Steinbeck"));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("A Clockwork Orange", "Anthony Burgess"));
        books.add(new Book("Invisible Man", "Ralph Ellison"));
        books.add(new Book("Frankenstein", "Mary Shelley"));
        books.add(new Book("The AutoBiography of Malcolm X", "Alvin Hailey"));


 //   public String Book() {
        int choice = 0;
        switch(choice) {
            case 1:
                System.out.println("Library Directory");
                break;
            case 2:
                System.out.println("Search");
                break;
            case 3:
                System.out.println("Return Book");
                break;
        }




    // Method call to get due date 14 days (2 weeks) from current date.
        CheckedBook.dueDateMethod();

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







