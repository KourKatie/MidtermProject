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

        Book.add(new books(Title, Author, etc.));

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
}






